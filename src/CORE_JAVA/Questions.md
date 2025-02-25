1) What is Dynamic method dispatching?
    it is runtime polymorphism.
   ----------------------------------
2) Explain http sessions?
   HttpSession object is used for session management. A session contain information about a particular user across the whole application.
   When a user enters an online application for the first time HttpSession is obtained via request.getSession(), the user is given a unique id to 
   identify the session.
   The HttpSession stays alive for default time of 30 minutes or some value specified in the web.xml file.
   ----------------------------------
3) What is session hiJacking?
   A user session can be hijacked by another user like an attacker and loose control of the session altogether.
   You can prevent it by using only HTTPS , or use spring security , it will manage it all itself , so you don't need to worry about it.
   ----------------------------------
4) What is a transient keyword in java! why its used;
   When in the process of serialization e.g serialize to write in a file the variable marked as transient will not take part in serialization and so will not be stored in the file!
   its usual purpose is to maintain security. e.g not to store password in the file so make that variable of the model calss transient
   only variable can be marked as transient and that will be of the model class variables

   -> If you don't want some file to be searilized , you can make the file transient or STATIC !
      Static members are associated with the class not with the object , hence why they retain the value when serialize and deserialize. 
      when serialization static members are not saved in the file , when deserialization they again inatialize the value from JVM ,so thats why they have the value.

    read this article : https://javabeginnerstutorial.com/core-java-tutorial/transient-vs-static-variable-java/
      
----------------------------------------

 What is Searalizaiton!
 Searalization is the process to convert state of an object into byte stream.
 