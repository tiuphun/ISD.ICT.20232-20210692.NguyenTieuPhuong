# Normalization of Database
The `script.sql` is written for MySQL.

## First Normal Form (1NF)
- Each column should have a unique name.

## Second Normal Form (2NF)
- It should be in 1NF.  
- All non-key attributes should be fully functional dependent on the primary key.

## Third Normal Form (3NF)
- It should be in 2NF.
- There should be no transitive dependency.

## Boyce-Codd Normal Form (BCNF)
- It should be in 3NF.
- For every functional dependency, the left-hand side should be a super key.

## Fourth Normal Form (4NF)
- It should be in BCNF.
- It should have no multi-valued dependencies.

-> According to these rules, the database is normalized.