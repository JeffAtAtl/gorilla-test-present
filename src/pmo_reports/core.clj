(ns pmo-reports.core
    (:require [clojure.xml :as x])
    (:use clojureql.core)
    (:use dk.ative.docjure.spreadsheet))

(def mpl {:classname "com.microsoft.sqlserver.jdbc.SQLServerDriver" 
          :subprotocol "sqlserver" 
          :user "dao_login" 
          :password "d@0_pr0d" 
          :subname "//WSPRDS01022;databaseName=dpr044ta"})

(def epr {:classname "com.ibm.db2.jcc.DB2Driver" 
          :subprotocol "db2" 
          :user "prfis04" 
          :password "iud822a" 
          :subname "//ibdyprx0.sysplex.homedepot.com:5123/PR1"})

(def fms {:classname "com.microsoft.sqlserver.jdbc.SQLServerDriver" 
          :subprotocol "sqlserver" 
          :user "pmo_user" 
          :password "pmo_user" 
          :subname "//WSPRDS01022;databaseName=dpr042ta"})

(def wo {:classname "com.microsoft.sqlserver.jdbc.SQLServerDriver" 
          :subprotocol "sqlserver" 
          :user "pmo_user" 
          :password "pmo_user" 
          :subname "//WSPRDS01022;databaseName=dpr045ta"})

(def rat {:classname "com.microsoft.sqlserver.jdbc.SQLServerDriver" 
          :subprotocol "sqlserver" 
          :user "dao_login" 
          :password "d@0_pr0d" 
          :subname "//WSPRDS01022;databaseName=dpr046ta"})

;; MPL

(defn fms->proj [fms] 
	(first (map :proj_id 
		    @(select (table mpl :MSTR_PROJ_LIST) 
			     (where (and (= :FMS_PROJ_NBR fms)
					 (= :proj_class_cd 1)))))))

(defn mpl-pm-aid [fms] 
	(first (map :proj_assoc_id 
		    @(select (table mpl :PROJ_ASSOC_ROLE) 
			     (where (and (= :proj_id (fms->proj fms))
					 (= :proj_role_cd 4)))))))

(defn mpl-upd-pm 
  [fms aid]
  (count @(update-in! (table mpl :proj_assoc_role)
			  (where (and (= :proj_role_cd 4)
				      (= :proj_id (fms->proj fms))))
			  {:proj_assoc_id aid})))

(defn nowTs [] (java.sql.Timestamp. (System/currentTimeMillis)))

(defn mpl-crt-pm
	  [fms aid]
	  (count @(conj! (table mpl :proj_assoc_role) 
                         [{:PROJ_ID (fms->proj fms) 
                           :PROJ_ROLE_CD 4 
                           :LAST_UPD_TS (nowTs) 
                           :LAST_UPD_SYSUSR_ID "JXC4598" 
                           :PROJ_ASSOC_ID aid}])))

(defn mpl-mpl [fms] 
	@(select (table mpl :MSTR_PROJ_LIST) 
		 (where (= :FMS_PROJ_NBR fms))))

(defn mpl-mpl-all [] 
	@(table mpl :MSTR_PROJ_LIST))

(defn mpl-mpl-all-no-sub [] 
	@(select (table mpl :MSTR_PROJ_LIST) 
		 (where (= :proj_class_cd 1))))

(defn mpl-mpl-all-no-sub-rev-ts
	[n]
	(->> (mpl-mpl-all-no-sub)
	     (sort-by :last_upd_ts)
	     reverse
	     (clojure.core/take n)))

