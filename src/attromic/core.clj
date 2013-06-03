
(ns attromic.core
  (:require [datomic.api :refer [tempid]]))

;; Public
;; ------

(defn attribute
  "Allows more terse creation of Datomic schema attributes, with sensible
  defaults and optional overriding of all other parts.

  eg. (attribute :user/name)
      (attribute :user/friends
                 :db/valueType :db.type/ref
                 :db/cardinality :db.cardinality/many)

  By default all fields are strings."
  [ident & options]
  (let [defaults {:db/id (tempid :db.part/db)
                  :db/ident ident
                  :db/valueType :db.type/string
                  :db/cardinality :db.cardinality/one
                  :db.install/_attribute :db.part/db}]
    (merge defaults
           (apply hash-map options))))

