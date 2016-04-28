;; gorilla-repl.fileformat = 1

;; **
;;; # Files
;;; 
;;; Examples of file and spreadsheet manipulation.
;; **

;; @@
(ns files
  (:use gorilla-plot.core)
  (:use [gorilla-repl table latex html])
  (:use dk.ative.docjure.spreadsheet)
  (:use clojure.pprint)
  (:use clojure.repl)
  (:use clojure.data.json))
;; @@

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
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;abrade-ex&quot;</span>","value":"\"abrade-ex\""},{"type":"html","content":"<span class='clj-string'>&quot;central-limit.clj&quot;</span>","value":"\"central-limit.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;clock-demo.clj&quot;</span>","value":"\"clock-demo.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;couchdb-example.clj&quot;</span>","value":"\"couchdb-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;expression-render.clj&quot;</span>","value":"\"expression-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;files.clj&quot;</span>","value":"\"files.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;first.clj&quot;</span>","value":"\"first.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;graph-examples.clj&quot;</span>","value":"\"graph-examples.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;hiccup-test.clj&quot;</span>","value":"\"hiccup-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;incanter.clj&quot;</span>","value":"\"incanter.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;introduction.clj&quot;</span>","value":"\"introduction.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;loom-test.clj&quot;</span>","value":"\"loom-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;matrix-form-test.clj&quot;</span>","value":"\"matrix-form-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;mongo-example.clj&quot;</span>","value":"\"mongo-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;mysql-example.clj&quot;</span>","value":"\"mysql-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;new-render.clj&quot;</span>","value":"\"new-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;redis-example.clj&quot;</span>","value":"\"redis-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;scanmaster.clj&quot;</span>","value":"\"scanmaster.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;second.clj&quot;</span>","value":"\"second.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;sicp-1.clj&quot;</span>","value":"\"sicp-1.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;test.clj&quot;</span>","value":"\"test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;unified-update-model.clj&quot;</span>","value":"\"unified-update-model.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;words.clj&quot;</span>","value":"\"words.clj\""}],"value":"(\"abrade-ex\" \"central-limit.clj\" \"clock-demo.clj\" \"couchdb-example.clj\" \"expression-render.clj\" \"files.clj\" \"first.clj\" \"graph-examples.clj\" \"hiccup-test.clj\" \"incanter.clj\" \"introduction.clj\" \"loom-test.clj\" \"matrix-form-test.clj\" \"mongo-example.clj\" \"mysql-example.clj\" \"new-render.clj\" \"redis-example.clj\" \"scanmaster.clj\" \"second.clj\" \"sicp-1.clj\" \"test.clj\" \"unified-update-model.clj\" \"words.clj\")"}
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
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;.git&quot;</span>","value":"\".git\""},{"type":"html","content":"<span class='clj-string'>&quot;.gitignore&quot;</span>","value":"\".gitignore\""},{"type":"html","content":"<span class='clj-string'>&quot;.gorilla-port&quot;</span>","value":"\".gorilla-port\""},{"type":"html","content":"<span class='clj-string'>&quot;.nrepl-port&quot;</span>","value":"\".nrepl-port\""},{"type":"html","content":"<span class='clj-string'>&quot;.project.clj.un~&quot;</span>","value":"\".project.clj.un~\""},{"type":"html","content":"<span class='clj-string'>&quot;data&quot;</span>","value":"\"data\""},{"type":"html","content":"<span class='clj-string'>&quot;leinGorilla036.bat&quot;</span>","value":"\"leinGorilla036.bat\""},{"type":"html","content":"<span class='clj-string'>&quot;LICENCE.txt&quot;</span>","value":"\"LICENCE.txt\""},{"type":"html","content":"<span class='clj-string'>&quot;project.clj&quot;</span>","value":"\"project.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;project.clj~&quot;</span>","value":"\"project.clj~\""},{"type":"html","content":"<span class='clj-string'>&quot;README.md&quot;</span>","value":"\"README.md\""},{"type":"html","content":"<span class='clj-string'>&quot;spreadsheet.xlsx&quot;</span>","value":"\"spreadsheet.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;src&quot;</span>","value":"\"src\""},{"type":"html","content":"<span class='clj-string'>&quot;target&quot;</span>","value":"\"target\""},{"type":"html","content":"<span class='clj-string'>&quot;test.xlsx&quot;</span>","value":"\"test.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;ws&quot;</span>","value":"\"ws\""}],"value":"(\".git\" \".gitignore\" \".gorilla-port\" \".nrepl-port\" \".project.clj.un~\" \"data\" \"leinGorilla036.bat\" \"LICENCE.txt\" \"project.clj\" \"project.clj~\" \"README.md\" \"spreadsheet.xlsx\" \"src\" \"target\" \"test.xlsx\" \"ws\")"}
;; <=

