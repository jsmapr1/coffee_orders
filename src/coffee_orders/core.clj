(ns coffee_orders.core)

(defn handler [request]
    {:status 200
     :headers {"Content-Type" "text/html"}
     :body (file "public/hello.html")})
