;; gorilla-repl.fileformat = 1

;; **
;;; # Word List Analysis
;;; 
;;; Analysis and classification of word list using Clojure
;; **

;; @@
(ns words
  (:use gorilla-plot.core)
  (:use clojure.repl)
  (:use [clojure.string :only (split)]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def words-file (slurp "data/words"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;words/words-file</span>","value":"#'words/words-file"}
;; <=

;; @@
(def words (split words-file #"\r\n"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;words/words</span>","value":"#'words/words"}
;; <=

;; @@
(take 5 words)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;A&quot;</span>","value":"\"A\""},{"type":"html","content":"<span class='clj-string'>&quot;a&quot;</span>","value":"\"a\""},{"type":"html","content":"<span class='clj-string'>&quot;aa&quot;</span>","value":"\"aa\""},{"type":"html","content":"<span class='clj-string'>&quot;aal&quot;</span>","value":"\"aal\""},{"type":"html","content":"<span class='clj-string'>&quot;aalii&quot;</span>","value":"\"aalii\""}],"value":"(\"A\" \"a\" \"aa\" \"aal\" \"aalii\")"}
;; <=

;; @@
(count words)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>234936</span>","value":"234936"}
;; <=

;; @@
(reduce + (map count words))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>2251877</span>","value":"2251877"}
;; <=

;; @@
(/ (reduce + (map count words)) (count words))
;; @@

;; @@
(float (/ (reduce + (map count words)) (count words)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>9.585066</span>","value":"9.585066"}
;; <=

;; @@
(double (/ (reduce + (map count words)) (count words)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-double'>9.585065720025879</span>","value":"9.585065720025879"}
;; <=

;; @@
(frequencies (map count words))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-long'>52</span>","value":"52"}],"value":"[1 52]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-long'>155</span>","value":"155"}],"value":"[2 155]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"},{"type":"html","content":"<span class='clj-long'>1351</span>","value":"1351"}],"value":"[3 1351]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>4</span>","value":"4"},{"type":"html","content":"<span class='clj-long'>5110</span>","value":"5110"}],"value":"[4 5110]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>5</span>","value":"5"},{"type":"html","content":"<span class='clj-long'>9987</span>","value":"9987"}],"value":"[5 9987]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"},{"type":"html","content":"<span class='clj-long'>17477</span>","value":"17477"}],"value":"[6 17477]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"},{"type":"html","content":"<span class='clj-long'>23734</span>","value":"23734"}],"value":"[7 23734]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"},{"type":"html","content":"<span class='clj-long'>29926</span>","value":"29926"}],"value":"[8 29926]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>9</span>","value":"9"},{"type":"html","content":"<span class='clj-long'>32380</span>","value":"32380"}],"value":"[9 32380]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>10</span>","value":"10"},{"type":"html","content":"<span class='clj-long'>30867</span>","value":"30867"}],"value":"[10 30867]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>11</span>","value":"11"},{"type":"html","content":"<span class='clj-long'>26010</span>","value":"26010"}],"value":"[11 26010]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>12</span>","value":"12"},{"type":"html","content":"<span class='clj-long'>20460</span>","value":"20460"}],"value":"[12 20460]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>13</span>","value":"13"},{"type":"html","content":"<span class='clj-long'>14937</span>","value":"14937"}],"value":"[13 14937]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>14</span>","value":"14"},{"type":"html","content":"<span class='clj-long'>9763</span>","value":"9763"}],"value":"[14 9763]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>15</span>","value":"15"},{"type":"html","content":"<span class='clj-long'>5924</span>","value":"5924"}],"value":"[15 5924]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>16</span>","value":"16"},{"type":"html","content":"<span class='clj-long'>3377</span>","value":"3377"}],"value":"[16 3377]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>17</span>","value":"17"},{"type":"html","content":"<span class='clj-long'>1813</span>","value":"1813"}],"value":"[17 1813]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>18</span>","value":"18"},{"type":"html","content":"<span class='clj-long'>842</span>","value":"842"}],"value":"[18 842]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>19</span>","value":"19"},{"type":"html","content":"<span class='clj-long'>428</span>","value":"428"}],"value":"[19 428]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>20</span>","value":"20"},{"type":"html","content":"<span class='clj-long'>198</span>","value":"198"}],"value":"[20 198]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>21</span>","value":"21"},{"type":"html","content":"<span class='clj-long'>82</span>","value":"82"}],"value":"[21 82]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>22</span>","value":"22"},{"type":"html","content":"<span class='clj-long'>41</span>","value":"41"}],"value":"[22 41]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>23</span>","value":"23"},{"type":"html","content":"<span class='clj-long'>17</span>","value":"17"}],"value":"[23 17]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>24</span>","value":"24"},{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"}],"value":"[24 5]"}],"value":"{1 52, 2 155, 3 1351, 4 5110, 5 9987, 6 17477, 7 23734, 8 29926, 9 32380, 10 30867, 11 26010, 12 20460, 13 14937, 14 9763, 15 5924, 16 3377, 17 1813, 18 842, 19 428, 20 198, 21 82, 22 41, 23 17, 24 5}"}
;; <=

;; @@
(histogram (map count words) :bins 24)
;; @@
;; =>
;;; {"type":"vega","content":{"width":400,"height":247.2187957763672,"padding":{"top":10,"left":55,"bottom":40,"right":10},"data":[{"name":"f47cca3f-f4a8-4710-a868-d304c431f40d","values":[{"x":1.0,"y":0},{"x":1.9583333333333335,"y":52.0},{"x":2.916666666666667,"y":155.0},{"x":3.8750000000000004,"y":1351.0},{"x":4.833333333333334,"y":5110.0},{"x":5.791666666666668,"y":9987.0},{"x":6.750000000000002,"y":17477.0},{"x":7.708333333333336,"y":23734.0},{"x":8.66666666666667,"y":29926.0},{"x":9.625000000000004,"y":32380.0},{"x":10.583333333333337,"y":30867.0},{"x":11.541666666666671,"y":26010.0},{"x":12.500000000000005,"y":20460.0},{"x":13.45833333333334,"y":14937.0},{"x":14.416666666666673,"y":9763.0},{"x":15.375000000000007,"y":5924.0},{"x":16.33333333333334,"y":3377.0},{"x":17.29166666666667,"y":1813.0},{"x":18.250000000000004,"y":842.0},{"x":19.208333333333336,"y":428.0},{"x":20.166666666666668,"y":198.0},{"x":21.125,"y":82.0},{"x":22.083333333333332,"y":41.0},{"x":23.041666666666664,"y":17.0},{"x":23.999999999999996,"y":0.0},{"x":24.95833333333333,"y":5.0},{"x":25.91666666666666,"y":0}]}],"marks":[{"type":"line","from":{"data":"f47cca3f-f4a8-4710-a868-d304c431f40d"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"interpolate":{"value":"step-before"},"fill":{"value":"steelblue"},"fillOpacity":{"value":0.4},"stroke":{"value":"steelblue"},"strokeWidth":{"value":2},"strokeOpacity":{"value":1}}}}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"f47cca3f-f4a8-4710-a868-d304c431f40d","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"f47cca3f-f4a8-4710-a868-d304c431f40d","field":"data.y"}}],"axes":[{"type":"x","scale":"x"},{"type":"y","scale":"y"}]},"value":"#gorilla_repl.vega.VegaView{:content {:width 400, :height 247.2188, :padding {:top 10, :left 55, :bottom 40, :right 10}, :data [{:name \"f47cca3f-f4a8-4710-a868-d304c431f40d\", :values ({:x 1.0, :y 0} {:x 1.9583333333333335, :y 52.0} {:x 2.916666666666667, :y 155.0} {:x 3.8750000000000004, :y 1351.0} {:x 4.833333333333334, :y 5110.0} {:x 5.791666666666668, :y 9987.0} {:x 6.750000000000002, :y 17477.0} {:x 7.708333333333336, :y 23734.0} {:x 8.66666666666667, :y 29926.0} {:x 9.625000000000004, :y 32380.0} {:x 10.583333333333337, :y 30867.0} {:x 11.541666666666671, :y 26010.0} {:x 12.500000000000005, :y 20460.0} {:x 13.45833333333334, :y 14937.0} {:x 14.416666666666673, :y 9763.0} {:x 15.375000000000007, :y 5924.0} {:x 16.33333333333334, :y 3377.0} {:x 17.29166666666667, :y 1813.0} {:x 18.250000000000004, :y 842.0} {:x 19.208333333333336, :y 428.0} {:x 20.166666666666668, :y 198.0} {:x 21.125, :y 82.0} {:x 22.083333333333332, :y 41.0} {:x 23.041666666666664, :y 17.0} {:x 23.999999999999996, :y 0.0} {:x 24.95833333333333, :y 5.0} {:x 25.91666666666666, :y 0})}], :marks [{:type \"line\", :from {:data \"f47cca3f-f4a8-4710-a868-d304c431f40d\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :interpolate {:value \"step-before\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 0.4}, :stroke {:value \"steelblue\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 1}}}}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"f47cca3f-f4a8-4710-a868-d304c431f40d\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"f47cca3f-f4a8-4710-a868-d304c431f40d\", :field \"data.y\"}}], :axes [{:type \"x\", :scale \"x\"} {:type \"y\", :scale \"y\"}]}}"}
;; <=

;; @@
(defn lower [s] (.toLowerCase s))

(defn w2cf 
  [w] 
  (frequencies (sort (map #((comp keyword lower str) %) (seq w)))))

(defn find-matching-words 
  [w] 
  (filter #(and (= (count w) (count %)) 
                (= (w2cf w) (w2cf %)))  
          words))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;words/find-matching-words</span>","value":"#'words/find-matching-words"}
;; <=

;; @@
(def max-threes (->> words
                     (filter #(= 3 (count %)))
                     (pmap find-matching-words)
                     (map count)
                     (apply max)))
max-threes
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}
;; <=

;; @@
(def threes-with-gt-dec-max (into #{} (filter #(> (count %) (dec max-threes)) (pmap find-matching-words (filter #(= 3 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/threes-with-gt-dec-max</span>","value":"#'user/threes-with-gt-dec-max"}
;; <=

;; @@
[(count threes-with-gt-dec-max) (first (map count threes-with-gt-dec-max))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}],"value":"[1 6]"}
;; <=

;; @@
threes-with-gt-dec-max
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-set'>#{</span>","close":"<span class='clj-set'>}</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;Amy&quot;</span>","value":"\"Amy\""},{"type":"html","content":"<span class='clj-string'>&quot;amy&quot;</span>","value":"\"amy\""},{"type":"html","content":"<span class='clj-string'>&quot;May&quot;</span>","value":"\"May\""},{"type":"html","content":"<span class='clj-string'>&quot;may&quot;</span>","value":"\"may\""},{"type":"html","content":"<span class='clj-string'>&quot;Mya&quot;</span>","value":"\"Mya\""},{"type":"html","content":"<span class='clj-string'>&quot;yam&quot;</span>","value":"\"yam\""}],"value":"(\"Amy\" \"amy\" \"May\" \"may\" \"Mya\" \"yam\")"}],"value":"#{(\"Amy\" \"amy\" \"May\" \"may\" \"Mya\" \"yam\")}"}
;; <=

;; @@
(find-matching-words "may")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;Amy&quot;</span>","value":"\"Amy\""},{"type":"html","content":"<span class='clj-string'>&quot;amy&quot;</span>","value":"\"amy\""},{"type":"html","content":"<span class='clj-string'>&quot;May&quot;</span>","value":"\"May\""},{"type":"html","content":"<span class='clj-string'>&quot;may&quot;</span>","value":"\"may\""},{"type":"html","content":"<span class='clj-string'>&quot;Mya&quot;</span>","value":"\"Mya\""},{"type":"html","content":"<span class='clj-string'>&quot;yam&quot;</span>","value":"\"yam\""}],"value":"(\"Amy\" \"amy\" \"May\" \"may\" \"Mya\" \"yam\")"}
;; <=

;; @@
(def max-fours (->> words
                     (filter #(= 4 (count %)))
                     (pmap find-matching-words)
                     (map count)
                     (apply max)))
max-fours
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"}
;; <=

;; @@
(def fours-with-gt-dec-max (into #{} (filter #(> (count %) (dec max-fours)) (pmap find-matching-words (filter #(= 4 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/fours-with-gt-dec-max</span>","value":"#'user/fours-with-gt-dec-max"}
;; <=

;; @@
[(count fours-with-gt-dec-max) (first (map count fours-with-gt-dec-max))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"}],"value":"[2 8]"}
;; <=

;; @@
fours-with-gt-dec-max
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-set'>#{</span>","close":"<span class='clj-set'>}</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;alem&quot;</span>","value":"\"alem\""},{"type":"html","content":"<span class='clj-string'>&quot;alme&quot;</span>","value":"\"alme\""},{"type":"html","content":"<span class='clj-string'>&quot;lame&quot;</span>","value":"\"lame\""},{"type":"html","content":"<span class='clj-string'>&quot;leam&quot;</span>","value":"\"leam\""},{"type":"html","content":"<span class='clj-string'>&quot;Male&quot;</span>","value":"\"Male\""},{"type":"html","content":"<span class='clj-string'>&quot;male&quot;</span>","value":"\"male\""},{"type":"html","content":"<span class='clj-string'>&quot;meal&quot;</span>","value":"\"meal\""},{"type":"html","content":"<span class='clj-string'>&quot;mela&quot;</span>","value":"\"mela\""}],"value":"(\"alem\" \"alme\" \"lame\" \"leam\" \"Male\" \"male\" \"meal\" \"mela\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;aril&quot;</span>","value":"\"aril\""},{"type":"html","content":"<span class='clj-string'>&quot;lair&quot;</span>","value":"\"lair\""},{"type":"html","content":"<span class='clj-string'>&quot;Lari&quot;</span>","value":"\"Lari\""},{"type":"html","content":"<span class='clj-string'>&quot;lari&quot;</span>","value":"\"lari\""},{"type":"html","content":"<span class='clj-string'>&quot;liar&quot;</span>","value":"\"liar\""},{"type":"html","content":"<span class='clj-string'>&quot;lira&quot;</span>","value":"\"lira\""},{"type":"html","content":"<span class='clj-string'>&quot;rail&quot;</span>","value":"\"rail\""},{"type":"html","content":"<span class='clj-string'>&quot;rial&quot;</span>","value":"\"rial\""}],"value":"(\"aril\" \"lair\" \"Lari\" \"lari\" \"liar\" \"lira\" \"rail\" \"rial\")"}],"value":"#{(\"alem\" \"alme\" \"lame\" \"leam\" \"Male\" \"male\" \"meal\" \"mela\") (\"aril\" \"lair\" \"Lari\" \"lari\" \"liar\" \"lira\" \"rail\" \"rial\")}"}
;; <=

;; @@
(find-matching-words "male")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;alem&quot;</span>","value":"\"alem\""},{"type":"html","content":"<span class='clj-string'>&quot;alme&quot;</span>","value":"\"alme\""},{"type":"html","content":"<span class='clj-string'>&quot;lame&quot;</span>","value":"\"lame\""},{"type":"html","content":"<span class='clj-string'>&quot;leam&quot;</span>","value":"\"leam\""},{"type":"html","content":"<span class='clj-string'>&quot;Male&quot;</span>","value":"\"Male\""},{"type":"html","content":"<span class='clj-string'>&quot;male&quot;</span>","value":"\"male\""},{"type":"html","content":"<span class='clj-string'>&quot;meal&quot;</span>","value":"\"meal\""},{"type":"html","content":"<span class='clj-string'>&quot;mela&quot;</span>","value":"\"mela\""}],"value":"(\"alem\" \"alme\" \"lame\" \"leam\" \"Male\" \"male\" \"meal\" \"mela\")"}
;; <=

;; @@
(find-matching-words "liar")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;aril&quot;</span>","value":"\"aril\""},{"type":"html","content":"<span class='clj-string'>&quot;lair&quot;</span>","value":"\"lair\""},{"type":"html","content":"<span class='clj-string'>&quot;Lari&quot;</span>","value":"\"Lari\""},{"type":"html","content":"<span class='clj-string'>&quot;lari&quot;</span>","value":"\"lari\""},{"type":"html","content":"<span class='clj-string'>&quot;liar&quot;</span>","value":"\"liar\""},{"type":"html","content":"<span class='clj-string'>&quot;lira&quot;</span>","value":"\"lira\""},{"type":"html","content":"<span class='clj-string'>&quot;rail&quot;</span>","value":"\"rail\""},{"type":"html","content":"<span class='clj-string'>&quot;rial&quot;</span>","value":"\"rial\""}],"value":"(\"aril\" \"lair\" \"Lari\" \"lari\" \"liar\" \"lira\" \"rail\" \"rial\")"}
;; <=

;; @@
(def max-fives (->> words
                     (filter #(= 5 (count %)))
                     (pmap find-matching-words)
                     (map count)
                     (apply max)))
max-fives
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>11</span>","value":"11"}
;; <=

;; @@
(def fives-with-gt-dec-max (into #{} (filter #(> (count %) (dec max-fives)) (pmap find-matching-words (filter #(= 5 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/fives-with-gt-dec-max</span>","value":"#'user/fives-with-gt-dec-max"}
;; <=

;; @@
[(count fives-with-gt-dec-max) (first (map count fives-with-gt-dec-max))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>11</span>","value":"11"}],"value":"[1 11]"}
;; <=

;; @@
fives-with-gt-dec-max
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-set'>#{</span>","close":"<span class='clj-set'>}</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;angor&quot;</span>","value":"\"angor\""},{"type":"html","content":"<span class='clj-string'>&quot;argon&quot;</span>","value":"\"argon\""},{"type":"html","content":"<span class='clj-string'>&quot;goran&quot;</span>","value":"\"goran\""},{"type":"html","content":"<span class='clj-string'>&quot;grano&quot;</span>","value":"\"grano\""},{"type":"html","content":"<span class='clj-string'>&quot;groan&quot;</span>","value":"\"groan\""},{"type":"html","content":"<span class='clj-string'>&quot;nagor&quot;</span>","value":"\"nagor\""},{"type":"html","content":"<span class='clj-string'>&quot;Orang&quot;</span>","value":"\"Orang\""},{"type":"html","content":"<span class='clj-string'>&quot;orang&quot;</span>","value":"\"orang\""},{"type":"html","content":"<span class='clj-string'>&quot;organ&quot;</span>","value":"\"organ\""},{"type":"html","content":"<span class='clj-string'>&quot;rogan&quot;</span>","value":"\"rogan\""},{"type":"html","content":"<span class='clj-string'>&quot;Ronga&quot;</span>","value":"\"Ronga\""}],"value":"(\"angor\" \"argon\" \"goran\" \"grano\" \"groan\" \"nagor\" \"Orang\" \"orang\" \"organ\" \"rogan\" \"Ronga\")"}],"value":"#{(\"angor\" \"argon\" \"goran\" \"grano\" \"groan\" \"nagor\" \"Orang\" \"orang\" \"organ\" \"rogan\" \"Ronga\")}"}
;; <=

;; @@
(table-view (map #(find-matching-words %) (map first fives-with-gt-dec-max)))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;angor&quot;</span>","value":"\"angor\""},{"type":"html","content":"<span class='clj-string'>&quot;argon&quot;</span>","value":"\"argon\""},{"type":"html","content":"<span class='clj-string'>&quot;goran&quot;</span>","value":"\"goran\""},{"type":"html","content":"<span class='clj-string'>&quot;grano&quot;</span>","value":"\"grano\""},{"type":"html","content":"<span class='clj-string'>&quot;groan&quot;</span>","value":"\"groan\""},{"type":"html","content":"<span class='clj-string'>&quot;nagor&quot;</span>","value":"\"nagor\""},{"type":"html","content":"<span class='clj-string'>&quot;Orang&quot;</span>","value":"\"Orang\""},{"type":"html","content":"<span class='clj-string'>&quot;orang&quot;</span>","value":"\"orang\""},{"type":"html","content":"<span class='clj-string'>&quot;organ&quot;</span>","value":"\"organ\""},{"type":"html","content":"<span class='clj-string'>&quot;rogan&quot;</span>","value":"\"rogan\""},{"type":"html","content":"<span class='clj-string'>&quot;Ronga&quot;</span>","value":"\"Ronga\""}],"value":"(\"angor\" \"argon\" \"goran\" \"grano\" \"groan\" \"nagor\" \"Orang\" \"orang\" \"organ\" \"rogan\" \"Ronga\")"}],"value":"#gorilla_repl.table.TableView{:contents ((\"angor\" \"argon\" \"goran\" \"grano\" \"groan\" \"nagor\" \"Orang\" \"orang\" \"organ\" \"rogan\" \"Ronga\")), :opts nil}"}
;; <=

;; @@
(def max-sixes (->> words
                     (filter #(= 6 (count %)))
                     (pmap find-matching-words)
                     (map count)
                     (apply max)))
max-sixes
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>9</span>","value":"9"}
;; <=

;; @@
(def sixes-with-gt-dec-max (into #{} (filter #(> (count %) (dec max-sixes)) (pmap find-matching-words (filter #(= 6 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/sixes-with-gt-dec-max</span>","value":"#'user/sixes-with-gt-dec-max"}
;; <=

;; @@
[(count sixes-with-gt-dec-max) (first (map count sixes-with-gt-dec-max))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>9</span>","value":"9"}],"value":"[2 9]"}
;; <=

;; @@
sixes-with-gt-dec-max
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-set'>#{</span>","close":"<span class='clj-set'>}</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;acinar&quot;</span>","value":"\"acinar\""},{"type":"html","content":"<span class='clj-string'>&quot;arnica&quot;</span>","value":"\"arnica\""},{"type":"html","content":"<span class='clj-string'>&quot;Canari&quot;</span>","value":"\"Canari\""},{"type":"html","content":"<span class='clj-string'>&quot;canari&quot;</span>","value":"\"canari\""},{"type":"html","content":"<span class='clj-string'>&quot;Carian&quot;</span>","value":"\"Carian\""},{"type":"html","content":"<span class='clj-string'>&quot;carina&quot;</span>","value":"\"carina\""},{"type":"html","content":"<span class='clj-string'>&quot;Crania&quot;</span>","value":"\"Crania\""},{"type":"html","content":"<span class='clj-string'>&quot;crania&quot;</span>","value":"\"crania\""},{"type":"html","content":"<span class='clj-string'>&quot;narica&quot;</span>","value":"\"narica\""}],"value":"(\"acinar\" \"arnica\" \"Canari\" \"canari\" \"Carian\" \"carina\" \"Crania\" \"crania\" \"narica\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;asteer&quot;</span>","value":"\"asteer\""},{"type":"html","content":"<span class='clj-string'>&quot;Easter&quot;</span>","value":"\"Easter\""},{"type":"html","content":"<span class='clj-string'>&quot;easter&quot;</span>","value":"\"easter\""},{"type":"html","content":"<span class='clj-string'>&quot;Eastre&quot;</span>","value":"\"Eastre\""},{"type":"html","content":"<span class='clj-string'>&quot;reseat&quot;</span>","value":"\"reseat\""},{"type":"html","content":"<span class='clj-string'>&quot;saeter&quot;</span>","value":"\"saeter\""},{"type":"html","content":"<span class='clj-string'>&quot;seater&quot;</span>","value":"\"seater\""},{"type":"html","content":"<span class='clj-string'>&quot;staree&quot;</span>","value":"\"staree\""},{"type":"html","content":"<span class='clj-string'>&quot;teaser&quot;</span>","value":"\"teaser\""}],"value":"(\"asteer\" \"Easter\" \"easter\" \"Eastre\" \"reseat\" \"saeter\" \"seater\" \"staree\" \"teaser\")"}],"value":"#{(\"acinar\" \"arnica\" \"Canari\" \"canari\" \"Carian\" \"carina\" \"Crania\" \"crania\" \"narica\") (\"asteer\" \"Easter\" \"easter\" \"Eastre\" \"reseat\" \"saeter\" \"seater\" \"staree\" \"teaser\")}"}
;; <=

;; @@
(table-view (map #(find-matching-words %) (map first sixes-with-gt-dec-max)))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;acinar&quot;</span>","value":"\"acinar\""},{"type":"html","content":"<span class='clj-string'>&quot;arnica&quot;</span>","value":"\"arnica\""},{"type":"html","content":"<span class='clj-string'>&quot;Canari&quot;</span>","value":"\"Canari\""},{"type":"html","content":"<span class='clj-string'>&quot;canari&quot;</span>","value":"\"canari\""},{"type":"html","content":"<span class='clj-string'>&quot;Carian&quot;</span>","value":"\"Carian\""},{"type":"html","content":"<span class='clj-string'>&quot;carina&quot;</span>","value":"\"carina\""},{"type":"html","content":"<span class='clj-string'>&quot;Crania&quot;</span>","value":"\"Crania\""},{"type":"html","content":"<span class='clj-string'>&quot;crania&quot;</span>","value":"\"crania\""},{"type":"html","content":"<span class='clj-string'>&quot;narica&quot;</span>","value":"\"narica\""}],"value":"(\"acinar\" \"arnica\" \"Canari\" \"canari\" \"Carian\" \"carina\" \"Crania\" \"crania\" \"narica\")"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;asteer&quot;</span>","value":"\"asteer\""},{"type":"html","content":"<span class='clj-string'>&quot;Easter&quot;</span>","value":"\"Easter\""},{"type":"html","content":"<span class='clj-string'>&quot;easter&quot;</span>","value":"\"easter\""},{"type":"html","content":"<span class='clj-string'>&quot;Eastre&quot;</span>","value":"\"Eastre\""},{"type":"html","content":"<span class='clj-string'>&quot;reseat&quot;</span>","value":"\"reseat\""},{"type":"html","content":"<span class='clj-string'>&quot;saeter&quot;</span>","value":"\"saeter\""},{"type":"html","content":"<span class='clj-string'>&quot;seater&quot;</span>","value":"\"seater\""},{"type":"html","content":"<span class='clj-string'>&quot;staree&quot;</span>","value":"\"staree\""},{"type":"html","content":"<span class='clj-string'>&quot;teaser&quot;</span>","value":"\"teaser\""}],"value":"(\"asteer\" \"Easter\" \"easter\" \"Eastre\" \"reseat\" \"saeter\" \"seater\" \"staree\" \"teaser\")"}],"value":"#gorilla_repl.table.TableView{:contents ((\"acinar\" \"arnica\" \"Canari\" \"canari\" \"Carian\" \"carina\" \"Crania\" \"crania\" \"narica\") (\"asteer\" \"Easter\" \"easter\" \"Eastre\" \"reseat\" \"saeter\" \"seater\" \"staree\" \"teaser\")), :opts nil}"}
;; <=

;; @@
(def max-sevens (->> words
                     (filter #(= 7 (count %)))
                     (pmap find-matching-words)
                     (map count)
                     (apply max)))
max-sevens
;; @@

;; @@
(def seven-with-gt-dec-max (into #{} (filter #(> (count %) (dec max-sevens)) (pmap find-matching-words (filter #(= 7 (count %)) words)))))
;; @@
;; =>
;;; #'user/seven-with-gt-5
;; <=

;; @@
[(count sevens-with-gt-dec-max) (first (map count sevens-with-gt-dec-max))]
;; @@
;; =>
;;; 15
;; <=

;; @@
sevens-with-gt-dec-max
;; @@
;; =>
;;; {6 13, 7 1, 8 1}
;; <=

;; @@
(table-view (map #(find-matching-words %) (map first sevens-with-gt-dec-max)))
;; @@
;; =>
;;; ("easting" "gainset" "Genista" "genista" "ingesta" "seating" "signate" "teasing")
;; <=

;; @@
(def eight-with-gt-5 (into #{} (filter #(> (count %) 5) (pmap find-matching-words (filter #(= 8 (count %)) words)))))
;; @@
;; =>
;;; #'user/eight-with-gt-5
;; <=

;; @@
(count eight-with-gt-5)
;; @@
;; =>
;;; 3
;; <=

;; @@
(frequencies (map count eight-with-gt-5))
;; @@
;; =>
;;; {6 2, 8 1}
;; <=

;; @@
(sort-by count eight-with-gt-5)
;; @@
;; =>
;;; (("Artesian" "artesian" "Asterina" "asternia" "Erastian" "seatrain") ("arsonite" "Asterion" "asterion" "oestrian" "rosinate" "serotina") ("acrolein" "arecolin" "Caroline" "caroline" "colinear" "Cornelia" "creolian" "Lonicera"))
;; <=

;; @@
(find-matching-words "colinear")
;; @@
;; =>
;;; ("acrolein" "arecolin" "Caroline" "caroline" "colinear" "Cornelia" "creolian" "Lonicera")
;; <=

;; @@
(def nine-with-gt-4 (into #{} (filter #(> (count %) 4) (pmap find-matching-words (filter #(= 9 (count %)) words)))))
;; @@
;; =>
;;; #'user/nine-with-gt-2
;; <=

;; @@
(count nine-with-gt-4)
;; @@
;; =>
;;; 173
;; <=

;; @@
(frequencies (map count nine-with-gt-4))
;; @@
;; =>
;;; {5 5, 3 146, 4 22}
;; <=

;; @@
(sort-by count nine-with-gt-4)
;; @@
;; =>
;;; (("hesitater" "Hetaerist" "hetaerist") ("detrusion" "tinderous" "unstoried") ("disnature" "Sturnidae" "truandise") ("citronade" "endaortic" "redaction") ("deaminase" "Mesadenia" "mesadenia") ("asyndetic" "cystidean" "syndicate") ("unclaimed" "undecimal" "unmedical") ("cutleress" "lecturess" "truceless") ("performer" "prereform" "reperform") ("lightness" "nightless" "thingless") ("dipicrate" "patricide" "pediatric") ("Opulaster" "sportulae" "sporulate") ("decimator" "medicator" "mordicate") ("carpolith" "politarch" "trophical") ("perborate" "prorebate" "reprobate") ("messelite" "semisteel" "teleseism") ("gladdener" "glandered" "regladden") ("Aphrodite" "atrophied" "Diaporthe") ("entropion" "pontonier" "prenotion") ("curtilage" "cutigeral" "graticule") ("bakerless" "brakeless" "breakless") ("ciclatoun" "Noctiluca" "noctiluca") ("antitrope" "patronite" "tritanope") ("forminate" "Fremontia" "taeniform") ("Balanites" "basaltine" "stainable") ("emanatist" "staminate" "tasmanite") ("inspreith" "nephritis" "phrenitis") ("metronome" "monometer" "monotreme") ("petalless" "plateless" "pleatless") ("gratiolin" "largition" "tailoring") ("anticourt" "curtation" "ructation") ("antinegro" "Argentino" "argention") ("espringal" "presignal" "relapsing") ("targetman" "Termagant" "termagant") ("centurial" "Lucretian" "ultranice") ("resuspend" "suspender" "unpressed") ("indurable" "unbrailed" "unridable") ("dunstable" "unblasted" "unstabled") ("adipocele" "Cepolidae" "Ploceidae") ("cystotome" "cytostome" "ostectomy") ("gradation" "indagator" "tanagroid") ("epithecal" "petechial" "phacelite") ("argentide" "denigrate" "dinergate") ("intermine" "Nemertini" "terminine") ("citramide" "diametric" "matricide") ("coadunite" "education" "Noctuidae") ("anconitis" "antiscion" "onanistic") ("disherent" "hinderest" "tenderish") ("elasticin" "inelastic" "sciential") ("relevator" "revelator" "veratrole") ("lucrative" "revictual" "victualer") ("neuralist" "Ulsterian" "unrealist") ("Argentine" "argentine" "Tangerine") ("enstatite" "intestate" "satinette") ("Hesperian" "phrenesia" "seraphine") ("certosino" "cortisone" "Socotrine") ("nephritic" "phrenitic" "prehnitic") ("necrotomy" "normocyte" "oncometry") ("lituiform" "Trifolium" "trifolium") ("nervulose" "unresolve" "vulnerose") ("centriole" "electrion" "relection") ("ancillary" "Carlylian" "cranially") ("retheness" "thereness" "threeness") ("monograph" "nomograph" "phonogram") ("anticreep" "apenteric" "increpate") ("Oniscidae" "Oscinidae" "sciaenoid") ("misdealer" "misleader" "misleared") ("enameling" "malengine" "meningeal") ("Cornelius" "inclosure" "reclusion") ("pactional" "Pactolian" "placation") ("apertness" "peartness" "taperness") ("centurion" "continuer" "cornutine") ("kitchener" "rethicken" "thickener") ("eglantine" "inelegant" "legantine") ("consenter" "nonsecret" "reconsent") ("Petrogale" "petrolage" "prolegate") ("largeness" "rangeless" "regalness") ("agrestian" "gerastian" "Stangeria") ("crepitous" "Euproctis" "uroseptic") ("acentrous" "courtesan" "nectarous") ("unrespect" "unscepter" "unsceptre") ("periodate" "Proetidae" "Proteidae") ("dichroite" "erichtoid" "theriodic") ("limestone" "Melonites" "milestone") ("Dendrites" "distender" "redistend") ("reductant" "traducent" "truncated") ("spectrous" "susceptor" "suspector") ("examinate" "exanimate" "metaxenia") ("lightener" "relighten" "threeling") ("Cratinean" "incarnate" "nectarian") ("celloidin" "collidine" "decillion") ("binocular" "Caliburno" "Colubrina") ("appealing" "lagniappe" "panplegia") ("clinodome" "melodicon" "monocleid") ("Oestridae" "Ostreidae" "sorediate") ("precredit" "predirect" "repredict") ("enervator" "renovater" "venerator") ("Levantine" "Valentine" "valentine") ("leatherer" "releather" "Tarheeler") ("bicornate" "carbonite" "reboantic") ("overstain" "servation" "versation") ("curtailer" "recruital" "reticular") ("preaction" "precation" "recaption") ("denumeral" "undermeal" "unrealmed") ("Cicindela" "Cinclidae" "Icelandic") ("deliriant" "draintile" "interlaid") ("economism" "monoecism" "monosemic") ("ceruminal" "melanuric" "numerical") ("cantalite" "lactinate" "tetanical") ("antimodel" "maldonite" "monilated") ("briefless" "fiberless" "fibreless") ("cocurrent" "occurrent" "uncorrect") ("Kleistian" "saintlike" "satinlike") ("Wagnerite" "wagnerite" "winterage") ("ademonist" "demoniast" "staminode") ("ploration" "portional" "prolation") ("lairstone" "Orleanist" "serotinal") ("antrocele" "coeternal" "tolerance") ("anarchist" "archsaint" "cantharis") ("proctitis" "protistic" "tropistic") ("anthracia" "Antiarcha" "Catharina") ("epidermal" "impleader" "premedial") ("interdome" "mordenite" "nemertoid") ("continual" "inoculant" "unctional") ("direption" "perdition" "tropidine") ("mesomeric" "microseme" "semicrome") ("entertain" "Tarentine" "Terentian") ("anticness" "cantiness" "incessant") ("assaulter" "reassault" "saleratus") ("accretion" "anorectic" "Neoarctic") ("detrusive" "divesture" "servitude") ("encurtain" "runcinate" "uncertain") ("ameristic" "armistice" "artemisic") ("masculine" "semuncial" "simulance") ("octometer" "rectotome" "tocometer") ("antenatal" "Atlantean" "Tantalean") ("agoniadin" "anangioid" "ganoidian") ("Barnabite" "rabbanite" "rabbinate") ("suctional" "sulcation" "unstoical") ("Mesropian" "promnesia" "Spironema") ("cauliform" "formulaic" "fumarolic") ("endearing" "engrained" "grenadine") ("eburnated" "underbeat" "unrebated") ("entomeric" "intercome" "morencite") ("Acrididae" "Cardiidae" "Cidaridae") ("amnionate" "anamniote" "emanation") ("interlope" "interpole" "repletion" "terpineol") ("germanite" "germinate" "gramenite" "mangerite") ("deciatine" "diacetine" "taenicide" "teniacide") ("intercale" "interlace" "lacertine" "reclinate") ("ascertain" "Cartesian" "cartisane" "sectarian") ("Alectoris" "sarcolite" "sclerotia" "sectorial") ("eroticism" "isometric" "meroistic" "trioecism") ("carnalite" "Claretian" "lacertian" "nectarial") ("epistoler" "peristole" "perseitol" "pistoleer") ("antimeric" "carminite" "criminate" "metrician") ("alimentic" "antilemic" "melanitic" "metanilic") ("Neustrian" "Saturnine" "saturnine" "Sturninae") ("anarcotin" "Cantorian" "carnation" "narcotina") ("Alectrion" "clarionet" "crotaline" "Locarnite") ("anchorite" "antechoir" "heatronic" "Hectorian") ("saintless" "saltiness" "slatiness" "stainless") ("Demetrian" "dermatine" "meandrite" "minareted") ("alopecist" "altiscope" "epicostal" "scapolite") ("herpetism" "metership" "metreship" "temperish") ("interpone" "peritenon" "pinnotere" "preintone") ("guerdoner" "reundergo" "undergoer" "undergore") ("restraint" "retransit" "trainster" "transiter") ("connarite" "container" "cotarnine" "crenation" "narcotine") ("antimeter" "attermine" "interteam" "terminate" "tetramine") ("Angelical" "angelical" "englacial" "Galenical" "galenical") ("posterish" "prothesis" "sophister" "storeship" "tephrosis") ("atroscine" "certosina" "ostracine" "Tinoceras" "tricosane"))
;; <=

;; @@
(find-matching-words "tricosane")
;; @@
;; =>
;;; ("atroscine" "certosina" "ostracine" "Tinoceras" "tricosane")
;; <=

;; @@
(find-matching-words "storeship")
;; @@
;; =>
;;; ("posterish" "prothesis" "sophister" "storeship" "tephrosis")
;; <=

;; @@
(find-matching-words "Angelical")
;; @@
;; =>
;;; ("Angelical" "angelical" "englacial" "Galenical" "galenical")
;; <=

;; @@
(find-matching-words "terminate")
;; @@
;; =>
;;; ("antimeter" "attermine" "interteam" "terminate" "tetramine")
;; <=

;; @@
(find-matching-words "container")
;; @@
;; =>
;;; ("connarite" "container" "cotarnine" "crenation" "narcotine")
;; <=

;; @@
(def ten-with-gt-4 (into #{} (filter #(> (count %) 4) (pmap find-matching-words (filter #(= 10 (count %)) words)))))
;; @@
;; =>
;;; #'user/ten-with-gt-4
;; <=

;; @@
(count ten-with-gt-4)
;; @@
;; =>
;;; 1
;; <=

;; @@
(frequencies (map count ten-with-gt-4))
;; @@
;; =>
;;; {5 1}
;; <=

;; @@
(sort-by count ten-with-gt-4)
;; @@
;; =>
;;; (("underserve" "underverse" "undeserver" "unreserved" "unreversed"))
;; <=

;; @@
(find-matching-words "underserve")
;; @@
;; =>
;;; ("underserve" "underverse" "undeserver" "unreserved" "unreversed")
;; <=

;; @@
(def eleven-with-gt-4 (into #{} (filter #(> (count %) 4) (pmap find-matching-words (filter #(= 11 (count %)) words)))))
;; @@
;; =>
;;; #'user/eleven-with-gt-4
;; <=

;; @@
(count eleven-with-gt-4)
;; @@
;; =>
;;; 1
;; <=

;; @@
(frequencies (map count eleven-with-gt-4))
;; @@
;; =>
;;; {5 1}
;; <=

;; @@
(sort-by count eleven-with-gt-4)
;; @@
;; =>
;;; (("anisometric" "creationism" "miscreation" "ramisection" "reactionism"))
;; <=

;; @@
(find-matching-words "creationism")
;; @@
;; =>
;;; ("anisometric" "creationism" "miscreation" "ramisection" "reactionism")
;; <=

;; @@
(def twelve-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 12 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/twelve-with-gt-2</span>","value":"#'user/twelve-with-gt-2"}
;; <=

;; @@
(count twelve-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}
;; <=

;; @@
(frequencies (map count twelve-with-gt-2))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{<span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"},{"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}],"value":"[3 6]"}],"value":"{3 6}"}
;; <=

;; @@
(sort-by count twelve-with-gt-2)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-list'>(<span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;indiscreetly&quot;</span>","value":"\"indiscreetly\""},{"type":"html","content":"<span class='clj-string'>&quot;indiscretely&quot;</span>","value":"\"indiscretely\""},{"type":"html","content":"<span class='clj-string'>&quot;iridescently&quot;</span>","value":"\"iridescently\""}],"value":"(\"indiscreetly\" \"indiscretely\" \"iridescently\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;salamandarin&quot;</span>","value":"\"salamandarin\""},{"type":"html","content":"<span class='clj-string'>&quot;salamandrian&quot;</span>","value":"\"salamandrian\""},{"type":"html","content":"<span class='clj-string'>&quot;Salamandrina&quot;</span>","value":"\"Salamandrina\""}],"value":"(\"salamandarin\" \"salamandrian\" \"Salamandrina\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;dentilingual&quot;</span>","value":"\"dentilingual\""},{"type":"html","content":"<span class='clj-string'>&quot;indulgential&quot;</span>","value":"\"indulgential\""},{"type":"html","content":"<span class='clj-string'>&quot;linguidental&quot;</span>","value":"\"linguidental\""}],"value":"(\"dentilingual\" \"indulgential\" \"linguidental\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;alterability&quot;</span>","value":"\"alterability\""},{"type":"html","content":"<span class='clj-string'>&quot;bilaterality&quot;</span>","value":"\"bilaterality\""},{"type":"html","content":"<span class='clj-string'>&quot;relatability&quot;</span>","value":"\"relatability\""}],"value":"(\"alterability\" \"bilaterality\" \"relatability\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;counterpaled&quot;</span>","value":"\"counterpaled\""},{"type":"html","content":"<span class='clj-string'>&quot;counterplead&quot;</span>","value":"\"counterplead\""},{"type":"html","content":"<span class='clj-string'>&quot;unpercolated&quot;</span>","value":"\"unpercolated\""}],"value":"(\"counterpaled\" \"counterplead\" \"unpercolated\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;perviousness&quot;</span>","value":"\"perviousness\""},{"type":"html","content":"<span class='clj-string'>&quot;previousness&quot;</span>","value":"\"previousness\""},{"type":"html","content":"<span class='clj-string'>&quot;viperousness&quot;</span>","value":"\"viperousness\""}],"value":"(\"perviousness\" \"previousness\" \"viperousness\")"}],"value":"((\"indiscreetly\" \"indiscretely\" \"iridescently\") (\"salamandarin\" \"salamandrian\" \"Salamandrina\") (\"dentilingual\" \"indulgential\" \"linguidental\") (\"alterability\" \"bilaterality\" \"relatability\") (\"counterpaled\" \"counterplead\" \"unpercolated\") (\"perviousness\" \"previousness\" \"viperousness\"))"}
;; <=

;; @@
(find-matching-words "indiscreetly")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;indiscreetly&quot;</span>","value":"\"indiscreetly\""},{"type":"html","content":"<span class='clj-string'>&quot;indiscretely&quot;</span>","value":"\"indiscretely\""},{"type":"html","content":"<span class='clj-string'>&quot;iridescently&quot;</span>","value":"\"iridescently\""}],"value":"(\"indiscreetly\" \"indiscretely\" \"iridescently\")"}
;; <=

;; @@
(def thirteen-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 13 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/thirteen-with-gt-2</span>","value":"#'user/thirteen-with-gt-2"}
;; <=

;; @@
(count thirteen-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"}
;; <=

;; @@
(frequencies (map count thirteen-with-gt-2))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{<span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"},{"type":"html","content":"<span class='clj-long'>8</span>","value":"8"}],"value":"[3 8]"}],"value":"{3 8}"}
;; <=

;; @@
(sort-by count thirteen-with-gt-2)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-list'>(<span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;gastrophrenic&quot;</span>","value":"\"gastrophrenic\""},{"type":"html","content":"<span class='clj-string'>&quot;nephrogastric&quot;</span>","value":"\"nephrogastric\""},{"type":"html","content":"<span class='clj-string'>&quot;phrenogastric&quot;</span>","value":"\"phrenogastric\""}],"value":"(\"gastrophrenic\" \"nephrogastric\" \"phrenogastric\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;phrenosplenic&quot;</span>","value":"\"phrenosplenic\""},{"type":"html","content":"<span class='clj-string'>&quot;splenonephric&quot;</span>","value":"\"splenonephric\""},{"type":"html","content":"<span class='clj-string'>&quot;splenophrenic&quot;</span>","value":"\"splenophrenic\""}],"value":"(\"phrenosplenic\" \"splenonephric\" \"splenophrenic\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;demipronation&quot;</span>","value":"\"demipronation\""},{"type":"html","content":"<span class='clj-string'>&quot;preadmonition&quot;</span>","value":"\"preadmonition\""},{"type":"html","content":"<span class='clj-string'>&quot;predomination&quot;</span>","value":"\"predomination\""}],"value":"(\"demipronation\" \"preadmonition\" \"predomination\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;antisoporific&quot;</span>","value":"\"antisoporific\""},{"type":"html","content":"<span class='clj-string'>&quot;prosification&quot;</span>","value":"\"prosification\""},{"type":"html","content":"<span class='clj-string'>&quot;sporification&quot;</span>","value":"\"sporification\""}],"value":"(\"antisoporific\" \"prosification\" \"sporification\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;certification&quot;</span>","value":"\"certification\""},{"type":"html","content":"<span class='clj-string'>&quot;cretification&quot;</span>","value":"\"cretification\""},{"type":"html","content":"<span class='clj-string'>&quot;rectification&quot;</span>","value":"\"rectification\""}],"value":"(\"certification\" \"cretification\" \"rectification\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;gramophonical&quot;</span>","value":"\"gramophonical\""},{"type":"html","content":"<span class='clj-string'>&quot;monographical&quot;</span>","value":"\"monographical\""},{"type":"html","content":"<span class='clj-string'>&quot;nomographical&quot;</span>","value":"\"nomographical\""}],"value":"(\"gramophonical\" \"monographical\" \"nomographical\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;impersonation&quot;</span>","value":"\"impersonation\""},{"type":"html","content":"<span class='clj-string'>&quot;prosemination&quot;</span>","value":"\"prosemination\""},{"type":"html","content":"<span class='clj-string'>&quot;semipronation&quot;</span>","value":"\"semipronation\""}],"value":"(\"impersonation\" \"prosemination\" \"semipronation\")"},{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;peridiastolic&quot;</span>","value":"\"peridiastolic\""},{"type":"html","content":"<span class='clj-string'>&quot;periodicalist&quot;</span>","value":"\"periodicalist\""},{"type":"html","content":"<span class='clj-string'>&quot;proidealistic&quot;</span>","value":"\"proidealistic\""}],"value":"(\"peridiastolic\" \"periodicalist\" \"proidealistic\")"}],"value":"((\"gastrophrenic\" \"nephrogastric\" \"phrenogastric\") (\"phrenosplenic\" \"splenonephric\" \"splenophrenic\") (\"demipronation\" \"preadmonition\" \"predomination\") (\"antisoporific\" \"prosification\" \"sporification\") (\"certification\" \"cretification\" \"rectification\") (\"gramophonical\" \"monographical\" \"nomographical\") (\"impersonation\" \"prosemination\" \"semipronation\") (\"peridiastolic\" \"periodicalist\" \"proidealistic\"))"}
;; <=

;; @@
(find-matching-words "gastrophrenic")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;gastrophrenic&quot;</span>","value":"\"gastrophrenic\""},{"type":"html","content":"<span class='clj-string'>&quot;nephrogastric&quot;</span>","value":"\"nephrogastric\""},{"type":"html","content":"<span class='clj-string'>&quot;phrenogastric&quot;</span>","value":"\"phrenogastric\""}],"value":"(\"gastrophrenic\" \"nephrogastric\" \"phrenogastric\")"}
;; <=

;; @@
(def fourteen-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 14 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/fourteen-with-gt-2</span>","value":"#'user/fourteen-with-gt-2"}
;; <=

;; @@
(count fourteen-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def fifteen-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 15 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/fifteen-with-gt-2</span>","value":"#'user/fifteen-with-gt-2"}
;; <=

;; @@
(count fifteen-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"}
;; <=

;; @@
(frequencies (map count fifteen-with-gt-2))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{<span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>4</span>","value":"4"},{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"}],"value":"[4 1]"}],"value":"{4 1}"}
;; <=

;; @@
(sort-by count fifteen-with-gt-2)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-list'>(<span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;gramophonically&quot;</span>","value":"\"gramophonically\""},{"type":"html","content":"<span class='clj-string'>&quot;monographically&quot;</span>","value":"\"monographically\""},{"type":"html","content":"<span class='clj-string'>&quot;nomographically&quot;</span>","value":"\"nomographically\""},{"type":"html","content":"<span class='clj-string'>&quot;phonogramically&quot;</span>","value":"\"phonogramically\""}],"value":"(\"gramophonically\" \"monographically\" \"nomographically\" \"phonogramically\")"}],"value":"((\"gramophonically\" \"monographically\" \"nomographically\" \"phonogramically\"))"}
;; <=

;; @@
(find-matching-words "monographically")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(<span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;gramophonically&quot;</span>","value":"\"gramophonically\""},{"type":"html","content":"<span class='clj-string'>&quot;monographically&quot;</span>","value":"\"monographically\""},{"type":"html","content":"<span class='clj-string'>&quot;nomographically&quot;</span>","value":"\"nomographically\""},{"type":"html","content":"<span class='clj-string'>&quot;phonogramically&quot;</span>","value":"\"phonogramically\""}],"value":"(\"gramophonically\" \"monographically\" \"nomographically\" \"phonogramically\")"}
;; <=

;; @@
(def sixteen-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 16 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/sixteen-with-gt-2</span>","value":"#'user/sixteen-with-gt-2"}
;; <=

;; @@
(count sixteen-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def seventeen-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 17 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/seventeen-with-gt-2</span>","value":"#'user/seventeen-with-gt-2"}
;; <=

;; @@
(count seventeen-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def eightteen-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 18 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/eightteen-with-gt-2</span>","value":"#'user/eightteen-with-gt-2"}
;; <=

;; @@
(count eightteen-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def nineteen-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 19 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/nineteen-with-gt-2</span>","value":"#'user/nineteen-with-gt-2"}
;; <=

;; @@
(count nineteen-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def twenty-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 20 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/twenty-with-gt-2</span>","value":"#'user/twenty-with-gt-2"}
;; <=

;; @@
(count twenty-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def twentyone-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 21 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/twentyone-with-gt-2</span>","value":"#'user/twentyone-with-gt-2"}
;; <=

;; @@
(count twentyone-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def twentytwo-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 22 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/twentytwo-with-gt-2</span>","value":"#'user/twentytwo-with-gt-2"}
;; <=

;; @@
(count twentytwo-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(def twentythree-with-gt-2 (into #{} (filter #(> (count %) 2) (pmap find-matching-words (filter #(= 23 (count %)) words)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/twentythree-with-gt-2</span>","value":"#'user/twentythree-with-gt-2"}
;; <=

;; @@
(count twentythree-with-gt-2)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}
;; <=

;; @@
(frequencies (map count twentythree-with-gt-2))
;; @@

;; @@
(sort-by count twentythree-with-gt-2)
;; @@

;; @@
(find-matching-words "")
;; @@

;; @@

;; @@
