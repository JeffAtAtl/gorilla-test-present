;; gorilla-repl.fileformat = 1

;; **
;;; # Unified Update Model
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;;; 
;;; Copied examples from Labrepl.
;; **

;; @@
(ns unified-update-model
  (:require [gorilla-plot.core :as plot])
  (:use clojure.repl)
  (:use clojure.pprint))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def counter (atom 0))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;unified-update-model/counter</span>","value":"#'unified-update-model/counter"}
;; <=

;; @@
counter
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-atom'>#&lt;Atom@5dd999a3: 0&gt;</span>","value":"#<Atom@5dd999a3: 0>"}
;; <=

;; @@
@counter
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>0</span>","value":"0"}
;; <=

;; @@
(swap! counter inc)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>1</span>","value":"1"}
;; <=

;; @@
(swap! counter + 1000)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>1001</span>","value":"1001"}
;; <=

;; @@
(def languages (atom {1 {:name "Clojure", :age 2}}))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;unified-update-model/languages</span>","value":"#'unified-update-model/languages"}
;; <=

;; @@
languages
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-atom'>#&lt;Atom@672d82a2: {1 {:age 2, :name &quot;Clojure&quot;}}&gt;</span>","value":"#<Atom@672d82a2: {1 {:age 2, :name \"Clojure\"}}>"}
;; <=

;; @@
@languages
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>2</span>","value":"2"}],"value":"[:age 2]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Clojure&quot;</span>","value":"\"Clojure\""}],"value":"[:name \"Clojure\"]"}],"value":"{:age 2, :name \"Clojure\"}"}],"value":"[1 {:age 2, :name \"Clojure\"}]"}],"value":"{1 {:age 2, :name \"Clojure\"}}"}
;; <=

;; @@
(swap! languages update-in [1 :age] inc)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"[:age 3]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Clojure&quot;</span>","value":"\"Clojure\""}],"value":"[:name \"Clojure\"]"}],"value":"{:age 3, :name \"Clojure\"}"}],"value":"[1 {:age 3, :name \"Clojure\"}]"}],"value":"{1 {:age 3, :name \"Clojure\"}}"}
;; <=

;; @@
(swap! languages assoc 2 {:name "Java" :age 18})
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"[:age 3]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Clojure&quot;</span>","value":"\"Clojure\""}],"value":"[:name \"Clojure\"]"}],"value":"{:age 3, :name \"Clojure\"}"}],"value":"[1 {:age 3, :name \"Clojure\"}]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>2</span>","value":"2"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>18</span>","value":"18"}],"value":"[:age 18]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Java&quot;</span>","value":"\"Java\""}],"value":"[:name \"Java\"]"}],"value":"{:age 18, :name \"Java\"}"}],"value":"[2 {:age 18, :name \"Java\"}]"}],"value":"{1 {:age 3, :name \"Clojure\"}, 2 {:age 18, :name \"Java\"}}"}
;; <=

;; @@
(def languages-1 (atom [{:name "Clojure", :age 2}]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;unified-update-model/languages-1</span>","value":"#'unified-update-model/languages-1"}
;; <=

;; @@
(swap! languages-1 update-in [0 :age] inc)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"[:age 3]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Clojure&quot;</span>","value":"\"Clojure\""}],"value":"[:name \"Clojure\"]"}],"value":"{:age 3, :name \"Clojure\"}"}],"value":"[{:age 3, :name \"Clojure\"}]"}
;; <=

;; @@
(swap! languages-1 conj {:name "Java" :age 18})
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"[:age 3]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Clojure&quot;</span>","value":"\"Clojure\""}],"value":"[:name \"Clojure\"]"}],"value":"{:age 3, :name \"Clojure\"}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>18</span>","value":"18"}],"value":"[:age 18]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Java&quot;</span>","value":"\"Java\""}],"value":"[:name \"Java\"]"}],"value":"{:age 18, :name \"Java\"}"}],"value":"[{:age 3, :name \"Clojure\"} {:age 18, :name \"Java\"}]"}
;; <=

;; @@
(swap! languages-1 update-in [1 :age] inc)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"[:age 3]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Clojure&quot;</span>","value":"\"Clojure\""}],"value":"[:name \"Clojure\"]"}],"value":"{:age 3, :name \"Clojure\"}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:age</span>","value":":age"},{"type":"html","content":"<span class='clj-long'>19</span>","value":"19"}],"value":"[:age 19]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:name</span>","value":":name"},{"type":"html","content":"<span class='clj-string'>&quot;Java&quot;</span>","value":"\"Java\""}],"value":"[:name \"Java\"]"}],"value":"{:age 19, :name \"Java\"}"}],"value":"[{:age 3, :name \"Clojure\"} {:age 19, :name \"Java\"}]"}
;; <=

;; @@

;; @@
