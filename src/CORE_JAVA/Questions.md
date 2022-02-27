1) What is Dynamic method dispatching?
    it is runtime polymorphism.
   ----------------------------------
2) Explain http sessions?
   HttpSession object is used for session management. A session contain information about a particular user across the whole application.
   When a user enters an online application for the first time HttpSession is obtained via request.getSession(), the user is given a unique id to 
   identify the session.
   The HttpSession stays alive for default time of 30 minites or some value specified in the web.xml file.
   ----------------------------------
3) What is session hiJacking?
   A user session can be hijacked by another user like an attacker ans loose control of the session altogether.
   You can prevent it by using only HTTPS , or use spring secuarity , it will manage it all itself , so you don't need to worry about it.
   ----------------------------------
4) 