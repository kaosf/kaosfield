(ns kaosfield.routes.home
  (:use compojure.core)
  (:require [kaosfield.views.layout :as layout]
            [kaosfield.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content "<h2>profile</h2>"}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
