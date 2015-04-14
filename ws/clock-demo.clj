;; gorilla-repl.fileformat = 1

;; **
;;; # Clock Demo
;;; 
;;; Welcome to gorilla :-) Shift + enter evaluates code. Poke the question mark (top right) to learn more ...
;; **

;; @@
(ns clock-demo
  (:use [gorilla-repl table latex html])
  (:use gorilla-renderable.core)
  (:use gorilla-plot.core)
  (:use hiccup.core)
  (:use clojure.repl)
  (:use clojure.pprint))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(defrecord Clock [hours mins])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-class'>clock_demo.Clock</span>","value":"clock_demo.Clock"}
;; <=

;; @@
(defn clock-svg 
  [hour minute]
  (let [hour-prime (- 6 hour)
        hourX (+ 50 (* 30 (Math/sin (* hour-prime 0.53))))
        hourY (+ 50 (* 30 (Math/cos (* hour-prime 0.53))))
        min-prime (- 30 minute)
        minX (+ 50 (* 35 (Math/sin (* min-prime 0.10472))))
        minY (+ 50 (* 35 (Math/cos (* min-prime 0.10472))))]
    (html [:svg {:height 100 :width 100}
       	    [:circle {:cx 50 :cy 50 :r 40 :stroke "black" :stroke-width 4 :fill "white"}]
            [:line {:x1 50 :y1 50 :x2 hourX :y2 hourY :stroke "red" :stroke-width 4}]
            [:line {:x1 50 :y1 50 :x2 minX :y2 minY :stroke "black" :stroke-width 3}]])))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;clock-demo/clock-svg</span>","value":"#'clock-demo/clock-svg"}
;; <=

