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
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@20853d8c&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@20853d8c>"}
;; <=

;; @@
(:result (meta *1))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-record'>#cemerick.url.URL{</span>","close":"<span class='clj-record'>}</span>","separator":" ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:protocol</span>","value":":protocol"},{"type":"html","content":"<span class='clj-string'>&quot;http&quot;</span>","value":"\"http\""}],"value":"[:protocol \"http\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:username</span>","value":":username"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:username nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:password</span>","value":":password"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:password nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:host</span>","value":":host"},{"type":"html","content":"<span class='clj-string'>&quot;localhost&quot;</span>","value":"\"localhost\""}],"value":"[:host \"localhost\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:port</span>","value":":port"},{"type":"html","content":"<span class='clj-unkown'>5984</span>","value":"5984"}],"value":"[:port 5984]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:path</span>","value":":path"},{"type":"html","content":"<span class='clj-string'>&quot;/test&quot;</span>","value":"\"/test\""}],"value":"[:path \"/test\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:query</span>","value":":query"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:query nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:anchor</span>","value":":anchor"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:anchor nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:disk_format_version</span>","value":":disk_format_version"},{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}],"value":"[:disk_format_version 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:db_name</span>","value":":db_name"},{"type":"html","content":"<span class='clj-string'>&quot;test&quot;</span>","value":"\"test\""}],"value":"[:db_name \"test\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:doc_del_count</span>","value":":doc_del_count"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:doc_del_count 0]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:committed_update_seq</span>","value":":committed_update_seq"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:committed_update_seq 0]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:disk_size</span>","value":":disk_size"},{"type":"html","content":"<span class='clj-unkown'>79</span>","value":"79"}],"value":"[:disk_size 79]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:update_seq</span>","value":":update_seq"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:update_seq 0]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:purge_seq</span>","value":":purge_seq"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:purge_seq 0]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:data_size</span>","value":":data_size"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:data_size 0]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:compact_running</span>","value":":compact_running"},{"type":"html","content":"<span class='clj-unkown'>false</span>","value":"false"}],"value":"[:compact_running false]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:instance_start_time</span>","value":":instance_start_time"},{"type":"html","content":"<span class='clj-string'>&quot;1425779102864590&quot;</span>","value":"\"1425779102864590\""}],"value":"[:instance_start_time \"1425779102864590\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:doc_count</span>","value":":doc_count"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[:doc_count 0]"}],"value":"#cemerick.url.URL{:protocol \"http\", :username nil, :password nil, :host \"localhost\", :port 5984, :path \"/test\", :query nil, :anchor nil, :disk_format_version 6, :db_name \"test\", :doc_del_count 0, :committed_update_seq 0, :disk_size 79, :update_seq 0, :purge_seq 0, :data_size 0, :compact_running false, :instance_start_time \"1425779102864590\", :doc_count 0}"}
;; <=

;; @@
(reduce conj! db (for [x (range 5000)]
                      {:_id (str x) :a [1 2 x]}))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@7b9ec151&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@7b9ec151>"}
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
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""}],"value":"[:_id \"0\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;1-79fe783154bff972172bc30732783a68&quot;</span>","value":"\"1-79fe783154bff972172bc30732783a68\""}],"value":"[:_rev \"1-79fe783154bff972172bc30732783a68\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[1 2 0]"}],"value":"[:a [1 2 0]]"}],"value":"{:_id \"0\", :_rev \"1-79fe783154bff972172bc30732783a68\", :a [1 2 0]}"}],"value":"[\"0\" {:_id \"0\", :_rev \"1-79fe783154bff972172bc30732783a68\", :a [1 2 0]}]"}
;; <=

;; @@
(dissoc! db "68")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@65637ab5&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@65637ab5>"}
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
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@20f38f88&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@20f38f88>"}
;; <=

;; @@
(:result (meta *1))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;1-ac3fe57a7604cfd6dcca06b25204b590&quot;</span>","value":"\"1-ac3fe57a7604cfd6dcca06b25204b590\""}],"value":"[:_rev \"1-ac3fe57a7604cfd6dcca06b25204b590\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;:foo&quot;</span>","value":"\":foo\""}],"value":"[:_id \":foo\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}],"value":"[:a 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"}],"value":"[:b 7]"}],"value":"{:_rev \"1-ac3fe57a7604cfd6dcca06b25204b590\", :_id \":foo\", :a 6, :b 7}"}
;; <=

;; @@
(get db :foo)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;:foo&quot;</span>","value":"\":foo\""}],"value":"[:_id \":foo\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;1-ac3fe57a7604cfd6dcca06b25204b590&quot;</span>","value":"\"1-ac3fe57a7604cfd6dcca06b25204b590\""}],"value":"[:_rev \"1-ac3fe57a7604cfd6dcca06b25204b590\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}],"value":"[:a 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"}],"value":"[:b 7]"}],"value":"{:_id \":foo\", :_rev \"1-ac3fe57a7604cfd6dcca06b25204b590\", :a 6, :b 7}"}
;; <=

;; @@
;; to clear database
(reduce dissoc! db (for [x (keys db)]
                        x))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@1a29124&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@1a29124>"}
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
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;_replicator&quot;</span>","value":"\"_replicator\""},{"type":"html","content":"<span class='clj-string'>&quot;_users&quot;</span>","value":"\"_users\""},{"type":"html","content":"<span class='clj-string'>&quot;test&quot;</span>","value":"\"test\""},{"type":"html","content":"<span class='clj-string'>&quot;test_suite_db&quot;</span>","value":"\"test_suite_db\""},{"type":"html","content":"<span class='clj-string'>&quot;test_suite_db2&quot;</span>","value":"\"test_suite_db2\""},{"type":"html","content":"<span class='clj-string'>&quot;wiki&quot;</span>","value":"\"wiki\""}],"value":"(\"_replicator\" \"_users\" \"test\" \"test_suite_db\" \"test_suite_db2\" \"wiki\")"}
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
;;; {"type":"html","content":"<span class='clj-unkown'>(&quot;MainPage&quot; &quot;TestPage&quot;)</span>","value":"(\"MainPage\" \"TestPage\")"}
;; <=

