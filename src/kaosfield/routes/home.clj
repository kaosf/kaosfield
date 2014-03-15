(ns kaosfield.routes.home
  (:use compojure.core)
  (:require [kaosfield.util :as util]
            [clj-jade.core :as jade]))

(jade/configure {:template-dir "src/kaosfield/views/"})

(defroutes home-routes
  (GET "/" [] (jade/render "index.jade" {}))
  (GET "/log" [] (jade/render "log/index.jade" {})))
