(defproject gorilla-test "0.1.0-SNAPSHOT"
  :description "A test project for the Gorilla REPL."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [instaparse "1.4.2"]
                 [com.vijaykiran/docjure "1.7.0" :exclusions [xml-apis]]
                 [org.clojure/core.match "0.2.2" :exclusions [org.clojure/tools.analyzer.jvm]]
                 [org.clojure/core.unify "0.5.7"]
                 [clj-http "3.2.0"]
                 [clojurewerkz/neocons "3.1.0" :exclusions [clj-http]]
                 [clj-gremlin "0.0.3"]
                 [clj-blueprints2 "0.0.1" :exclusions [com.tinkerpop.blueprints/blueprints-core]]
                 [gavagai "0.3.2"]
                 [prismatic/plumbing "0.5.3"]
                 [clojureql "1.0.4" :exclusions [org.clojure/core.incubator]]
                 [lein-kibit "0.1.2" :exclusions [org.clojure/core.logic]]
                 [rplevy-draker/wabbitmq "0.3.0" :exclusions [org.clojure/clojure]]
                 [com.mysql/connectorj "5.1.12"]
                 [hiccup "1.0.5"]
                 [expresso "0.2.0" :exclusions [org.clojure/core.memoize instaparse]]
                 [aysylu/loom "0.6.0"]
                 [loom-gorilla "0.1.0"]
                 [walmartlabs/datascope "0.1.1"]
                 [com.walmartlabs/lacinia "0.14.0"]
                 [org.clojure/data.xml "0.0.8"]
                 [incanter-gorilla "0.1.0" :exclusions [xml-apis]]
                 [gorilla-renderable "2.0.0"]
                 [com.microsoft/sqljdbc4 "3.0"]
                 [cn.guoyukun.jdbc/db2jcc "1.4.2"]
                 [cn.guoyukun.jdbc/db2jcc_license_cu "1.4.2"]
                 [com.taoensso/carmine "2.14.0" :exclusions [org.clojure/clojure org.clojure/tools.reader]]
                 [com.ashafa/clutch "0.4.0"]
                 [org.apache.geronimo.specs/geronimo-activation_1.1_spec "1.1"]
                 [com.uswitch/clj-soap "0.2.3" :exclusions [org.apache.geronimo.specs/geronimo-activation_1.1_spec]]
                 [proto-repl "0.3.1"]
                 [abrade "0.1.8"]
                 [clarango "0.7.1"]
                 [clojurewerkz/elastisch "2.2.1"]
                 [im.chit/one.love "0.1.4"]
                 [com.rpl/specter "1.0.0"]
                 [clojurewerkz/machine_head "1.0.0"]
                 [org.clojars.vaclavsynacek/gorilla-plantuml "0.1.0-SNAPSHOT" :exclusions [gorilla-repl]]
                 [com.lemondronor.leaflet-gorilla "0.1.3"]
                 [org.apache.kafka/kafka-clients "2.0.0"]
                 [tentacles "0.5.2"]]
  :main ^:skip-aot gorilla-test.core
  :target-path "target/%s"
  :plugins [[org.clojars.benfb/lein-gorilla "0.6.0"]
            [lein-localrepo "0.5.3"]]
  :profiles {:uberjar {:aot :all}})
