;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit ctrl+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;;; 
;;; chainMultiply(2)(3)(); // => 6
;;; chainMultiply(2)(3)(4)(5)(); // => 120
;;; chainMultiply(9)(8)(7)(); // 504
;;; chainMultiply(100)(2)(5)(10)(.01)(); // 100
;; **

;; @@
(ns mysterious-sands
  (:require [gorilla-plot.core :as plot]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(defn chain-mult 
  [n] 
  (if (nil? n)
      0
      (if (number? n)
          (partial * n)
          (partial n))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;mysterious-sands/chain-mult</span>","value":"#'mysterious-sands/chain-mult"}
;; <=

;; @@
((partial * 2) 3)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}
;; <=

;; @@
(chain-mult nil)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>0</span>","value":"0"}
;; <=

;; @@
((chain-mult 2) 3)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>6</span>","value":"6"}
;; <=

;; @@
((partial (partial * 2) 3) 5)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>30</span>","value":"30"}
;; <=

;; @@
(((chain-mult 2) 3) 5)
;; @@

;; @@

;; @@
