# Bacon

(c) 2015 Matt Burgess

Bacon is a Domain-Specific Language (DSL) for Extract-Transform-Load (ETL) processes. Its name is inspired by Apache Pig, a Data Manipulation Language intended for large data sets. Bacon supplies a lower-level set of functions, types, etc. but intends to have higher performance on smaller datasets than Pig, so it's like a smaller Pig that really cooks ;)

Architecture
------------
Bacon is comprised of an ANTLR grammar that generates a Lexer and a Parser that produces an AST and visitor classes. The latter is meant to enable various compilation targets, such as Pentaho Data Integration (PDI) transformations, possibly Pig scripts, pure Java code, etc.

Design
------

Language Features
-----------------

