(defproject net.kaosfield.www "0.1.0"
  :description "www.kaosfield.net"
  :url "http://www.kaosfield.net"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [stasis "2.3.0"]
                 [clj-jade "0.1.7"]]
  :main ^:skip-aot net.kaosfield.www.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
