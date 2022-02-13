           

    Notes From Java Program Design (EDWARD SCIORE).

    ModularSoftwareDesign.Modular Software Design
    -Two Common development Methodoligiees

     1.WaterFall


     - This is a process where you create a design for the program
     - Iteratively revising the design untill user are happy.
     Then you write the whole program, hoping that the first version will be 
      satisfactory. It rarely is. Even if you manage to implement the design perfectly.
     - Has a fewer Iterations, scope of each version change is unpredictable.


     2.Agile Methodology

    - Program design and Implementation occur in tandem.
    - You start by implementing the bare bones of the program
     - Each Subsuquent version implementing a bare bones version of 
      additional feature.
      - The idea is that each version contains "just Enough" code to make the 
      chosen subset of feature work.
     - Agile developmenet plans for frequent iterations with small, predictable changes.


![](https://d112uwirao0vo9.cloudfront.net/wp-content/uploads/2019/04/Waterfall-vs-Agile-1.jpg?raw=true)

    

      The Fundamental Priniciple of Software Desing
```- A program should be designed so that any change to it will affect only a small, predictable portion of the code.
  - Variables declared outside the class it said to be global scope
  - If the varible is declared within a method can be referenced only from within the code block where it is declared and is said to be local scope.
  - in the scopeDemo class there are four variables x, z, and two version of y.
    - X has the largest Scope, it can be refered from anywhre in the class.
    - Y in method f can only be accessed from within that method, and similarly for varible y in g.
    - Variable Z can only be accessed from within f's for loop.
`
``
         Why Should a programmer care about variable scope
- The answer comes from the fundamental design priniciple. 
- In general the smaller the scope of a variable, the fewer the lines of code can be affected by a change. 
- FDP implies that each variable should have the smallest possible scope.


           Object Oriented Basics
- Objects are the Fundamental Building blocks of java Programs.
- Each object belongs to a class. Which defines the object's capabilities in therms of its public variable and Methods

            APIs and Dependencies
- The public variables and methods of a class are called its Application Program Interface (or API).
- If X is a client of Y then Y is said to be a dependency of X. The idea is that X depends on Y to not change the behavior of its methods. 

             Modularity
- Treating an API as a contract simplifies the way that large programs get written
- A large program is organized into multiple classes. Each class is implemented independently of the other classes, under the assumption that each method it calls will eventually be implemented and do what it is expected to do
- When all classes are written and debugged, they can be combined to create the final program.
- This design strategy has several benefits. Each class will have a limited scope and thus will be easier to program and debug. Moreover, the classes can be written simultaneously by multiple people, resulting in the program getting completed more quickly.
- We say that such programs are modular. Modularity is a necessity; good programs are always modular. 

              Static vs. Nonstatic
- A static variable is a variable that “belongs” to a class. It is shared among all objects of the class.
- If one object changes the value of a static variable then all objects see that change.
- a nonstatic variable “belongs” to an object of the class. Each object has its own instance of the variable, whose value is assigned independently of the other instances.


                Refactoring
- is the process of redistributing the existing code between classes.
- In general, to refactor a program means to make syntactic changes to it without changing the way it works
- Examples of refactoring include: renaming a class, method, or variable; changing the implementation of avariable from one data type to another; and splitting a class into two.
- 

            The Most Qualified Class Rule
- Work should be assigned to the class that know best how to do it.
- When an object receives its dependency values through a constructor we Called it constructor injection.

            Configuration Class.
- Enables users to reconfigure the behavior of the program by simply modifiying the class
- The idea of placing all dependencies decisons within single class is powerful and convienient
They place all configuration details (i.e., information about the input stream, the name of the stored data file, etc.) into a configuration file. 
The configuration class reads that file and uses it to create the appropriate objects.

        Advantage of using Configuration code:
-The advantage to using a configuration file is that the configuration code never needs to change. Only the configuration file changes.

            The Rule of Low Coupling
- try to minimize the number of class dependencies
- This rule is often expressed less formally as “Don’t talk to strangers.” The idea is that if a concept is strange to a client, or 
difficult to understand, it is better to mediate access to it.

    Summary
-Software development must be guided by a concern for program modifiability. 
The fundamental design principle is that a program should be designed so that any change to it will affect only a small, predictable portion of the code. 
There are several rules that can help a designer satisfy the fundamental principle.
       -The ![<em>Encapsulation</em>] rule states that a class’s implementation details should be hidden from its clients as much as possible.
       - The Most Qualified Class rule states that work should be assigned to the class that knows best how to do it.
       - The Low Coupling rule states that the number of class dependencies should be minimized.
       - The Single Responsibility rule states that a class should have a single purpose, and its methods should all be related to that purpose.