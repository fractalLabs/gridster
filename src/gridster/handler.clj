(ns gridster.handler
  (:use [gridster core]
        compojure.core
        [hiccup core page element])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (html (include-js "http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js") (gridster)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