(defn mpl-mpl-all-no-sub-rev 
	  [n] 
	  (clojure.core/take n @(order-by (select (table mpl :MSTR_PROJ_LIST) 
		                                  (where (= :proj_class_cd 1)))
		                          [:last_upd_ts#desc])))
		             

;; EPR

(defn epr-fmld [fms] 
	(first (map (juxt :frst_nm :mid_nm :last_nm :dept_nbr :wrkr_id)
		    @(select (table epr :epr_ssc_atc_wrkr) 
			     (where (= :wrkr_id (mpl-pm-aid fms)))))))

(defn epr-fl 
  [fms] 
  (first (map (juxt (comp #(.trim %) :frst_nm) 
	            (comp #(.trim %) :last_nm))
              @(select (table epr :epr_ssc_atc_wrkr) 
		       (where (= :wrkr_id (mpl-pm-aid fms)))))))

(defn epr-fmld->aid [f l] 
	(map (juxt :frst_nm :mid_nm :last_nm :dept_nbr :wrkr_id)
	     @(select (table epr :epr_ssc_atc_wrkr) 
		      (where (and (= :frst_nm f)
				  (= :last_nm l)
				  (= :d_wrkr_stat_cd "ACTIVE"))))))

(defn epr-ld->aid 
	  [l d]
	  (map (juxt :frst_nm :mid_nm :last_nm :dept_nbr :wrkr_id)
	     @(select (table epr :epr_ssc_atc_wrkr) 
		      (where (and (= :last_nm l)
				  (= :dept_nbr d)
				  (= :d_wrkr_stat_cd "ACTIVE"))))))

(defn epr-fd->aid 
	  [f d]
	  (map (juxt :frst_nm :mid_nm :last_nm :dept_nbr :wrkr_id)
	     @(select (table epr :epr_ssc_atc_wrkr) 
		      (where (and (= :frst_nm f)
				  (= :dept_nbr d)
				  (= :d_wrkr_stat_cd "ACTIVE"))))))

(defn epr-l->aid 
	  [l]
	  (map (juxt :frst_nm :mid_nm :last_nm :dept_nbr :wrkr_id)
	     @(select (table epr :epr_ssc_atc_wrkr) 
		      (where (and (= :last_nm l)
				  (= :d_wrkr_stat_cd "ACTIVE"))))))

(defn epr-sysusr
	  [uid]
	(first @(select (table epr :sysusr)
		 (where (= :user_id uid)))))

(defn epr-sysusr-by-aid
	  [aid]
	(first @(select (table epr :sysusr)
		        (where (= :prsn_id aid)))))

(defn epr-ssc-atc-wrkr-by-aid
  [aid] 
  @(select (table epr :epr_ssc_atc_wrkr) 
           (where (= :wrkr_id aid))))

(defn epr-ssc-atc-wrkr-by-dpt
  [dpt] 
  @(select (table epr :epr_ssc_atc_wrkr) 
           (where (= :dept_nbr dpt))))

(defn epr-ssc-atc-wrkr-by-ecc
  [ecc] 
  @(select (table epr :epr_ssc_atc_wrkr) 
           (where (= :emplt_ctgry_cd ecc))))

;; FMS

(defn fms-tbl-proj-users-pm1-userid
	  [n] 
	(->> @(select (table fms :TBLPROJECTUSERS) 
		      (where (and (= :projectid n) 
				  (= :projectmanager 1)
                                  (= :rank 1))))
	     (map :userid)
	     first))

(defn fms-tbl-proj-users-pm1
	  [n] 
	(first @(select (table fms :TBLPROJECTUSERS) 
		        (where (and (= :projectid n) 
			            (= :projectmanager 1)
                                    (= :rank 1))))))

(defn fms-tbl-users 
	[n] 
	(first @(select (table fms :TBLUSERS) 
		        (where (and (= :userid n)
				    (= :active 1))))))

(defn fms-tbl-proj-users-pm1s-rev
	[n]
	(->> @(select (table fms :TBLPROJECTUSERS) 
		      (where (and (= :projectmanager 1)
                                  (= :rank 1))))
	     (sort-by :lastupdate)
	     reverse
	     (clojure.core/take n)))

(defn fms-tbl-projects-rev
	[n]
	(->> @(table fms :TBLPROJECTS)
	     (sort-by :lastupdate)
	     reverse
	     (clojure.core/take n)))

(defn fms-tbl-proj-users
	[n r] 
	(first @(select (table fms :TBLPROJECTUSERS) 
		        (where (and (= :projectid n) 
			            (= :projectmanager 1)
                                    (= :rank r))))))

(defn fms-tbl-projects
	[n]
	(first @(select (table fms :TBLPROJECTS)
	                (where (= :projectid n)))))

(defn fms-tbl-costcenters
	  [n]
	(first @(select (table fms :tblcostcenters)
			(where (= :costcenterid n)))))

;; WO

(defn wo-wo
	  [n]
	@(select (table wo :pmo_wrk_ord) 
		 (where (= :pmo_wrk_ord_id n))))

(defn wo-aapprv
	  [n]
	@(select (table wo :pmo_wrkord_aapprv) 
		 (where (= :pmo_wrk_ord_id n))))

(defn wo-aapprv-pm
	  [n]
	@(select (table wo :pmo_wrkord_aapprv) 
		 (where (and (= :pmo_wrk_ord_id n)
			     (= :seq_nbr 1)))))

(defn wo-n-wo-stat-all
	  []
	@(table wo :n_pmo_wrkord_stat))

(defn wo-stat-cdmap
	  []
	  (->> (wo-n-wo-stat-all)
	       (map (juxt :pmo_wrkord_stat_cd :stat_desc))
		    (apply map list)
		    (apply zipmap)))

(defn wo-all-by-fmn
	  [yr fmn]
	@(distinct (select (project (join (join (table wo :pmo_wrk_ord) 
			                        (table wo :pmo_reqd_rsrc) 
			                        (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_reqd_rsrc.pmo_wrk_ord_id))) 
		                          (table wo :pmo_rsrc_alloc) 
		                          (where (and (= :pmo_reqd_rsrc.actv_flg :pmo_rsrc_alloc.actv_flg)
				                      (= :pmo_reqd_rsrc.pmo_reqd_rsrc_id :pmo_rsrc_alloc.pmo_reqd_rsrc_id))))
		                    [:pmo_wrk_ord.*] )
	                   (where (or (and (= :pmo_wrk_ord.prev_mth_adj_flg "N" )
			                   (= :pmo_rsrc_alloc.fscl_yr yr)
			                   (= :pmo_rsrc_alloc.fscl_mth_nbr fmn)) 
			              (and (= :pmo_wrk_ord.prev_mth_adj_flg "Y" )
			                   (= :pmo_rsrc_alloc.fscl_yr yr)
			                   (= :pmo_rsrc_alloc.fscl_mth_nbr (dec fmn))))))))

(defn wo-wo-aa-aprvd
	  [yr fmn]
	@(distinct (select (project (join (join (join (table wo :pmo_wrk_ord) 
			                              (table wo :pmo_reqd_rsrc) 
			                              (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_reqd_rsrc.pmo_wrk_ord_id)))
		                                (table wo :pmo_rsrc_alloc) 
		                                (where (and (= :pmo_reqd_rsrc.actv_flg :pmo_rsrc_alloc.actv_flg)
				                            (= :pmo_reqd_rsrc.pmo_reqd_rsrc_id :pmo_rsrc_alloc.pmo_reqd_rsrc_id))))
					  (table wo :pmo_wrkord_aapprv)
					  (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_wrkord_aapprv.pmo_wrk_ord_id)))
		                    [:pmo_wrk_ord.* :pmo_wrkord_aapprv.aapprv_sysusr_id] )
	                   (where (and (or (and (= :pmo_wrk_ord.prev_mth_adj_flg "N" )
			                        (= :pmo_rsrc_alloc.fscl_yr yr)
			                        (= :pmo_rsrc_alloc.fscl_mth_nbr fmn)) 
			                   (and (= :pmo_wrk_ord.prev_mth_adj_flg "Y" )
			                        (= :pmo_rsrc_alloc.fscl_yr yr)
			                        (= :pmo_rsrc_alloc.fscl_mth_nbr (dec fmn))))
				       (= :pmo_wrkord_aapprv.seq_nbr 1))))))

(defn wo-active
	  [yr fmn]
	@(distinct (select (project (join (join (table wo :pmo_wrk_ord) 
			                        (table wo :pmo_reqd_rsrc) 
			                        (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_reqd_rsrc.pmo_wrk_ord_id))) 
		                          (table wo :pmo_rsrc_alloc) 
		                          (where (and (= :pmo_reqd_rsrc.actv_flg :pmo_rsrc_alloc.actv_flg)
				                      (= :pmo_reqd_rsrc.pmo_reqd_rsrc_id :pmo_rsrc_alloc.pmo_reqd_rsrc_id))))
		                    [:pmo_wrk_ord.*] )
	                   (where (or (and (= :pmo_wrk_ord.prev_mth_adj_flg "N" )
			                   (= :pmo_rsrc_alloc.fscl_yr yr)
			                   (>= :pmo_rsrc_alloc.fscl_mth_nbr fmn)) 
			              (and (= :pmo_wrk_ord.prev_mth_adj_flg "Y" )
			                   (= :pmo_rsrc_alloc.fscl_yr yr)
			                   (= :pmo_rsrc_alloc.fscl_mth_nbr (dec fmn))))))))

(defn wo-aapprv-active
	  [yr fmn]
	@(distinct (select (project (join (join (join (table wo :pmo_wrk_ord) 
			                              (table wo :pmo_reqd_rsrc) 
			                              (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_reqd_rsrc.pmo_wrk_ord_id))) 
		                                (table wo :pmo_rsrc_alloc) 
		                                (where (and (= :pmo_reqd_rsrc.actv_flg :pmo_rsrc_alloc.actv_flg)
				                            (= :pmo_reqd_rsrc.pmo_reqd_rsrc_id :pmo_rsrc_alloc.pmo_reqd_rsrc_id))))
                                           (table wo :pmo_wrkord_aapprv)
					   (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_wrkord_aapprv.pmo_wrk_ord_id)))
		                    [:pmo_wrk_ord.* :pmo_wrkord_aapprv.aapprv_sysusr_id :pmo_wrkord_aapprv.aapprv_flg] )
	                   (where (and (or (and (= :pmo_wrk_ord.prev_mth_adj_flg "N" )
			                        (= :pmo_rsrc_alloc.fscl_yr yr)
			                        (>= :pmo_rsrc_alloc.fscl_mth_nbr fmn)) 
			                   (and (= :pmo_wrk_ord.prev_mth_adj_flg "Y" )
			                        (= :pmo_rsrc_alloc.fscl_yr yr)
			                        (= :pmo_rsrc_alloc.fscl_mth_nbr (dec fmn))))
                                       (= :pmo_wrkord_aapprv.seq_nbr 1))))))

(defn wo-pend-approval
	  [yr fmn]
	@(distinct (select (project (join (join (table wo :pmo_wrk_ord) 
			                        (table wo :pmo_reqd_rsrc) 
			                        (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_reqd_rsrc.pmo_wrk_ord_id))) 
		                          (table wo :pmo_rsrc_alloc) 
		                          (where (and (= :pmo_reqd_rsrc.actv_flg :pmo_rsrc_alloc.actv_flg)
				                      (= :pmo_reqd_rsrc.pmo_reqd_rsrc_id :pmo_rsrc_alloc.pmo_reqd_rsrc_id))))
		                    [:pmo_wrk_ord.* :pmo_rsrc_alloc.rsrc_alloc_tot_amt] )
	                   (where (or (and (= :pmo_wrk_ord.pmo_wrkord_stat_cd 3)
			                   (= :pmo_wrk_ord.prev_mth_adj_flg "N" )
			                   (= :pmo_rsrc_alloc.fscl_yr yr)
			                   (= :pmo_rsrc_alloc.fscl_mth_nbr fmn)) 
			              (and (= :pmo_wrk_ord.pmo_wrkord_stat_cd 3)
			                   (= :pmo_wrk_ord.prev_mth_adj_flg "Y" )
			                   (= :pmo_rsrc_alloc.fscl_yr yr)
			                   (= :pmo_rsrc_alloc.fscl_mth_nbr (dec fmn))))))))

