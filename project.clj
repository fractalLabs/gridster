(defproject gridster "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [hiccup "1.0.2"]]
  :plugins [[lein-ring "0.8.3"]]
  :ring {:handler gridster.handler/app}
  :profiles
  {:dev {:dependencies [[compojure "1.1.5"]
                        [ring-mock "0.1.3"]]}})
