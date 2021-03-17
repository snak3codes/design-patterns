# Factory Design Pattern
The **Factory Pattern** allows you to create objects without specifying 
the exact class of object that will be created at runtime.

## What is it?
* When a method returns one of several possible classes that share a
common superclass.
  * Create a new enemy in a game.
  * Random number generator picks a number associated to a specific enemy 
  * The factory returns the enemy associated with that number
    
* The class is chosen at runtime.

## When to use?
* When you don't know ahead of time what class object you need
* When all of the potential classes are in the same subclass hierarchy
* To centralize class selection code
* When you don't want the user to have to know every subclass
* To encapsulate object creation