(defn wo-pend-approval-aa-not-aprvd
	  [yr fmn]
	@(distinct (select (project (join (join (join (table wo :pmo_wrk_ord) 
			                              (table wo :pmo_reqd_rsrc) 
			                              (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_reqd_rsrc.pmo_wrk_ord_id)))
		                                (table wo :pmo_rsrc_alloc) 
		                                (where (and (= :pmo_reqd_rsrc.actv_flg :pmo_rsrc_alloc.actv_flg)
				                            (= :pmo_reqd_rsrc.pmo_reqd_rsrc_id :pmo_rsrc_alloc.pmo_reqd_rsrc_id))))
					  (table wo :pmo_wrkord_aapprv)
					  (where (= :pmo_wrk_ord.pmo_wrk_ord_id :pmo_wrkord_aapprv.pmo_wrk_ord_id)))
		                    [:pmo_wrk_ord.* :pmo_wrkord_aapprv.aapprv_sysusr_id] )
	                   (where (and (or (and (= :pmo_wrk_ord.pmo_wrkord_stat_cd 3)
			                        (= :pmo_wrk_ord.prev_mth_adj_flg "N" )
			                        (= :pmo_rsrc_alloc.fscl_yr yr)
			                        (= :pmo_rsrc_alloc.fscl_mth_nbr fmn)) 
			                   (and (= :pmo_wrk_ord.pmo_wrkord_stat_cd 3)
			                        (= :pmo_wrk_ord.prev_mth_adj_flg "Y" )
			                        (= :pmo_rsrc_alloc.fscl_yr yr)
			                        (= :pmo_rsrc_alloc.fscl_mth_nbr (dec fmn))))
				       (= :pmo_wrkord_aapprv.seq_nbr 1)
				       (= :pmo_wrkord_aapprv.aapprv_flg "N"))))))

