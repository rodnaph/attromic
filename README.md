
# Datomic Schema Helper

A basic helper for writing Datomic schema.

## Usage

Datomic schema is wordy, so apply some sane defaults and allow overriding 
where needed. The minimum you can provide is just an attribute name...
 
```clojure
(attribute :user/name)
```
 
Then you can customize other attributes as required, for example setting a
custom data type...
 
```clojure
(attribute :user/age
           :db/valueType :db.type/long)
```

And all other attributes as well of course...
 
```clojure
(attribute :user/friends
           :db/valueType :db.type/ref
           :db/cardinality :db.cardinality/many)
```

## Installation

Attromic is [available from Clojars](https://clojars.org/rodnaph/attromic)

