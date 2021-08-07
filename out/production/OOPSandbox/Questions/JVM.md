
JVM is a virtual machine (does not exist physically) .it is machine dependant.
when JVM + LIBRARIES -> makes a JRE where a java application can run.
JDK - >JRE + DEV TOOLS
DEV-TOOLS -> debugger compiler

 //for reference -> https://www.youtube.com/watch?v=RYd_hagCiVk

 --------------------------------------------------------------------JVM ARCHITECTURE-----------------------------------------------

 1)Class Loader
 2)Runtime Data area
 3)Execution Engine

    1) Class Loader
       ClassLoader has three phases
           Phase-1 =>(Loading)


               ...1) Bootstrap ClassLoader
                                It loads preCompiled preTrusted System class files to runtime memory area.Files from RT.jar in the jre directory under java installation.

               ...2)Extension ClassLoader
                               it loads preCompiled classes from jre/lib/ext directory , when you use third party jar files in your project , they are added into extension folder by the
                               extensionClassLoader. So extension ClassLoader makes these preCompiled classes available to the JVM by loading the files to the memory area.
               ...3)Application ClassLoader
                               Its role is to load your compiled classes to the memory the program you wrote.


           Phase-2 (Linking)

                    Verify : in this part of linking all the  class file  loaded into the memory by classLoaders in the form of byteCode are verified if the conform to the standards.
                    Prepare: In this part of linking memory is allocated the static variables are default values are assigned.
                    Resolve: In this part of linking all the symbolic references are replaced with actual references.


          Phase-3) Initialization
                    In this part all the static variables are assigned with there actual values and also executes  the static initializer at this point of time.



 2)       RunTime Data Area
          1) JVM needs memory area to store the class files and execute them.
          2)  Five types of memory data area.
                  1) Method area:
                     In this part class level data is stored. e.g -> All the static variables of the class will be stored in the part of jvm memory.
                  2) Heap memory:
                     All the objects and instance variables are stored in this memory ares.
                  3) Stack Memory
                     This contain three sections of memory area
                       -> Local variable:stores all the local variables that are used in a module.
                       ->Operand stack:Contain all the operands that are used in a stack.
                       ->Frame data : This part of memory area contain the catch exception block information in case any exception occur in the method.

                  4) PC Register :
                       This memory area holds the current executing instructions.

                  5) Native method stack:
                       Memory area that holds the native method information.



3) JVM EXECUTION ENGINE:
          This engine converts the bytecode to machine code and executes the instructions.

          1) Interpreter :
                 Reads the classFiles(ByteCode) and executes it one by one. Flaw of Interpreter is when a method is called multiple times it interprets those lines of code again and again.


          2) JIT compiler:
                 JIT compiler compiler to byteCode to native code , it solves the flaw  in  interpreter. Native code will be used directly for repeated method calls.It has few components
                  ->intermediate code generator = generate intermediate code.
                  ->Code optimizer = optimizes the code for better performance.
                  ->Target code generator:converts intermediate code to native code,
                  ->Profiler->responsible for finding hotspots  ,means methods that are called repeatedly.


          3) Garbage Collector: To destory objects that are no longer used.

          4) jvm native method interface: responsible for interacting with native libraries and makes it available for JVM execution engine.



          For reference : https://www.youtube.com/watch?v=QHIWkwxs0AI