(defn wo-upd-pm
	  [w pm]
	  (count @(update-in! (table wo :pmo_wrk_ord) 
			      (where (= :pmo_wrk_ord_id w))
                              {:pmgr_sysusr_id pm})))

(defn wo-upd-odr
	  [w pm]
	  (count @(update-in! (table wo :pmo_wrk_ord) 
			      (where (= :pmo_wrk_ord_id w))
                              {:odr_mgr_sysusr_id pm})))

(defn wo-upd-aapprv-pm
	  [w pm]
	  (count @(update-in! (table wo :pmo_wrkord_aapprv) 
			      (where (and (= :pmo_wrk_ord_id w)
					  (= :seq_nbr 1)
                                          (= :aapprv_flg "N")))
                              {:aapprv_sysusr_id pm})))

(defn wo-upd-aapprv-rm
	  [w rm]
	  (count @(update-in! (table wo :pmo_wrkord_aapprv) 
			      (where (and (= :pmo_wrk_ord_id w)
					  (= :seq_nbr 2)
                                          (= :aapprv_flg "N")))
                              {:aapprv_sysusr_id rm})))

(defn wo-upd-aapprv-adtnl
	  [w adtnl]
	  (count @(update-in! (table wo :pmo_wrkord_aapprv) 
			      (where (and (= :pmo_wrk_ord_id w)
					  (= :seq_nbr 3)
                                          (= :aapprv_flg "N")))
                              {:aapprv_sysusr_id adtnl})))