;; @@
(->> (file-seq wd)
     (map #(.getName %))
     (filter #(.endsWith % ".clj"))
     pprint)
;; @@
;; ->
;;; (&quot;project.clj&quot;
;;;  &quot;core.clj&quot;
;;;  &quot;expresso_latex.clj&quot;
;;;  &quot;classpath.clj&quot;
;;;  &quot;core.clj&quot;
;;;  &quot;elastisch.clj&quot;
;;;  &quot;mongo.clj&quot;
;;;  &quot;neo.clj&quot;
;;;  &quot;numbers.clj&quot;
;;;  &quot;rabbitmq.clj&quot;
;;;  &quot;words.clj&quot;
;;;  &quot;render.clj&quot;
;;;  &quot;central-limit.clj&quot;
;;;  &quot;clock-demo.clj&quot;
;;;  &quot;couchdb-example.clj&quot;
;;;  &quot;expression-render.clj&quot;
;;;  &quot;files.clj&quot;
;;;  &quot;first.clj&quot;
;;;  &quot;graph-examples.clj&quot;
;;;  &quot;hiccup-test.clj&quot;
;;;  &quot;incanter.clj&quot;
;;;  &quot;introduction.clj&quot;
;;;  &quot;loom-test.clj&quot;
;;;  &quot;matrix-form-test.clj&quot;
;;;  &quot;mongo-example.clj&quot;
;;;  &quot;mysql-example.clj&quot;
;;;  &quot;new-render.clj&quot;
;;;  &quot;redis-example.clj&quot;
;;;  &quot;scanmaster.clj&quot;
;;;  &quot;second.clj&quot;
;;;  &quot;sicp-1.clj&quot;
;;;  &quot;test.clj&quot;
;;;  &quot;unified-update-model.clj&quot;
;;;  &quot;words.clj&quot;)
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(println (slurp "project.clj"))
;; @@
;; ->
;;; (defproject gorilla-test &quot;0.1.0-SNAPSHOT&quot;
;;;   :description &quot;A test project for the Gorilla REPL.&quot;
;;;   :dependencies [[org.clojure/clojure &quot;1.7.0&quot;]
;;;                  [com.vijaykiran/docjure &quot;1.7.0&quot;]
;;;                  [org.clojure/core.match &quot;0.2.2&quot;]
;;;                  [org.clojure/core.unify &quot;0.5.6&quot;]
;;;                  [clojurewerkz/neocons &quot;3.1.0&quot;]
;;;                  [clj-gremlin &quot;0.0.3&quot;]
;;;                  [clj-blueprints2 &quot;0.0.1&quot; :exclusions [com.tinkerpop.blueprints/blueprints-core]]
;;;                  [gavagai &quot;0.3.2&quot;]
;;;                  [prismatic/plumbing &quot;0.5.2&quot;]
;;;                  [clojureql &quot;1.0.4&quot;]
;;;                  [lein-kibit &quot;0.1.2&quot;]
;;;                  [rplevy-draker/wabbitmq &quot;0.3.0&quot; :exclusions [org.clojure/clojure]]
;;;                  [com.mysql/connectorj &quot;5.1.12&quot;]
;;;                  [hiccup &quot;1.0.5&quot;]
;;;                  [expresso &quot;0.2.0&quot;]
;;;                  [aysylu/loom &quot;0.5.4&quot;]
;;;                  [loom-gorilla &quot;0.1.0&quot;]
;;;                  [org.clojure/data.xml &quot;0.0.8&quot;]
;;;                  [incanter-gorilla &quot;0.1.0&quot;]
;;;                  [gorilla-renderable &quot;2.0.0&quot;]
;;;                  [com.microsoft/sqljdbc4 &quot;3.0&quot;]
;;;                  [cn.guoyukun.jdbc/db2jcc &quot;1.4.2&quot;]
;;;                  [cn.guoyukun.jdbc/db2jcc_license_cu &quot;1.4.2&quot;]
;;;                  [com.taoensso/carmine &quot;2.12.2&quot; :exclusions [org.clojure/clojure]]
;;;                  [com.ashafa/clutch &quot;0.4.0&quot;]
;;;                  [com.uswitch/clj-soap &quot;0.2.3&quot;]
;;;                  [proto-repl &quot;0.1.2&quot;]
;;;                  [abrade &quot;0.1.8&quot;]]
;;;   :main ^:skip-aot gorilla-test.core
;;;   :target-path &quot;target/%s&quot;
;;;   :plugins [[lein-gorilla &quot;0.3.6&quot;]
;;;             [lein-localrepo &quot;0.5.3&quot;]]
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
                           ["Baz Widget" 300]
                           ["Biz Widget" 400]])
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
                 rest
                 (map (juxt (comp html-view :name) :price)))
            )
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"Foo Widget","value":"#gorilla_repl.html.HtmlView{:content \"Foo Widget\"}"},{"type":"html","content":"<span class='clj-double'>100.0</span>","value":"100.0"}],"value":"[#gorilla_repl.html.HtmlView{:content \"Foo Widget\"} 100.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"Bar Widget","value":"#gorilla_repl.html.HtmlView{:content \"Bar Widget\"}"},{"type":"html","content":"<span class='clj-double'>200.0</span>","value":"200.0"}],"value":"[#gorilla_repl.html.HtmlView{:content \"Bar Widget\"} 200.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"Baz Widget","value":"#gorilla_repl.html.HtmlView{:content \"Baz Widget\"}"},{"type":"html","content":"<span class='clj-double'>300.0</span>","value":"300.0"}],"value":"[#gorilla_repl.html.HtmlView{:content \"Baz Widget\"} 300.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"Biz Widget","value":"#gorilla_repl.html.HtmlView{:content \"Biz Widget\"}"},{"type":"html","content":"<span class='clj-double'>400.0</span>","value":"400.0"}],"value":"[#gorilla_repl.html.HtmlView{:content \"Biz Widget\"} 400.0]"}],"value":"#gorilla_repl.table.TableView{:contents ([#gorilla_repl.html.HtmlView{:content \"Foo Widget\"} 100.0] [#gorilla_repl.html.HtmlView{:content \"Bar Widget\"} 200.0] [#gorilla_repl.html.HtmlView{:content \"Baz Widget\"} 300.0] [#gorilla_repl.html.HtmlView{:content \"Biz Widget\"} 400.0]), :opts nil}"}
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
;;; (&quot;C:\\Users\\Jeffrey\\.m2\\repository\\abrade\\abrade\\0.1.8\\abrade-0.1.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\aysylu\\loom\\0.5.4\\loom-0.5.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\bouncycastle\\bcmail-jdk14\\138\\bcmail-jdk14-138.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\bouncycastle\\bcprov-jdk14\\138\\bcprov-jdk14-138.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.1.2\\logback-classic-1.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.1.2\\logback-core-1.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cheshire\\cheshire\\5.3.1\\cheshire-5.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cider\\cider-nrepl\\0.10.2\\cider-nrepl-0.10.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clatrix\\clatrix\\0.3.0\\clatrix-0.3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-blueprints2\\clj-blueprints2\\0.0.1\\clj-blueprints2-0.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-gremlin\\clj-gremlin\\0.0.3\\clj-gremlin-0.0.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-http\\clj-http\\2.0.0\\clj-http-2.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-time\\clj-time\\0.4.4\\clj-time-0.4.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-tuple\\clj-tuple\\0.2.2\\clj-tuple-0.2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojure-complete\\clojure-complete\\0.2.4\\clojure-complete-0.2.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojureql\\clojureql\\1.0.4\\clojureql-1.0.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojurewerkz\\neocons\\3.1.0\\neocons-3.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojurewerkz\\support\\1.1.0\\support-1.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clout\\clout\\1.2.0\\clout-1.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cn\\guoyukun\\jdbc\\db2jcc\\1.4.2\\db2jcc-1.4.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cn\\guoyukun\\jdbc\\db2jcc_license_cu\\1.4.2\\db2jcc_license_cu-1.4.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\colt\\colt\\1.2.0\\colt-1.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\ashafa\\clutch\\0.4.0\\clutch-0.4.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\cemerick\\url\\0.0.6\\url-0.0.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-core\\2.3.1\\jackson-core-2.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\fasterxml\\jackson\\dataformat\\jackson-dataformat-smile\\2.3.1\\jackson-dataformat-smile-2.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\AMDJ\\1.0.1\\AMDJ-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\BTFJ\\1.0.1\\BTFJ-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\COLAMDJ\\1.0.1\\COLAMDJ-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\JKLU\\1.0.0\\JKLU-1.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\googlecode\\netlib-java\\netlib-java\\0.9.3\\netlib-java-0.9.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\lowagie\\itext\\2.1.7\\itext-2.1.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\microsoft\\sqljdbc4\\3.0\\sqljdbc4-3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\mysql\\connectorj\\5.1.12\\connectorj-5.1.12.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\rabbitmq\\amqp-client\\2.8.1\\amqp-client-2.8.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\carmine\\2.12.2\\carmine-2.12.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\encore\\2.32.0\\encore-2.32.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\nippy\\2.10.0\\nippy-2.10.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\timbre\\4.2.1\\timbre-4.2.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\truss\\1.0.0\\truss-1.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\blueprints\\blueprints-core\\2.2.0\\blueprints-core-2.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\gremlin\\gremlin-java\\2.2.0\\gremlin-java-2.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\pipes\\2.2.0\\pipes-2.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\uswitch\\clj-soap\\0.2.3\\clj-soap-0.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\vijaykiran\\docjure\\1.7.0\\docjure-1.7.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-codec\\commons-codec\\1.10\\commons-codec-1.10.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-fileupload\\commons-fileupload\\1.3\\commons-fileupload-1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-httpclient\\commons-httpclient\\3.1\\commons-httpclient-3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-io\\commons-io\\2.4\\commons-io-2.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\compliment\\compliment\\0.2.7\\compliment-0.2.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\compojure\\compojure\\1.1.8\\compojure-1.1.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\concurrent\\concurrent\\1.3.4\\concurrent-1.3.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\congomongo\\congomongo\\0.3.3\\congomongo-0.3.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\de\\kotka\\lazymap\\3.1.0\\lazymap-3.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\defprecated\\defprecated\\0.1.3\\defprecated-0.1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\dom4j\\dom4j\\1.6.1\\dom4j-1.6.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\expresso\\expresso\\0.2.0\\expresso-0.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\fr\\grunwald\\lazymap\\3.1.0\\lazymap-3.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gavagai\\gavagai\\0.3.2\\gavagai-0.3.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-plot\\gorilla-plot\\0.1.4\\gorilla-plot-0.1.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-renderable\\gorilla-renderable\\2.0.0\\gorilla-renderable-2.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-repl\\gorilla-repl\\0.3.6\\gorilla-repl-0.3.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\grimradical\\clj-semver\\0.2.0\\clj-semver-0.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\hiccup\\hiccup\\1.0.5\\hiccup-1.0.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\http-kit\\http-kit\\2.1.18\\http-kit-2.1.18.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter-gorilla\\incanter-gorilla\\0.1.0\\incanter-gorilla-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-charts\\1.5.5\\incanter-charts-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-core\\1.5.5\\incanter-core-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-excel\\1.5.5\\incanter-excel-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-io\\1.5.5\\incanter-io-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-latex\\1.5.5\\incanter-latex-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-mongodb\\1.5.5\\incanter-mongodb-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-pdf\\1.5.5\\incanter-pdf-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-sql\\1.5.5\\incanter-sql-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-svg\\1.5.5\\incanter-svg-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-zoo\\1.5.5\\incanter-zoo-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter\\1.5.5\\incanter-1.5.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\jcommon\\1.0.16\\jcommon-1.0.16.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\jfreechart\\1.0.13-no-gnujaxp\\jfreechart-1.0.13-no-gnujaxp.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\instaparse\\instaparse\\1.2.2\\instaparse-1.2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\io\\aviso\\pretty\\0.1.21\\pretty-0.1.21.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\javax\\servlet\\servlet-api\\2.5\\servlet-api-2.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\javax\\ws\\rs\\jsr311-api\\1.0\\jsr311-api-1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\jaxen\\jaxen\\1.1.3\\jaxen-1.1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\joda-time\\joda-time\\2.1\\joda-time-2.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\jonase\\kibit\\0.1.2\\kibit-0.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\junit\\junit\\4.8.2\\junit-4.8.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\lein-kibit\\lein-kibit\\0.1.2\\lein-kibit-0.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\loom-gorilla\\loom-gorilla\\0.1.0\\loom-gorilla-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\jpountz\\lz4\\lz4\\1.3\\lz4-1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\mikera\\core.matrix\\0.10.0\\core.matrix-0.10.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sf\\opencsv\\opencsv\\2.3\\opencsv-2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\csparsej\\csparsej\\1.1.1\\csparsej-1.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\cssparser\\cssparser\\0.9.18\\cssparser-0.9.18.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\f2j\\arpack_combined_all\\0.1\\arpack_combined_all-0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\htmlunit\\htmlunit-core-js\\2.17\\htmlunit-core-js-2.17.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\htmlunit\\htmlunit\\2.21\\htmlunit-2.21.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\htmlunit\\neko-htmlunit\\2.21\\neko-htmlunit-2.21.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jplasma\\core-lapack\\0.1\\core-lapack-0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jplasma\\jplasma\\1.2.0\\jplasma-1.2.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jtransforms\\jtransforms\\2.4.0\\jtransforms-2.4.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\parallelcolt\\optimization\\1.0\\optimization-1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\parallelcolt\\parallelcolt\\0.10.1\\parallelcolt-0.10.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-adb\\1.6.2\\axis2-adb-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-kernel\\1.6.2\\axis2-kernel-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-transport-http\\1.6.2\\axis2-transport-http-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-transport-local\\1.6.2\\axis2-transport-local-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\commons\\commons-lang3\\3.4\\commons-lang3-3.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\commons\\commons-pool2\\2.4.2\\commons-pool2-2.4.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-activation_1.1_spec\\1.0.2\\geronimo-activation_1.1_spec-1.0.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-javamail_1.4_spec\\1.7.1\\geronimo-javamail_1.4_spec-1.7.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-jta_1.1_spec\\1.1\\geronimo-jta_1.1_spec-1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-stax-api_1.0_spec\\1.0.1\\geronimo-stax-api_1.0_spec-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-ws-metadata_2.0_spec\\1.1.2\\geronimo-ws-metadata_2.0_spec-1.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpclient\\4.5\\httpclient-4.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpcore\\4.4.1\\httpcore-4.4.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpmime\\4.5\\httpmime-4.5.jar&quot;
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
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\clojure\\1.7.0\\clojure-1.7.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.cache\\0.6.3\\core.cache-0.6.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.incubator\\0.1.1\\core.incubator-0.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.logic\\0.8.4\\core.logic-0.8.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.match\\0.2.2\\core.match-0.2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.memoize\\0.5.6\\core.memoize-0.5.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.unify\\0.5.6\\core.unify-0.5.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.codec\\0.1.0\\data.codec-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.json\\0.2.6\\data.json-0.2.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.priority-map\\0.0.5\\data.priority-map-0.0.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.xml\\0.0.8\\data.xml-0.0.8.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.zip\\0.1.1\\data.zip-0.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\java.jdbc\\0.2.3\\java.jdbc-0.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\math.combinatorics\\0.0.4\\math.combinatorics-0.0.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.analyzer.jvm\\0.1.0-beta12\\tools.analyzer.jvm-0.1.0-beta12.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.analyzer\\0.1.0-beta12\\tools.analyzer-0.1.0-beta12.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.cli\\0.3.1\\tools.cli-0.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.macro\\0.1.0\\tools.macro-0.1.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.nrepl\\0.2.12\\tools.nrepl-0.2.12.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.reader\\0.10.0\\tools.reader-0.10.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jackson\\jackson-core-asl\\1.8.5\\jackson-core-asl-1.8.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jackson\\jackson-mapper-asl\\1.8.5\\jackson-mapper-asl-1.8.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jettison\\jettison\\1.3\\jettison-1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\woodstox\\wstx-asl\\3.2.9\\wstx-asl-3.2.9.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\danlarkin\\clojure-json\\1.1\\clojure-json-1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\jetty-io\\9.2.15.v20160210\\jetty-io-9.2.15.v20160210.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\jetty-util\\9.2.15.v20160210\\jetty-util-9.2.15.v20160210.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-api\\9.2.15.v20160210\\websocket-api-9.2.15.v20160210.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-client\\9.2.15.v20160210\\websocket-client-9.2.15.v20160210.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-common\\9.2.15.v20160210\\websocket-common-9.2.15.v20160210.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\iq80\\snappy\\snappy\\0.4\\snappy-0.4.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\jblas\\jblas\\1.2.3\\jblas-1.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\mongodb\\mongo-java-driver\\2.9.3\\mongo-java-driver-2.9.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\ow2\\asm\\asm-all\\4.1\\asm-all-4.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\scilab\\forge\\jlatexmath\\0.9.6\\jlatexmath-0.9.6.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\slf4j\\slf4j-api\\1.7.7\\slf4j-api-1.7.7.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\tcrawley\\dynapath\\0.2.3\\dynapath-0.2.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\tukaani\\xz\\1.5\\xz-1.5.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\w3c\\css\\sac\\1.3\\sac-1.3.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\pathetic\\pathetic\\0.4.0\\pathetic-0.4.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\potemkin\\potemkin\\0.4.1\\potemkin-0.4.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\prismatic\\plumbing\\0.5.2\\plumbing-0.5.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\prismatic\\schema\\1.0.1\\schema-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\proto-repl\\proto-repl\\0.1.2\\proto-repl-0.1.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\riddley\\riddley\\0.1.10\\riddley-0.1.10.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-codec\\1.0.0\\ring-codec-1.0.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-core\\1.2.2\\ring-core-1.2.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-json\\0.3.1\\ring-json-0.3.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\rplevy-draker\\wabbitmq\\0.3.0\\wabbitmq-0.3.0.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\slingshot\\slingshot\\0.12.2\\slingshot-0.12.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\stax\\stax-api\\1.0.1\\stax-api-1.0.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\tigris\\tigris\\0.1.1\\tigris-0.1.1.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\wsdl4j\\wsdl4j\\1.6.2\\wsdl4j-1.6.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xalan\\serializer\\2.7.2\\serializer-2.7.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xalan\\xalan\\2.7.2\\xalan-2.7.2.jar&quot;
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xerces\\xercesImpl\\2.11.0\\xercesImpl-2.11.0.jar&quot;
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
;;; (abrade-ex
;;;  abrade.client
;;;  cheshire.core
;;;  cheshire.factory
;;;  cheshire.generate
;;;  cheshire.parse
;;;  cider.nrepl
;;;  cider.nrepl.middleware.apropos
;;;  cider.nrepl.middleware.classpath
;;;  cider.nrepl.middleware.complete
;;;  cider.nrepl.middleware.debug
;;;  cider.nrepl.middleware.format
;;;  cider.nrepl.middleware.info
;;;  cider.nrepl.middleware.inspect
;;;  cider.nrepl.middleware.macroexpand
;;;  cider.nrepl.middleware.ns
;;;  cider.nrepl.middleware.out
;;;  cider.nrepl.middleware.pprint
;;;  cider.nrepl.middleware.refresh
;;;  cider.nrepl.middleware.resource
;;;  cider.nrepl.middleware.stacktrace
;;;  cider.nrepl.middleware.test
;;;  cider.nrepl.middleware.trace
;;;  cider.nrepl.middleware.track-state
;;;  cider.nrepl.middleware.undef
;;;  cider.nrepl.middleware.util.cljs
;;;  cider.nrepl.middleware.util.inspect
;;;  cider.nrepl.middleware.util.instrument
;;;  cider.nrepl.middleware.util.java
;;;  cider.nrepl.middleware.util.misc
;;;  cider.nrepl.print-method
;;;  clj-semver.core
;;;  clojure.core
;;;  clojure.core.protocols
;;;  clojure.data.json
;;;  clojure.instant
;;;  clojure.java.io
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
;;;  clojure.uuid
;;;  clojure.walk
;;;  clojure.zip
;;;  clout.core
;;;  compojure.core
;;;  compojure.response
;;;  compojure.route
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
;;;  gorilla-repl.handle
;;;  gorilla-repl.html
;;;  gorilla-repl.latex
;;;  gorilla-repl.nrepl
;;;  gorilla-repl.render-values-mw
;;;  gorilla-repl.renderer
;;;  gorilla-repl.table
;;;  gorilla-repl.vega
;;;  gorilla-repl.version
;;;  gorilla-repl.websocket-relay
;;;  mranderson046.cljfmt.v0v3v0.cljfmt.core
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.coerce
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.comment
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.fn
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.forms
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.integer
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.keyword
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.meta
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.protocols
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.quote
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.reader-macro
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.seq
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.string
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.token
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.uneval
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.whitespace
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.core
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.keyword
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.string
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.token
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.utils
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.whitespace
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.potemkin
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.reader
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.base
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.edit
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.find
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.insert
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.move
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.remove
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.seq
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.subedit
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.utils
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.walk
;;;  mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.whitespace
;;;  mranderson046.cljs-tooling.v0v1v9.cljs-tooling.complete
;;;  mranderson046.cljs-tooling.v0v1v9.cljs-tooling.info
;;;  mranderson046.cljs-tooling.v0v1v9.cljs-tooling.util.analysis
;;;  mranderson046.cljs-tooling.v0v1v9.cljs-tooling.util.misc
;;;  mranderson046.compliment.v0v2v6.compliment.context
;;;  mranderson046.compliment.v0v2v6.compliment.core
;;;  mranderson046.compliment.v0v2v6.compliment.sources
;;;  mranderson046.compliment.v0v2v6.compliment.sources.class-members
;;;  mranderson046.compliment.v0v2v6.compliment.sources.keywords
;;;  mranderson046.compliment.v0v2v6.compliment.sources.local-bindings
;;;  mranderson046.compliment.v0v2v6.compliment.sources.namespaces-and-classes
;;;  mranderson046.compliment.v0v2v6.compliment.sources.ns-mappings
;;;  mranderson046.compliment.v0v2v6.compliment.sources.resources
;;;  mranderson046.compliment.v0v2v6.compliment.sources.special-forms
;;;  mranderson046.compliment.v0v2v6.compliment.utils
;;;  mranderson046.compliment.v0v2v6.defprecated.v0v1v2.defprecated.core
;;;  mranderson046.javaclasspath.v0v2v3.clojure.java.classpath
;;;  mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.dependency
;;;  mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.dir
;;;  mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.file
;;;  mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.find
;;;  mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.parse
;;;  mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.reload
;;;  mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.track
;;;  mranderson046.toolsreader.v0v10v0.clojure.tools.reader
;;;  mranderson046.toolsreader.v0v10v0.clojure.tools.reader.default-data-readers
;;;  mranderson046.toolsreader.v0v10v0.clojure.tools.reader.edn
;;;  mranderson046.toolsreader.v0v10v0.clojure.tools.reader.impl.commons
;;;  mranderson046.toolsreader.v0v10v0.clojure.tools.reader.impl.utils
;;;  mranderson046.toolsreader.v0v10v0.clojure.tools.reader.reader-types
;;;  mranderson046.toolstrace.v0v7v9.clojure.tools.trace
;;;  org.httpkit.client
;;;  org.httpkit.server
;;;  ring.middleware.content-type
;;;  ring.middleware.file-info
;;;  ring.middleware.head
;;;  ring.middleware.json
;;;  ring.middleware.keyword-params
;;;  ring.middleware.params
;;;  ring.util.codec
;;;  ring.util.io
;;;  ring.util.mime-type
;;;  ring.util.response
;;;  ring.util.time
;;;  user)
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(dir clojure.data.json)
;; @@
;; ->
;;; -write
;;; JSONWriter
;;; json-str
;;; pprint
;;; pprint-json
;;; print-json
;;; read
;;; read-json
;;; read-str
;;; write
;;; write-json
;;; write-str
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(doc clojure.data.json/read-str)
;; @@
;; ->
;;; -------------------------
;;; clojure.data.json/read-str
;;; ([string &amp; options])
;;;   Reads one JSON value from input String. Options are the same as for
;;;   read.
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(clojure.data.json/write-str {:a 1 :b [{:c "one"} {:d 5}]})
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;{\\&quot;a\\&quot;:1,\\&quot;b\\&quot;:[{\\&quot;c\\&quot;:\\&quot;one\\&quot;},{\\&quot;d\\&quot;:5}]}&quot;</span>","value":"\"{\\\"a\\\":1,\\\"b\\\":[{\\\"c\\\":\\\"one\\\"},{\\\"d\\\":5}]}\""}
;; <=