;; @@
(extend-type Clock
  Renderable
  (render [self]
          {:type :html
           :content (clock-svg (:hours self) (:mins self))
           :value (pr-str self)}))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(table-view (map (fn [h] (map #(Clock. h %) [0 15 30 45])) (range 0 12)))
;; @@
;; =>
;;; {"type":"list-like","open":"<center><table>","close":"</table></center>","separator":"\n","items":[{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"48.84806286484294\" y1=\"50\" y2=\"20.022124144018374\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 0, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"48.84806286484294\" y1=\"50\" y2=\"20.022124144018374\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 0, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"48.84806286484294\" y1=\"50\" y2=\"20.022124144018374\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 0, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"48.84806286484294\" y1=\"50\" y2=\"20.022124144018374\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 0, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 0, :mins 0} #clock_demo.Clock{:hours 0, :mins 15} #clock_demo.Clock{:hours 0, :mins 30} #clock_demo.Clock{:hours 0, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"64.16091623869647\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 1, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"64.16091623869647\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 1, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"64.16091623869647\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 1, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"64.16091623869647\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 1, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 1, :mins 0} #clock_demo.Clock{:hours 1, :mins 15} #clock_demo.Clock{:hours 1, :mins 30} #clock_demo.Clock{:hours 1, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"75.58821444658628\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 2, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"75.58821444658628\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 2, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"75.58821444658628\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 2, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"75.58821444658628\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 2, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 2, :mins 0} #clock_demo.Clock{:hours 2, :mins 15} #clock_demo.Clock{:hours 2, :mins 30} #clock_demo.Clock{:hours 2, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"79.99446845402872\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 3, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"79.99446845402872\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 3, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"79.99446845402872\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 3, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"79.99446845402872\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 3, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 3, :mins 0} #clock_demo.Clock{:hours 3, :mins 15} #clock_demo.Clock{:hours 3, :mins 30} #clock_demo.Clock{:hours 3, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"76.17066447034959\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 4, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"76.17066447034959\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 4, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"76.17066447034959\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 4, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"76.17066447034959\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 4, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 4, :mins 0} #clock_demo.Clock{:hours 4, :mins 15} #clock_demo.Clock{:hours 4, :mins 30} #clock_demo.Clock{:hours 4, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"65.16600023614541\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 5, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"65.16600023614541\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 5, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"65.16600023614541\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 5, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"65.16600023614541\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 5, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 5, :mins 0} #clock_demo.Clock{:hours 5, :mins 15} #clock_demo.Clock{:hours 5, :mins 30} #clock_demo.Clock{:hours 5, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"80.0\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 6, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"80.0\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 6, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"80.0\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 6, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"80.0\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 6, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 6, :mins 0} #clock_demo.Clock{:hours 6, :mins 15} #clock_demo.Clock{:hours 6, :mins 30} #clock_demo.Clock{:hours 6, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"34.83399976385459\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 7, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"34.83399976385459\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 7, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"34.83399976385459\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 7, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"34.83399976385459\" y1=\"50\" y2=\"75.88421211544284\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 7, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 7, :mins 0} #clock_demo.Clock{:hours 7, :mins 15} #clock_demo.Clock{:hours 7, :mins 30} #clock_demo.Clock{:hours 7, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"23.82933552965041\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 8, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"23.82933552965041\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 8, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"23.82933552965041\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 8, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"23.82933552965041\" y1=\"50\" y2=\"64.66616245581582\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 8, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 8, :mins 0} #clock_demo.Clock{:hours 8, :mins 15} #clock_demo.Clock{:hours 8, :mins 30} #clock_demo.Clock{:hours 8, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"20.005531545971273\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 9, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"20.005531545971273\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 9, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"20.005531545971273\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 9, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"20.005531545971273\" y1=\"50\" y2=\"49.42392521294922\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 9, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 9, :mins 0} #clock_demo.Clock{:hours 9, :mins 15} #clock_demo.Clock{:hours 9, :mins 30} #clock_demo.Clock{:hours 9, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"24.411785553413715\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 10, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"24.411785553413715\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 10, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"24.411785553413715\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 10, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"24.411785553413715\" y1=\"50\" y2=\"34.33975474535878\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 10, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 10, :mins 0} #clock_demo.Clock{:hours 10, :mins 15} #clock_demo.Clock{:hours 10, :mins 30} #clock_demo.Clock{:hours 10, :mins 45})"},{"type":"list-like","open":"<tr><td>","close":"</td></tr>","separator":"</td><td>","items":[{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"35.839083761303534\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"49.99974287564277\" y1=\"50\" y2=\"15.000000000944468\"></line></svg>","value":"#clock_demo.Clock{:hours 11, :mins 0}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"35.839083761303534\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"84.99999999976387\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 11, :mins 15}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"35.839083761303534\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"50.0\" y1=\"50\" y2=\"85.0\"></line></svg>","value":"#clock_demo.Clock{:hours 11, :mins 30}"},{"type":"html","content":"<svg height=\"100\" width=\"100\"><circle cx=\"50\" cy=\"50\" fill=\"white\" r=\"40\" stroke-width=\"4\" stroke=\"black\"></circle><line stroke-width=\"4\" stroke=\"red\" x1=\"50\" x2=\"35.839083761303534\" y1=\"50\" y2=\"23.552534123651416\"></line><line stroke-width=\"3\" stroke=\"black\" x1=\"50\" x2=\"15.00000000023612\" y1=\"50\" y2=\"49.99987143782138\"></line></svg>","value":"#clock_demo.Clock{:hours 11, :mins 45}"}],"value":"(#clock_demo.Clock{:hours 11, :mins 0} #clock_demo.Clock{:hours 11, :mins 15} #clock_demo.Clock{:hours 11, :mins 30} #clock_demo.Clock{:hours 11, :mins 45})"}],"value":"#gorilla_repl.table.TableView{:contents ((#clock_demo.Clock{:hours 0, :mins 0} #clock_demo.Clock{:hours 0, :mins 15} #clock_demo.Clock{:hours 0, :mins 30} #clock_demo.Clock{:hours 0, :mins 45}) (#clock_demo.Clock{:hours 1, :mins 0} #clock_demo.Clock{:hours 1, :mins 15} #clock_demo.Clock{:hours 1, :mins 30} #clock_demo.Clock{:hours 1, :mins 45}) (#clock_demo.Clock{:hours 2, :mins 0} #clock_demo.Clock{:hours 2, :mins 15} #clock_demo.Clock{:hours 2, :mins 30} #clock_demo.Clock{:hours 2, :mins 45}) (#clock_demo.Clock{:hours 3, :mins 0} #clock_demo.Clock{:hours 3, :mins 15} #clock_demo.Clock{:hours 3, :mins 30} #clock_demo.Clock{:hours 3, :mins 45}) (#clock_demo.Clock{:hours 4, :mins 0} #clock_demo.Clock{:hours 4, :mins 15} #clock_demo.Clock{:hours 4, :mins 30} #clock_demo.Clock{:hours 4, :mins 45}) (#clock_demo.Clock{:hours 5, :mins 0} #clock_demo.Clock{:hours 5, :mins 15} #clock_demo.Clock{:hours 5, :mins 30} #clock_demo.Clock{:hours 5, :mins 45}) (#clock_demo.Clock{:hours 6, :mins 0} #clock_demo.Clock{:hours 6, :mins 15} #clock_demo.Clock{:hours 6, :mins 30} #clock_demo.Clock{:hours 6, :mins 45}) (#clock_demo.Clock{:hours 7, :mins 0} #clock_demo.Clock{:hours 7, :mins 15} #clock_demo.Clock{:hours 7, :mins 30} #clock_demo.Clock{:hours 7, :mins 45}) (#clock_demo.Clock{:hours 8, :mins 0} #clock_demo.Clock{:hours 8, :mins 15} #clock_demo.Clock{:hours 8, :mins 30} #clock_demo.Clock{:hours 8, :mins 45}) (#clock_demo.Clock{:hours 9, :mins 0} #clock_demo.Clock{:hours 9, :mins 15} #clock_demo.Clock{:hours 9, :mins 30} #clock_demo.Clock{:hours 9, :mins 45}) (#clock_demo.Clock{:hours 10, :mins 0} #clock_demo.Clock{:hours 10, :mins 15} #clock_demo.Clock{:hours 10, :mins 30} #clock_demo.Clock{:hours 10, :mins 45}) (#clock_demo.Clock{:hours 11, :mins 0} #clock_demo.Clock{:hours 11, :mins 15} #clock_demo.Clock{:hours 11, :mins 30} #clock_demo.Clock{:hours 11, :mins 45})), :opts nil}"}
;; <=

;; @@

;; @@