;; @@
(pprint (map #(get db-wiki %) (keys db-wiki)))
;; @@
;; ->
;;; ({:_id &quot;MainPage&quot;,
;;;   :_rev &quot;1-33bb4cd4d7ea3ab7494ad5e14ac9a3fc&quot;,
;;;   :content
;;;   &quot;Hello this is the MainPage. \r\n\r\nClick this to get to TestPage&quot;}
;;;  {:_id &quot;TestPage&quot;,
;;;   :_rev &quot;10-4462a9af90a1ed7ebb6e76eba7a2e96e&quot;,
;;;   :content
;;;   &quot;This is a TestPage.\r\n\r\n---\r\n\r\nThis is a TestPage.\r\n\r\n1. test\r\n2. hello\r\n\r\n---\r\n\r\n- test\r\n\r\n----\r\n\r\nMainPage&quot;})
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(couchdb-info)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:couchdb</span>","value":":couchdb"},{"type":"html","content":"<span class='clj-string'>&quot;Welcome&quot;</span>","value":"\"Welcome\""}],"value":"[:couchdb \"Welcome\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:uuid</span>","value":":uuid"},{"type":"html","content":"<span class='clj-string'>&quot;fbe0714ddbd1f1c136ed74cb7ef8443c&quot;</span>","value":"\"fbe0714ddbd1f1c136ed74cb7ef8443c\""}],"value":"[:uuid \"fbe0714ddbd1f1c136ed74cb7ef8443c\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:version</span>","value":":version"},{"type":"html","content":"<span class='clj-string'>&quot;1.5.0&quot;</span>","value":"\"1.5.0\""}],"value":"[:version \"1.5.0\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:vendor</span>","value":":vendor"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Ubuntu&quot;</span>","value":"\"Ubuntu\""}],"value":"[:name \"Ubuntu\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:version</span>","value":":version"},{"type":"html","content":"<span class='clj-string'>&quot;14.04&quot;</span>","value":"\"14.04\""}],"value":"[:version \"14.04\"]"}],"value":"{:name \"Ubuntu\", :version \"14.04\"}"}],"value":"[:vendor {:name \"Ubuntu\", :version \"14.04\"}]"}],"value":"{:couchdb \"Welcome\", :uuid \"fbe0714ddbd1f1c136ed74cb7ef8443c\", :version \"1.5.0\", :vendor {:name \"Ubuntu\", :version \"14.04\"}}"}
;; <=

;; @@
(pprint (map #(database-info %) [db db-wiki]))
;; @@
;; ->
;;; ({:disk_format_version 6,
;;;   :db_name &quot;test&quot;,
;;;   :doc_del_count 1,
;;;   :committed_update_seq 85018,
;;;   :disk_size 317284465,
;;;   :update_seq 85018,
;;;   :purge_seq 0,
;;;   :data_size 3578913,
;;;   :compact_running false,
;;;   :instance_start_time &quot;1423444691727194&quot;,
;;;   :doc_count 5000}
;;;  {:disk_format_version 6,
;;;   :db_name &quot;wiki&quot;,
;;;   :doc_del_count 0,
;;;   :committed_update_seq 26,
;;;   :disk_size 106600,
;;;   :update_seq 26,
;;;   :purge_seq 0,
;;;   :data_size 1860,
;;;   :compact_running false,
;;;   :instance_start_time &quot;1423450082817896&quot;,
;;;   :doc_count 5})
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(str (java.util.Date. 1423444691727194))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Fri Mar 02 02:15:27 EST 47077&quot;</span>","value":"\"Fri Mar 02 02:15:27 EST 47077\""}
;; <=

;; @@
(str (java.util.Date. 1423450082817896))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Thu May 03 12:46:57 EDT 47077&quot;</span>","value":"\"Thu May 03 12:46:57 EDT 47077\""}
;; <=

;; @@

;; @@
