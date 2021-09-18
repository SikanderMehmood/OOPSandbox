


Delete vs Truncate 

With delete you can delete one row from the table || Truncate remove all rows from the table
Delete can rollback || Truncate command does not support rollback


Use Char when String length is fixed/constant. 
Use Varchar when string length is variable.


Constraints are used to specify limit on the data type of the table.
e.g   NOT NULL -> Ensures that null value cannot be stored in the column.
      UNIQUE   -> always unique , you will get exception if you try to store duplicate value.




Data integrity : it means accuracy and consistency of the data.



Index is the performance tuning method for fast retrieval of records from the table.
Clustred index:  reorders the table , can be only one in a table , search on the basis of key values.
Not clustred index: can be many in a table , does not change the physical order of the table,



Drop -> remove complete table = no table
Truncate -> remove all rows = empty table

ACID properties 
Atomicity 
Consistency
isolation
Durability
