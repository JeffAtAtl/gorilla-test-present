(defproject gorilla-test "0.1.0-SNAPSHOT"
  :description "A test project for the Gorilla REPL."
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.vijaykiran/docjure "1.7.0"]
                 [com.novemberain/monger "1.7.0-beta1"]
                 [incanter "1.5.4"]
                 [org.clojure/core.match "0.2.0"]
                 [org.clojure/core.unify "0.5.6"]
                 [clojurewerkz/neocons "2.0.1"]
                 [clj-gremlin "0.0.3"]
                 [clj-blueprints2 "0.0.1" :exclusions [com.tinkerpop.blueprints/blueprints-core]]
                 [gavagai "0.3.1"]
                 [prismatic/plumbing "0.3.3"]
                 [clojureql "1.0.4"]
                 [lein-kibit "0.0.8"]
                 [rplevy-draker/wabbitmq "0.3.0" :exclusions [org.clojure/clojure]]
                 [com.mysql/connectorj "5.1.12"]
                 [hiccup "1.0.5"]
                 [expresso "0.2.0"]
                 [aysylu/loom "0.5.0"]
                 [loom-gorilla "0.1.0"]
                 [org.clojure/data.xml "0.0.7"]
                 [incanter-gorilla "0.1.0"]
                 [gorilla-renderable "1.0.0"]
                 [com.microsoft/sqljdbc4 "3.0"]
		 [cn.guoyukun.jdbc/db2jcc "1.4.2"]
		 [cn.guoyukun.jdbc/db2jcc_license_cu "1.4.2"]
                 [com.taoensso/carmine "2.7.0" :exclusions [org.clojure/clojure]]
                 [com.ashafa/clutch "0.4.0"]
                 [com.uswitch/clj-soap "0.2.3"]]
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.5"]
            [lein-localrepo "0.3"]]
  :profiles {:uberjar {:aot :all}})
