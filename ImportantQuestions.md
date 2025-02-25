

1) What is composition?
   Answer: Strong relationship among two objects , like one cannot exist independently.
           e.g : leg object cannot exist with person object
                 File object placed in a folder object. if folder is deleted , file will be deleted too.
                 Linked objects are dependent on each other.
2) What is aggregation?
   Answer: Weak relationship b/w two objects. one can exist wihout the other. e.g car object and wheel object. car can run without any other wheel object.

3) Difference b/w constructor injection and setter injection.
   Answer:   
              1)Partial dependency can be injected using setter injection. e.g. if there are three properties in a class and you only need to set value for one use setter injection.
              2)Setter injection overrides the constructor injection. if you use both constructor and setter injection IOC will use setter injection.
              3)We can easily change the value with setter injection. it will not create a new instance unlike constructor injection. so it is flexible than constructor injection.


4)  