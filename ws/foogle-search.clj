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
(extract-word "CATSANDDOGS" 4)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-string'>&quot;CATS&quot;</span>","value":"\"CATS\""}
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
[(apply str (take (length-longest-first-word "DOGSANDCATS") "DOGSANDCATS")) (apply str (drop (length-longest-first-word "DOGSANDCATS") "DOGSANDCATS"))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;ANDCATS&quot;</span>","value":"\"ANDCATS\""}],"value":"[\"DOGS\" \"ANDCATS\"]"}
;; <=

;; @@
[(apply str (take (length-longest-first-word "ANDCATS") "ANDCATS")) (apply str (drop (length-longest-first-word "ANDCATS") "ANDCATS"))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CATS&quot;</span>","value":"\"CATS\""}],"value":"[\"AND\" \"CATS\"]"}
;; <=

;; @@
[(apply str (take (length-longest-first-word "CATS") "CATS")) (apply str (drop (length-longest-first-word "CATS") "CATS"))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""}],"value":"[\"CAT\" \"S\"]"}
;; <=

;; @@
[(apply str (take (length-longest-first-word "S") "S")) (apply str (drop (length-longest-first-word "S") "S"))]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;S&quot;</span>","value":"\"S\""},{"type":"html","content":"<span class='clj-string'>&quot;&quot;</span>","value":"\"\""}],"value":"[\"S\" \"\"]"}
;; <=

;; @@

;; @@
