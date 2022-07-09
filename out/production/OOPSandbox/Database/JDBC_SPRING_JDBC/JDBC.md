Spring JDBC/DAO

Use to build data access layer of enterprise application.
Database related logic has to be place in separate classes called DAO classes;

--------------------------


Spring jdbc supports 

1) Transactions management logic 
2) Distribution based transaction management
3) Annotation based transaction management

but
JDBC does not support above three;



--------------------------
in JDBC 

1) Connection , statement and preparedStatement have to be allocated explicitly by the developer in JDBC;
2) in JDBC developer explicitly writes the logic to release the database resources;
3) JDBC throws java.sql.SQLEXCEPTION. There won't be specific exception for specific problem.


in Spring-JDBC

Spring provides org.springframework.jdbcTemplate object; It abstracts the database resource allocation logic;
Spring provides fine Grind Exception handling mechanism to deal with database;

<img src="D:\Github\OOPSandbox\src\Resources\Capture.PNG" width="500" height="500"/>


Connection Pooling:
Mechanism of creating a group of database connections and keeping them in cache memory for use and reuse; It provides high performance and efficient resource pooling;


JAVA.sql.DataSource
it is an interface for object-oriented representation of connection pooling;
Connection factory for java application;
BasicDataSource
DriverManagerDataSource


<img height="400" src="D:\Github\OOPSandbox\src\Resources\Capture1.PNG" width="500"/>


------------------------------
Spring has two dataSource Classes
-> DriverManagerDataSource
-> SingleConnectionDataSource  = return the same connection everyTime the connection is required;






