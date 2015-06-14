;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;;; 
;;; Welcome to gorilla :-) Shift + enter evaluates code. Poke the question mark (top right) to learn more ...
;; **

;; @@
(ns test
  (:use gorilla-test.core)
  (:use clojure.repl)
  (:use clojure.pprint))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(dir gorilla-test.core)
;; @@
;; ->
;;; -main
;;; gaussian
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(-main)
;; @@
;; ->
;;; Hello, World!
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(source -main)
;; @@
;; ->
;;; (defn -main
;;;   &quot;I don&#x27;t do a whole lot ... yet.&quot;
;;;   [&amp; args]
;;;   (println &quot;Hello, World!&quot;))
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(source gaussian)
;; @@
;; ->
;;; (defn gaussian
;;;   [x sigma mu]
;;;   (* (/ 0.4 sigma) (Math/exp (- (/ (* (- x mu) (- x mu)) (* 2 (* sigma sigma)))))))
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(pprint (->> (all-ns)
             (map #(.name %))
             sort))
;; @@
;; ->
;;; (cemerick.piggieback
;;;  cheshire.core
;;;  cheshire.factory
;;;  cheshire.generate
;;;  cheshire.parse
;;;  cider.nrepl
;;;  cider.nrepl.middleware.apropos
;;;  cider.nrepl.middleware.classpath
;;;  cider.nrepl.middleware.complete
;;;  cider.nrepl.middleware.info
;;;  cider.nrepl.middleware.inspect
;;;  cider.nrepl.middleware.macroexpand
;;;  cider.nrepl.middleware.ns
;;;  cider.nrepl.middleware.resource
;;;  cider.nrepl.middleware.stacktrace
;;;  cider.nrepl.middleware.test
;;;  cider.nrepl.middleware.trace
;;;  cider.nrepl.middleware.undef
;;;  cider.nrepl.middleware.util.cljs
;;;  cider.nrepl.middleware.util.inspect
;;;  cider.nrepl.middleware.util.java
;;;  cider.nrepl.middleware.util.java.parser
;;;  cider.nrepl.middleware.util.misc
;;;  clj-semver.core
;;;  clj-time.core
;;;  clj-time.format
;;;  cljs-tooling.complete
;;;  cljs-tooling.info
;;;  cljs-tooling.util.analysis
;;;  cljs-tooling.util.misc
;;;  cljs.analyzer
;;;  cljs.closure
;;;  cljs.compiler
;;;  cljs.env
;;;  cljs.repl
;;;  cljs.repl.rhino
;;;  cljs.source-map
;;;  cljs.source-map.base64
;;;  cljs.source-map.base64-vlq
;;;  cljs.tagged-literals
;;;  clojure.core
;;;  clojure.core.incubator
;;;  clojure.core.protocols
;;;  clojure.data.json
;;;  clojure.instant
;;;  clojure.java.classpath
;;;  clojure.java.io
;;;  clojure.main
;;;  clojure.pprint
;;;  clojure.reflect
;;;  clojure.repl
;;;  clojure.set
;;;  clojure.stacktrace
;;;  clojure.string
;;;  clojure.template
;;;  clojure.test
;;;  clojure.tools.macro
;;;  clojure.tools.nrepl
;;;  clojure.tools.nrepl.ack
;;;  clojure.tools.nrepl.bencode
;;;  clojure.tools.nrepl.middleware
;;;  clojure.tools.nrepl.middleware.interruptible-eval
;;;  clojure.tools.nrepl.middleware.load-file
;;;  clojure.tools.nrepl.middleware.pr-values
;;;  clojure.tools.nrepl.middleware.session
;;;  clojure.tools.nrepl.misc
;;;  clojure.tools.nrepl.server
;;;  clojure.tools.nrepl.transport
;;;  clojure.tools.reader
;;;  clojure.tools.reader.default-data-readers
;;;  clojure.tools.reader.impl.ExceptionInfo
;;;  clojure.tools.reader.impl.commons
;;;  clojure.tools.reader.impl.utils
;;;  clojure.tools.reader.reader-types
;;;  clojure.tools.trace
;;;  clojure.uuid
;;;  clojure.walk
;;;  clout.core
;;;  complete.core
;;;  compliment.context
;;;  compliment.core
;;;  compliment.sources
;;;  compliment.sources.class-members
;;;  compliment.sources.keywords
;;;  compliment.sources.local-bindings
;;;  compliment.sources.namespaces-and-classes
;;;  compliment.sources.ns-mappings
;;;  compliment.sources.special-forms
;;;  compliment.utils
;;;  compojure.core
;;;  compojure.handler
;;;  compojure.response
;;;  compojure.route
;;;  dynapath.defaults
;;;  dynapath.dynamic-classpath
;;;  dynapath.util
;;;  gorilla-renderable.core
;;;  gorilla-repl.core
;;;  gorilla-repl.files
;;;  gorilla-repl.nrepl
;;;  gorilla-repl.render-values-mw
;;;  gorilla-repl.renderer
;;;  gorilla-repl.version
;;;  gorilla-repl.websocket-relay
;;;  gorilla-test.core
;;;  new.mongo
;;;  org.httpkit.client
;;;  org.httpkit.server
;;;  ring.middleware.content-type
;;;  ring.middleware.cookies
;;;  ring.middleware.file-info
;;;  ring.middleware.flash
;;;  ring.middleware.head
;;;  ring.middleware.json
;;;  ring.middleware.keyword-params
;;;  ring.middleware.multipart-params
;;;  ring.middleware.nested-params
;;;  ring.middleware.params
;;;  ring.middleware.session
;;;  ring.middleware.session.memory
;;;  ring.middleware.session.store
;;;  ring.util.codec
;;;  ring.util.io
;;;  ring.util.mime-type
;;;  ring.util.response
;;;  ring.util.time
;;;  sicp-1
;;;  somnium.congomongo
;;;  somnium.congomongo.coerce
;;;  somnium.congomongo.config
;;;  test
;;;  user)
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(dir clojure.tools.nrepl.server)
;; @@
;; ->
;;; -&gt;Server
;;; default-handler
;;; default-middlewares
;;; handle
;;; handle*
;;; map-&gt;Server
;;; start-server
;;; stop-server
;;; unknown-op
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(doc clojure.tools.nrepl.server/map->Server)
;; @@
;; ->
;;; -------------------------
;;; clojure.tools.nrepl.server/map-&gt;Server
;;; ([m__5818__auto__])
;;;   Factory function for class clojure.tools.nrepl.server.Server, taking a map of keywords to field values.
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(doc clojure.tools.nrepl.server/->Server)
;; @@
;; ->
;;; -------------------------
;;; clojure.tools.nrepl.server/-&gt;Server
;;; ([server-socket port open-transports transport greeting handler])
;;;   Positional factory function for class clojure.tools.nrepl.server.Server.
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(doc clojure.tools.nrepl.server/start-server)
;; @@
;; ->
;;; -------------------------
;;; clojure.tools.nrepl.server/start-server
;;; ([&amp; {:keys [port bind transport-fn handler ack-port greeting-fn], :or {port 0}}])
;;;   Starts a socket-based nREPL server.  Configuration options include:
;;;  
;;;    * :port — defaults to 0, which autoselects an open port on localhost
;;;    * :bind — bind address, by default any (0.0.0.0)
;;;    * :handler — the nREPL message handler to use for each incoming connection;
;;;        defaults to the result of `(default-handler)`
;;;    * :transport-fn — a function that, given a java.net.Socket corresponding
;;;        to an incoming connection, will return an value satisfying the
;;;        clojure.tools.nrepl.Transport protocol for that Socket.
;;;    * :ack-port — if specified, the port of an already-running server
;;;        that will be connected to to inform of the new server&#x27;s port.
;;;        Useful only by Clojure tooling implementations.
;;; 
;;;    Returns a (map) handle to the server that is started, which may be stopped
;;;    either via `stop-server`, (.close server), or automatically via `with-open`.
;;;    The port that the server is open on is available in the :port slot of the
;;;    server map (useful if the :port option is 0 or was left unspecified.
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(Integer/parseInt "9")
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>9</span>","value":"9"}
;; <=

;; @@
(defn sum-digits-multiple-of-3? [n] (zero? (mod (apply + (map #(Integer/parseInt %) (map str (seq (str n))))) 3)))
(defn multiple-of-3? [n] (zero? (mod n 3)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;user/multiple-of-3?</span>","value":"#'user/multiple-of-3?"}
;; <=

;; @@
(count (filter sum-digits-multiple-of-3? (range 10000)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>3334</span>","value":"3334"}
;; <=

;; @@
(count (filter multiple-of-3? (range 10000)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>3334</span>","value":"3334"}
;; <=

;; @@
(= (filter sum-digits-multiple-of-3? (range 10000)) (filter multiple-of-3? (range 10000)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>true</span>","value":"true"}
;; <=

;; @@
(require 'new.mongo)
(dir new.mongo)
;; @@
;; ->
;;; find-matching-words-mongo
;;; info
;;; lower
;;; mckeys
;;; w2cf
;;; words
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(dir sicp-1)
;; @@
;; ->
;;; a
;;; a-plus-abs-b
;;; abs
;;; average
;;; b
;;; f
;;; f1
;;; good-enough-1?
;;; good-enough?
;;; improve
;;; new-if
;;; p
;;; sqrt
;;; sqrt-1
;;; sqrt-iter
;;; sqrt-iter-1
;;; square
;;; sum-of-squares
;;; test
;;; tst
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def wd (java.io.File. "."))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;test/wd</span>","value":"#'test/wd"}
;; <=

;; @@
(seq (.list wd))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-string'>&quot;README.md&quot;</span>","value":"\"README.md\""},{"type":"html","content":"<span class='clj-string'>&quot;data&quot;</span>","value":"\"data\""},{"type":"html","content":"<span class='clj-string'>&quot;.lein-repl-history&quot;</span>","value":"\".lein-repl-history\""},{"type":"html","content":"<span class='clj-string'>&quot;.nrepl-port&quot;</span>","value":"\".nrepl-port\""},{"type":"html","content":"<span class='clj-string'>&quot;test.xlsx&quot;</span>","value":"\"test.xlsx\""},{"type":"html","content":"<span class='clj-string'>&quot;project.clj&quot;</span>","value":"\"project.clj\""},{"type":"html","content":"<span class='clj-string'>&quot;src&quot;</span>","value":"\"src\""},{"type":"html","content":"<span class='clj-string'>&quot;ws&quot;</span>","value":"\"ws\""},{"type":"html","content":"<span class='clj-string'>&quot;.gitignore&quot;</span>","value":"\".gitignore\""},{"type":"html","content":"<span class='clj-string'>&quot;target&quot;</span>","value":"\"target\""},{"type":"html","content":"<span class='clj-string'>&quot;LICENCE.txt&quot;</span>","value":"\"LICENCE.txt\""},{"type":"html","content":"<span class='clj-string'>&quot;.gorilla-port&quot;</span>","value":"\".gorilla-port\""},{"type":"html","content":"<span class='clj-string'>&quot;spreadsheet.xlsx&quot;</span>","value":"\"spreadsheet.xlsx\""}],"value":"(\"README.md\" \"data\" \".lein-repl-history\" \".nrepl-port\" \"test.xlsx\" \"project.clj\" \"src\" \"ws\" \".gitignore\" \"target\" \"LICENCE.txt\" \".gorilla-port\" \"spreadsheet.xlsx\")"}
;; <=

;; @@

;; @@
