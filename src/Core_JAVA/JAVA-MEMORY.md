

HEAP
STACK

Both Heap & Stack are created by JVM and are stored in RAM.


-------------------------------------------------

Stack Memory:
            Stack memory is temporary memory  used for function calls. it automatically allocated memory when a function starts and clears when function ends.
            Programmer do not need to manage this manually.
            if the stack runs out of space , stack over flow error occurs.
            
        StackOverFlow reasons:
             1) infinite resursive calls
             2) stack size not being enough
             3) creating too many big varibles like arrays or other data structures  within a funciton.
             4) too many nested funciton calls inside a function


--------------------------------------------------------StackOverFlow error to STACK is similar to OutOfMemory Error is to HEAP-------------------------------------------------

when a method is invoked jvm creates anew stackFrame and pushes it to current thread stack.
Size of frame is determined at compile time based on method requirements.

StackFrame contents
  1) Local Variable array , all local variables in method and method parameters
  2) Operand stack : temp workspace for all the performing calculations and storing immediate results
  3) Frame data : info about where to resume after method call 

Although JVM automatically manages the allocation/deAllocation of stack frame the overall maximum size of stackFrame can be configured by -Xss JVM arguments.


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                                                           ------------------------------HEAP-----------------------


All objects created are stored in heap. While references to those objects are stored in stack.
When a method completes that stackFrame is popped , hence removing the references to those objects , making them eligible for garbage collection.

To optimize garbage collection , heap memory is divided into generations.

1) Young generation
   All new objects are stored here.
   Young generation is further divided into 
              1) Eden space  -> Only new objects
              2) Survivor space
                   Objects that survive minor GC() calls are moved to survivor space.
                   Survivor space is further divided into 
                       1) S0
                       2) S1
                     Objects are moved b/w these spaces until they become unreachable and removed or promoted to OLD Generation


2) Old Generation
                 : Objects that survived multiple minor garbage collection are moved to older generations and are considered long lived.

3) Permanent generation:
                        This area historically part of heap , is now moved off heap in modern JVM's , It stores class level metaData such as class structure and method byteCode and constant pool.


Heap size can be configured like

-Xms -> initial  heap size
-Xmx -> maximum heap size
-Xmn -> Young generation size



------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------