(defn wo-upd-stv
	  [w]
	  (count @(update-in! (table wo :pmo_wrk_ord) 
			      (where (= :pmo_wrk_ord_id w))
                              {:pmo_wrkord_stat_cd 5})))

(defn wo-upd-aapprv-aprv-pm
	  [w pm]
	  (count @(update-in! (table wo :pmo_wrkord_aapprv) 
			      (where (and (= :pmo_wrk_ord_id w)
					  (= :seq_nbr 1)
                                          (= :aapprv_flg "N")))
                              {:aapprv_flg "Y" :last_upd_sysusr_id pm :last_upd_ts (nowTs)})))

(defn wo-upd-aapprv-aprv-rm
	  [w rm]
	  (count @(update-in! (table wo :pmo_wrkord_aapprv) 
			      (where (and (= :pmo_wrk_ord_id w)
					  (= :seq_nbr 2)
                                          (= :aapprv_flg "N")))
                              {:aapprv_flg "Y" :last_upd_sysusr_id rm :last_upd_ts (nowTs)})))

(defn wo-upd-aapprv-aprv-adtnl
	  [w adtnl]
	  (count @(update-in! (table wo :pmo_wrkord_aapprv) 
			      (where (and (= :pmo_wrk_ord_id w)
					  (= :seq_nbr 3)
                                          (= :aapprv_flg "N")))
                              {:aapprv_flg "Y" :last_upd_sysusr_id adtnl :last_upd_ts (nowTs)})))


;; RAT

(defn rat-ralloc-proj-alloc-excpt
  [aid] 
  @(select (table rat :ralloc_proj_alloc_excpt) 
           (where (= :rsrc_assoc_id aid))))

(defn rat-ralloc-proj-assoc-snsh
  [aid] 
  @(select (table rat :ralloc_proj_assoc_snsh) 
           (where (= :rsrc_assoc_id aid))))

(defn rat-ralloc-proj-assoc-snsh-h
  [aid] 
  @(select (table rat :ralloc_proj_assoc_snsh_h) 
           (where (= :rsrc_assoc_id aid))))

(defn merge-with-prefix
	  [p & maps]
	  (let [sp  (map name p)
	        sks (map (comp #(map name %) keys) maps)
		vs  (map vals maps)
	        nks (map #(map (fn [k] 
				   (keyword (str (first %) "." k)))
			       (second %))
			 (map list sp sks))]
	      (apply merge (map #(apply zipmap %) (map list nks vs)))))

(defn create-worksheet
      [coc filename]
      (let [wb (create-workbook "Data Dump"
                                coc)]
           (save-workbook! filename wb)))
