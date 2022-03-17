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
(ns kafka-example
  (:use [gorilla-repl table latex])
  (:import (org.apache.kafka.clients.admin AdminClient AdminClientConfig NewTopic)
           (org.apache.kafka.clients.consumer KafkaConsumer)
           (org.apache.kafka.clients.producer KafkaProducer ProducerRecord)
           (org.apache.kafka.common.serialization StringDeserializer StringSerializer)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
;; define atom to count records processed and functions to access
(def records-processed (atom 0))

(defn inc-records-processed
    []
    (swap! records-processed inc))

(defn get-records-processed
    []
    @records-processed)

(defn reset-records-processed
    []
    (reset! records-processed 0))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/reset-records-processed</span>","value":"#'kafka-example/reset-records-processed"}
;; <=

;; @@
(defn create-topics!
  "Create the topics from the provided list"
  [bootstrap-server topics partitions replication]
  (let [config {AdminClientConfig/BOOTSTRAP_SERVERS_CONFIG bootstrap-server}
        adminClient (AdminClient/create config)
        new-topics (map #(NewTopic. % partitions replication) topics)]
    (.createTopics adminClient new-topics)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/create-topics!</span>","value":"#'kafka-example/create-topics!"}
;; <=

;; @@
(defn delete-topics!
  "Delete the topics from the provided list"
  [bootstrap-server topics]
  (let [config {AdminClientConfig/BOOTSTRAP_SERVERS_CONFIG bootstrap-server}
        adminClient (AdminClient/create config)]
    (.deleteTopics adminClient topics)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/delete-topics!</span>","value":"#'kafka-example/delete-topics!"}
;; <=

;; @@
(defn list-topics
  "List the topics on this cluster of brokers"
  [bootstrap-server]
  (let [config {AdminClientConfig/BOOTSTRAP_SERVERS_CONFIG bootstrap-server}
        adminClient (AdminClient/create config)]
    (.get (.names (.listTopics adminClient)))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/list-topics</span>","value":"#'kafka-example/list-topics"}
;; <=

;; @@
(defn- build-consumer
  "Create the consumer instance to consume
from the provided kafka topic name"
  ([consumer-topic bootstrap-server group-id]
  (let [consumer-props
        {"bootstrap.servers", bootstrap-server
         "group.id",          group-id
         "key.deserializer",  StringDeserializer
         "value.deserializer", StringDeserializer
         "auto.offset.reset", "earliest"
         "enable.auto.commit", "true"}]

    (doto (KafkaConsumer. consumer-props)
      (.subscribe [consumer-topic]))))
    ([consumer-topic bootstrap-server]
     (build-consumer consumer-topic bootstrap-server "example")))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/build-consumer</span>","value":"#'kafka-example/build-consumer"}
;; <=

;; @@
(defn- build-producer
  "Create the kafka producer to send on messages received"
  [bootstrap-server]
  (let [producer-props {"value.serializer" StringSerializer
                        "key.serializer" StringSerializer
                        "bootstrap.servers" bootstrap-server}]
    (KafkaProducer. producer-props)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/build-producer</span>","value":"#'kafka-example/build-producer"}
;; <=

;; @@
(list-topics "localhost:9092")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#{&quot;test-consumer-topic&quot; &quot;test-2&quot; &quot;logs_broker&quot; &quot;connect-configs&quot; &quot;telecom_italia_data&quot; &quot;test-1&quot; &quot;coyote-test-avro&quot; &quot;coyote-test-binary&quot; &quot;_schemas&quot; &quot;test-produced-topic&quot; &quot;connect-offsets&quot; &quot;test-produced-topic-2&quot; &quot;example-produced-topic-2&quot; &quot;sea_vessel_position_reports&quot; &quot;nyc_yellow_taxi_trip_data&quot; &quot;names&quot; &quot;example-produced-topic&quot; &quot;connect-statuses&quot; &quot;mqtt&quot; &quot;backblaze_smart&quot; &quot;telecom_italia_grid&quot; &quot;example-consumer-topic&quot; &quot;coyote-test-json&quot;}</span>","value":"#{\"test-consumer-topic\" \"test-2\" \"logs_broker\" \"connect-configs\" \"telecom_italia_data\" \"test-1\" \"coyote-test-avro\" \"coyote-test-binary\" \"_schemas\" \"test-produced-topic\" \"connect-offsets\" \"test-produced-topic-2\" \"example-produced-topic-2\" \"sea_vessel_position_reports\" \"nyc_yellow_taxi_trip_data\" \"names\" \"example-produced-topic\" \"connect-statuses\" \"mqtt\" \"backblaze_smart\" \"telecom_italia_grid\" \"example-consumer-topic\" \"coyote-test-json\"}"}
;; <=

;; @@
(def producer-1 (build-producer "localhost:9092"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/producer-1</span>","value":"#'kafka-example/producer-1"}
;; <=

;; @@
(defn send-producer-1 [t k w] (.send producer-1 (ProducerRecord. t k w)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/send-producer-1</span>","value":"#'kafka-example/send-producer-1"}
;; <=

;; @@
(dotimes [n 5] (send-producer-1 "test-2" (str n) (str "record-" n)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def consumer-1 (build-consumer "test-2" "localhost:9092" "g1"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/consumer-1</span>","value":"#'kafka-example/consumer-1"}
;; <=

;; @@
(->> (.poll consumer-1 1000)
     seq
     (map (juxt #(.offset %) 
                #(.partition %)
                #(.key %) 
                #(.value %) 
                #(java.util.Date. (.timestamp %))))
     (concat (list (list "offset" "partition" "key" "value" "timestamp")))
     table-view
)
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;offset&quot;</span>","value":"\"offset\""},{"type":"html","content":"<span class='clj-string'>&quot;partition&quot;</span>","value":"\"partition\""},{"type":"html","content":"<span class='clj-string'>&quot;key&quot;</span>","value":"\"key\""},{"type":"html","content":"<span class='clj-string'>&quot;value&quot;</span>","value":"\"value\""},{"type":"html","content":"<span class='clj-string'>&quot;timestamp&quot;</span>","value":"\"timestamp\""}],"value":"(\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>20</span>","value":"20"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""},{"type":"html","content":"<span class='clj-string'>&quot;record-0&quot;</span>","value":"\"record-0\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:06:06.083-00:00&quot;</span>","value":"#inst \"2021-12-17T21:06:06.083-00:00\""}],"value":"[20 0 \"0\" \"record-0\" #inst \"2021-12-17T21:06:06.083-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>21</span>","value":"21"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""},{"type":"html","content":"<span class='clj-string'>&quot;record-1&quot;</span>","value":"\"record-1\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:06:06.086-00:00&quot;</span>","value":"#inst \"2021-12-17T21:06:06.086-00:00\""}],"value":"[21 0 \"1\" \"record-1\" #inst \"2021-12-17T21:06:06.086-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>22</span>","value":"22"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;2&quot;</span>","value":"\"2\""},{"type":"html","content":"<span class='clj-string'>&quot;record-2&quot;</span>","value":"\"record-2\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:06:06.087-00:00&quot;</span>","value":"#inst \"2021-12-17T21:06:06.087-00:00\""}],"value":"[22 0 \"2\" \"record-2\" #inst \"2021-12-17T21:06:06.087-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>23</span>","value":"23"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;3&quot;</span>","value":"\"3\""},{"type":"html","content":"<span class='clj-string'>&quot;record-3&quot;</span>","value":"\"record-3\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:06:06.087-00:00&quot;</span>","value":"#inst \"2021-12-17T21:06:06.087-00:00\""}],"value":"[23 0 \"3\" \"record-3\" #inst \"2021-12-17T21:06:06.087-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>24</span>","value":"24"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;4&quot;</span>","value":"\"4\""},{"type":"html","content":"<span class='clj-string'>&quot;record-4&quot;</span>","value":"\"record-4\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:06:06.087-00:00&quot;</span>","value":"#inst \"2021-12-17T21:06:06.087-00:00\""}],"value":"[24 0 \"4\" \"record-4\" #inst \"2021-12-17T21:06:06.087-00:00\"]"}],"value":"#gorilla_repl.table.TableView{:contents ((\"offset\" \"partition\" \"key\" \"value\" \"timestamp\") [20 0 \"0\" \"record-0\" #inst \"2021-12-17T21:06:06.083-00:00\"] [21 0 \"1\" \"record-1\" #inst \"2021-12-17T21:06:06.086-00:00\"] [22 0 \"2\" \"record-2\" #inst \"2021-12-17T21:06:06.087-00:00\"] [23 0 \"3\" \"record-3\" #inst \"2021-12-17T21:06:06.087-00:00\"] [24 0 \"4\" \"record-4\" #inst \"2021-12-17T21:06:06.087-00:00\"]), :opts nil}"}
;; <=

;; @@
;; This is our processing setup and loop (wrapped by future so it runs in a seperate Thread)
(def consumer-producer-future 
     (future 
         (let [consumer-topic "test-consumer-topic"
               producer-topic "test-produced-topic"
               producer-topic-2 "test-produced-topic-2"
               bootstrap-server "localhost:9092"
               zookeeper-hosts "localhost:2181"]
           ;; Create the example topics
           ;(create-topics! bootstrap-server [producer-topic consumer-topic] 1 1)

           (def consumer (build-consumer consumer-topic bootstrap-server))

           (def producer (build-producer bootstrap-server))

           (while true
                  (let [records (.poll consumer 100)]
                    (doseq [record records]
                       (inc-records-processed) ;; keep track of how many records have been processed
                       (.send producer (ProducerRecord. producer-topic 
                                                        (.key record)
                                                        (str "Processed Value: " (.value record))))
                       (.send producer (ProducerRecord. producer-topic-2 
                                                        (.key record)
                                                        (str "Processed Value length: " (str (count (.value record)))))))
                    (.commitAsync consumer))))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/consumer-producer-future</span>","value":"#'kafka-example/consumer-producer-future"}
;; <=

;; @@
(get-records-processed)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-long'>0</span>","value":"0"}
;; <=

;; @@
(dotimes [n 5] (send-producer-1 "test-consumer-topic" (str n) (str "record-" n)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def consumer-2 (build-consumer "test-consumer-topic" "localhost:9092" "c2"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/consumer-2</span>","value":"#'kafka-example/consumer-2"}
;; <=

;; @@
(def consumer-3 (build-consumer "test-produced-topic" "localhost:9092" "c3"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/consumer-3</span>","value":"#'kafka-example/consumer-3"}
;; <=

;; @@
(def consumer-4 (build-consumer "test-produced-topic-2" "localhost:9092" "c4"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/consumer-4</span>","value":"#'kafka-example/consumer-4"}
;; <=

;; @@
(->> (.poll consumer-2 1000)
     seq
     (map (juxt #(.offset %) 
                #(.partition %)
                #(.key %) 
                #(.value %) 
                #(java.util.Date. (.timestamp %))))
     (concat (list (list "offset" "partition" "key" "value" "timestamp")))
     table-view
)
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;offset&quot;</span>","value":"\"offset\""},{"type":"html","content":"<span class='clj-string'>&quot;partition&quot;</span>","value":"\"partition\""},{"type":"html","content":"<span class='clj-string'>&quot;key&quot;</span>","value":"\"key\""},{"type":"html","content":"<span class='clj-string'>&quot;value&quot;</span>","value":"\"value\""},{"type":"html","content":"<span class='clj-string'>&quot;timestamp&quot;</span>","value":"\"timestamp\""}],"value":"(\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>10</span>","value":"10"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;0&quot;</span>","value":"\"0\""},{"type":"html","content":"<span class='clj-string'>&quot;record-0&quot;</span>","value":"\"record-0\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:08:52.453-00:00&quot;</span>","value":"#inst \"2021-12-17T21:08:52.453-00:00\""}],"value":"[10 0 \"0\" \"record-0\" #inst \"2021-12-17T21:08:52.453-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>11</span>","value":"11"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;1&quot;</span>","value":"\"1\""},{"type":"html","content":"<span class='clj-string'>&quot;record-1&quot;</span>","value":"\"record-1\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:08:52.453-00:00&quot;</span>","value":"#inst \"2021-12-17T21:08:52.453-00:00\""}],"value":"[11 0 \"1\" \"record-1\" #inst \"2021-12-17T21:08:52.453-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>12</span>","value":"12"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;2&quot;</span>","value":"\"2\""},{"type":"html","content":"<span class='clj-string'>&quot;record-2&quot;</span>","value":"\"record-2\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:08:52.453-00:00&quot;</span>","value":"#inst \"2021-12-17T21:08:52.453-00:00\""}],"value":"[12 0 \"2\" \"record-2\" #inst \"2021-12-17T21:08:52.453-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>13</span>","value":"13"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;3&quot;</span>","value":"\"3\""},{"type":"html","content":"<span class='clj-string'>&quot;record-3&quot;</span>","value":"\"record-3\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:08:52.453-00:00&quot;</span>","value":"#inst \"2021-12-17T21:08:52.453-00:00\""}],"value":"[13 0 \"3\" \"record-3\" #inst \"2021-12-17T21:08:52.453-00:00\"]"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>14</span>","value":"14"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;4&quot;</span>","value":"\"4\""},{"type":"html","content":"<span class='clj-string'>&quot;record-4&quot;</span>","value":"\"record-4\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2021-12-17T21:08:52.453-00:00&quot;</span>","value":"#inst \"2021-12-17T21:08:52.453-00:00\""}],"value":"[14 0 \"4\" \"record-4\" #inst \"2021-12-17T21:08:52.453-00:00\"]"}],"value":"#gorilla_repl.table.TableView{:contents ((\"offset\" \"partition\" \"key\" \"value\" \"timestamp\") [10 0 \"0\" \"record-0\" #inst \"2021-12-17T21:08:52.453-00:00\"] [11 0 \"1\" \"record-1\" #inst \"2021-12-17T21:08:52.453-00:00\"] [12 0 \"2\" \"record-2\" #inst \"2021-12-17T21:08:52.453-00:00\"] [13 0 \"3\" \"record-3\" #inst \"2021-12-17T21:08:52.453-00:00\"] [14 0 \"4\" \"record-4\" #inst \"2021-12-17T21:08:52.453-00:00\"]), :opts nil}"}
;; <=

;; @@
(->> (.poll consumer-3 1000)
     seq
     (map (juxt #(.offset %) 
                #(.partition %)
                #(.key %) 
                #(.value %) 
                #(java.util.Date. (.timestamp %))))
     (concat (list (list "offset" "partition" "key" "value" "timestamp")))
     table-view
)
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;offset&quot;</span>","value":"\"offset\""},{"type":"html","content":"<span class='clj-string'>&quot;partition&quot;</span>","value":"\"partition\""},{"type":"html","content":"<span class='clj-string'>&quot;key&quot;</span>","value":"\"key\""},{"type":"html","content":"<span class='clj-string'>&quot;value&quot;</span>","value":"\"value\""},{"type":"html","content":"<span class='clj-string'>&quot;timestamp&quot;</span>","value":"\"timestamp\""}],"value":"(\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")"}],"value":"#gorilla_repl.table.TableView{:contents ((\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")), :opts nil}"}
;; <=

;; @@
(->> (.poll consumer-4 1000)
     seq
     (map (juxt #(.offset %) 
                #(.partition %)
                #(.key %) 
                #(.value %) 
                #(java.util.Date. (.timestamp %))))
     (concat (list (list "offset" "partition" "key" "value" "timestamp")))
     table-view
)
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;offset&quot;</span>","value":"\"offset\""},{"type":"html","content":"<span class='clj-string'>&quot;partition&quot;</span>","value":"\"partition\""},{"type":"html","content":"<span class='clj-string'>&quot;key&quot;</span>","value":"\"key\""},{"type":"html","content":"<span class='clj-string'>&quot;value&quot;</span>","value":"\"value\""},{"type":"html","content":"<span class='clj-string'>&quot;timestamp&quot;</span>","value":"\"timestamp\""}],"value":"(\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")"}],"value":"#gorilla_repl.table.TableView{:contents ((\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")), :opts nil}"}
;; <=

