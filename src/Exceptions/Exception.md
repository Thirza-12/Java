## Types of Errors
**1. Compile time errors**-Errors which occur at compile time.\
**2. Run time errors** They are called exceptions.\
**3. Logical Errors** 

## Hierarchy of Classes
- Object
  - Throwable
    - (i) Error- I/O error, VirtualMachineError,OutOfMemoryError, ThreadDeath         
    - (ii)Exception
        - Runtime Exception (Unchecked Exception)
            - Arithmetic Exception
            - ArrayIndexOutOfBounds Exception
            - NullPointerException
        - Sql Exception (Checked Exception) // Forces to handle exceptions
        - I/O Exception (Checked Exception) // Forces to handle exceptions


## Throw vs Throws keyword
- Throw keyword means throwing an exception explicitly even if it is not an exception.
- Throws means that a method will throw exception but that exception will be handled by some other function who is calling this critical function.

## Finally Block
- Finally, will get executed each and every time, whether an exception occurs or not.
