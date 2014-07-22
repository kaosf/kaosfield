(defproject kaosfield "0.1.0"
  :description "kaosfield.net"
  :url "http://ka-ring.herokuapp.com"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [lib-noir "0.8.0"]
                 [compojure "1.1.7"]
                 [ring-server "0.3.1"]
                 [selmer "0.5.9"]
                 [com.taoensso/timbre "3.0.0"]
                 [com.taoensso/tower "2.0.1"]
                 [markdown-clj "0.9.41"]
                 [environ "0.4.0"]
                 [clj-jade "0.1.4"]]

  :repl-options {:init-ns kaosfield.repl}
  :plugins [[lein-ring "0.8.10"]
            [lein-environ "0.4.0"]]
  :ring {:handler kaosfield.handler/app
         :init    kaosfield.handler/init
         :destroy kaosfield.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production {:ring {:open-browser? false
                       :stacktraces?  false
                       :auto-reload?  false}}
   :dev {:dependencies [[ring-mock "0.1.5"]
                        [ring/ring-devel "1.2.2"]]
         :env {:dev true}}}
  :min-lein-version "2.0.0")
