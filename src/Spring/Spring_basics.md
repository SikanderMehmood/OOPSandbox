Spring autoConfiguration

Dependency injection : Passing dependency to other objects and frameworks

-----------
IOC container will create the objects , wire them together , configure them and manage their complete lifeCycle from
creation to destruction. It uses dependency injection to manage the components that make up the application.


-----------------------------

Dependency injection is a pattern that implements inversion of control.

Constructor injection :
it is used when the class cannot function without the dependant class. This will Ensure that the dependency is
present. (It will fail if dependency not present). Can create immutable classes.

Setter injection : Does not ensure the dependency is present. (Good for optional dependencies).

@Autowired 
private LogService logService; //This is field injection - stop doing that.

