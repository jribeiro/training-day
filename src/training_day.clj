(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn
  square
  "Takes a number as a parameter and multiplies it with itself."
  [x]
  (* x x))

(defn
  average
  "Takes two numbers and return their average"
  [a b]
  (/ (+ a b) 2))

(defn myfn
  [n]
  (if (< n 10) true false))

(myfn 2)
(myfn 10)
(square 9)
