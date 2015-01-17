(ns coffee.page
  (:use [hiccup core element page]))

(defn hello []
  (html5 [:body
            [:div
              [:h1 "Hello World"]]]))
