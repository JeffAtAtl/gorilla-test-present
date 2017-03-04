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
  (:use clojure.repl)
  (:use clojure.data.json))
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
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;abrade-ex.clj&quot;</span>","value":"\"abrade-ex.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;central-limit.clj&quot;</span>","value":"\"central-limit.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;clock-demo.clj&quot;</span>","value":"\"clock-demo.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;couchdb-example.clj&quot;</span>","value":"\"couchdb-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;expression-render.clj&quot;</span>","value":"\"expression-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;files.clj&quot;</span>","value":"\"files.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;first.clj&quot;</span>","value":"\"first.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;graph-examples.clj&quot;</span>","value":"\"graph-examples.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;hiccup-test.clj&quot;</span>","value":"\"hiccup-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;incanter.clj&quot;</span>","value":"\"incanter.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;introduction.clj&quot;</span>","value":"\"introduction.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;loom-test.clj&quot;</span>","value":"\"loom-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;matrix-form-test.clj&quot;</span>","value":"\"matrix-form-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;mongo-example.clj&quot;</span>","value":"\"mongo-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;mysql-example.clj&quot;</span>","value":"\"mysql-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;neocons-ex.clj&quot;</span>","value":"\"neocons-ex.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;new-render.clj&quot;</span>","value":"\"new-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;redis-example.clj&quot;</span>","value":"\"redis-example.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;scanmaster.clj&quot;</span>","value":"\"scanmaster.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;second.clj&quot;</span>","value":"\"second.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;sicp-1.clj&quot;</span>","value":"\"sicp-1.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;test.clj&quot;</span>","value":"\"test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;unified-update-model.clj&quot;</span>","value":"\"unified-update-model.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;words.clj&quot;</span>","value":"\"words.clj\""}],"value":"(\"abrade-ex.clj\" \"central-limit.clj\" \"clock-demo.clj\" \"couchdb-example.clj\" \"expression-render.clj\" \"files.clj\" \"first.clj\" \"graph-examples.clj\" \"hiccup-test.clj\" \"incanter.clj\" \"introduction.clj\" \"loom-test.clj\" \"matrix-form-test.clj\" \"mongo-example.clj\" \"mysql-example.clj\" \"neocons-ex.clj\" \"new-render.clj\" \"redis-example.clj\" \"scanmaster.clj\" \"second.clj\" \"sicp-1.clj\" \"test.clj\" \"unified-update-model.clj\" \"words.clj\")"}
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
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;.git&quot;</span>","value":"\".git\""},{"type":"html","content":"<span class='clj-string'>&quot;.gitignore&quot;</span>","value":"\".gitignore\""},{"type":"html","content":"<span class='clj-string'>&quot;.gorilla-port&quot;</span>","value":"\".gorilla-port\""},{"type":"html","content":"<span class='clj-string'>&quot;.nrepl-port&quot;</span>","value":"\".nrepl-port\""},{"type":"html","content":"<span class='clj-string'>&quot;data&quot;</span>","value":"\"data\""},{"type":"html","content":"<span class='clj-string'>&quot;leinGorilla036.bat&quot;</span>","value":"\"leinGorilla036.bat\""},{"type":"html","content":"<span class='clj-string'>&quot;LICENCE.txt&quot;</span>","value":"\"LICENCE.txt\""},{"type":"html","content":"<span class='clj-string'>&quot;project.clj&quot;</span>","value":"\"project.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;README.md&quot;</span>","value":"\"README.md\""},{"type":"html","content":"<span class='clj-string'>&quot;spreadsheet.xlsx&quot;</span>","value":"\"spreadsheet.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;src&quot;</span>","value":"\"src\""},{"type":"html","content":"<span class='clj-string'>&quot;target&quot;</span>","value":"\"target\""},{"type":"html","content":"<span class='clj-string'>&quot;test.xlsx&quot;</span>","value":"\"test.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;ws&quot;</span>","value":"\"ws\""},{"type":"html","content":"<span class='clj-string'>&quot;~$spreadsheet.xlsx&quot;</span>","value":"\"~$spreadsheet.xlsx\""}],"value":"(\".git\" \".gitignore\" \".gorilla-port\" \".nrepl-port\" \"data\" \"leinGorilla036.bat\" \"LICENCE.txt\" \"project.clj\" \"README.md\" \"spreadsheet.xlsx\" \"src\" \"target\" \"test.xlsx\" \"ws\" \"~$spreadsheet.xlsx\")"}
;; <=

