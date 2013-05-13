(ns gridster.handler
  (:use gridster.core
        compojure.core
        [hiccup core page element])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (html le-hiccup))
  (GET "/lab" [] (html le-hiccup2))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
