;; gorilla-repl.fileformat = 1

;; **
;;; # Foogle Search
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;;; 
;;; Foogle is a search engine that specializes in search queries that consist of words that are made up of 4 characters or less.  The UI team has built a front end that does not support the space character, as that is the latest rage in the UI experience community.  You’ve been tasked with building a service/function that can take the user UI input of a single string and break it into the words we believe the user was searching for.  For example: 
;;; 
;;; INPUT:  “FOODTHATISGOOD” 
;;; 
;;; OUTPUT: [“FOOD”, “THAT”, “IS”, “GOOD”] 
;;; 
;;; Expectations:
;;; 
;;; 1.  This is a thought exercise, not a coding exercise.  You will be asked to talk through how you would solve this, what complexities you see in this challenge, and how you would overcome those complexities.
;;; 2.  Even though it is not a code challenge, you can frame your approach in a particular language, stack, or coding paradigm you are familiar with.
;;; 3.  Feel free to code out a solution if that helps you talk through it.  Any language, even a pseudo language, is acceptable (if using a language only you are familiar with, be prepared to explain the why’s behind choosing that language).  
;;; 
;;; Rules: 
;;; 
;;; 1.  All of the words that are in the input string will be between 1 and 4 characters long.  Words like I, AM, THE, CODE would all be valid words, where CODEX would not be valid.
;;; 2.  Within Foogle a dictionary is available that has every known word with a length between 1 and 4 characters.  The shape/type of this dictionary is fluid and will conform to how you propose to use it in your solution, and will be provided to your service/function along with the search string.  For example, if you think and solve in Java, the dictionary could be a java.util.HashSet or java.util.ArrayList.  The choice is yours to best suite your approach.
;;; 3.  Every search input will be made up of only known words.  So, you may get “FOODTHATISGOOD”, “FOODTHATISGOO”, and “FOODTHATISGO”, but never “FOODTHATISG” as G is not a word.
;;; 4.  The output of the function is a collection of the words the search string is parsed into in the order they appear in the search string.  So “IAMTHECOD” will output as [“I”, “AM”, “THE”, “COD”]. 
;;; 5.  The input could lead to many possible outputs.  Your solution should only return the first one it finds.  For example, the input of “DOGSANDCATS” could return [“DOGS”, “AND”, “CATS”] or [“DOG”, “SAND”, “CATS”].  Both are valid but only one needs to be returned.
;;; 6.  There is no limit to the number of words or the length of the search input.  It could be a single one letter word such as “A”, or it could consist of 10000 words.  No limit.
;;; 7.  The search input is never null nor empty.  It will always have at least 1 word in it.
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
                     (remove #{"B" "C" "D" "E" "F" "G" "H" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W"                                  "X" "Y" "Z"})
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
;;; {"type":"html","content":"<span class='clj-unkown'>6287</span>","value":"6287"}
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
;; this function paints us into a corner (we always take longest word even when it prevents us from finding next word)
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
;; this function paints us into a corner (we always take longest word even when it prevents us from finding next word)
(defn length-shortest-first-word 
  [term]
  (first (filter #(in-dictionary? (extract-word term %)) [1 2 3 4])))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;foogle-search/length-shortest-first-word</span>","value":"#'foogle-search/length-shortest-first-word"}
;; <=

;; @@
(length-shortest-first-word "DOGSANDCATS")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>2</span>","value":"2"}
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
[(take-longest-word "ANDCAT") (drop-longest-word "ANDCAT")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""}],"value":"[\"AND\" \"CAT\"]"}
;; <=

;; @@
[(take-longest-word "CAT") (drop-longest-word "CAT")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;&quot;</span>","value":"\"\""}],"value":"[\"CAT\" \"\"]"}
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
(longest-word-rest "DOGSANDCAT")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;ANDCAT&quot;</span>","value":"\"ANDCAT\""}],"value":"[\"DOGS\" \"ANDCAT\"]"}
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
(process "DOGSANDCAT")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""}],"value":"(\"DOGS\" \"AND\" \"CAT\")"}
;; <=

;; @@
(process "INVERYMANYDOGSANDCAT")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""}],"value":"(\"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\")"}
;; <=

;; @@
(process "INVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCAT")
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""},{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""}],"value":"(\"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\" \"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\")"}
;; <=

;; @@
(distinct (process "INVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCATINVERYMANYDOGSANDCAT"))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-lazy-seq'>(</span>","close":"<span class='clj-lazy-seq'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;IN&quot;</span>","value":"\"IN\""},{"type":"html","content":"<span class='clj-string'>&quot;VERY&quot;</span>","value":"\"VERY\""},{"type":"html","content":"<span class='clj-string'>&quot;MANY&quot;</span>","value":"\"MANY\""},{"type":"html","content":"<span class='clj-string'>&quot;DOGS&quot;</span>","value":"\"DOGS\""},{"type":"html","content":"<span class='clj-string'>&quot;AND&quot;</span>","value":"\"AND\""},{"type":"html","content":"<span class='clj-string'>&quot;CAT&quot;</span>","value":"\"CAT\""}],"value":"(\"IN\" \"VERY\" \"MANY\" \"DOGS\" \"AND\" \"CAT\")"}
;; <=

;; @@
;; examples where current code fails us
(process "ANONE")
;; @@

;; @@
[(take-longest-word "ANONE") (drop-longest-word "ANONE")]
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;ANON&quot;</span>","value":"\"ANON\""},{"type":"html","content":"<span class='clj-string'>&quot;E&quot;</span>","value":"\"E\""}],"value":"[\"ANON\" \"E\"]"}
;; <=

;; @@
[(take-longest-word "E") (drop-longest-word "E")]
;; @@

;; @@

;; @@
