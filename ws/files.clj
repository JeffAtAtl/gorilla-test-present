;; gorilla-repl.fileformat = 1

;; **
;;; # Files
;;; 
;;; Examples of file and spreadsheet manipulation.
;; **

;; @@
(ns files
  (:use gorilla-plot.core)
  (:use gorilla-repl.table)
  (:use dk.ative.docjure.spreadsheet)
  (:use clojure.pprint)
  (:use clojure.repl))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def ws (java.io.File. "ws"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;files/ws</span>","value":"#'files/ws"}
;; <=

;; @@
(seq (.list ws))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;central-limit.clj&quot;</span>","value":"\"central-limit.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;clock-demo.clj&quot;</span>","value":"\"clock-demo.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;couchdb-example.clj&quot;</span>","value":"\"couchdb-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;expression-render.clj&quot;</span>","value":"\"expression-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;files.clj&quot;</span>","value":"\"files.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;first.clj&quot;</span>","value":"\"first.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;graph-examples.clj&quot;</span>","value":"\"graph-examples.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;hiccup-test.clj&quot;</span>","value":"\"hiccup-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;incanter.clj&quot;</span>","value":"\"incanter.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;introduction.clj&quot;</span>","value":"\"introduction.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;loom-test.clj&quot;</span>","value":"\"loom-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;matrix-form-test.clj&quot;</span>","value":"\"matrix-form-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;mongo-example.clj&quot;</span>","value":"\"mongo-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;mysql-example.clj&quot;</span>","value":"\"mysql-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;new-render.clj&quot;</span>","value":"\"new-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;redis-example.clj&quot;</span>","value":"\"redis-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;scanmaster.clj&quot;</span>","value":"\"scanmaster.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;second.clj&quot;</span>","value":"\"second.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;sicp-1.clj&quot;</span>","value":"\"sicp-1.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;test.clj&quot;</span>","value":"\"test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;words.clj&quot;</span>","value":"\"words.clj\""}],"value":"(\"central-limit.clj\" \"clock-demo.clj\" \"couchdb-example.clj\" \"expression-render.clj\" \"files.clj\" \"first.clj\" \"graph-examples.clj\" \"hiccup-test.clj\" \"incanter.clj\" \"introduction.clj\" \"loom-test.clj\" \"matrix-form-test.clj\" \"mongo-example.clj\" \"mysql-example.clj\" \"new-render.clj\" \"redis-example.clj\" \"scanmaster.clj\" \"second.clj\" \"sicp-1.clj\" \"test.clj\" \"words.clj\")"}
;; <=

;; @@
(def wd (java.io.File. "."))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;files/wd</span>","value":"#'files/wd"}
;; <=

;; @@
(seq (.list wd))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;.git&quot;</span>","value":"\".git\""},{"type":"html","content":"<span class='clj-string'>&quot;.gitignore&quot;</span>","value":"\".gitignore\""},{"type":"html","content":"<span class='clj-string'>&quot;.gorilla-port&quot;</span>","value":"\".gorilla-port\""},{"type":"html","content":"<span class='clj-string'>&quot;.nrepl-port&quot;</span>","value":"\".nrepl-port\""},{"type":"html","content":"<span class='clj-string'>&quot;data&quot;</span>","value":"\"data\""},{"type":"html","content":"<span class='clj-string'>&quot;leinGorilla034.bat&quot;</span>","value":"\"leinGorilla034.bat\""},{"type":"html","content":"<span class='clj-string'>&quot;LICENCE.txt&quot;</span>","value":"\"LICENCE.txt\""},{"type":"html","content":"<span class='clj-string'>&quot;project.clj&quot;</span>","value":"\"project.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;README.md&quot;</span>","value":"\"README.md\""},{"type":"html","content":"<span class='clj-string'>&quot;spreadsheet.xlsx&quot;</span>","value":"\"spreadsheet.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;src&quot;</span>","value":"\"src\""},{"type":"html","content":"<span class='clj-string'>&quot;target&quot;</span>","value":"\"target\""},{"type":"html","content":"<span class='clj-string'>&quot;test.xlsx&quot;</span>","value":"\"test.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;ws&quot;</span>","value":"\"ws\""}],"value":"(\".git\" \".gitignore\" \".gorilla-port\" \".nrepl-port\" \"data\" \"leinGorilla034.bat\" \"LICENCE.txt\" \"project.clj\" \"README.md\" \"spreadsheet.xlsx\" \"src\" \"target\" \"test.xlsx\" \"ws\")"}
;; <=

