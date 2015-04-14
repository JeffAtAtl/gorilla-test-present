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
  (:use dk.ative.docjure.spreadsheet))
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
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;central-limit.clj&quot;</span>","value":"\"central-limit.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;clock-demo.clj&quot;</span>","value":"\"clock-demo.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;expression-render.clj&quot;</span>","value":"\"expression-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;files.clj&quot;</span>","value":"\"files.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;first.clj&quot;</span>","value":"\"first.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;graph-examples.clj&quot;</span>","value":"\"graph-examples.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;hiccup-test.clj&quot;</span>","value":"\"hiccup-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;incanter.clj&quot;</span>","value":"\"incanter.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;introduction.clj&quot;</span>","value":"\"introduction.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;loom-test.clj&quot;</span>","value":"\"loom-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;matrix-form-test.clj&quot;</span>","value":"\"matrix-form-test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;new-render.clj&quot;</span>","value":"\"new-render.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;pmo-reports.clj&quot;</span>","value":"\"pmo-reports.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;scanmaster.clj&quot;</span>","value":"\"scanmaster.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;second.clj&quot;</span>","value":"\"second.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;test.clj&quot;</span>","value":"\"test.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;words.clj&quot;</span>","value":"\"words.clj\""}],"value":"(\"central-limit.clj\" \"clock-demo.clj\" \"expression-render.clj\" \"files.clj\" \"first.clj\" \"graph-examples.clj\" \"hiccup-test.clj\" \"incanter.clj\" \"introduction.clj\" \"loom-test.clj\" \"matrix-form-test.clj\" \"new-render.clj\" \"pmo-reports.clj\" \"scanmaster.clj\" \"second.clj\" \"test.clj\" \"words.clj\")"}
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
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;.gitignore&quot;</span>","value":"\".gitignore\""},{"type":"html","content":"<span class='clj-string'>&quot;.gorilla-port&quot;</span>","value":"\".gorilla-port\""},{"type":"html","content":"<span class='clj-string'>&quot;.lein-repl-history&quot;</span>","value":"\".lein-repl-history\""},{"type":"html","content":"<span class='clj-string'>&quot;.nrepl-port&quot;</span>","value":"\".nrepl-port\""},{"type":"html","content":"<span class='clj-string'>&quot;data&quot;</span>","value":"\"data\""},{"type":"html","content":"<span class='clj-string'>&quot;leinGorilla034.bat&quot;</span>","value":"\"leinGorilla034.bat\""},{"type":"html","content":"<span class='clj-string'>&quot;LICENCE.txt&quot;</span>","value":"\"LICENCE.txt\""},{"type":"html","content":"<span class='clj-string'>&quot;project.clj&quot;</span>","value":"\"project.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;README.md&quot;</span>","value":"\"README.md\""},{"type":"html","content":"<span class='clj-string'>&quot;spreadsheet.xlsx&quot;</span>","value":"\"spreadsheet.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;src&quot;</span>","value":"\"src\""},{"type":"html","content":"<span class='clj-string'>&quot;target&quot;</span>","value":"\"target\""},{"type":"html","content":"<span class='clj-string'>&quot;test.xlsx&quot;</span>","value":"\"test.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;ws&quot;</span>","value":"\"ws\""},{"type":"html","content":"<span class='clj-string'>&quot;~$spreadsheet.xlsx&quot;</span>","value":"\"~$spreadsheet.xlsx\""}],"value":"(\".gitignore\" \".gorilla-port\" \".lein-repl-history\" \".nrepl-port\" \"data\" \"leinGorilla034.bat\" \"LICENCE.txt\" \"project.clj\" \"README.md\" \"spreadsheet.xlsx\" \"src\" \"target\" \"test.xlsx\" \"ws\" \"~$spreadsheet.xlsx\")"}
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
(table-view (->> (load-workbook "test.xlsx")
     (select-sheet "Test")
     (select-columns {:A :number, :B :square})
     (map (juxt :number :square))))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;n&quot;</span>","value":"\"n\""},{"type":"html","content":"<span class='clj-string'>&quot;n^2&quot;</span>","value":"\"n^2\""}],"value":"[\"n\" \"n^2\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>1.0</span>","value":"1.0"},{"type":"html","content":"<span class='clj-double'>1.0</span>","value":"1.0"}],"value":"[1.0 1.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>2.0</span>","value":"2.0"},{"type":"html","content":"<span class='clj-double'>4.0</span>","value":"4.0"}],"value":"[2.0 4.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>3.0</span>","value":"3.0"},{"type":"html","content":"<span class='clj-double'>9.0</span>","value":"9.0"}],"value":"[3.0 9.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>4.0</span>","value":"4.0"},{"type":"html","content":"<span class='clj-double'>16.0</span>","value":"16.0"}],"value":"[4.0 16.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>5.0</span>","value":"5.0"},{"type":"html","content":"<span class='clj-double'>25.0</span>","value":"25.0"}],"value":"[5.0 25.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>6.0</span>","value":"6.0"},{"type":"html","content":"<span class='clj-double'>36.0</span>","value":"36.0"}],"value":"[6.0 36.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>7.0</span>","value":"7.0"},{"type":"html","content":"<span class='clj-double'>49.0</span>","value":"49.0"}],"value":"[7.0 49.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>8.0</span>","value":"8.0"},{"type":"html","content":"<span class='clj-double'>64.0</span>","value":"64.0"}],"value":"[8.0 64.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>9.0</span>","value":"9.0"},{"type":"html","content":"<span class='clj-double'>81.0</span>","value":"81.0"}],"value":"[9.0 81.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>10.0</span>","value":"10.0"},{"type":"html","content":"<span class='clj-double'>100.0</span>","value":"100.0"}],"value":"[10.0 100.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>11.0</span>","value":"11.0"},{"type":"html","content":"<span class='clj-double'>121.0</span>","value":"121.0"}],"value":"[11.0 121.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>12.0</span>","value":"12.0"},{"type":"html","content":"<span class='clj-double'>144.0</span>","value":"144.0"}],"value":"[12.0 144.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>13.0</span>","value":"13.0"},{"type":"html","content":"<span class='clj-double'>169.0</span>","value":"169.0"}],"value":"[13.0 169.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>14.0</span>","value":"14.0"},{"type":"html","content":"<span class='clj-double'>196.0</span>","value":"196.0"}],"value":"[14.0 196.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>15.0</span>","value":"15.0"},{"type":"html","content":"<span class='clj-double'>225.0</span>","value":"225.0"}],"value":"[15.0 225.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>16.0</span>","value":"16.0"},{"type":"html","content":"<span class='clj-double'>256.0</span>","value":"256.0"}],"value":"[16.0 256.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>17.0</span>","value":"17.0"},{"type":"html","content":"<span class='clj-double'>289.0</span>","value":"289.0"}],"value":"[17.0 289.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>18.0</span>","value":"18.0"},{"type":"html","content":"<span class='clj-double'>324.0</span>","value":"324.0"}],"value":"[18.0 324.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>19.0</span>","value":"19.0"},{"type":"html","content":"<span class='clj-double'>361.0</span>","value":"361.0"}],"value":"[19.0 361.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>20.0</span>","value":"20.0"},{"type":"html","content":"<span class='clj-double'>400.0</span>","value":"400.0"}],"value":"[20.0 400.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>21.0</span>","value":"21.0"},{"type":"html","content":"<span class='clj-double'>441.0</span>","value":"441.0"}],"value":"[21.0 441.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>22.0</span>","value":"22.0"},{"type":"html","content":"<span class='clj-double'>484.0</span>","value":"484.0"}],"value":"[22.0 484.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>23.0</span>","value":"23.0"},{"type":"html","content":"<span class='clj-double'>529.0</span>","value":"529.0"}],"value":"[23.0 529.0]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-double'>24.0</span>","value":"24.0"},{"type":"html","content":"<span class='clj-double'>576.0</span>","value":"576.0"}],"value":"[24.0 576.0]"}],"value":"#gorilla_repl.table.TableView{:contents ([\"n\" \"n^2\"] [1.0 1.0] [2.0 4.0] [3.0 9.0] [4.0 16.0] [5.0 25.0] [6.0 36.0] [7.0 49.0] [8.0 64.0] [9.0 81.0] [10.0 100.0] [11.0 121.0] [12.0 144.0] [13.0 169.0] [14.0 196.0] [15.0 225.0] [16.0 256.0] [17.0 289.0] [18.0 324.0] [19.0 361.0] [20.0 400.0] [21.0 441.0] [22.0 484.0] [23.0 529.0] [24.0 576.0]), :opts nil}"}
