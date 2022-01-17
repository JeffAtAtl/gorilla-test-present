;; gorilla-repl.fileformat = 1

;; **
;;; # Foogle Search
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;; **

;; @@
(ns foogle-search)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def word-file (slurp "data/words"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/word-file</span>","value":"#'foogle-search/word-file"}
;; <=

;; @@
(def words (clojure.string/split word-file #"\r\n"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/words</span>","value":"#'foogle-search/words"}
;; <=

;; @@
(def dictionary (->> words
                     (remove #(< 4 (count %)))
                     (map #(.toUpperCase %))
                     set))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/dictionary</span>","value":"#'foogle-search/dictionary"}
;; <=

;; @@
(count words)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>234936</span>","value":"234936"}
;; <=

;; @@
(count dictionary)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>6311</span>","value":"6311"}
;; <=

;; @@
(take 5 words)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;A&quot;</span>","value":"\"A\""},{"type":"html","content":"<span class='clj-string'>&quot;a&quot;</span>","value":"\"a\""},{"type":"html","content":"<span class='clj-string'>&quot;aa&quot;</span>","value":"\"aa\""},{"type":"html","content":"<span class='clj-string'>&quot;aal&quot;</span>","value":"\"aal\""},{"type":"html","content":"<span class='clj-string'>&quot;aalii&quot;</span>","value":"\"aalii\""}],"value":"(\"A\" \"a\" \"aa\" \"aal\" \"aalii\")"}
;; <=

;; @@
(take 5 dictionary)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;JOOM&quot;</span>","value":"\"JOOM\""},{"type":"html","content":"<span class='clj-string'>&quot;UTUM&quot;</span>","value":"\"UTUM\""},{"type":"html","content":"<span class='clj-string'>&quot;BONY&quot;</span>","value":"\"BONY\""},{"type":"html","content":"<span class='clj-string'>&quot;CLAW&quot;</span>","value":"\"CLAW\""},{"type":"html","content":"<span class='clj-string'>&quot;PURE&quot;</span>","value":"\"PURE\""}],"value":"(\"JOOM\" \"UTUM\" \"BONY\" \"CLAW\" \"PURE\")"}
;; <=

;; @@
(defn extract-word
  [term n]
  (apply str (take n term)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/extract-word</span>","value":"#'foogle-search/extract-word"}
;; <=

;; @@
(extract-word "DOGSANDCATS" 4)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""}
;; <=

;; @@
(defn in-dictionary?
  [s]
  (contains? dictionary s))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/in-dictionary?</span>","value":"#'foogle-search/in-dictionary?"}
;; <=

;; @@
(defn length-longest-first-word 
  [term]
  (first (filter #(in-dictionary? (extract-word term %)) [4 3 2 1])))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/length-longest-first-word</span>","value":"#'foogle-search/length-longest-first-word"}
;; <=

;; @@
(length-longest-first-word "DOGSANDCATS")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>4</span>","value":"4"}
;; <=

;; @@
(defn take-longest-word
  [term]
  (if (= term "")
      ""
      (apply str (take (length-longest-first-word term) term))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/take-longest-word</span>","value":"#'foogle-search/take-longest-word"}
;; <=

;; @@
(defn drop-longest-word
  [term]
  (if (= term "")
      ""
      (apply str (drop (length-longest-first-word term) term))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/drop-longest-word</span>","value":"#'foogle-search/drop-longest-word"}
;; <=

;; @@
[(take-longest-word "DOGSANDCATS") (drop-longest-word "DOGSANDCATS")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;ANDCATS&quot;</span>","value":"\"ANDCATS\""}],"value":"[\"DOGS\" \"ANDCATS\"]"}
;; <=

;; @@
[(take-longest-word "ANDCATS") (drop-longest-word "ANDCATS")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CATS&quot;</span>","value":"\"CATS\""}],"value":"[\"AND\" \"CATS\"]"}
;; <=

;; @@
[(take-longest-word "CATS") (drop-longest-word "CATS")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""}],"value":"[\"CAT\" \"S\"]"}
;; <=

;; @@
[(take-longest-word "S") (drop-longest-word "S")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""},{"type":"html","content":"<span class='clj-string'>&quot;&quot;</span>","value":"\"\""}],"value":"[\"S\" \"\"]"}
;; <=

;; @@
[(take-longest-word "") (drop-longest-word "")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;&quot;</span>","value":"\"\""},{"type":"html","content":"<span class='clj-string'>&quot;&quot;</span>","value":"\"\""}],"value":"[\"\" \"\"]"}
;; <=

;; @@
(defn longest-word-rest
  [term]
  [(take-longest-word term) (drop-longest-word term)])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/longest-word-rest</span>","value":"#'foogle-search/longest-word-rest"}
;; <=

;; @@
(longest-word-rest "DOGSANDCATS")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;ANDCATS&quot;</span>","value":"\"ANDCATS\""}],"value":"[\"DOGS\" \"ANDCATS\"]"}
;; <=

;; @@
(defn process
  [term]
  (map first 
       (take-while #(not (= "" (first %))) 
                   (rest (iterate (fn [[_ rest]] (longest-word-rest rest)) ["" term])))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/process</span>","value":"#'foogle-search/process"}
;; <=

;; @@
(process "FOODTHATISGOOD")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;FOOD&quot;</span>","value":"\"FOOD\""},{"type":"html","content":"<span class='clj-string'>&quot;THAT&quot;</span>","value":"\"THAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IS&quot;</span>","value":"\"IS\""},{"type":"html","content":"<span class='clj-string'>&quot;GOOD&quot;</span>","value":"\"GOOD\""}],"value":"(\"FOOD\" \"THAT\" \"IS\" \"GOOD\")"}
;; <=

;; @@
(process "DOGSANDCATS")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""}],"value":"(\"DOGS\" \"AND\" \"CAT\" \"S\")"}
;; <=

;; @@
(process "INVERYMANYDOGSANDCATS")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""}],"value":"(\"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"S\")"}
;; <=

;; @@
(process "INVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATS")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""}],"value":"(\"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"S\")"}
;; <=

;; @@
(distinct (process "INVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATSINVERYMANYDOGSANDCATS"))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;SIN&quot;</span>","value":"\"SIN\""},{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""}],"value":"(\"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"SIN\" \"S\")"}
;; <=

;; @@

;; @@