;; @@
(println (slurp "project.clj"))
;; @@
;; ->
;;; (defproject gorilla-test &quot;0.1.0-SNAPSHOT&quot;
;;;   :description &quot;A test project for the Gorilla REPL.&quot;
;;;   :dependencies [[org.clojure/clojure &quot;1.5.1&quot;]
;;;                  [com.vijaykiran/docjure &quot;1.7.0&quot;]
;;;                  [com.novemberain/monger &quot;1.7.0-beta1&quot;]
;;;                  [incanter &quot;1.5.4&quot;]
;;;                  [org.clojure/core.match &quot;0.2.0&quot;]
;;;                  [org.clojure/core.unify &quot;0.5.6&quot;]
;;;                  [clojurewerkz/neocons &quot;2.0.1&quot;]
;;;                  [clj-gremlin &quot;0.0.3&quot;]
;;;                  [clj-blueprints2 &quot;0.0.1&quot; :exclusions [com.tinkerpop.blueprints/blueprints-core]]
;;;                  [gavagai &quot;0.3.1&quot;]
;;;                  [prismatic/plumbing &quot;0.3.3&quot;]
;;;                  [clojureql &quot;1.0.4&quot;]
;;;                  [lein-kibit &quot;0.0.8&quot;]
;;;                  [rplevy-draker/wabbitmq &quot;0.3.0&quot; :exclusions [org.clojure/clojure]]
;;;                  [com.mysql/connectorj &quot;5.1.12&quot;]
;;;                  [hiccup &quot;1.0.5&quot;]
;;;                  [expresso &quot;0.2.0&quot;]
;;;                  [aysylu/loom &quot;0.5.0&quot;]
;;;                  [loom-gorilla &quot;0.1.0&quot;]
;;;                  [org.clojure/data.xml &quot;0.0.7&quot;]
;;;                  [incanter-gorilla &quot;0.1.0&quot;]
;;;                  [gorilla-renderable &quot;1.0.0&quot;]
;;;                  [com.microsoft/sqljdbc4 &quot;3.0&quot;]
;;; 		 [cn.guoyukun.jdbc/db2jcc &quot;1.4.2&quot;]
;;; 		 [cn.guoyukun.jdbc/db2jcc_license_cu &quot;1.4.2&quot;]
;;;                  [com.taoensso/carmine &quot;2.7.0&quot; :exclusions [org.clojure/clojure]]
;;;                  [com.ashafa/clutch &quot;0.4.0&quot;]
;;;                  [com.uswitch/clj-soap &quot;0.2.3&quot;]]
;;;   :main ^:skip-aot gorilla-test.core
;;;   :target-path &quot;target/%s&quot;
;;;   :plugins [[lein-gorilla &quot;0.3.4&quot;]
;;;             [lein-localrepo &quot;0.3&quot;]]
;;;   :profiles {:uberjar {:aot :all}})
;;; 
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
;; Create a spreadsheet and save it
(let [wb (create-workbook "Price List"
                          [["Name" "Price"]
                           ["Foo Widget" 100]
                           ["Bar Widget" 200]
                           ["Baz Widget" 300]])
      sheet (select-sheet "Price List" wb)
      header-row (first (row-seq sheet))]
  (do
    (set-row-style! header-row (create-cell-style! wb {:background :yellow,
                                                       :font {:bold true}}))
    (save-workbook! "spreadsheet.xlsx" wb)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(table-view (->> (load-workbook "spreadsheet.xlsx")
     (select-sheet "Price List")
     (select-columns {:A :name, :B :price})
     (map (juxt :name :price))))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;Name&quot;</span>","value":"\"Name\""},{"type":"html","content":"<span class='clj-string'>&quot;Price&quot;</span>","value":"\"Price\""}],"value":"[\"Name\" \"Price\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;Foo Widget&quot;</span>","value":"\"Foo Widget\""},{"type":"html","content":"<span class='clj-double'>100.0</span>","value":"100.0"}],"value":"[\"Foo Widget\" 100.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;Bar Widget&quot;</span>","value":"\"Bar Widget\""},{"type":"html","content":"<span class='clj-double'>200.0</span>","value":"200.0"}],"value":"[\"Bar Widget\" 200.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;Baz Widget&quot;</span>","value":"\"Baz Widget\""},{"type":"html","content":"<span class='clj-double'>300.0</span>","value":"300.0"}],"value":"[\"Baz Widget\" 300.0]"}],"value":"#gorilla_repl.table.TableView{:contents ([\"Name\" \"Price\"] [\"Foo Widget\" 100.0] [\"Bar Widget\" 200.0] [\"Baz Widget\" 300.0]), :opts nil}"}
;; <=

