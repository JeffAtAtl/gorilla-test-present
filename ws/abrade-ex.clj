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
(ns abrade-ex
  (:use gorilla-plot.core)
  (:use abrade.client)
  (:use clojure.pprint)
  (:use clojure.repl))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(-> (browser :firefox)
    (open "http://127.0.0.1:8994/worksheet.html")
    (css "div")
    pprint)
;; @@

;; @@

;; @@
