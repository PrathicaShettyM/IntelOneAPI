# Object Oriented Programming using Java
This repository contains OOPs concepts in Java programming language.

### Pillars of OOPs:
1. `Datahiding`: achieved using private access modifier
2. `Abstraction`: achieved using abstract class and interface
3. `Encapsulation`: Encapsulation = Datahiding + Abstraction
4. `Polymorphism`: comes through Inheritence

### Inheritence: 
- The process of acquiring the properties and behaviours of one class to another class is called "Inheritence".
- In Java, inheritence can be achieved in 2 forms
1. IS   - A(using the `extends` keyword)
2. HAS  - A(Declaring one ref variable inside another class)

- The class which share properties / behaviours to another  class is referred as `Base Class/ Parent Class`.
- The class which uses properties / behaviour of another class is referred as `Derieved Class/ Child Class`. 

### Constructor
- It is a method which has got the same name as the class name.
- While writing a constructor, we should not use a return type.
- It is called automatically during the creation of an object. Hence we us it to initialise the instance variables of the class.
- types of constructors:
    - `Zero arguement constructor`: default values of the datatype will be printed
    - `Parameterised constructor`: we can initialise the values.

### Polymorphism
- poly means "many" and morphism means "forms"
- They are of 2 types:
1. Static polymorphism
Ex: Method overloading, method hiding

- `Method overloading`: 2 methods are said to be overloaded, if they both have the same name but with different arguement types.
    - In case of method overloading, `compiler` will bind the call of the method to the body of the method 
    - JVM should just execute the method body, so we call method overloading as "Compile Time Binding / Early binding  / Eager binding"
    - A method is overloaded only when it differs in arguement, if 2 methods of same name doesn't have any arguement then we get a compile time error. 

- Compiler binds the call based on the arguement
    - If exact match is found => bind the call
    - If exact match is not found => perform `implicit typecasting` till it reaches to bind
    - upon implicit typecasting also if the call can't be binded then it would result in `Compile time error`

    - Implicit typecasting chart(Explicit is just opposite)
```
byte -> short -> int -> long -> float -> double
        char--->int
```


2. Dynamic polymorphism
Ex: Method overriding












### Points to be noted
1. Depending upon the position of declaration and its behaviours, there are 3 types of variable:
(There is no global variables in Java)
- `Local variables`: variables declared inside the method
    - Memory is allocated in the `stack area`
    - Once the control enters inside the method, memory will be given
    - Once the control leaves the method, memory will be taken out
    - "No default values" will be given to the local variables.

- `Instance variables`: variables declared inside the class but outside the method
    - Memory is allocated in `Heap region`
    - Default value depending on datatypes
    - Memory initialised at the time of Object creation
    - Memory will be deactivated at the time of Object destruction

- `Static variables`: variables declared inside the class but outside the method, but with static keyword.
    - Memory  will be given in the `method area`.
    - Memory will be given at the time of loading `.class` file
    - Default values will be given if the user doesnt specify any value.
    - Static variables can be accessed in 2 ways:
        - using ClassName
        - using reference of the object

2. `this` keyword points to current  object data

3. Based on the type of value stored in the variables, it is of 2 types:
- `primitive variables`: int a = 10;
- `reference varaibles`: Student std = new Student();

4. Object is the parent class for all the classes in Java
                                      Object(Class)
        ________________________________|__________________________________
        |          |          |         |          |        |       |      |
    String StringBuilder StringBuffer Number Character Boolean Thread Runnable
                _________________________|___________________
               |        |       |        |         |         |
            Byte       Short    Integer  Long     Float      Double