;; @@
(clojure.data.json/pprint {:a 1 :b [{:c "one"} {:d 5}]})
;; @@
;; ->
;;; {&quot;a&quot;:1, &quot;b&quot;:[{&quot;c&quot;:&quot;one&quot;}, {&quot;d&quot;:5}]}
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(clojure.data.json/read-str "{\"a\":1, \"b\":[{\"c\":\"one\"}, {\"d\":5}]}" :key-fn keyword)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"}],"value":"[:a 1]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:c</span>","value":":c"},{"type":"html","content":"<span class='clj-string'>&quot;one&quot;</span>","value":"\"one\""}],"value":"[:c \"one\"]"}],"value":"{:c \"one\"}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:d</span>","value":":d"},{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"}],"value":"[:d 5]"}],"value":"{:d 5}"}],"value":"[{:c \"one\"} {:d 5}]"}],"value":"[:b [{:c \"one\"} {:d 5}]]"}],"value":"{:a 1, :b [{:c \"one\"} {:d 5}]}"}
;; <=

;; @@
(slurp "http://localhost:8083/CodingTest/WorkItem/FOO")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;{\\&quot;category\\&quot;:\\&quot;FOO\\&quot;,\\&quot;cost\\&quot;:\\&quot;1\\&quot;,\\&quot;date\\&quot;:\\&quot;20160314_161631.230888295\\&quot;,\\&quot;uuid\\&quot;:\\&quot;ddcfa347-18e4-4783-ab93-6cb9dcb75d43\\&quot;}&quot;</span>","value":"\"{\\\"category\\\":\\\"FOO\\\",\\\"cost\\\":\\\"1\\\",\\\"date\\\":\\\"20160314_161631.230888295\\\",\\\"uuid\\\":\\\"ddcfa347-18e4-4783-ab93-6cb9dcb75d43\\\"}\""}
;; <=