;; @@
(list-topics "localhost:9092")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#{&quot;test-consumer-topic&quot; &quot;test-2&quot; &quot;logs_broker&quot; &quot;connect-configs&quot; &quot;telecom_italia_data&quot; &quot;test-1&quot; &quot;coyote-test-avro&quot; &quot;coyote-test-binary&quot; &quot;_schemas&quot; &quot;test-produced-topic&quot; &quot;connect-offsets&quot; &quot;test-produced-topic-2&quot; &quot;example-produced-topic-2&quot; &quot;sea_vessel_position_reports&quot; &quot;nyc_yellow_taxi_trip_data&quot; &quot;example-produced-topic&quot; &quot;connect-statuses&quot; &quot;mqtt&quot; &quot;backblaze_smart&quot; &quot;telecom_italia_grid&quot; &quot;example-consumer-topic&quot; &quot;coyote-test-json&quot; &quot;pulsar&quot;}</span>","value":"#{\"test-consumer-topic\" \"test-2\" \"logs_broker\" \"connect-configs\" \"telecom_italia_data\" \"test-1\" \"coyote-test-avro\" \"coyote-test-binary\" \"_schemas\" \"test-produced-topic\" \"connect-offsets\" \"test-produced-topic-2\" \"example-produced-topic-2\" \"sea_vessel_position_reports\" \"nyc_yellow_taxi_trip_data\" \"example-produced-topic\" \"connect-statuses\" \"mqtt\" \"backblaze_smart\" \"telecom_italia_grid\" \"example-consumer-topic\" \"coyote-test-json\" \"pulsar\"}"}
;; <=

