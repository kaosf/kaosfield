(ns kaosfield.routes.home
  (:use compojure.core)
  (:require [kaosfield.views.layout :as layout]
            [kaosfield.util :as util]
            [clj-jade.core :as jade]))

(jade/configure {:template-dir "resources/public/jade/"})

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (jade/render "index.jade" {}))
  (GET "/about" [] (about-page)))