;; @@
(clojure.data.json/read-str (slurp "http://localhost:8083/CodingTest/WorkItem/BAR") :key-fn keyword)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:category</span>","value":":category"},{"type":"html","content":"<span class='clj-string'>&quot;BAR&quot;</span>","value":"\"BAR\""}],"value":"[:category \"BAR\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:cost</span>","value":":cost"},{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""}],"value":"[:cost \"1\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:date</span>","value":":date"},{"type":"html","content":"<span class='clj-string'>&quot;20160314_161631.230888295&quot;</span>","value":"\"20160314_161631.230888295\""}],"value":"[:date \"20160314_161631.230888295\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:uuid</span>","value":":uuid"},{"type":"html","content":"<span class='clj-string'>&quot;ddcfa347-18e4-4783-ab93-6cb9dcb75d43&quot;</span>","value":"\"ddcfa347-18e4-4783-ab93-6cb9dcb75d43\""}],"value":"[:uuid \"ddcfa347-18e4-4783-ab93-6cb9dcb75d43\"]"}],"value":"{:category \"BAR\", :cost \"1\", :date \"20160314_161631.230888295\", :uuid \"ddcfa347-18e4-4783-ab93-6cb9dcb75d43\"}"}
;; <=

;; @@
(time (clojure.data.json/read-str (slurp "http://localhost:8083/CodingTest/WorkItem/BAR") :key-fn keyword))
;; @@
;; ->
;;; &quot;Elapsed time: 5660.469469 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:category</span>","value":":category"},{"type":"html","content":"<span class='clj-string'>&quot;BAR&quot;</span>","value":"\"BAR\""}],"value":"[:category \"BAR\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:cost</span>","value":":cost"},{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""}],"value":"[:cost \"0\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:date</span>","value":":date"},{"type":"html","content":"<span class='clj-string'>&quot;20160314_182211.140713614&quot;</span>","value":"\"20160314_182211.140713614\""}],"value":"[:date \"20160314_182211.140713614\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:uuid</span>","value":":uuid"},{"type":"html","content":"<span class='clj-string'>&quot;428363d7-8777-4f55-91ea-a18a2ed0a4c1&quot;</span>","value":"\"428363d7-8777-4f55-91ea-a18a2ed0a4c1\""}],"value":"[:uuid \"428363d7-8777-4f55-91ea-a18a2ed0a4c1\"]"}],"value":"{:category \"BAR\", :cost \"0\", :date \"20160314_182211.140713614\", :uuid \"428363d7-8777-4f55-91ea-a18a2ed0a4c1\"}"}
;; <=