;; @@
(delete-topics! "localhost:9092" ["test-2" "test-consumer-topic" "test-produced-topic" "test-produced-topic-2"])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#object[org.apache.kafka.clients.admin.DeleteTopicsResult 0x7927bcbc &quot;org.apache.kafka.clients.admin.DeleteTopicsResult@7927bcbc&quot;]</span>","value":"#object[org.apache.kafka.clients.admin.DeleteTopicsResult 0x7927bcbc \"org.apache.kafka.clients.admin.DeleteTopicsResult@7927bcbc\"]"}
;; <=

;; @@
(def consumer-5 (build-consumer "pulsar" "localhost:9092" "p1"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/consumer-5</span>","value":"#'kafka-example/consumer-5"}
;; <=

;; @@
(->> (.poll consumer-5 1000)
     seq
     (map (juxt #(.offset %) 
                #(.partition %)
                #(.key %) 
                #(.value %) 
                #(java.util.Date. (.timestamp %))))
     (concat (list (list "offset" "partition" "key" "value" "timestamp")))
     table-view
)
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;offset&quot;</span>","value":"\"offset\""},{"type":"html","content":"<span class='clj-string'>&quot;partition&quot;</span>","value":"\"partition\""},{"type":"html","content":"<span class='clj-string'>&quot;key&quot;</span>","value":"\"key\""},{"type":"html","content":"<span class='clj-string'>&quot;value&quot;</span>","value":"\"value\""},{"type":"html","content":"<span class='clj-string'>&quot;timestamp&quot;</span>","value":"\"timestamp\""}],"value":"(\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>5</span>","value":"5"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;\u0000\u0000\u0000\u0000\\b\u0000&quot;</span>","value":"\"\u0000\u0000\u0000\u0000\\b\u0000\""},{"type":"html","content":"<span class='clj-string'>&quot;\u0000\u0000\u0000\u0000\\f\u0018hello-pulsar&quot;</span>","value":"\"\u0000\u0000\u0000\u0000\\f\u0018hello-pulsar\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2020-10-04T18:34:24.629-00:00&quot;</span>","value":"#inst \"2020-10-04T18:34:24.629-00:00\""}],"value":"[5 0 \"\u0000\u0000\u0000\u0000\\b\u0000\" \"\u0000\u0000\u0000\u0000\\f\u0018hello-pulsar\" #inst \"2020-10-04T18:34:24.629-00:00\"]"}],"value":"#gorilla_repl.table.TableView{:contents ((\"offset\" \"partition\" \"key\" \"value\" \"timestamp\") [5 0 \"\u0000\u0000\u0000\u0000\\b\u0000\" \"\u0000\u0000\u0000\u0000\\f\u0018hello-pulsar\" #inst \"2020-10-04T18:34:24.629-00:00\"]), :opts nil}"}
;; <=