;; @@
(doc ..)
;; @@
;; ->
;;; -------------------------
;;; clojure.core/..
;;; ([x form] [x form &amp; more])
;;; Macro
;;;   form =&gt; fieldName-symbol or (instanceMethodName-symbol args*)
;;; 
;;;   Expands into a member access (.) of the first member on the first
;;;   argument, followed by the next member on the result, etc. For
;;;   instance:
;;; 
;;;   (.. System (getProperties) (get &quot;os.name&quot;))
;;; 
;;;   expands to:
;;; 
;;;   (. (. System (getProperties)) (get &quot;os.name&quot;))
;;; 
;;;   but is easier to write, read, and understand.
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(->> (file-seq wd)
     (filter #(.. % getName (endsWith ".clj")))
     (map #(.getCanonicalPath %))
     pprint)
;; @@
;; ->
;;; [&quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\project.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\gorilla_test\\core.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\gorilla_test\\expresso_latex.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\classpath.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\core.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\elastisch.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\mongo.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\neo.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\numbers.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\rabbitmq.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\new\\words.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src\\sr_basics\\render.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\abrade-ex.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\central-limit.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\clock-demo.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\couchdb-example.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\expression-render.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\files.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\first.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\graph-examples.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\hiccup-test.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\incanter.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\introduction.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\loom-test.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\matrix-form-test.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\mongo-example.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\mysql-example.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\neocons-ex.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\new-render.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\redis-example.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\scanmaster.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\second.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\sicp-1.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\test.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\unified-update-model.clj&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\ws\\words.clj&quot;]
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
;;;   :dependencies [[org.clojure/clojure &quot;1.8.0&quot;]
;;;                  [cider/cider-nrepl &quot;0.10.2&quot;]
;;;                  [instaparse &quot;1.4.2&quot;]
;;;                  [com.vijaykiran/docjure &quot;1.7.0&quot; :exclusions [xml-apis]]
;;;                  [org.clojure/core.match &quot;0.2.2&quot; :exclusions [org.clojure/tools.analyzer.jvm]]
;;;                  [org.clojure/core.unify &quot;0.5.7&quot;]
;;;                  [clj-http &quot;3.2.0&quot;]
;;;                  [clojurewerkz/neocons &quot;3.1.0&quot; :exclusions [clj-http]]
;;;                  [clj-gremlin &quot;0.0.3&quot;]
;;;                  [clj-blueprints2 &quot;0.0.1&quot; :exclusions [com.tinkerpop.blueprints/blueprints-core]]
;;;                  [gavagai &quot;0.3.2&quot;]
;;;                  [prismatic/plumbing &quot;0.5.3&quot;]
;;;                  [clojureql &quot;1.0.4&quot; :exclusions [org.clojure/core.incubator]]
;;;                  [lein-kibit &quot;0.1.2&quot; :exclusions [org.clojure/core.logic]]
;;;                  [rplevy-draker/wabbitmq &quot;0.3.0&quot; :exclusions [org.clojure/clojure]]
;;;                  [com.mysql/connectorj &quot;5.1.12&quot;]
;;;                  [hiccup &quot;1.0.5&quot;]
;;;                  [expresso &quot;0.2.0&quot; :exclusions [org.clojure/core.memoize instaparse]]
;;;                  [aysylu/loom &quot;0.6.0&quot;]
;;;                  [loom-gorilla &quot;0.1.0&quot;]
;;;                  [org.clojure/data.xml &quot;0.0.8&quot;]
;;;                  [incanter-gorilla &quot;0.1.0&quot; :exclusions [xml-apis]]
;;;                  [gorilla-renderable &quot;2.0.0&quot;]
;;;                  [com.microsoft/sqljdbc4 &quot;3.0&quot;]
;;;                  [cn.guoyukun.jdbc/db2jcc &quot;1.4.2&quot;]
;;;                  [cn.guoyukun.jdbc/db2jcc_license_cu &quot;1.4.2&quot;]
;;;                  [com.taoensso/carmine &quot;2.14.0&quot; :exclusions [org.clojure/clojure org.clojure/tools.reader]]
;;;                  [com.ashafa/clutch &quot;0.4.0&quot;]
;;;                  [org.apache.geronimo.specs/geronimo-activation_1.1_spec &quot;1.1&quot;]
;;;                  [com.uswitch/clj-soap &quot;0.2.3&quot; :exclusions [org.apache.geronimo.specs/geronimo-activation_1.1_spec]]
;;;                  [proto-repl &quot;0.3.1&quot;]
;;;                  [abrade &quot;0.1.8&quot;]]
;;;   :main ^:skip-aot gorilla-test.core
;;;   :target-path &quot;target/%s&quot;
;;;   :plugins [[lein-gorilla &quot;0.3.6&quot;  :exclusions [cider/cider-nrepl]]
;;;             [lein-localrepo &quot;0.5.3&quot;]]
;;;   :profiles {:uberjar {:aot :all}})
;;; 
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(doc create-workbook)
;; @@
;; ->
;;; -------------------------
;;; dk.ative.docjure.spreadsheet/create-workbook
;;; ([sheet-name data])
;;;   Create a new workbook with a single sheet and the data specified.  The
;;;    data is given a vector of vectors, representing the rows and the
;;;    cells of the rows.
;;; 
;;;    For example, to create a workbook with a sheet with two rows of each
;;;    three columns:
;;; 
;;;    (create-workbook &quot;Sheet 1&quot; [[&quot;Name&quot; &quot;Quantity&quot; &quot;Price&quot;]
;;;                     [&quot;Foo Widget&quot; 2 42]])
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
;;; [&quot;C:\\Users\\Jeffrey\\.m2\\repository\\abrade\\abrade\\0.1.8\\abrade-0.1.8.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\aysylu\\loom\\0.6.0\\loom-0.6.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\bouncycastle\\bcmail-jdk14\\138\\bcmail-jdk14-138.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\bouncycastle\\bcprov-jdk14\\138\\bcprov-jdk14-138.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.1.2\\logback-classic-1.1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.1.2\\logback-core-1.1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cheshire\\cheshire\\5.3.1\\cheshire-5.3.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cider\\cider-nrepl\\0.10.2\\cider-nrepl-0.10.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clatrix\\clatrix\\0.3.0\\clatrix-0.3.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-blueprints2\\clj-blueprints2\\0.0.1\\clj-blueprints2-0.0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-gremlin\\clj-gremlin\\0.0.3\\clj-gremlin-0.0.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-http\\clj-http\\3.2.0\\clj-http-3.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-time\\clj-time\\0.4.4\\clj-time-0.4.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clj-tuple\\clj-tuple\\0.2.2\\clj-tuple-0.2.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojure-complete\\clojure-complete\\0.2.4\\clojure-complete-0.2.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojureql\\clojureql\\1.0.4\\clojureql-1.0.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojurewerkz\\neocons\\3.1.0\\neocons-3.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clojurewerkz\\support\\1.1.0\\support-1.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\clout\\clout\\1.2.0\\clout-1.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cn\\guoyukun\\jdbc\\db2jcc\\1.4.2\\db2jcc-1.4.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\cn\\guoyukun\\jdbc\\db2jcc_license_cu\\1.4.2\\db2jcc_license_cu-1.4.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\colt\\colt\\1.2.0\\colt-1.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\ashafa\\clutch\\0.4.0\\clutch-0.4.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\cemerick\\url\\0.0.6\\url-0.0.6.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-core\\2.3.1\\jackson-core-2.3.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\fasterxml\\jackson\\dataformat\\jackson-dataformat-smile\\2.3.1\\jackson-dataformat-smile-2.3.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\AMDJ\\1.0.1\\AMDJ-1.0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\BTFJ\\1.0.1\\BTFJ-1.0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\COLAMDJ\\1.0.1\\COLAMDJ-1.0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\github\\rwl\\JKLU\\1.0.0\\JKLU-1.0.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\googlecode\\netlib-java\\netlib-java\\0.9.3\\netlib-java-0.9.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\lowagie\\itext\\2.1.7\\itext-2.1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\microsoft\\sqljdbc4\\3.0\\sqljdbc4-3.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\mysql\\connectorj\\5.1.12\\connectorj-5.1.12.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\rabbitmq\\amqp-client\\2.8.1\\amqp-client-2.8.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\carmine\\2.14.0\\carmine-2.14.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\encore\\2.67.2\\encore-2.67.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\nippy\\2.12.0\\nippy-2.12.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\timbre\\4.7.3\\timbre-4.7.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\taoensso\\truss\\1.3.3\\truss-1.3.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\blueprints\\blueprints-core\\2.2.0\\blueprints-core-2.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\gremlin\\gremlin-java\\2.2.0\\gremlin-java-2.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\tinkerpop\\pipes\\2.2.0\\pipes-2.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\uswitch\\clj-soap\\0.2.3\\clj-soap-0.2.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\com\\vijaykiran\\docjure\\1.7.0\\docjure-1.7.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-codec\\commons-codec\\1.10\\commons-codec-1.10.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-fileupload\\commons-fileupload\\1.3\\commons-fileupload-1.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-httpclient\\commons-httpclient\\3.1\\commons-httpclient-3.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-io\\commons-io\\2.5\\commons-io-2.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\compliment\\compliment\\0.2.7\\compliment-0.2.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\compojure\\compojure\\1.1.8\\compojure-1.1.8.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\concurrent\\concurrent\\1.3.4\\concurrent-1.3.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\congomongo\\congomongo\\0.3.3\\congomongo-0.3.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\de\\kotka\\lazymap\\3.1.0\\lazymap-3.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\defprecated\\defprecated\\0.1.3\\defprecated-0.1.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\dom4j\\dom4j\\1.6.1\\dom4j-1.6.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\expresso\\expresso\\0.2.0\\expresso-0.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\fr\\grunwald\\lazymap\\3.1.0\\lazymap-3.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gavagai\\gavagai\\0.3.2\\gavagai-0.3.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-plot\\gorilla-plot\\0.1.4\\gorilla-plot-0.1.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-renderable\\gorilla-renderable\\2.0.0\\gorilla-renderable-2.0.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\gorilla-repl\\gorilla-repl\\0.3.6\\gorilla-repl-0.3.6.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\grimradical\\clj-semver\\0.2.0\\clj-semver-0.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\hiccup\\hiccup\\1.0.5\\hiccup-1.0.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\http-kit\\http-kit\\2.1.18\\http-kit-2.1.18.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter-gorilla\\incanter-gorilla\\0.1.0\\incanter-gorilla-0.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-charts\\1.5.5\\incanter-charts-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-core\\1.5.5\\incanter-core-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-excel\\1.5.5\\incanter-excel-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-io\\1.5.5\\incanter-io-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-latex\\1.5.5\\incanter-latex-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-mongodb\\1.5.5\\incanter-mongodb-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-pdf\\1.5.5\\incanter-pdf-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-sql\\1.5.5\\incanter-sql-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-svg\\1.5.5\\incanter-svg-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter-zoo\\1.5.5\\incanter-zoo-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\incanter\\1.5.5\\incanter-1.5.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\jcommon\\1.0.16\\jcommon-1.0.16.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\incanter\\jfreechart\\1.0.13-no-gnujaxp\\jfreechart-1.0.13-no-gnujaxp.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\instaparse\\instaparse\\1.4.2\\instaparse-1.4.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\io\\aviso\\pretty\\0.1.29\\pretty-0.1.29.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\javax\\servlet\\servlet-api\\2.5\\servlet-api-2.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\javax\\ws\\rs\\jsr311-api\\1.0\\jsr311-api-1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\jaxen\\jaxen\\1.1.3\\jaxen-1.1.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\joda-time\\joda-time\\2.1\\joda-time-2.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\jonase\\kibit\\0.1.2\\kibit-0.1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\junit\\junit\\4.8.2\\junit-4.8.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\lein-kibit\\lein-kibit\\0.1.2\\lein-kibit-0.1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\loom-gorilla\\loom-gorilla\\0.1.0\\loom-gorilla-0.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\jpountz\\lz4\\lz4\\1.3\\lz4-1.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\mikera\\core.matrix\\0.10.0\\core.matrix-0.10.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sf\\opencsv\\opencsv\\2.3\\opencsv-2.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\csparsej\\csparsej\\1.1.1\\csparsej-1.1.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\cssparser\\cssparser\\0.9.20\\cssparser-0.9.20.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\f2j\\arpack_combined_all\\0.1\\arpack_combined_all-0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\htmlunit\\htmlunit-core-js\\2.23\\htmlunit-core-js-2.23.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\htmlunit\\htmlunit\\2.23\\htmlunit-2.23.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\htmlunit\\neko-htmlunit\\2.23\\neko-htmlunit-2.23.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jplasma\\core-lapack\\0.1\\core-lapack-0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jplasma\\jplasma\\1.2.0\\jplasma-1.2.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\jtransforms\\jtransforms\\2.4.0\\jtransforms-2.4.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\parallelcolt\\optimization\\1.0\\optimization-1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\net\\sourceforge\\parallelcolt\\parallelcolt\\0.10.1\\parallelcolt-0.10.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-adb\\1.6.2\\axis2-adb-1.6.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-kernel\\1.6.2\\axis2-kernel-1.6.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-transport-http\\1.6.2\\axis2-transport-http-1.6.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\axis2\\axis2-transport-local\\1.6.2\\axis2-transport-local-1.6.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\commons\\commons-lang3\\3.4\\commons-lang3-3.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\commons\\commons-pool2\\2.4.2\\commons-pool2-2.4.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-activation_1.1_spec\\1.1\\geronimo-activation_1.1_spec-1.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-javamail_1.4_spec\\1.7.1\\geronimo-javamail_1.4_spec-1.7.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-jta_1.1_spec\\1.1\\geronimo-jta_1.1_spec-1.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-stax-api_1.0_spec\\1.0.1\\geronimo-stax-api_1.0_spec-1.0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\geronimo\\specs\\geronimo-ws-metadata_2.0_spec\\1.1.2\\geronimo-ws-metadata_2.0_spec-1.1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpclient\\4.5.2\\httpclient-4.5.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpcore\\4.4.5\\httpcore-4.4.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\httpcomponents\\httpmime\\4.5.2\\httpmime-4.5.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\james\\apache-mime4j-core\\0.7.2\\apache-mime4j-core-0.7.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\neethi\\neethi\\3.0.2\\neethi-3.0.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\poi\\poi-ooxml-schemas\\3.9\\poi-ooxml-schemas-3.9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\poi\\poi-ooxml\\3.9\\poi-ooxml-3.9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\poi\\poi\\3.9\\poi-3.9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\woden\\woden-api\\1.0M9\\woden-api-1.0M9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\woden\\woden-impl-commons\\1.0M9\\woden-impl-commons-1.0M9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\woden\\woden-impl-dom\\1.0M9\\woden-impl-dom-1.0M9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\ws\\commons\\axiom\\axiom-api\\1.2.13\\axiom-api-1.2.13.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\ws\\commons\\axiom\\axiom-impl\\1.2.13\\axiom-impl-1.2.13.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\ws\\commons\\schema\\XmlSchema\\1.4.7\\XmlSchema-1.4.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlbeans\\xmlbeans\\2.3.0\\xmlbeans-2.3.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-awt-util\\1.7\\batik-awt-util-1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-css\\1.7\\batik-css-1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-dom\\1.7\\batik-dom-1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-ext\\1.7\\batik-ext-1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-svggen\\1.7\\batik-svggen-1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-util\\1.7\\batik-util-1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\apache\\xmlgraphics\\batik-xml\\1.7\\batik-xml-1.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\bouncycastle\\bcmail-jdk14\\1.38\\bcmail-jdk14-1.38.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\bouncycastle\\bcprov-jdk14\\1.38\\bcprov-jdk14-1.38.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\bouncycastle\\bctsp-jdk14\\1.38\\bctsp-jdk14-1.38.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\clojure\\1.8.0\\clojure-1.8.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.async\\0.2.374\\core.async-0.2.374.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.cache\\0.6.4\\core.cache-0.6.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.incubator\\0.1.2\\core.incubator-0.1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.logic\\0.8.4\\core.logic-0.8.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.match\\0.2.2\\core.match-0.2.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.memoize\\0.5.8\\core.memoize-0.5.8.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\core.unify\\0.5.7\\core.unify-0.5.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.codec\\0.1.0\\data.codec-0.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.json\\0.2.6\\data.json-0.2.6.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.priority-map\\0.0.5\\data.priority-map-0.0.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.xml\\0.0.8\\data.xml-0.0.8.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\data.zip\\0.1.2\\data.zip-0.1.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\java.jdbc\\0.2.3\\java.jdbc-0.2.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\math.combinatorics\\0.0.4\\math.combinatorics-0.0.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.analyzer.jvm\\0.6.9\\tools.analyzer.jvm-0.6.9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.analyzer\\0.6.7\\tools.analyzer-0.6.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.cli\\0.3.1\\tools.cli-0.3.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.macro\\0.1.0\\tools.macro-0.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.namespace\\0.2.11\\tools.namespace-0.2.11.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.nrepl\\0.2.12\\tools.nrepl-0.2.12.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\clojure\\tools.reader\\0.8.1\\tools.reader-0.8.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jackson\\jackson-core-asl\\1.8.5\\jackson-core-asl-1.8.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jackson\\jackson-mapper-asl\\1.8.5\\jackson-mapper-asl-1.8.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\jettison\\jettison\\1.3\\jettison-1.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\codehaus\\woodstox\\wstx-asl\\3.2.9\\wstx-asl-3.2.9.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\danlarkin\\clojure-json\\1.1\\clojure-json-1.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\jetty-io\\9.2.18.v20160721\\jetty-io-9.2.18.v20160721.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\jetty-util\\9.2.18.v20160721\\jetty-util-9.2.18.v20160721.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-api\\9.2.18.v20160721\\websocket-api-9.2.18.v20160721.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-client\\9.2.18.v20160721\\websocket-client-9.2.18.v20160721.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-common\\9.2.18.v20160721\\websocket-common-9.2.18.v20160721.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\iq80\\snappy\\snappy\\0.4\\snappy-0.4.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\jblas\\jblas\\1.2.3\\jblas-1.2.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\mongodb\\mongo-java-driver\\2.9.3\\mongo-java-driver-2.9.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\ow2\\asm\\asm-all\\4.2\\asm-all-4.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\scilab\\forge\\jlatexmath\\0.9.6\\jlatexmath-0.9.6.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\slf4j\\slf4j-api\\1.7.7\\slf4j-api-1.7.7.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\tcrawley\\dynapath\\0.2.3\\dynapath-0.2.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\tukaani\\xz\\1.5\\xz-1.5.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\org\\w3c\\css\\sac\\1.3\\sac-1.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\pathetic\\pathetic\\0.4.0\\pathetic-0.4.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\potemkin\\potemkin\\0.4.3\\potemkin-0.4.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\prismatic\\plumbing\\0.5.3\\plumbing-0.5.3.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\prismatic\\schema\\1.0.1\\schema-1.0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\proto-repl\\proto-repl\\0.3.1\\proto-repl-0.3.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\riddley\\riddley\\0.1.12\\riddley-0.1.12.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-codec\\1.0.0\\ring-codec-1.0.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-core\\1.2.2\\ring-core-1.2.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\ring\\ring-json\\0.3.1\\ring-json-0.3.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\rplevy-draker\\wabbitmq\\0.3.0\\wabbitmq-0.3.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\slingshot\\slingshot\\0.12.2\\slingshot-0.12.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\stax\\stax-api\\1.0.1\\stax-api-1.0.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\tailrecursion\\cljs-priority-map\\1.1.0\\cljs-priority-map-1.1.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\tigris\\tigris\\0.1.1\\tigris-0.1.1.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\wsdl4j\\wsdl4j\\1.6.2\\wsdl4j-1.6.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xalan\\serializer\\2.7.2\\serializer-2.7.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xalan\\xalan\\2.7.2\\xalan-2.7.2.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xerces\\xercesImpl\\2.11.0\\xercesImpl-2.11.0.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xml-apis\\xml-apis-ext\\1.3.04\\xml-apis-ext-1.3.04.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\.m2\\repository\\xml-apis\\xml-apis\\1.4.01\\xml-apis-1.4.01.jar&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\dev-resources&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\resources&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\src&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\target\\base+system+user+dev\\classes&quot;,
;;;  &quot;C:\\Users\\Jeffrey\\Documents\\GitHub\\gorilla-test-present\\test&quot;]
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
;;; [&quot;cheshire.core&quot;, &quot;cheshire.factory&quot;, &quot;cheshire.generate&quot;,
;;;  &quot;cheshire.parse&quot;, &quot;cider.nrepl&quot;, &quot;cider.nrepl.middleware.apropos&quot;,
;;;  &quot;cider.nrepl.middleware.classpath&quot;, &quot;cider.nrepl.middleware.complete&quot;,
;;;  &quot;cider.nrepl.middleware.debug&quot;, &quot;cider.nrepl.middleware.format&quot;,
;;;  &quot;cider.nrepl.middleware.info&quot;, &quot;cider.nrepl.middleware.inspect&quot;,
;;;  &quot;cider.nrepl.middleware.macroexpand&quot;, &quot;cider.nrepl.middleware.ns&quot;,
;;;  &quot;cider.nrepl.middleware.out&quot;, &quot;cider.nrepl.middleware.pprint&quot;,
;;;  &quot;cider.nrepl.middleware.refresh&quot;, &quot;cider.nrepl.middleware.resource&quot;,
;;;  &quot;cider.nrepl.middleware.stacktrace&quot;, &quot;cider.nrepl.middleware.test&quot;,
;;;  &quot;cider.nrepl.middleware.trace&quot;, &quot;cider.nrepl.middleware.track-state&quot;,
;;;  &quot;cider.nrepl.middleware.undef&quot;, &quot;cider.nrepl.middleware.util.cljs&quot;,
;;;  &quot;cider.nrepl.middleware.util.inspect&quot;,
;;;  &quot;cider.nrepl.middleware.util.instrument&quot;,
;;;  &quot;cider.nrepl.middleware.util.java&quot;,
;;;  &quot;cider.nrepl.middleware.util.misc&quot;, &quot;cider.nrepl.print-method&quot;,
;;;  &quot;clj-semver.core&quot;, &quot;clojure.core&quot;, &quot;clojure.core.cache&quot;,
;;;  &quot;clojure.core.logic&quot;, &quot;clojure.core.logic.fd&quot;,
;;;  &quot;clojure.core.logic.protocols&quot;, &quot;clojure.core.logic.unifier&quot;,
;;;  &quot;clojure.core.matrix&quot;, &quot;clojure.core.matrix.impl.default&quot;,
;;;  &quot;clojure.core.matrix.impl.double-array&quot;,
;;;  &quot;clojure.core.matrix.impl.mathsops&quot;,
;;;  &quot;clojure.core.matrix.impl.ndarray&quot;,
;;;  &quot;clojure.core.matrix.impl.ndarray-magic&quot;,
;;;  &quot;clojure.core.matrix.impl.persistent-vector&quot;,
;;;  &quot;clojure.core.matrix.impl.pprint&quot;,
;;;  &quot;clojure.core.matrix.impl.sequence&quot;,
;;;  &quot;clojure.core.matrix.impl.sparse-map&quot;,
;;;  &quot;clojure.core.matrix.impl.wrappers&quot;,
;;;  &quot;clojure.core.matrix.implementations&quot;,
;;;  &quot;clojure.core.matrix.multimethods&quot;, &quot;clojure.core.matrix.operators&quot;,
;;;  &quot;clojure.core.matrix.protocols&quot;, &quot;clojure.core.matrix.utils&quot;,
;;;  &quot;clojure.core.memoize&quot;, &quot;clojure.core.protocols&quot;,
;;;  &quot;clojure.core.server&quot;, &quot;clojure.data.json&quot;,
;;;  &quot;clojure.data.priority-map&quot;, &quot;clojure.edn&quot;, &quot;clojure.instant&quot;,
;;;  &quot;clojure.java.io&quot;, &quot;clojure.main&quot;, &quot;clojure.pprint&quot;,
;;;  &quot;clojure.reflect&quot;, &quot;clojure.repl&quot;, &quot;clojure.set&quot;,
;;;  &quot;clojure.stacktrace&quot;, &quot;clojure.string&quot;, &quot;clojure.template&quot;,
;;;  &quot;clojure.test&quot;, &quot;clojure.tools.macro&quot;, &quot;clojure.tools.nrepl&quot;,
;;;  &quot;clojure.tools.nrepl.ack&quot;, &quot;clojure.tools.nrepl.bencode&quot;,
;;;  &quot;clojure.tools.nrepl.middleware&quot;,
;;;  &quot;clojure.tools.nrepl.middleware.interruptible-eval&quot;,
;;;  &quot;clojure.tools.nrepl.middleware.load-file&quot;,
;;;  &quot;clojure.tools.nrepl.middleware.pr-values&quot;,
;;;  &quot;clojure.tools.nrepl.middleware.session&quot;, &quot;clojure.tools.nrepl.misc&quot;,
;;;  &quot;clojure.tools.nrepl.server&quot;, &quot;clojure.tools.nrepl.transport&quot;,
;;;  &quot;clojure.uuid&quot;, &quot;clojure.walk&quot;, &quot;clojure.zip&quot;, &quot;clout.core&quot;,
;;;  &quot;compojure.core&quot;, &quot;compojure.response&quot;, &quot;compojure.route&quot;,
;;;  &quot;dk.ative.docjure.spreadsheet&quot;, &quot;dynapath.defaults&quot;,
;;;  &quot;dynapath.dynamic-classpath&quot;, &quot;dynapath.util&quot;, &quot;expression-render&quot;,
;;;  &quot;files&quot;, &quot;gorilla-plot.core&quot;, &quot;gorilla-plot.util&quot;,
;;;  &quot;gorilla-plot.vega&quot;, &quot;gorilla-renderable.core&quot;, &quot;gorilla-repl.core&quot;,
;;;  &quot;gorilla-repl.files&quot;, &quot;gorilla-repl.handle&quot;, &quot;gorilla-repl.html&quot;,
;;;  &quot;gorilla-repl.latex&quot;, &quot;gorilla-repl.nrepl&quot;,
;;;  &quot;gorilla-repl.render-values-mw&quot;, &quot;gorilla-repl.renderer&quot;,
;;;  &quot;gorilla-repl.table&quot;, &quot;gorilla-repl.vega&quot;, &quot;gorilla-repl.version&quot;,
;;;  &quot;gorilla-repl.websocket-relay&quot;, &quot;gorilla-test.expresso-latex&quot;,
;;;  &quot;instaparse.abnf&quot;, &quot;instaparse.auto-flatten-seq&quot;, &quot;instaparse.cfg&quot;,
;;;  &quot;instaparse.clone&quot;, &quot;instaparse.combinators-source&quot;,
;;;  &quot;instaparse.core&quot;, &quot;instaparse.failure&quot;, &quot;instaparse.gll&quot;,
;;;  &quot;instaparse.line-col&quot;, &quot;instaparse.print&quot;, &quot;instaparse.reduction&quot;,
;;;  &quot;instaparse.repeat&quot;, &quot;instaparse.transform&quot;, &quot;instaparse.viz&quot;,
;;;  &quot;instaparse.viz-not-found&quot;, &quot;mranderson046.cljfmt.v0v3v0.cljfmt.core&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.coerce&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.comment&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.fn&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.forms&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.integer&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.keyword&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.meta&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.protocols&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.quote&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.reader-macro&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.seq&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.string&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.token&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.uneval&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.node.whitespace&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.core&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.keyword&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.string&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.token&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.utils&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.parser.whitespace&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.potemkin&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.reader&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.base&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.edit&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.find&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.insert&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.move&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.remove&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.seq&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.subedit&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.utils&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.walk&quot;,
;;;  &quot;mranderson046.cljfmt.v0v3v0.rewrite-clj.v0v4v12.rewrite-clj.zip.whitespace&quot;,
;;;  &quot;mranderson046.cljs-tooling.v0v1v9.cljs-tooling.complete&quot;,
;;;  &quot;mranderson046.cljs-tooling.v0v1v9.cljs-tooling.info&quot;,
;;;  &quot;mranderson046.cljs-tooling.v0v1v9.cljs-tooling.util.analysis&quot;,
;;;  &quot;mranderson046.cljs-tooling.v0v1v9.cljs-tooling.util.misc&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.context&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.core&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources.class-members&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources.keywords&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources.local-bindings&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources.namespaces-and-classes&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources.ns-mappings&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources.resources&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.sources.special-forms&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.compliment.utils&quot;,
;;;  &quot;mranderson046.compliment.v0v2v6.defprecated.v0v1v2.defprecated.core&quot;,
;;;  &quot;mranderson046.javaclasspath.v0v2v3.clojure.java.classpath&quot;,
;;;  &quot;mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.dependency&quot;,
;;;  &quot;mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.dir&quot;,
;;;  &quot;mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.file&quot;,
;;;  &quot;mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.find&quot;,
;;;  &quot;mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.parse&quot;,
;;;  &quot;mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.reload&quot;,
;;;  &quot;mranderson046.toolsnamespace.v0v2v11.clojure.tools.namespace.track&quot;,
;;;  &quot;mranderson046.toolsreader.v0v10v0.clojure.tools.reader&quot;,
;;;  &quot;mranderson046.toolsreader.v0v10v0.clojure.tools.reader.default-data-readers&quot;,
;;;  &quot;mranderson046.toolsreader.v0v10v0.clojure.tools.reader.edn&quot;,
;;;  &quot;mranderson046.toolsreader.v0v10v0.clojure.tools.reader.impl.commons&quot;,
;;;  &quot;mranderson046.toolsreader.v0v10v0.clojure.tools.reader.impl.utils&quot;,
;;;  &quot;mranderson046.toolsreader.v0v10v0.clojure.tools.reader.reader-types&quot;,
;;;  &quot;mranderson046.toolstrace.v0v7v9.clojure.tools.trace&quot;,
;;;  &quot;numeric.expresso.calculus&quot;, &quot;numeric.expresso.construct&quot;,
;;;  &quot;numeric.expresso.core&quot;, &quot;numeric.expresso.impl.matcher&quot;,
;;;  &quot;numeric.expresso.impl.pimplementation&quot;,
;;;  &quot;numeric.expresso.impl.polynomial&quot;, &quot;numeric.expresso.impl.symbolic&quot;,
;;;  &quot;numeric.expresso.optimize&quot;, &quot;numeric.expresso.parse&quot;,
;;;  &quot;numeric.expresso.properties&quot;, &quot;numeric.expresso.protocols&quot;,
;;;  &quot;numeric.expresso.rules&quot;, &quot;numeric.expresso.simplify&quot;,
;;;  &quot;numeric.expresso.solve&quot;, &quot;numeric.expresso.types&quot;,
;;;  &quot;numeric.expresso.utils&quot;, &quot;org.httpkit.client&quot;, &quot;org.httpkit.server&quot;,
;;;  &quot;ring.middleware.content-type&quot;, &quot;ring.middleware.file-info&quot;,
;;;  &quot;ring.middleware.head&quot;, &quot;ring.middleware.json&quot;,
;;;  &quot;ring.middleware.keyword-params&quot;, &quot;ring.middleware.params&quot;,
;;;  &quot;ring.util.codec&quot;, &quot;ring.util.io&quot;, &quot;ring.util.mime-type&quot;,
;;;  &quot;ring.util.response&quot;, &quot;ring.util.time&quot;, &quot;user&quot;]
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
(require '[clojure.data.json :as json])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(json/write-str {:a 1 :b [{:c "one"} {:d 5}]})
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;{\\&quot;a\\&quot;:1,\\&quot;b\\&quot;:[{\\&quot;c\\&quot;:\\&quot;one\\&quot;},{\\&quot;d\\&quot;:5}]}&quot;</span>","value":"\"{\\\"a\\\":1,\\\"b\\\":[{\\\"c\\\":\\\"one\\\"},{\\\"d\\\":5}]}\""}
;; <=

;; @@
(json/pprint {:a 1 :b [{:c "one"} {:d 5}]})
;; @@
;; ->
;;; {&quot;a&quot;:1, &quot;b&quot;:[{&quot;c&quot;:&quot;one&quot;}, {&quot;d&quot;:5}]}
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(json/read-str "{\"a\":1, \"b\":[{\"c\":\"one\"}, {\"d\":5}]}" :key-fn keyword)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:a</span>","value":":a"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"}],"value":"[:a 1]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:b</span>","value":":b"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:c</span>","value":":c"},{"type":"html","content":"<span class='clj-string'>&quot;one&quot;</span>","value":"\"one\""}],"value":"[:c \"one\"]"}],"value":"{:c \"one\"}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:d</span>","value":":d"},{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"}],"value":"[:d 5]"}],"value":"{:d 5}"}],"value":"[{:c \"one\"} {:d 5}]"}],"value":"[:b [{:c \"one\"} {:d 5}]]"}],"value":"{:a 1, :b [{:c \"one\"} {:d 5}]}"}
;; <=

