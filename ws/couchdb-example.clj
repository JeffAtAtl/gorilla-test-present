;; gorilla-repl.fileformat = 1

;; **
;;; # Couchdb Example
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;; **

;; @@
(ns couchdb-example
  (:use com.ashafa.clutch)
  (:use clojure.repl)
  (:use clojure.pprint))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def db (couch "test"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;couchdb-example/db</span>","value":"#'couchdb-example/db"}
;; <=

;; @@
(create! db)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#object[com.ashafa.clutch.CouchDB 0x71b05a13 &quot;com.ashafa.clutch.CouchDB@71b05a13&quot;]</span>","value":"#object[com.ashafa.clutch.CouchDB 0x71b05a13 \"com.ashafa.clutch.CouchDB@71b05a13\"]"}
;; <=

;; @@
(:result (meta *1))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-record'>#cemerick.url.URL{</span>","close":"<span class='clj-record'>}</span>","separator":" ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:protocol</span>","value":":protocol"},{"type":"html","content":"<span class='clj-string'>&quot;http&quot;</span>","value":"\"http\""}],"value":"[:protocol \"http\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:username</span>","value":":username"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:username nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:password</span>","value":":password"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:password nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:host</span>","value":":host"},{"type":"html","content":"<span class='clj-string'>&quot;localhost&quot;</span>","value":"\"localhost\""}],"value":"[:host \"localhost\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:port</span>","value":":port"},{"type":"html","content":"<span class='clj-unkown'>5984</span>","value":"5984"}],"value":"[:port 5984]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:path</span>","value":":path"},{"type":"html","content":"<span class='clj-string'>&quot;/test&quot;</span>","value":"\"/test\""}],"value":"[:path \"/test\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:query</span>","value":":query"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:query nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:anchor</span>","value":":anchor"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:anchor nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:update_seq</span>","value":":update_seq"},{"type":"html","content":"<span class='clj-unkown'>50008</span>","value":"50008"}],"value":"[:update_seq 50008]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:committed_update_seq</span>","value":":committed_update_seq"},{"type":"html","content":"<span class='clj-unkown'>50008</span>","value":"50008"}],"value":"[:committed_update_seq 50008]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:compact_running</span>","value":":compact_running"},{"type":"html","content":"<span class='clj-unkown'>false</span>","value":"false"}],"value":"[:compact_running false]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:disk_size</span>","value":":disk_size"},{"type":"html","content":"<span class='clj-unkown'>180433009</span>","value":"180433009"}],"value":"[:disk_size 180433009]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:db_name</span>","value":":db_name"},{"type":"html","content":"<span class='clj-string'>&quot;test&quot;</span>","value":"\"test\""}],"value":"[:db_name \"test\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:disk_format_version</span>","value":":disk_format_version"},{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}],"value":"[:disk_format_version 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:data_size</span>","value":":data_size"},{"type":"html","content":"<span class='clj-unkown'>2357282</span>","value":"2357282"}],"value":"[:data_size 2357282]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:instance_start_time</span>","value":":instance_start_time"},{"type":"html","content":"<span class='clj-string'>&quot;1457497305239840&quot;</span>","value":"\"1457497305239840\""}],"value":"[:instance_start_time \"1457497305239840\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:doc_del_count</span>","value":":doc_del_count"},{"type":"html","content":"<span class='clj-unkown'>5001</span>","value":"5001"}],"value":"[:doc_del_count 5001]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:purge_seq</span>","value":":purge_seq"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:purge_seq 0]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:doc_count</span>","value":":doc_count"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:doc_count 0]"}],"value":"#cemerick.url.URL{:protocol \"http\", :username nil, :password nil, :host \"localhost\", :port 5984, :path \"/test\", :query nil, :anchor nil, :update_seq 50008, :committed_update_seq 50008, :compact_running false, :disk_size 180433009, :db_name \"test\", :disk_format_version 6, :data_size 2357282, :instance_start_time \"1457497305239840\", :doc_del_count 5001, :purge_seq 0, :doc_count 0}"}
;; <=

;; @@
(reduce conj! db (for [x (range 5000)]
                      {:_id (str x) :a [1 2 x]}))
;; @@
;; =>
;; <=

;; @@
(count db)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>5000</span>","value":"5000"}
;; <=

;; @@
(get-in db ["68" :a 2])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>68</span>","value":"68"}
;; <=

;; @@
(def copy (into {} db))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;couchdb-example/copy</span>","value":"#'couchdb-example/copy"}
;; <=

;; @@
(get-in copy ["68" :a 2])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>68</span>","value":"68"}
;; <=

;; @@
(first db)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""}],"value":"[:_id \"0\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;19-023e148e2843854af7a7b4b6be9ae34e&quot;</span>","value":"\"19-023e148e2843854af7a7b4b6be9ae34e\""}],"value":"[:_rev \"19-023e148e2843854af7a7b4b6be9ae34e\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[1 2 0]"}],"value":"[:a [1 2 0]]"}],"value":"{:_id \"0\", :_rev \"19-023e148e2843854af7a7b4b6be9ae34e\", :a [1 2 0]}"}],"value":"[\"0\" {:_id \"0\", :_rev \"19-023e148e2843854af7a7b4b6be9ae34e\", :a [1 2 0]}]"}
;; <=

