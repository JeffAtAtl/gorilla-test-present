;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;; **

;; @@
(ns stack-example
  (:require [gorilla-plot.core :as plot]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def stack (atom []))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;stack-example/stack</span>","value":"#'stack-example/stack"}
;; <=

;; @@
(defn push [a] (swap! stack conj a))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;stack-example/push</span>","value":"#'stack-example/push"}
;; <=

;; @@
(push 1)
(push 2)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-long'>2</span>","value":"2"}],"value":"[1 2]"}
;; <=

;; @@
(defn peek-pop-ret
  []
  (let [v (peek @stack)]  
  (swap! stack pop)
  v))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;stack-example/peek-pop-ret</span>","value":"#'stack-example/peek-pop-ret"}
;; <=

;; @@
(defn invoke
  [f a]
  (if (= a 2)
    (let [v2 (peek-pop-ret)
          v1 (peek-pop-ret)]
      (push (f v1 v2)))
    ;; (= a 1)
    (let [v1 (peek-pop-ret)]
      (push (f v1)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;stack-example/invoke</span>","value":"#'stack-example/invoke"}
;; <=

;; @@
(invoke + 2)
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>3</span>","value":"3"}],"value":"[3]"}
;; <=

;; @@
(invoke println 1)
;; @@
;; ->
;;; 3
;;; 
;; <-
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}],"value":"[nil]"}
;; <=

;; @@

;; @@

;; @@

;; @@

;; @@

;; @@

;; @@

;; @@
