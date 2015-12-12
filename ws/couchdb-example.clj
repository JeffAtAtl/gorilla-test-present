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
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@64cf643a&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@64cf643a>"}
;; <=

;; @@
(:result (meta *1))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(reduce conj! db (for [x (range 5000)]
                      {:_id (str x) :a [1 2 x]}))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@79f84af0&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@79f84af0>"}
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
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""}],"value":"[:_id \"0\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;7-124c1d8d04c15386c6310dd22c0db256&quot;</span>","value":"\"7-124c1d8d04c15386c6310dd22c0db256\""}],"value":"[:_rev \"7-124c1d8d04c15386c6310dd22c0db256\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[1 2 0]"}],"value":"[:a [1 2 0]]"}],"value":"{:_id \"0\", :_rev \"7-124c1d8d04c15386c6310dd22c0db256\", :a [1 2 0]}"}],"value":"[\"0\" {:_id \"0\", :_rev \"7-124c1d8d04c15386c6310dd22c0db256\", :a [1 2 0]}]"}
;; <=

;; @@
(first copy)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;3630&quot;</span>","value":"\"3630\""},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;3630&quot;</span>","value":"\"3630\""}],"value":"[:_id \"3630\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;7-7108614ee65fe5569e25035e40e64155&quot;</span>","value":"\"7-7108614ee65fe5569e25035e40e64155\""}],"value":"[:_rev \"7-7108614ee65fe5569e25035e40e64155\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>3630</span>","value":"3630"}],"value":"[1 2 3630]"}],"value":"[:a [1 2 3630]]"}],"value":"{:_id \"3630\", :_rev \"7-7108614ee65fe5569e25035e40e64155\", :a [1 2 3630]}"}],"value":"[\"3630\" {:_id \"3630\", :_rev \"7-7108614ee65fe5569e25035e40e64155\", :a [1 2 3630]}]"}
;; <=

;; @@
(dissoc! db "68")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@26e66ddd&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@26e66ddd>"}
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
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@43734c8a&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@43734c8a>"}
;; <=

;; @@
(:result (meta *1))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;5-6c14da3a23e15df51e0e7596ed9d301c&quot;</span>","value":"\"5-6c14da3a23e15df51e0e7596ed9d301c\""}],"value":"[:_rev \"5-6c14da3a23e15df51e0e7596ed9d301c\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;:foo&quot;</span>","value":"\":foo\""}],"value":"[:_id \":foo\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}],"value":"[:a 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"}],"value":"[:b 7]"}],"value":"{:_rev \"5-6c14da3a23e15df51e0e7596ed9d301c\", :_id \":foo\", :a 6, :b 7}"}
;; <=

;; @@
(get db :foo)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;:foo&quot;</span>","value":"\":foo\""}],"value":"[:_id \":foo\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;5-6c14da3a23e15df51e0e7596ed9d301c&quot;</span>","value":"\"5-6c14da3a23e15df51e0e7596ed9d301c\""}],"value":"[:_rev \"5-6c14da3a23e15df51e0e7596ed9d301c\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}],"value":"[:a 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"}],"value":"[:b 7]"}],"value":"{:_id \":foo\", :_rev \"5-6c14da3a23e15df51e0e7596ed9d301c\", :a 6, :b 7}"}
;; <=

;; @@
;; to clear database
(reduce dissoc! db (for [x (keys db)]
                        x))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@34504008&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@34504008>"}
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
;;; ({:_id &quot;JeffreyCummings&quot;,
;;;   :_rev &quot;2-a77018252a0968b6a2237640bc23625a&quot;,
;;;   :content &quot;This is me.\r\n\r\nback to MainPage.&quot;}
;;;  {:_id &quot;MainPage&quot;,
;;;   :_rev &quot;2-4b1448ea9de259fe8f9e715e4a188ae8&quot;,
;;;   :content &quot;This is a test.\r\n\r\nJeffreyCummings&quot;})
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
;;; ({:disk_format_version 6,
;;;   :db_name &quot;test&quot;,
;;;   :doc_del_count 5001,
;;;   :committed_update_seq 40006,
;;;   :disk_size 143495281,
;;;   :update_seq 40006,
;;;   :purge_seq 0,
;;;   :data_size 2029466,
;;;   :compact_running false,
;;;   :instance_start_time &quot;1442182798284910&quot;,
;;;   :doc_count 0}
;;;  {:disk_format_version 6,
;;;   :db_name &quot;wiki&quot;,
;;;   :doc_del_count 0,
;;;   :committed_update_seq 4,
;;;   :disk_size 16479,
;;;   :update_seq 4,
;;;   :purge_seq 0,
;;;   :data_size 555,
;;;   :compact_running false,
;;;   :instance_start_time &quot;1442678425893900&quot;,
;;;   :doc_count 2})
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(str (java.util.Date. ))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sat Sep 19 12:01:43 EDT 2015&quot;</span>","value":"\"Sat Sep 19 12:01:43 EDT 2015\""}
;; <=

;; @@
(str (java.util.Date. 1442182798284))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sun Sep 13 18:19:58 EDT 2015&quot;</span>","value":"\"Sun Sep 13 18:19:58 EDT 2015\""}
;; <=

;; @@
(str (java.util.Date. 1442678425893))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sat Sep 19 12:00:25 EDT 2015&quot;</span>","value":"\"Sat Sep 19 12:00:25 EDT 2015\""}
;; <=

;; @@
(.getTime (java.util.Date.))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>1442678648913</span>","value":"1442678648913"}
;; <=

;; @@
(time (reduce dissoc! db (for [x (keys db)]
                        x)))
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
