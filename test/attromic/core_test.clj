
(ns attromic.core-test
  (:require [clojure.test :refer :all]
            [attromic.core :refer :all]))

(def foo-bar (attribute :foo/bar))

(deftest attributes-can-be-easily-created
  (is (= :foo/bar (:db/ident foo-bar))))

(deftest attributes-have-sensible-defaults
  (is (= :db.type/string) (:db/valueType foo-bar))
  (is (= :db.cardinality/one) (:db/cardinality foo-bar)))

(deftest attributes-can-be-overridden
  (is (= :db.type/long) (:db/valueType (attribute :foo :db/valueType :db.type/long))))

(run-tests)

