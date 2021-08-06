
**Singleton Pattern** : Define a class that has only one instance and provides a global point
of access to it.

     only one instance of the class will be created and will be used by 
     all other classes.

**Two types of Singleton design pattern :**
1) Early instantiation: creation of instance at load time;
2) Lazy instantiation: Creation of instance when required;


**Advantages :**
1) Saves memory because object is not created at each request.Only single instance is
used again and again.
2) If you have some shareable data to share across multiple class , then you should go for Singleton design pattern.


**Usage:**
1) Singleton pattern is mostly used in multi-threaded applications and database applications.
2) It is used in logging, caching , thread pools and configuration setting etc.


How to create a Singleton Pattern?

1) Static member: It contains the instance of the class;
2) Private constructor:It will prevent to instantiate the Singleton class from outside the class.
3) Static factory method: This provides the gloabl point of access to the singleton object and returns instace to the caller.

If singleton class is loaded by two classLoaders , two instances will be created , one for each class loader.

Significance of Serialization in Singleton Pattern
If singleton class in serializable you can serialize the singleton instance. once it is serialized , you can deserialize it but it will not 
return the singleton object.
To solve this issue you need to override the readResolve() method that enforces the singleton.It is called just after the object is deserialized.
it returns the singleton object.




References :
1) https://www.javatpoint.com/singleton-design-pattern-in-java
2) https://www.youtube.com/watch?v=rSZIRsB0YlQ
3) https://www.youtube.com/watch?v=3yEx0w3eYpk
