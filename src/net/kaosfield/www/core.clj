(ns net.kaosfield.www.core
  (:gen-class)
  (:require [stasis.core :as stasis]
            [clojure.java.shell :as shell]
            [clj-jade.core :as jade]))

(jade/configure {:template-dir "src/net/kaosfield/www/views/"})

(def pages {"/index.html" (jade/render "index.jade")
            "/log/index.html" (jade/render "log/index.jade")})

(def target-dir "target/site")

(defn- copy-resources []
  (shell/sh "mkdir" "-p" target-dir)
  (map
    #(shell/sh "cp" "-r" (str "resources/public/" %1) target-dir)
    ["css" "fonts" "img" "js" "log" "stylesheets" "tgk"]))

(defn -main
  "Generate static pages and copy resources (assets)"
  []
  (stasis/empty-directory! target-dir)
  (stasis/export-pages pages target-dir)
  (copy-resources))
