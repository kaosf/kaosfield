(ns net.kaosfield.www.core
  (:gen-class)
  (:require [stasis.core :as stasis]
            [clojure.java.shell :as shell]
            [clj-jade.core :as jade]))

(jade/configure {:template-dir "src/net/kaosfield/www/views/"})

(def pages {"/index.html" (jade/render "index.jade")
            "/log/index.html" (jade/render "log/index.jade")})

(def target-dir "target/")

(defn- deploy []
  (shell/sh "mkdir" "target")
  (map
    #(shell/sh "cp" "-r" (str "resources/public/" %1) "target")
    ["css" "fonts" "img" "js" "log" "stylesheets" "tgk"]))

(defn -main
  "Generate static pages and deploy them."
  []
  (stasis/empty-directory! target-dir)
  (stasis/export-pages pages target-dir)
  (deploy))
