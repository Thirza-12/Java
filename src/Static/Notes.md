# Static Keyword
- In Java, a static variable (also called a class variable) is a variable that belongs to the class rather than to any specific instance of the class. This means that there is only one copy of the static variable, regardless of how many objects of the class are created. Static variables are shared among all instances of the class.
- It is like of common shared variable which all objects can use and modify.

- First Class gets load and then objects get instantiated.
- So when we create a static block in our class, it gets executed before object constructor being called.
- Static block is called only once when the class loads, not when objects are created.
- If you don't create an object, class won't load either. It means static block will not be called if no object of class has created.
- Class.forName("ClassName") loads the class even if you have not created objects.

- Static methods contain static variables only
- Static methods can be called using class names, but they can't be called via object names