;; @@
(time (clojure.data.json/read-str (slurp "http://localhost:8083/CodingTest/WorkItem/FOO") :key-fn keyword))
;; @@
;; ->
;;; &quot;Elapsed time: 139.56166 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:category</span>","value":":category"},{"type":"html","content":"<span class='clj-string'>&quot;FOO&quot;</span>","value":"\"FOO\""}],"value":"[:category \"FOO\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:cost</span>","value":":cost"},{"type":"html","content":"<span class='clj-string'>&quot;7&quot;</span>","value":"\"7\""}],"value":"[:cost \"7\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:date</span>","value":":date"},{"type":"html","content":"<span class='clj-string'>&quot;20160314_182211.139276295&quot;</span>","value":"\"20160314_182211.139276295\""}],"value":"[:date \"20160314_182211.139276295\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:uuid</span>","value":":uuid"},{"type":"html","content":"<span class='clj-string'>&quot;6645fc4b-8633-41fb-8e44-b01f2d8ac242&quot;</span>","value":"\"6645fc4b-8633-41fb-8e44-b01f2d8ac242\""}],"value":"[:uuid \"6645fc4b-8633-41fb-8e44-b01f2d8ac242\"]"}],"value":"{:category \"FOO\", :cost \"7\", :date \"20160314_182211.139276295\", :uuid \"6645fc4b-8633-41fb-8e44-b01f2d8ac242\"}"}
;; <=

