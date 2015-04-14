;; gorilla-repl.fileformat = 1

;; **
;;; # ClojureQL MySQL/MariaDb Example
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace.
;; **

;; @@
(ns mysql-example
  (:require [gorilla-plot.core :as plot])
  (:use clojureql.core)
  (:use clojure.repl)
  (:use clojure.pprint))
;; @@

;; @@
(def testdb {:classname "com.mysql.jdbc.Driver" 
             :subprotocol "mysql" 
             :user "jtcummi" 
             :password "h2ll0gone" 
             :subname "//localhost:3306/test"})
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;mysql-example/testdb</span>","value":"#'mysql-example/testdb"}
;; <=

;; @@
(count @(table testdb :words))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>234936</span>","value":"234936"}
;; <=

;; @@
(pprint (keys (first @(table testdb :words))))
;; @@

;; @@
(dir clojure.pprint)
;; @@

;; @@

;; @@