;; @@
(first copy)
;; @@
;; =>
;; <=

;; @@
(dissoc! db "68")
;; @@
;; =>
;; <=

;; @@
(get db "68")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(assoc! db :foo {:a 6 :b 7})
;; @@
;; =>
;; <=

;; @@
(:result (meta *1))
;; @@
;; =>
;; <=

;; @@
(get db :foo)
;; @@
;; =>
;; <=

;; @@
(count db)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>5000</span>","value":"5000"}
;; <=

;; @@
;; to clear database
(reduce dissoc! db (for [x (keys db)]
                        x))
;; @@
;; =>
;; <=

;; @@
(count db)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(dir com.ashafa.clutch)
;; @@
;; ->
;;; -&gt;CouchDB
;;; CouchOps
;;; ad-hoc-view
;;; all-databases
;;; all-documents
;;; assoc!
;;; bulk-update
;;; change-agent
;;; changes
;;; changes-running?
;;; configure-view-server
;;; conj!
;;; copy-document
;;; couch
;;; couchdb-info
;;; create!
;;; create-database
;;; database-info
;;; delete-attachment
;;; delete-database
;;; delete-document
;;; dissoc!
;;; dissoc-meta
;;; document-exists?
;;; get-attachment
;;; get-database
;;; get-document
;;; get-view
;;; put-attachment
;;; put-document
;;; replicate-database
;;; save-design-document
;;; save-filter
;;; save-view
;;; start-changes
;;; stop-changes
;;; update-document
;;; view-server-fns
;;; view-transformer
;;; wildcard-collation-string
;;; with-db
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(all-databases)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;_replicator&quot;</span>","value":"\"_replicator\""},{"type":"html","content":"<span class='clj-string'>&quot;_users&quot;</span>","value":"\"_users\""},{"type":"html","content":"<span class='clj-string'>&quot;test&quot;</span>","value":"\"test\""},{"type":"html","content":"<span class='clj-string'>&quot;wiki&quot;</span>","value":"\"wiki\""}],"value":"(\"_replicator\" \"_users\" \"test\" \"wiki\")"}
;; <=