;; @@
(slurp "http://localhost:1880/echo?one=1&two=2")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;{\\&quot;one\\&quot;:\\&quot;1\\&quot;,\\&quot;two\\&quot;:\\&quot;2\\&quot;}&quot;</span>","value":"\"{\\\"one\\\":\\\"1\\\",\\\"two\\\":\\\"2\\\"}\""}
;; <=

;; @@
(json/read-str (slurp "http://localhost:1880/echo?one=1&two=2&three=true") :key-fn keyword)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:one</span>","value":":one"},{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""}],"value":"[:one \"1\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:two</span>","value":":two"},{"type":"html","content":"<span class='clj-string'>&quot;2&quot;</span>","value":"\"2\""}],"value":"[:two \"2\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:three</span>","value":":three"},{"type":"html","content":"<span class='clj-string'>&quot;true&quot;</span>","value":"\"true\""}],"value":"[:three \"true\"]"}],"value":"{:one \"1\", :two \"2\", :three \"true\"}"}
;; <=

;; @@
(dir clojure.xml)
;; @@
;; ->
;;; *current*
;;; *sb*
;;; *stack*
;;; *state*
;;; attrs
;;; content
;;; content-handler
;;; element
;;; emit
;;; emit-element
;;; parse
;;; startparse-sax
;;; tag
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(require '[clojure.xml :as xml])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(slurp "http://localhost:1880/xml?one=1&two=2")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;&lt;?xml version=\\&quot;1.0\\&quot; encoding=\\&quot;UTF-8\\&quot; standalone=\\&quot;yes\\&quot;?&gt;&lt;root&gt;&lt;one&gt;1&lt;/one&gt;&lt;two&gt;2&lt;/two&gt;&lt;/root&gt;&quot;</span>","value":"\"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?><root><one>1</one><two>2</two></root>\""}
;; <=

;; @@
(xml/parse "http://localhost:1880/xml?one=1&two=2")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:tag</span>","value":":tag"},{"type":"html","content":"<span class='clj-keyword'>:root</span>","value":":root"}],"value":"[:tag :root]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:attrs</span>","value":":attrs"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:attrs nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:content</span>","value":":content"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:tag</span>","value":":tag"},{"type":"html","content":"<span class='clj-keyword'>:one</span>","value":":one"}],"value":"[:tag :one]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:attrs</span>","value":":attrs"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:attrs nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:content</span>","value":":content"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""}],"value":"[\"1\"]"}],"value":"[:content [\"1\"]]"}],"value":"{:tag :one, :attrs nil, :content [\"1\"]}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:tag</span>","value":":tag"},{"type":"html","content":"<span class='clj-keyword'>:two</span>","value":":two"}],"value":"[:tag :two]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:attrs</span>","value":":attrs"},{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[:attrs nil]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:content</span>","value":":content"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;2&quot;</span>","value":"\"2\""}],"value":"[\"2\"]"}],"value":"[:content [\"2\"]]"}],"value":"{:tag :two, :attrs nil, :content [\"2\"]}"}],"value":"[{:tag :one, :attrs nil, :content [\"1\"]} {:tag :two, :attrs nil, :content [\"2\"]}]"}],"value":"[:content [{:tag :one, :attrs nil, :content [\"1\"]} {:tag :two, :attrs nil, :content [\"2\"]}]]"}],"value":"{:tag :root, :attrs nil, :content [{:tag :one, :attrs nil, :content [\"1\"]} {:tag :two, :attrs nil, :content [\"2\"]}]}"}
;; <=

