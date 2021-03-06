;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;;; 
;;; Welcome to gorilla :-) Shift + enter evaluates code. Poke the question mark (top right) to learn more ...
;; **

;; @@
(ns expression-render
  (:use numeric.expresso.core)
  (:use [gorilla-repl latex table html])
  (:use gorilla-test.expresso-latex :reload))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(multiply-out (ex (** (+ x y) 7)))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>+</span>","value":"+"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>y</span>","value":"y"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"}],"value":"(** y 7)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>*</span>","value":"*"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"},{"type":"html","content":"<span class='clj-symbol'>x</span>","value":"x"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>y</span>","value":"y"},{"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}],"value":"(** y 6)"}],"value":"(* 7 x (** y 6))"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>*</span>","value":"*"},{"type":"html","content":"<span class='clj-long'>21</span>","value":"21"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>x</span>","value":"x"},{"type":"html","content":"<span class='clj-long'>2</span>","value":"2"}],"value":"(** x 2)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>y</span>","value":"y"},{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"}],"value":"(** y 5)"}],"value":"(* 21 (** x 2) (** y 5))"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>*</span>","value":"*"},{"type":"html","content":"<span class='clj-long'>35</span>","value":"35"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>x</span>","value":"x"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"(** x 3)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>y</span>","value":"y"},{"type":"html","content":"<span class='clj-long'>4</span>","value":"4"}],"value":"(** y 4)"}],"value":"(* 35 (** x 3) (** y 4))"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>*</span>","value":"*"},{"type":"html","content":"<span class='clj-long'>35</span>","value":"35"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>x</span>","value":"x"},{"type":"html","content":"<span class='clj-long'>4</span>","value":"4"}],"value":"(** x 4)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>y</span>","value":"y"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"(** y 3)"}],"value":"(* 35 (** x 4) (** y 3))"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>*</span>","value":"*"},{"type":"html","content":"<span class='clj-long'>21</span>","value":"21"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>x</span>","value":"x"},{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"}],"value":"(** x 5)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>y</span>","value":"y"},{"type":"html","content":"<span class='clj-long'>2</span>","value":"2"}],"value":"(** y 2)"}],"value":"(* 21 (** x 5) (** y 2))"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>*</span>","value":"*"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>x</span>","value":"x"},{"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}],"value":"(** x 6)"},{"type":"html","content":"<span class='clj-symbol'>y</span>","value":"y"}],"value":"(* 7 (** x 6) y)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-symbol'>**</span>","value":"**"},{"type":"html","content":"<span class='clj-symbol'>x</span>","value":"x"},{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"}],"value":"(** x 7)"}],"value":"(+ (** y 7) (* 7 x (** y 6)) (* 21 (** x 2) (** y 5)) (* 35 (** x 3) (** y 4)) (* 35 (** x 4) (** y 3)) (* 21 (** x 5) (** y 2)) (* 7 (** x 6) y) (** x 7))"}
;; <=

;; @@
(mathematician-view (multiply-out (ex (** (+ x y) 7))))
;; @@
;; =>
;;; {"type":"latex","content":"y^{7} + 7 x y^{6} + 21 x^{2} y^{5} + 35 x^{3} y^{4} + 35 x^{4} y^{3} + 21 x^{5} y^{2} + 7 x^{6} y + x^{7}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 7) (* 7 x (** y 6)) (* 21 (** x 2) (** y 5)) (* 35 (** x 3) (** y 4)) (* 35 (** x 4) (** y 3)) (* 21 (** x 5) (** y 2)) (* 7 (** x 6) y) (** x 7))}"}
;; <=

;; @@
(table-view
 (map
  (fn [order] [order (mathematician-view (multiply-out (ex (** (+ x y) ~order))))])
  (range 1 12))
 :columns [(latex-view "n") (latex-view "(x + y)^n")])
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><th>","close":"</th></tr>","separator":"</th><th>","items":[{"type":"latex","content":"n","value":"#gorilla_repl.latex.LatexView{:content \"n\"}"},{"type":"latex","content":"(x + y)^n","value":"#gorilla_repl.latex.LatexView{:content \"(x + y)^n\"}"}],"value":"[#gorilla_repl.latex.LatexView{:content \"n\"} #gorilla_repl.latex.LatexView{:content \"(x + y)^n\"}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"latex","content":"x + y","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ x y)}"}],"value":"[1 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ x y)}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>2</span>","value":"2"},{"type":"latex","content":"y^{2} + 2 x y + x^{2}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 2) (* 2 x y) (** x 2))}"}],"value":"[2 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 2) (* 2 x y) (** x 2))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"},{"type":"latex","content":"y^{3} + 3 x y^{2} + 3 x^{2} y + x^{3}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 3) (* 3 x (** y 2)) (* 3 (** x 2) y) (** x 3))}"}],"value":"[3 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 3) (* 3 x (** y 2)) (* 3 (** x 2) y) (** x 3))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>4</span>","value":"4"},{"type":"latex","content":"y^{4} + 4 x y^{3} + 6 x^{2} y^{2} + 4 x^{3} y + x^{4}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 4) (* 4 x (** y 3)) (* 6 (** x 2) (** y 2)) (* 4 (** x 3) y) (** x 4))}"}],"value":"[4 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 4) (* 4 x (** y 3)) (* 6 (** x 2) (** y 2)) (* 4 (** x 3) y) (** x 4))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"},{"type":"latex","content":"y^{5} + 5 x y^{4} + 10 x^{2} y^{3} + 10 x^{3} y^{2} + 5 x^{4} y + x^{5}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 5) (* 5 x (** y 4)) (* 10 (** x 2) (** y 3)) (* 10 (** x 3) (** y 2)) (* 5 (** x 4) y) (** x 5))}"}],"value":"[5 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 5) (* 5 x (** y 4)) (* 10 (** x 2) (** y 3)) (* 10 (** x 3) (** y 2)) (* 5 (** x 4) y) (** x 5))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>6</span>","value":"6"},{"type":"latex","content":"y^{6} + 6 x y^{5} + 15 x^{2} y^{4} + 20 x^{3} y^{3} + 15 x^{4} y^{2} + 6 x^{5} y + x^{6}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 6) (* 6 x (** y 5)) (* 15 (** x 2) (** y 4)) (* 20 (** x 3) (** y 3)) (* 15 (** x 4) (** y 2)) (* 6 (** x 5) y) (** x 6))}"}],"value":"[6 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 6) (* 6 x (** y 5)) (* 15 (** x 2) (** y 4)) (* 20 (** x 3) (** y 3)) (* 15 (** x 4) (** y 2)) (* 6 (** x 5) y) (** x 6))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>7</span>","value":"7"},{"type":"latex","content":"y^{7} + 7 x y^{6} + 21 x^{2} y^{5} + 35 x^{3} y^{4} + 35 x^{4} y^{3} + 21 x^{5} y^{2} + 7 x^{6} y + x^{7}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 7) (* 7 x (** y 6)) (* 21 (** x 2) (** y 5)) (* 35 (** x 3) (** y 4)) (* 35 (** x 4) (** y 3)) (* 21 (** x 5) (** y 2)) (* 7 (** x 6) y) (** x 7))}"}],"value":"[7 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 7) (* 7 x (** y 6)) (* 21 (** x 2) (** y 5)) (* 35 (** x 3) (** y 4)) (* 35 (** x 4) (** y 3)) (* 21 (** x 5) (** y 2)) (* 7 (** x 6) y) (** x 7))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>8</span>","value":"8"},{"type":"latex","content":"y^{8} + 8 x y^{7} + 28 x^{2} y^{6} + 56 x^{3} y^{5} + 70 x^{4} y^{4} + 56 x^{5} y^{3} + 28 x^{6} y^{2} + 8 x^{7} y + x^{8}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 8) (* 8 x (** y 7)) (* 28 (** x 2) (** y 6)) (* 56 (** x 3) (** y 5)) (* 70 (** x 4) (** y 4)) (* 56 (** x 5) (** y 3)) (* 28 (** x 6) (** y 2)) (* 8 (** x 7) y) (** x 8))}"}],"value":"[8 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 8) (* 8 x (** y 7)) (* 28 (** x 2) (** y 6)) (* 56 (** x 3) (** y 5)) (* 70 (** x 4) (** y 4)) (* 56 (** x 5) (** y 3)) (* 28 (** x 6) (** y 2)) (* 8 (** x 7) y) (** x 8))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>9</span>","value":"9"},{"type":"latex","content":"y^{9} + 9 x y^{8} + 36 x^{2} y^{7} + 84 x^{3} y^{6} + 126 x^{4} y^{5} + 126 x^{5} y^{4} + 84 x^{6} y^{3} + 36 x^{7} y^{2} + 9 x^{8} y + x^{9}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 9) (* 9 x (** y 8)) (* 36 (** x 2) (** y 7)) (* 84 (** x 3) (** y 6)) (* 126 (** x 4) (** y 5)) (* 126 (** x 5) (** y 4)) (* 84 (** x 6) (** y 3)) (* 36 (** x 7) (** y 2)) (* 9 (** x 8) y) (** x 9))}"}],"value":"[9 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 9) (* 9 x (** y 8)) (* 36 (** x 2) (** y 7)) (* 84 (** x 3) (** y 6)) (* 126 (** x 4) (** y 5)) (* 126 (** x 5) (** y 4)) (* 84 (** x 6) (** y 3)) (* 36 (** x 7) (** y 2)) (* 9 (** x 8) y) (** x 9))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>10</span>","value":"10"},{"type":"latex","content":"y^{10} + 10 x y^{9} + 45 x^{2} y^{8} + 120 x^{3} y^{7} + 210 x^{4} y^{6} + 252 x^{5} y^{5} + 210 x^{6} y^{4} + 120 x^{7} y^{3} + 45 x^{8} y^{2} + 10 x^{9} y + x^{10}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 10) (* 10 x (** y 9)) (* 45 (** x 2) (** y 8)) (* 120 (** x 3) (** y 7)) (* 210 (** x 4) (** y 6)) (* 252 (** x 5) (** y 5)) (* 210 (** x 6) (** y 4)) (* 120 (** x 7) (** y 3)) (* 45 (** x 8) (** y 2)) (* 10 (** x 9) y) (** x 10))}"}],"value":"[10 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 10) (* 10 x (** y 9)) (* 45 (** x 2) (** y 8)) (* 120 (** x 3) (** y 7)) (* 210 (** x 4) (** y 6)) (* 252 (** x 5) (** y 5)) (* 210 (** x 6) (** y 4)) (* 120 (** x 7) (** y 3)) (* 45 (** x 8) (** y 2)) (* 10 (** x 9) y) (** x 10))}]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>11</span>","value":"11"},{"type":"latex","content":"y^{11} + 11 x y^{10} + 55 x^{2} y^{9} + 165 x^{3} y^{8} + 330 x^{4} y^{7} + 462 x^{5} y^{6} + 462 x^{6} y^{5} + 330 x^{7} y^{4} + 165 x^{8} y^{3} + 55 x^{9} y^{2} + 11 x^{10} y + x^{11}","value":"#gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 11) (* 11 x (** y 10)) (* 55 (** x 2) (** y 9)) (* 165 (** x 3) (** y 8)) (* 330 (** x 4) (** y 7)) (* 462 (** x 5) (** y 6)) (* 462 (** x 6) (** y 5)) (* 330 (** x 7) (** y 4)) (* 165 (** x 8) (** y 3)) (* 55 (** x 9) (** y 2)) (* 11 (** x 10) y) (** x 11))}"}],"value":"[11 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 11) (* 11 x (** y 10)) (* 55 (** x 2) (** y 9)) (* 165 (** x 3) (** y 8)) (* 330 (** x 4) (** y 7)) (* 462 (** x 5) (** y 6)) (* 462 (** x 6) (** y 5)) (* 330 (** x 7) (** y 4)) (* 165 (** x 8) (** y 3)) (* 55 (** x 9) (** y 2)) (* 11 (** x 10) y) (** x 11))}]"}],"value":"#gorilla_repl.table.TableView{:contents ([1 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ x y)}] [2 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 2) (* 2 x y) (** x 2))}] [3 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 3) (* 3 x (** y 2)) (* 3 (** x 2) y) (** x 3))}] [4 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 4) (* 4 x (** y 3)) (* 6 (** x 2) (** y 2)) (* 4 (** x 3) y) (** x 4))}] [5 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 5) (* 5 x (** y 4)) (* 10 (** x 2) (** y 3)) (* 10 (** x 3) (** y 2)) (* 5 (** x 4) y) (** x 5))}] [6 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 6) (* 6 x (** y 5)) (* 15 (** x 2) (** y 4)) (* 20 (** x 3) (** y 3)) (* 15 (** x 4) (** y 2)) (* 6 (** x 5) y) (** x 6))}] [7 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 7) (* 7 x (** y 6)) (* 21 (** x 2) (** y 5)) (* 35 (** x 3) (** y 4)) (* 35 (** x 4) (** y 3)) (* 21 (** x 5) (** y 2)) (* 7 (** x 6) y) (** x 7))}] [8 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 8) (* 8 x (** y 7)) (* 28 (** x 2) (** y 6)) (* 56 (** x 3) (** y 5)) (* 70 (** x 4) (** y 4)) (* 56 (** x 5) (** y 3)) (* 28 (** x 6) (** y 2)) (* 8 (** x 7) y) (** x 8))}] [9 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 9) (* 9 x (** y 8)) (* 36 (** x 2) (** y 7)) (* 84 (** x 3) (** y 6)) (* 126 (** x 4) (** y 5)) (* 126 (** x 5) (** y 4)) (* 84 (** x 6) (** y 3)) (* 36 (** x 7) (** y 2)) (* 9 (** x 8) y) (** x 9))}] [10 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 10) (* 10 x (** y 9)) (* 45 (** x 2) (** y 8)) (* 120 (** x 3) (** y 7)) (* 210 (** x 4) (** y 6)) (* 252 (** x 5) (** y 5)) (* 210 (** x 6) (** y 4)) (* 120 (** x 7) (** y 3)) (* 45 (** x 8) (** y 2)) (* 10 (** x 9) y) (** x 10))}] [11 #gorilla_test.expresso_latex.ExpressoLatexView{:expr (+ (** y 11) (* 11 x (** y 10)) (* 55 (** x 2) (** y 9)) (* 165 (** x 3) (** y 8)) (* 330 (** x 4) (** y 7)) (* 462 (** x 5) (** y 6)) (* 462 (** x 6) (** y 5)) (* 330 (** x 7) (** y 4)) (* 165 (** x 8) (** y 3)) (* 55 (** x 9) (** y 2)) (* 11 (** x 10) y) (** x 11))}]), :opts (:columns [#gorilla_repl.latex.LatexView{:content \"n\"} #gorilla_repl.latex.LatexView{:content \"(x + y)^n\"}])}"}
;; <=

;; @@

;; @@