;; @@
(defn diff
  [c]
  (->> c
       (partition 2 1)
       (map reverse)
       (map #(apply - %))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;files/diff</span>","value":"#'files/diff"}
;; <=

;; @@
(diff (range 5))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"}],"value":"(1 1 1 1)"}
;; <=

;; @@
;; Create a spreadsheet and save it
(let [wb (create-workbook "Test"
                          (map (juxt identity
                                     #(* % %))
                               (rest (range 21))))
      sheet (select-sheet "Test" wb)
      header-row (first (row-seq sheet))]
  (do
    (set-row-style! header-row (create-cell-style! wb {:background :yellow,
                                                       :font {:bold true}}))
    (save-workbook! "test.xlsx" wb)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(table-view (->> (load-workbook "test.xlsx")
     (select-sheet "Test")
     (select-columns {:A :number, :B :square})
     (map (juxt :number :square))))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>1.0</span>","value":"1.0"},{"type":"html","content":"<span class='clj-double'>1.0</span>","value":"1.0"}],"value":"[1.0 1.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>2.0</span>","value":"2.0"},{"type":"html","content":"<span class='clj-double'>4.0</span>","value":"4.0"}],"value":"[2.0 4.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>3.0</span>","value":"3.0"},{"type":"html","content":"<span class='clj-double'>9.0</span>","value":"9.0"}],"value":"[3.0 9.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>4.0</span>","value":"4.0"},{"type":"html","content":"<span class='clj-double'>16.0</span>","value":"16.0"}],"value":"[4.0 16.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>5.0</span>","value":"5.0"},{"type":"html","content":"<span class='clj-double'>25.0</span>","value":"25.0"}],"value":"[5.0 25.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>6.0</span>","value":"6.0"},{"type":"html","content":"<span class='clj-double'>36.0</span>","value":"36.0"}],"value":"[6.0 36.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>7.0</span>","value":"7.0"},{"type":"html","content":"<span class='clj-double'>49.0</span>","value":"49.0"}],"value":"[7.0 49.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>8.0</span>","value":"8.0"},{"type":"html","content":"<span class='clj-double'>64.0</span>","value":"64.0"}],"value":"[8.0 64.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>9.0</span>","value":"9.0"},{"type":"html","content":"<span class='clj-double'>81.0</span>","value":"81.0"}],"value":"[9.0 81.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>10.0</span>","value":"10.0"},{"type":"html","content":"<span class='clj-double'>100.0</span>","value":"100.0"}],"value":"[10.0 100.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>11.0</span>","value":"11.0"},{"type":"html","content":"<span class='clj-double'>121.0</span>","value":"121.0"}],"value":"[11.0 121.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>12.0</span>","value":"12.0"},{"type":"html","content":"<span class='clj-double'>144.0</span>","value":"144.0"}],"value":"[12.0 144.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>13.0</span>","value":"13.0"},{"type":"html","content":"<span class='clj-double'>169.0</span>","value":"169.0"}],"value":"[13.0 169.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>14.0</span>","value":"14.0"},{"type":"html","content":"<span class='clj-double'>196.0</span>","value":"196.0"}],"value":"[14.0 196.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>15.0</span>","value":"15.0"},{"type":"html","content":"<span class='clj-double'>225.0</span>","value":"225.0"}],"value":"[15.0 225.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>16.0</span>","value":"16.0"},{"type":"html","content":"<span class='clj-double'>256.0</span>","value":"256.0"}],"value":"[16.0 256.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>17.0</span>","value":"17.0"},{"type":"html","content":"<span class='clj-double'>289.0</span>","value":"289.0"}],"value":"[17.0 289.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>18.0</span>","value":"18.0"},{"type":"html","content":"<span class='clj-double'>324.0</span>","value":"324.0"}],"value":"[18.0 324.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>19.0</span>","value":"19.0"},{"type":"html","content":"<span class='clj-double'>361.0</span>","value":"361.0"}],"value":"[19.0 361.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>20.0</span>","value":"20.0"},{"type":"html","content":"<span class='clj-double'>400.0</span>","value":"400.0"}],"value":"[20.0 400.0]"}],"value":"#gorilla_repl.table.TableView{:contents ([1.0 1.0] [2.0 4.0] [3.0 9.0] [4.0 16.0] [5.0 25.0] [6.0 36.0] [7.0 49.0] [8.0 64.0] [9.0 81.0] [10.0 100.0] [11.0 121.0] [12.0 144.0] [13.0 169.0] [14.0 196.0] [15.0 225.0] [16.0 256.0] [17.0 289.0] [18.0 324.0] [19.0 361.0] [20.0 400.0]), :opts nil}"}
;; <=

;; @@
(->> (load-workbook "test.xlsx")
     (select-sheet "Test")
     (select-columns {:A :number, :B :square})
     (map (juxt :number :square))
     (map second)
     (diff))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>3.0</span>","value":"3.0"},{"type":"html","content":"<span class='clj-double'>5.0</span>","value":"5.0"},{"type":"html","content":"<span class='clj-double'>7.0</span>","value":"7.0"},{"type":"html","content":"<span class='clj-double'>9.0</span>","value":"9.0"},{"type":"html","content":"<span class='clj-double'>11.0</span>","value":"11.0"},{"type":"html","content":"<span class='clj-double'>13.0</span>","value":"13.0"},{"type":"html","content":"<span class='clj-double'>15.0</span>","value":"15.0"},{"type":"html","content":"<span class='clj-double'>17.0</span>","value":"17.0"},{"type":"html","content":"<span class='clj-double'>19.0</span>","value":"19.0"},{"type":"html","content":"<span class='clj-double'>21.0</span>","value":"21.0"},{"type":"html","content":"<span class='clj-double'>23.0</span>","value":"23.0"},{"type":"html","content":"<span class='clj-double'>25.0</span>","value":"25.0"},{"type":"html","content":"<span class='clj-double'>27.0</span>","value":"27.0"},{"type":"html","content":"<span class='clj-double'>29.0</span>","value":"29.0"},{"type":"html","content":"<span class='clj-double'>31.0</span>","value":"31.0"},{"type":"html","content":"<span class='clj-double'>33.0</span>","value":"33.0"},{"type":"html","content":"<span class='clj-double'>35.0</span>","value":"35.0"},{"type":"html","content":"<span class='clj-double'>37.0</span>","value":"37.0"},{"type":"html","content":"<span class='clj-double'>39.0</span>","value":"39.0"}],"value":"(3.0 5.0 7.0 9.0 11.0 13.0 15.0 17.0 19.0 21.0 23.0 25.0 27.0 29.0 31.0 33.0 35.0 37.0 39.0)"}
;; <=

;; @@
(pprint (sort (.split (System/getProperty "java.class.path") ";")))
;; @@
;; ->
;;; (&quot;C:\\Users\\Jeffrey\\.m2\\repository\\args4j\\args4j\\2.0.16\\args4j-2.0.16.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\aysylu\\loom\\0.5.0\\loom-0.5.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\bouncycastle\\bcmail-jdk14\\138\\bcmail-jdk14-138.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\bouncycastle\\bcprov-jdk14\\138\\bcprov-jdk14-138.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.1.2\\logback-classic-1.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.1.2\\logback-core-1.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cheshire\\cheshire\\5.3.1\\cheshire-5.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cider\\cider-nrepl\\0.8.1\\cider-nrepl-0.8.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clatrix\\clatrix\\0.3.0\\clatrix-0.3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-blueprints2\\clj-blueprints2\\0.0.1\\clj-blueprints2-0.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-gremlin\\clj-gremlin\\0.0.3\\clj-gremlin-0.0.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-http\\clj-http\\0.7.8\\clj-http-0.7.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-time\\clj-time\\0.5.0\\clj-time-0.5.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cljs-tooling\\cljs-tooling\\0.1.3\\cljs-tooling-0.1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojure-complete\\clojure-complete\\0.2.3\\clojure-complete-0.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojureql\\clojureql\\1.0.4\\clojureql-1.0.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojurewerkz\\neocons\\2.0.1\\neocons-2.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojurewerkz\\support\\0.19.0\\support-0.19.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojurewerkz\\urly\\2.0.0-alpha5\\urly-2.0.0-alpha5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clout\\clout\\1.2.0\\clout-1.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cn\\guoyukun\\jdbc\\db2jcc\\1.4.2\\db2jcc-1.4.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cn\\guoyukun\\jdbc\\db2jcc_license_cu\\1.4.2\\db2jcc_license_cu-1.4.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\colt\\colt\\1.2.0\\colt-1.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\ashafa\\clutch\\0.4.0\\clutch-0.4.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\cemerick\\piggieback\\0.1.3\\piggieback-0.1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\cemerick\\url\\0.0.6\\url-0.0.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-core\\2.3.1\\jackson-core-2.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\fasterxml\\jackson\\dataformat\\jackson-dataformat-smile\\2.3.1\\jackson-dataformat-smile-2.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\AMDJ\\1.0.1\\AMDJ-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\BTFJ\\1.0.1\\BTFJ-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\COLAMDJ\\1.0.1\\COLAMDJ-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\JKLU\\1.0.0\\JKLU-1.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\google\\code\\findbugs\\jsr305\\1.3.9\\jsr305-1.3.9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\google\\guava\\guava\\14.0.1\\guava-14.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\google\\javascript\\closure-compiler\\v20130603\\closure-compiler-v20130603.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\google\\protobuf\\protobuf-java\\2.4.1\\protobuf-java-2.4.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\googlecode\\netlib-java\\netlib-java\\0.9.3\\netlib-java-0.9.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\keminglabs\\cljx\\0.4.0\\cljx-0.4.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\lowagie\\itext\\2.1.7\\itext-2.1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\microsoft\\sqljdbc4\\3.0\\sqljdbc4-3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\mysql\\connectorj\\5.1.12\\connectorj-5.1.12.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\novemberain\\monger\\1.7.0-beta1\\monger-1.7.0-beta1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\novemberain\\validateur\\1.5.0\\validateur-1.5.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\rabbitmq\\amqp-client\\2.8.1\\amqp-client-2.8.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\carmine\\2.7.0\\carmine-2.7.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\encore\\1.7.1\\encore-1.7.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\nippy\\2.6.3\\nippy-2.6.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\timbre\\3.2.1\\timbre-3.2.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\blueprints\\blueprints-core\\2.2.0\\blueprints-core-2.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\gremlin\\gremlin-java\\2.2.0\\gremlin-java-2.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\pipes\\2.2.0\\pipes-2.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\uswitch\\clj-soap\\0.2.3\\clj-soap-0.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\vijaykiran\\docjure\\1.7.0\\docjure-1.7.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-codec\\commons-codec\\1.9\\commons-codec-1.9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-fileupload\\commons-fileupload\\1.3\\commons-fileupload-1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-httpclient\\commons-httpclient\\3.1\\commons-httpclient-3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-io\\commons-io\\2.4\\commons-io-2.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-logging\\commons-logging\\1.1.3\\commons-logging-1.1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\compliment\\compliment\\0.2.0\\compliment-0.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\compojure\\compojure\\1.1.8\\compojure-1.1.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\concurrent\\concurrent\\1.3.4\\concurrent-1.3.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\congomongo\\congomongo\\0.3.3\\congomongo-0.3.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\crouton\\crouton\\0.1.1\\crouton-0.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\de\\kotka\\lazymap\\3.1.0\\lazymap-3.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\dom4j\\dom4j\\1.6.1\\dom4j-1.6.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\expresso\\expresso\\0.2.0\\expresso-0.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\fr\\grunwald\\lazymap\\3.1.0\\lazymap-3.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gavagai\\gavagai\\0.3.1\\gavagai-0.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-renderable\\gorilla-renderable\\1.0.0\\gorilla-renderable-1.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-repl\\gorilla-repl\\0.3.4\\gorilla-repl-0.3.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\grimradical\\clj-semver\\0.2.0\\clj-semver-0.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\hiccup\\hiccup\\1.0.5\\hiccup-1.0.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\http-kit\\http-kit\\2.1.18\\http-kit-2.1.18.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter-gorilla\\incanter-gorilla\\0.1.0\\incanter-gorilla-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-charts\\1.5.4\\incanter-charts-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-core\\1.5.4\\incanter-core-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-excel\\1.5.4\\incanter-excel-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-io\\1.5.4\\incanter-io-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-latex\\1.5.4\\incanter-latex-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-mongodb\\1.5.4\\incanter-mongodb-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-pdf\\1.5.4\\incanter-pdf-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-sql\\1.5.4\\incanter-sql-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-svg\\1.5.4\\incanter-svg-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-zoo\\1.5.4\\incanter-zoo-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter\\1.5.4\\incanter-1.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\jcommon\\1.0.16\\jcommon-1.0.16.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\jfreechart\\1.0.13-no-gnujaxp\\jfreechart-1.0.13-no-gnujaxp.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\instaparse\\instaparse\\1.2.2\\instaparse-1.2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\io\\aviso\\pretty\\0.1.10\\pretty-0.1.10.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\javax\\servlet\\servlet-api\\2.5\\servlet-api-2.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\javax\\ws\\rs\\jsr311-api\\1.0\\jsr311-api-1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\jaxen\\jaxen\\1.1.3\\jaxen-1.1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\jline\\jline\\2.11\\jline-2.11.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\joda-time\\joda-time\\2.2\\joda-time-2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\jonase\\kibit\\0.0.8\\kibit-0.0.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\junit\\junit\\4.10\\junit-4.10.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\lein-kibit\\lein-kibit\\0.0.8\\lein-kibit-0.0.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\loom-gorilla\\loom-gorilla\\0.1.0\\loom-gorilla-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\cgrand\\parsley\\0.9.1\\parsley-0.9.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\cgrand\\regex\\1.1.0\\regex-1.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\mikera\\core.matrix\\0.10.0\\core.matrix-0.10.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sf\\opencsv\\opencsv\\2.3\\opencsv-2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\csparsej\\csparsej\\1.1.1\\csparsej-1.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\f2j\\arpack_combined_all\\0.1\\arpack_combined_all-0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jplasma\\core-lapack\\0.1\\core-lapack-0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jplasma\\jplasma\\1.2.0\\jplasma-1.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jtransforms\\jtransforms\\2.4.0\\jtransforms-2.4.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\parallelcolt\\optimization\\1.0\\optimization-1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\parallelcolt\\parallelcolt\\0.10.0\\parallelcolt-0.10.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-adb\\1.6.2\\axis2-adb-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-kernel\\1.6.2\\axis2-kernel-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-transport-http\\1.6.2\\axis2-transport-http-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-transport-local\\1.6.2\\axis2-transport-local-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\commons\\commons-pool2\\2.2\\commons-pool2-2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-activation_1.1_spec\\1.0.2\\geronimo-activation_1.1_spec-1.0.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-javamail_1.4_spec\\1.7.1\\geronimo-javamail_1.4_spec-1.7.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-jta_1.1_spec\\1.1\\geronimo-jta_1.1_spec-1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-stax-api_1.0_spec\\1.0.1\\geronimo-stax-api_1.0_spec-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-ws-metadata_2.0_spec\\1.1.2\\geronimo-ws-metadata_2.0_spec-1.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpclient\\4.3.1\\httpclient-4.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpcore\\4.3\\httpcore-4.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpmime\\4.3.1\\httpmime-4.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\james\\apache-mime4j-core\\0.7.2\\apache-mime4j-core-0.7.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\neethi\\neethi\\3.0.2\\neethi-3.0.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\poi\\poi-ooxml-schemas\\3.9\\poi-ooxml-schemas-3.9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\poi\\poi-ooxml\\3.9\\poi-ooxml-3.9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\poi\\poi\\3.9\\poi-3.9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\woden\\woden-api\\1.0M9\\woden-api-1.0M9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\woden\\woden-impl-commons\\1.0M9\\woden-impl-commons-1.0M9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\woden\\woden-impl-dom\\1.0M9\\woden-impl-dom-1.0M9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\ws\\commons\\axiom\\axiom-api\\1.2.13\\axiom-api-1.2.13.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\ws\\commons\\axiom\\axiom-impl\\1.2.13\\axiom-impl-1.2.13.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\ws\\commons\\schema\\XmlSchema\\1.4.7\\XmlSchema-1.4.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlbeans\\xmlbeans\\2.3.0\\xmlbeans-2.3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-awt-util\\1.7\\batik-awt-util-1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-css\\1.7\\batik-css-1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-dom\\1.7\\batik-dom-1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-ext\\1.7\\batik-ext-1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-svggen\\1.7\\batik-svggen-1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-util\\1.7\\batik-util-1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-xml\\1.7\\batik-xml-1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\bouncycastle\\bcmail-jdk14\\1.38\\bcmail-jdk14-1.38.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\bouncycastle\\bcprov-jdk14\\1.38\\bcprov-jdk14-1.38.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\bouncycastle\\bctsp-jdk14\\1.38\\bctsp-jdk14-1.38.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojars\\trptcolin\\sjacket\\0.1.0.6\\sjacket-0.1.0.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\clojure\\1.5.1\\clojure-1.5.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\clojurescript\\0.0-2080\\clojurescript-0.0-2080.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.cache\\0.6.3\\core.cache-0.6.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.incubator\\0.1.1\\core.incubator-0.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.logic\\0.8.4\\core.logic-0.8.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.match\\0.2.0\\core.match-0.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.memoize\\0.5.6\\core.memoize-0.5.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.unify\\0.5.6\\core.unify-0.5.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.codec\\0.1.0\\data.codec-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.json\\0.2.5\\data.json-0.2.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.priority-map\\0.0.5\\data.priority-map-0.0.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.xml\\0.0.7\\data.xml-0.0.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\google-closure-library-third-party\\0.0-20130212-95c19e7f0f5f\\google-closure-library-third-party-0.0-20130212-95c19e7f0f5f.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\google-closure-library\\0.0-20130212-95c19e7f0f5f\\google-closure-library-0.0-20130212-95c19e7f0f5f.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\java.classpath\\0.2.0\\java.classpath-0.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\java.jdbc\\0.2.3\\java.jdbc-0.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\math.combinatorics\\0.0.3\\math.combinatorics-0.0.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.cli\\0.2.2\\tools.cli-0.2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.macro\\0.1.0\\tools.macro-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.namespace\\0.2.5\\tools.namespace-0.2.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.nrepl\\0.2.6\\tools.nrepl-0.2.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.reader\\0.8.1\\tools.reader-0.8.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.trace\\0.7.8\\tools.trace-0.7.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jackson\\jackson-core-asl\\1.8.5\\jackson-core-asl-1.8.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jackson\\jackson-mapper-asl\\1.8.5\\jackson-mapper-asl-1.8.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jettison\\jettison\\1.3\\jettison-1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\woodstox\\wstx-asl\\3.2.9\\wstx-asl-3.2.9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\danlarkin\\clojure-json\\1.1\\clojure-json-1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\hamcrest\\hamcrest-core\\1.1\\hamcrest-core-1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\iq80\\snappy\\snappy\\0.3\\snappy-0.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\jblas\\jblas\\1.2.3\\jblas-1.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\json\\json\\20090211\\json-20090211.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\jsoup\\jsoup\\1.7.1\\jsoup-1.7.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\mongodb\\mongo-java-driver\\2.11.2\\mongo-java-driver-2.11.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\mozilla\\rhino\\1.7R4\\rhino-1.7R4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\scilab\\forge\\jlatexmath\\0.9.6\\jlatexmath-0.9.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\slf4j\\slf4j-api\\1.7.7\\slf4j-api-1.7.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\tcrawley\\dynapath\\0.2.3\\dynapath-0.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\tukaani\\xz\\1.5\\xz-1.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\pathetic\\pathetic\\0.4.0\\pathetic-0.4.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\potemkin\\potemkin\\0.3.2\\potemkin-0.3.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\prismatic\\plumbing\\0.3.3\\plumbing-0.3.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\prismatic\\schema\\0.2.4\\schema-0.2.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ragtime\\ragtime.core\\0.3.4\\ragtime.core-0.3.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-codec\\1.0.0\\ring-codec-1.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-core\\1.2.2\\ring-core-1.2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-json\\0.3.1\\ring-json-0.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\rplevy-draker\\wabbitmq\\0.3.0\\wabbitmq-0.3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\slingshot\\slingshot\\0.10.3\\slingshot-0.10.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\stax\\stax-api\\1.0.1\\stax-api-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\swingrepl\\swingrepl\\1.3.0\\swingrepl-1.3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\tigris\\tigris\\0.1.1\\tigris-0.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\watchtower\\watchtower\\0.1.1\\watchtower-0.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\wsdl4j\\wsdl4j\\1.6.2\\wsdl4j-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xalan\\xalan\\2.6.0\\xalan-2.6.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xml-apis\\xml-apis-ext\\1.3.04\\xml-apis-ext-1.3.04.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xml-apis\\xml-apis\\1.0.b2\\xml-apis-1.0.b2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\dev-resources&quot;
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\resources&quot;
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src&quot;
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\target\\base+system+user+dev\\classes&quot;
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\test&quot;)
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(pprint (->> (all-ns)
             (map #(.name %))
             (sort)))
;; @@
;; ->
;;; (cemerick.piggieback
;;;  cemerick.url
;;;  cheshire.core
;;;  cheshire.factory
;;;  cheshire.generate
;;;  cheshire.parse
;;;  cider.nrepl
;;;  cider.nrepl.middleware.apropos
;;;  cider.nrepl.middleware.classpath
;;;  cider.nrepl.middleware.complete
;;;  cider.nrepl.middleware.info
;;;  cider.nrepl.middleware.inspect
;;;  cider.nrepl.middleware.macroexpand
;;;  cider.nrepl.middleware.ns
;;;  cider.nrepl.middleware.resource
;;;  cider.nrepl.middleware.stacktrace
;;;  cider.nrepl.middleware.test
;;;  cider.nrepl.middleware.trace
;;;  cider.nrepl.middleware.undef
;;;  cider.nrepl.middleware.util.cljs
;;;  cider.nrepl.middleware.util.inspect
;;;  cider.nrepl.middleware.util.java
;;;  cider.nrepl.middleware.util.misc
;;;  clj-http.client
;;;  clj-http.conn-mgr
;;;  clj-http.cookies
;;;  clj-http.core
;;;  clj-http.links
;;;  clj-http.multipart
;;;  clj-http.util
;;;  clj-semver.core
;;;  clj-time.core
;;;  clj-time.format
;;;  cljs-tooling.complete
;;;  cljs-tooling.info
;;;  cljs-tooling.util.analysis
;;;  cljs-tooling.util.misc
;;;  cljs.analyzer
;;;  cljs.closure
;;;  cljs.compiler
;;;  cljs.env
;;;  cljs.repl
;;;  cljs.repl.rhino
;;;  cljs.source-map
;;;  cljs.source-map.base64
;;;  cljs.source-map.base64-vlq
;;;  cljs.tagged-literals
;;;  clojure.core
;;;  clojure.core.incubator
;;;  clojure.core.protocols
;;;  clojure.data.codec.base64
;;;  clojure.data.json
;;;  clojure.data.priority-map
;;;  clojure.instant
;;;  clojure.java.classpath
;;;  clojure.java.io
;;;  clojure.java.shell
;;;  clojure.main
;;;  clojure.pprint
;;;  clojure.reflect
;;;  clojure.repl
;;;  clojure.set
;;;  clojure.stacktrace
;;;  clojure.string
;;;  clojure.template
;;;  clojure.test
;;;  clojure.tools.macro
;;;  clojure.tools.nrepl
;;;  clojure.tools.nrepl.ack
;;;  clojure.tools.nrepl.bencode
;;;  clojure.tools.nrepl.middleware
;;;  clojure.tools.nrepl.middleware.interruptible-eval
;;;  clojure.tools.nrepl.middleware.load-file
;;;  clojure.tools.nrepl.middleware.pr-values
;;;  clojure.tools.nrepl.middleware.session
;;;  clojure.tools.nrepl.misc
;;;  clojure.tools.nrepl.server
;;;  clojure.tools.nrepl.transport
;;;  clojure.tools.reader
;;;  clojure.tools.reader.default-data-readers
;;;  clojure.tools.reader.edn
;;;  clojure.tools.reader.impl.ExceptionInfo
;;;  clojure.tools.reader.impl.commons
;;;  clojure.tools.reader.impl.utils
;;;  clojure.tools.reader.reader-types
;;;  clojure.tools.trace
;;;  clojure.uuid
;;;  clojure.walk
;;;  clout.core
;;;  com.ashafa.clutch
;;;  com.ashafa.clutch.http-client
;;;  com.ashafa.clutch.utils
;;;  complete.core
;;;  compliment.context
;;;  compliment.core
;;;  compliment.sources
;;;  compliment.sources.class-members
;;;  compliment.sources.keywords
;;;  compliment.sources.local-bindings
;;;  compliment.sources.namespaces-and-classes
;;;  compliment.sources.ns-mappings
;;;  compliment.sources.special-forms
;;;  compliment.utils
;;;  compojure.core
;;;  compojure.handler
;;;  compojure.response
;;;  compojure.route
;;;  couchdb-example
;;;  crouton.html
;;;  dk.ative.docjure.spreadsheet
;;;  dynapath.defaults
;;;  dynapath.dynamic-classpath
;;;  dynapath.util
;;;  files
;;;  gorilla-plot.core
;;;  gorilla-plot.util
;;;  gorilla-plot.vega
;;;  gorilla-renderable.core
;;;  gorilla-repl.core
;;;  gorilla-repl.files
;;;  gorilla-repl.latex
;;;  gorilla-repl.nrepl
;;;  gorilla-repl.render-values-mw
;;;  gorilla-repl.renderer
;;;  gorilla-repl.table
;;;  gorilla-repl.vega
;;;  gorilla-repl.version
;;;  gorilla-repl.websocket-relay
;;;  io.aviso.ansi
;;;  io.aviso.columns
;;;  io.aviso.exception
;;;  io.aviso.writer
;;;  loom-gorilla.render
;;;  loom-test
;;;  loom.alg
;;;  loom.alg-generic
;;;  loom.attr
;;;  loom.flow
;;;  loom.graph
;;;  loom.io
;;;  mongo-example
;;;  org.httpkit.client
;;;  org.httpkit.server
;;;  pathetic.core
;;;  redis-example
;;;  ring.middleware.content-type
;;;  ring.middleware.cookies
;;;  ring.middleware.file-info
;;;  ring.middleware.flash
;;;  ring.middleware.head
;;;  ring.middleware.json
;;;  ring.middleware.keyword-params
;;;  ring.middleware.multipart-params
;;;  ring.middleware.nested-params
;;;  ring.middleware.params
;;;  ring.middleware.session
;;;  ring.middleware.session.memory
;;;  ring.middleware.session.store
;;;  ring.util.codec
;;;  ring.util.io
;;;  ring.util.mime-type
;;;  ring.util.response
;;;  ring.util.time
;;;  slingshot.slingshot
;;;  slingshot.support
;;;  somnium.congomongo
;;;  somnium.congomongo.coerce
;;;  somnium.congomongo.config
;;;  taoensso.carmine
;;;  taoensso.carmine.commands
;;;  taoensso.carmine.connections
;;;  taoensso.carmine.protocol
;;;  taoensso.carmine.utils
;;;  taoensso.encore
;;;  taoensso.nippy
;;;  taoensso.nippy.compression
;;;  taoensso.nippy.encryption
;;;  taoensso.nippy.tools
;;;  taoensso.nippy.utils
;;;  taoensso.timbre
;;;  user)
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@

;; @@
