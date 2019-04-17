#!/usr/bin/env bash

mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'conceptId' : 1});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'relationships.destination.conceptId' : 1,'relationships.type.conceptId' : 1});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'relationships.type.conceptId' : 1, 'relationships.destination.conceptId' : 1});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'memberships.refset.conceptId' :1});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({inferredAncestors:1});" 
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({statedAncestors:1});" 
# mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'relationships.typeInferredAncestors':1});" 
# mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'relationships.typeStatedAncestors':1});" 
# mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'relationships.targetInferredAncestors':1});" 
# mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'relationships.targetStatedAncestors':1});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3.ensureIndex({'module.conceptId':1});"

mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3tx.ensureIndex({'descriptionId' : 1});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3tx.ensureIndex({term: 'text'});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3tx.ensureIndex({term: 1});"
mongo --host $1 --port 27017 --eval "db = db.getSiblingDB('$2');db.v$3tx.ensureIndex({words: 1});"