;; @@
(time (clojure.data.json/read-str (slurp "http://localhost:8083/CodingTest/WorkItem/BAZ") :key-fn keyword))
;; @@
;; ->
;;; &quot;Elapsed time: 89.521737 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:category</span>","value":":category"},{"type":"html","content":"<span class='clj-string'>&quot;BAZ&quot;</span>","value":"\"BAZ\""}],"value":"[:category \"BAZ\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:cost</span>","value":":cost"},{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""}],"value":"[:cost \"1\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:date</span>","value":":date"},{"type":"html","content":"<span class='clj-string'>&quot;20160314_182211.143483136&quot;</span>","value":"\"20160314_182211.143483136\""}],"value":"[:date \"20160314_182211.143483136\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:uuid</span>","value":":uuid"},{"type":"html","content":"<span class='clj-string'>&quot;b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4&quot;</span>","value":"\"b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4\""}],"value":"[:uuid \"b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4\"]"}],"value":"{:category \"BAZ\", :cost \"1\", :date \"20160314_182211.143483136\", :uuid \"b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4\"}"}
;; <=

;; @@
(time (clojure.data.json/read-str (slurp "http://localhost:8083/CodingTest/WorkItem/XXX") :key-fn keyword))
;; @@
;; ->
;;; &quot;Elapsed time: 71.977749 msecs&quot;
;;; 
;; <-
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:category</span>","value":":category"},{"type":"html","content":"<span class='clj-string'>&quot;BAZ&quot;</span>","value":"\"BAZ\""}],"value":"[:category \"BAZ\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:cost</span>","value":":cost"},{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""}],"value":"[:cost \"1\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:date</span>","value":":date"},{"type":"html","content":"<span class='clj-string'>&quot;20160314_182211.143483136&quot;</span>","value":"\"20160314_182211.143483136\""}],"value":"[:date \"20160314_182211.143483136\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:uuid</span>","value":":uuid"},{"type":"html","content":"<span class='clj-string'>&quot;b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4&quot;</span>","value":"\"b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4\""}],"value":"[:uuid \"b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4\"]"}],"value":"{:category \"BAZ\", :cost \"1\", :date \"20160314_182211.143483136\", :uuid \"b8f3cf9e-1adc-41b7-832c-c9a3fe37f3b4\"}"}
;; <=

;; @@

;; @@
