(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

; boolean
(defn boolean
  [val]
  (if val true false))

(boolean "foo") ;=> true
(boolean nil) ;=> false
(boolean (+ 2 3)) ;=> true
(boolean true) ;=> true
(boolean false) ;=> false

; abs
(defn abs
  [n]
  (if (< n 0) (* n -1) n))

(abs -2)
(abs 42)

; Divides?

(defn divides?
  [diviser n]
  (if (= (mod n diviser) 0) true false))

(divides? 2 4) ;=> true
(divides? 4 2) ;=> false
(divides? 5 10) ;=> true
(divides? 2 5) ;=> false


; Fizzbuzz
(defn fizzbuzz
  "Returns fizz when n is divisible by 3; buzz when divisible by 5; gotcha! when divisible by 15 or '' otherwise"
  [n]
  (cond
    (= (mod n 15) 0)    "gotcha!"
    (= (mod n 5) 0)     "buzz"
    (= (mod n 3) 0)     "fizz"
    :else               ""))

(fizzbuzz 2)  ;=> ""
(fizzbuzz 45) ;=> "gotcha!"
(fizzbuzz 48) ;=> "fizz"
(fizzbuzz 70) ;=> "buzz"

; generic-doublificate

(defn generic-doublificate
  [n]
  (cond
    (number? n)                 (* n 2)
    (empty? n)                  nil
    (or (list? n) (vector? n))  (* (count n) 2)
    :else                       true))

(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true

; teen?
(defn teen?
  [n]
  (< 12 n 20))

(teen? 13)
(teen? 19)
(teen? 20)
(teen? 12)

; not-teen?
(defn not-teen?
  [n]
  (not (teen? n)))

(not-teen? 13) ;=> false
(not-teen? 25) ;=> true
(not-teen? 12) ;=> true
(not-teen? 19) ;=> false
(not-teen? 20) ;=> true

; leap-year?

(defn leap-year?
  [year]
  (cond
    (not (= (mod year 4) 0))    false
    (not (= (mod year 100) 0))  true
    (not (= (mod year 400) 0))  false
    :else                       true))

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false
