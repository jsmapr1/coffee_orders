(defproject coffee_orders "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :plugins [[lein-ring "0.9.0"]]
  :ring {:handler coffee.handler/app
         :nrepl {:start? true}}

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.1"]
                 [ring/ring-jetty-adapter "1.3.1"]
                 [compojure "1.3.1"]])