;; @@
(->> "http://localhost:1880/xml?one=1&two=2&three=true"
     xml/parse
     :content
     (map (juxt :tag 
                (comp first :content)))
     (apply map list)
     (apply zipmap))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:one</span>","value":":one"},{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""}],"value":"[:one \"1\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:two</span>","value":":two"},{"type":"html","content":"<span class='clj-string'>&quot;2&quot;</span>","value":"\"2\""}],"value":"[:two \"2\"]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:three</span>","value":":three"},{"type":"html","content":"<span class='clj-string'>&quot;true&quot;</span>","value":"\"true\""}],"value":"[:three \"true\"]"}],"value":"{:one \"1\", :two \"2\", :three \"true\"}"}
;; <=

;; @@
(println (slurp "http://localhost:1880/html?arg1=3&arg2=2"))
;; @@
;; ->
;;; &lt;html&gt;
;;;     &lt;head&gt;
;;;         &lt;title&gt;HTML&lt;/title&gt;
;;;     &lt;/head&gt;
;;;     &lt;body&gt;
;;;         &lt;p&gt;This is the payload:&lt;/p&gt;
;;;         &lt;ul&gt;
;;;             &lt;li&gt;arg1 = 3&lt;/li&gt;
;;;             &lt;li&gt;arg2 = 2&lt;/li&gt;
;;;         &lt;/ul&gt;
;;;     &lt;/body&gt;
;;; &lt;/html&gt;
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@

;; @@
