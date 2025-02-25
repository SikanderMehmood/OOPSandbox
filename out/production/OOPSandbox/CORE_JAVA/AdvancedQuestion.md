
volatile and transit

how to clone java object / copy of object in java

difference b/w constructor injection and setter injection


@Autowire  and  @injecta


----------------------------------------------------------
What is a marker interface!
A marker interface is an interface that does not have any methods or constants. it provides runtime informaation about the objects, So the compailer and JVM has additonal information the object.
JAVA has many builtin marker interfaces such as cloneable and searilizable interface.


----------------------------------------

1) Constructor injection does not allow to create circular dependency.                                                  Setter injection does not check circular dependency
2) Combining with final keyword , constructor injection gives extra safety in multithreaded environment.                No extra benefit of setter injection.
3) it should be used for mandatory dependencies.                                                                        It should be used for optional dependencies.


-----------------------------------------


n+1 issue 