;; <=

;; @@
(->> (load-workbook "test.xlsx")
     (select-sheet "Test")
     (select-columns {:A :number, :B :square})
     (map (juxt :number :square))
     (map second)
     rest
     (diff))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>3.0</span>","value":"3.0"},{"type":"html","content":"<span class='clj-double'>5.0</span>","value":"5.0"},{"type":"html","content":"<span class='clj-double'>7.0</span>","value":"7.0"},{"type":"html","content":"<span class='clj-double'>9.0</span>","value":"9.0"},{"type":"html","content":"<span class='clj-double'>11.0</span>","value":"11.0"},{"type":"html","content":"<span class='clj-double'>13.0</span>","value":"13.0"},{"type":"html","content":"<span class='clj-double'>15.0</span>","value":"15.0"},{"type":"html","content":"<span class='clj-double'>17.0</span>","value":"17.0"},{"type":"html","content":"<span class='clj-double'>19.0</span>","value":"19.0"},{"type":"html","content":"<span class='clj-double'>21.0</span>","value":"21.0"},{"type":"html","content":"<span class='clj-double'>23.0</span>","value":"23.0"},{"type":"html","content":"<span class='clj-double'>25.0</span>","value":"25.0"},{"type":"html","content":"<span class='clj-double'>27.0</span>","value":"27.0"},{"type":"html","content":"<span class='clj-double'>29.0</span>","value":"29.0"},{"type":"html","content":"<span class='clj-double'>31.0</span>","value":"31.0"},{"type":"html","content":"<span class='clj-double'>33.0</span>","value":"33.0"},{"type":"html","content":"<span class='clj-double'>35.0</span>","value":"35.0"},{"type":"html","content":"<span class='clj-double'>37.0</span>","value":"37.0"},{"type":"html","content":"<span class='clj-double'>39.0</span>","value":"39.0"},{"type":"html","content":"<span class='clj-double'>41.0</span>","value":"41.0"},{"type":"html","content":"<span class='clj-double'>43.0</span>","value":"43.0"},{"type":"html","content":"<span class='clj-double'>45.0</span>","value":"45.0"},{"type":"html","content":"<span class='clj-double'>47.0</span>","value":"47.0"}],"value":"(3.0 5.0 7.0 9.0 11.0 13.0 15.0 17.0 19.0 21.0 23.0 25.0 27.0 29.0 31.0 33.0 35.0 37.0 39.0 41.0 43.0 45.0 47.0)"}
;; <=

;; @@

;; @@
