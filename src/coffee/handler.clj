(ns coffee.handler
  (:use compojure.core)
  (:require [compojure.route :as route])
  (:require [clojure.java.io :as io]))

(defroutes app 
;; (GET "/" [] "<h1>Hello, J</h1>")
 (GET "/" [] (io/resource "public/hello.html"))
 (GET "/next" [] (io/resource "public/hello2.html"))
  (route/resources "/")
  (route/not-found "Page Not Found"))
