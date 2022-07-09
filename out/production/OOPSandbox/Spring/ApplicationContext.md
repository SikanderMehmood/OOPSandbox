
ApplicationContext is spring advanced container.Similar to bean factory it can load bean definitions ,
wire beans together and dispense beans upon request.



The context package adds ApplicationContext interface which enhances beanFactory functionality in a more framework oriented style.
It provides additional functionality like 
1) MessageSource , providing access to message  like i18n-style.
2) Access to resources , such as    URLs and files.
3) Event propagation to beans implementing ApplicationListener interface.
4) Loading of multiple (hierarchical) contexts , allowing each to be focused on one layer, for example the web layer of an application.


if you are using just a plain BeanFactory then a fair amount of support such as transactions and AOP will not 
take effect (at least not without some extra steps on your part), which could be confusing because nothing will 
actually be wrong with the configuration.



=---------------------------------------
main resilience/reliability -> make sure whether the call was successfully

for and forEach loop -> which is faster

avoid string concatenation in logger

when to use prototype -> any sceneries 