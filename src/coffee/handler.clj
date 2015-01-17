(ns coffee.handler
  (:use compojure.core)
  (:require [compojure.route :as route]
            [coffee.page :as page]
            [clojure.java.io :as io]))

(defroutes app 
 (GET "/" [] (io/resource "public/hello.html"))
 (GET "/test" [] (page/hello))
 (GET "/next" [] (io/resource "public/hello2.html"))
  (route/resources "/")
  (route/not-found "Page Not Found"))