;; @@
(def db-wiki (couch "wiki"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;couchdb-example/db-wiki</span>","value":"#'couchdb-example/db-wiki"}
;; <=

;; @@
(count db-wiki)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"}
;; <=

;; @@
(keys db-wiki)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>(&quot;JeffreyCummings&quot; &quot;MainPage&quot;)</span>","value":"(\"JeffreyCummings\" \"MainPage\")"}
;; <=

;; @@
(pprint (map #(get db-wiki %) (keys db-wiki)))
;; @@
;; ->
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(couchdb-info)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:couchdb</span>","value":":couchdb"},{"type":"html","content":"<span class='clj-string'>&quot;Welcome&quot;</span>","value":"\"Welcome\""}],"value":"[:couchdb \"Welcome\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:uuid</span>","value":":uuid"},{"type":"html","content":"<span class='clj-string'>&quot;44171a1a11a250e5448e594983fe3278&quot;</span>","value":"\"44171a1a11a250e5448e594983fe3278\""}],"value":"[:uuid \"44171a1a11a250e5448e594983fe3278\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:version</span>","value":":version"},{"type":"html","content":"<span class='clj-string'>&quot;1.6.1&quot;</span>","value":"\"1.6.1\""}],"value":"[:version \"1.6.1\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:vendor</span>","value":":vendor"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:version</span>","value":":version"},{"type":"html","content":"<span class='clj-string'>&quot;1.6.1&quot;</span>","value":"\"1.6.1\""}],"value":"[:version \"1.6.1\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;The Apache Software Foundation&quot;</span>","value":"\"The Apache Software Foundation\""}],"value":"[:name \"The Apache Software Foundation\"]"}],"value":"{:version \"1.6.1\", :name \"The Apache Software Foundation\"}"}],"value":"[:vendor {:version \"1.6.1\", :name \"The Apache Software Foundation\"}]"}],"value":"{:couchdb \"Welcome\", :uuid \"44171a1a11a250e5448e594983fe3278\", :version \"1.6.1\", :vendor {:version \"1.6.1\", :name \"The Apache Software Foundation\"}}"}
;; <=

;; @@
(pprint (map #(database-info %) [db db-wiki]))
;; @@
;; ->
;;;   :db_name &quot;test&quot;,
;;;   :disk_format_version 6,
;;;   :data_size 3599991,
;;;   :instance_start_time &quot;1472093641567470&quot;,
;;;   :doc_del_count 5001,
;;;   :purge_seq 0,
;;;   :doc_count 0}
;;;  {:update_seq 4,
;;;   :committed_update_seq 4,
;;;   :compact_running false,
;;;   :disk_size 16479,
;;;   :db_name &quot;wiki&quot;,
;;;   :disk_format_version 6,
;;;   :data_size 555,
;;;   :instance_start_time &quot;1472435988851950&quot;,
;;;   :doc_del_count 0,
;;;   :purge_seq 0,
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(str (java.util.Date. 1459628027173))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sat Apr 02 16:13:47 EDT 2016&quot;</span>","value":"\"Sat Apr 02 16:13:47 EDT 2016\""}
;; <=

;; @@
(str (java.util.Date. 1459628177095))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sat Apr 02 16:16:17 EDT 2016&quot;</span>","value":"\"Sat Apr 02 16:16:17 EDT 2016\""}
;; <=

;; @@
(str (java.util.Date. 1433637416630))
(.getTime (java.util.Date.))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>1472436012496</span>","value":"1472436012496"}
;; <=

;; @@
(time (reduce dissoc! db (for [x (keys db)]
                        x)))
;; @@
;; ->
;;; &quot;Elapsed time: 74433.50803 msecs&quot;
;;; 
;; <-
(count db)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(time (reduce conj! db (for [x (range 5000)]
                      {:_id (str x) :a [1 2 x]})))
;; @@
;; ->
;;; &quot;Elapsed time: 40544.056437 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@6d3d5efa&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@6d3d5efa>"}
;; <=

;; @@
(count db)
;; @@
;; ->
;;; &quot;Elapsed time: 74433.50803 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@72fd2ca0&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@72fd2ca0>"}
;; <=

;; @@
(count db)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(time (reduce conj! db (for [x (range 5000)]
                      {:_id (str x) :a [1 2 x]})))
;; @@
;; ->
;;; &quot;Elapsed time: 40544.056437 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@6d3d5efa&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@6d3d5efa>"}
;; <=

;; @@
(count db)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>5000</span>","value":"5000"}
;; <=

;; @@

;; @@
