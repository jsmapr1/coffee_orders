(ns coffee.page
  (:require [coffee.helper :as helper])
  (:use [hiccup core element page]))

(defn hello []
  (html5 [:body
            [:div
             (for [drink helper/drinks]
               [:h1 drink])]]))