;; @@
(def consumer-6 (build-consumer "mqtt" "localhost:9092" "m1"))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;kafka-example/consumer-6</span>","value":"#'kafka-example/consumer-6"}
;; <=

;; @@
(->> (.poll consumer-6 1000)
     seq
     (map (juxt #(.offset %) 
                #(.partition %)
                #(.key %) 
                #(.value %) 
                #(java.util.Date. (.timestamp %))))
     (concat (list (list "offset" "partition" "key" "value" "timestamp")))
     table-view
)
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-string'>&quot;offset&quot;</span>","value":"\"offset\""},{"type":"html","content":"<span class='clj-string'>&quot;partition&quot;</span>","value":"\"partition\""},{"type":"html","content":"<span class='clj-string'>&quot;key&quot;</span>","value":"\"key\""},{"type":"html","content":"<span class='clj-string'>&quot;value&quot;</span>","value":"\"value\""},{"type":"html","content":"<span class='clj-string'>&quot;timestamp&quot;</span>","value":"\"timestamp\""}],"value":"(\"offset\" \"partition\" \"key\" \"value\" \"timestamp\")"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<span class='clj-long'>45</span>","value":"45"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-string'>&quot;\u0000\u0000\u0000\u0000\\n\\f/mjson\u00023&quot;</span>","value":"\"\u0000\u0000\u0000\u0000\\n\\f/mjson\u00023\""},{"type":"html","content":"<span class='clj-string'>&quot;\u0000\u0000\u0000\u0000\u000B\u0004�����\u0019O@\u0004NA��堞]&quot;</span>","value":"\"\u0000\u0000\u0000\u0000\u000B\u0004�����\u0019O@\u0004NA��堞]\""},{"type":"html","content":"<span class='clj-unkown'>#inst &quot;2020-10-04T05:19:10.983-00:00&quot;</span>","value":"#inst \"2020-10-04T05:19:10.983-00:00\""}],"value":"[45 0 \"\u0000\u0000\u0000\u0000\\n\\f/mjson\u00023\" \"\u0000\u0000\u0000\u0000\u000B\u0004�����\u0019O@\u0004NA��堞]\" #inst \"2020-10-04T05:19:10.983-00:00\"]"}],"value":"#gorilla_repl.table.TableView{:contents ((\"offset\" \"partition\" \"key\" \"value\" \"timestamp\") [45 0 \"\u0000\u0000\u0000\u0000\\n\\f/mjson\u00023\" \"\u0000\u0000\u0000\u0000\u000B\u0004�����\u0019O@\u0004NA��堞]\" #inst \"2020-10-04T05:19:10.983-00:00\"]), :opts nil}"}
;; <=

;; @@

;; @@
