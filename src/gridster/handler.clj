(ns gridster.handler
  (:use [gridster core recycle-bin]
        compojure.core
        [hiccup core page element])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (html le-hiccup2))
  (GET "/lab" [] (html le-hiccup))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
