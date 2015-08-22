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
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""}],"value":"[:_id \"0\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;3-b866d84e9f006dca77ad1c6a0a3c20e8&quot;</span>","value":"\"3-b866d84e9f006dca77ad1c6a0a3c20e8\""}],"value":"[:_rev \"3-b866d84e9f006dca77ad1c6a0a3c20e8\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[1 2 0]"}],"value":"[:a [1 2 0]]"}],"value":"{:_id \"0\", :_rev \"3-b866d84e9f006dca77ad1c6a0a3c20e8\", :a [1 2 0]}"}],"value":"[\"0\" {:_id \"0\", :_rev \"3-b866d84e9f006dca77ad1c6a0a3c20e8\", :a [1 2 0]}]"}
;; <=

;; @@
(first copy)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;3630&quot;</span>","value":"\"3630\""},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;3630&quot;</span>","value":"\"3630\""}],"value":"[:_id \"3630\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;3-c451228829614825d215ea5a95adb57d&quot;</span>","value":"\"3-c451228829614825d215ea5a95adb57d\""}],"value":"[:_rev \"3-c451228829614825d215ea5a95adb57d\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>3630</span>","value":"3630"}],"value":"[1 2 3630]"}],"value":"[:a [1 2 3630]]"}],"value":"{:_id \"3630\", :_rev \"3-c451228829614825d215ea5a95adb57d\", :a [1 2 3630]}"}],"value":"[\"3630\" {:_id \"3630\", :_rev \"3-c451228829614825d215ea5a95adb57d\", :a [1 2 3630]}]"}
;; <=

;; @@
(dissoc! db "68")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@31aff5d4&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@31aff5d4>"}
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
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@7627d504&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@7627d504>"}
;; <=

;; @@
(:result (meta *1))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;3-caa601a0001bcc9be51fb1d9619c9967&quot;</span>","value":"\"3-caa601a0001bcc9be51fb1d9619c9967\""}],"value":"[:_rev \"3-caa601a0001bcc9be51fb1d9619c9967\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;:foo&quot;</span>","value":"\":foo\""}],"value":"[:_id \":foo\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}],"value":"[:a 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"}],"value":"[:b 7]"}],"value":"{:_rev \"3-caa601a0001bcc9be51fb1d9619c9967\", :_id \":foo\", :a 6, :b 7}"}
;; <=

;; @@
(get db :foo)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_id</span>","value":":_id"},{"type":"html","content":"<span class='clj-string'>&quot;:foo&quot;</span>","value":"\":foo\""}],"value":"[:_id \":foo\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:_rev</span>","value":":_rev"},{"type":"html","content":"<span class='clj-string'>&quot;3-caa601a0001bcc9be51fb1d9619c9967&quot;</span>","value":"\"3-caa601a0001bcc9be51fb1d9619c9967\""}],"value":"[:_rev \"3-caa601a0001bcc9be51fb1d9619c9967\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}],"value":"[:a 6]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"}],"value":"[:b 7]"}],"value":"{:_id \":foo\", :_rev \"3-caa601a0001bcc9be51fb1d9619c9967\", :a 6, :b 7}"}
;; <=

;; @@
;; to clear database
(reduce dissoc! db (for [x (keys db)]
                        x))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#&lt;CouchDB com.ashafa.clutch.CouchDB@6f6a031c&gt;</span>","value":"#<CouchDB com.ashafa.clutch.CouchDB@6f6a031c>"}
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
;;;   :doc_del_count 1,
;;;   :committed_update_seq 5002,
;;;   :disk_size 13258865,
;;;   :update_seq 5002,
;;;   :purge_seq 0,
;;;   :data_size 791696,
;;;   :compact_running false,
;;;   :instance_start_time &quot;1439172451797540&quot;,
;;;   :doc_count 5000}
;;;  {:disk_format_version 6,
;;;   :db_name &quot;wiki&quot;,
;;;   :doc_del_count 0,
;;;   :committed_update_seq 4,
;;;   :disk_size 16479,
;;;   :update_seq 4,
;;;   :purge_seq 0,
;;;   :data_size 555,
;;;   :compact_running false,
;;;   :instance_start_time &quot;1439172488172540&quot;,
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
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sat Jun 06 20:39:45 EDT 2015&quot;</span>","value":"\"Sat Jun 06 20:39:45 EDT 2015\""}
;; <=

;; @@
(str (java.util.Date. 1436732110082))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sun Jul 12 16:15:10 EDT 2015&quot;</span>","value":"\"Sun Jul 12 16:15:10 EDT 2015\""}
;; <=

;; @@
(str (java.util.Date. 1436751172676))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;Sun Jul 12 21:32:52 EDT 2015&quot;</span>","value":"\"Sun Jul 12 21:32:52 EDT 2015\""}
;; <=

;; @@
(.getTime (java.util.Date.))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>1436751957827</span>","value":"1436751957827"}
;; <=

;; @@

;; @@
