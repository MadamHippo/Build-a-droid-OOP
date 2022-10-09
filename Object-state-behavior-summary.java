/*
Object State & Behavior

In Java, an object is a specific instance of a class that uses attributes and behaviors to represent a real-world entity. This article will cover the following topics:

creating an object
object state
object behavior
the .toString() method

Creating an Object:

Objects and classes are closely related because classes define the attributes and behaviors of an object. To create an object, declare a variable in the main() method with the class name as the data type and set the value to a call to the class’ constructor:
*/

class Cat {
  // Class constructor:
  public Cat(){
    // Instructions for creating an instance of Cat goes here:
  }
 
  public static void main(String[] args) {
    // Create a Cat object by calling the constructor:
    Cat myCat = new Cat();
  }
}

// The class name is used as the data type because objects have reference data types meaning that the value of the variable is a reference to an instance’s memory address.

/*
Object State

State refers to the attributes of an object. State can be defined using instance variables, or instance fields, which are placed inside of a class.

Creating instance field: To create an instance field, initialize variables inside the class container:
*/

class Cat {
  // instance fields:
  String noise = "meow";
  int numLives = 9;
 
  public Cat(){
    // Instructions for creating an instance of Cat goes here:
  }
 
  public static void main(String[] args) {
    Cat myCat = new Cat();
  }
}

// To access an object’s instance fields, append the dot operator followed by the instance field’s name to the name of the object:

Cat myCat = new Cat();
// Access instance variable of an object:
System.out.println(myCat.noise); // Prints: meow

/* Defining State with Parameters:
To create dynamic objects, parameters can be added to the class constructor. Instance variables can then be assigned the parameter values:
*/

class Cat {
  // Instance fields:
  String noise;
  int numLives = 9;
 
  // Constructor takes in one String parameter
  public Cat(String animalNoise){
    // Assign instance variable to parameter value:
    noise = animalNoise;
  }
 
  public static void main(String[] args) {
    // Send argument to constructor when creating an object:
    Cat firstCat = new Cat("mew"); 
    // Send argument to constructor when creating another object:
    Cat secondCat = new Cat( "mow");
 
    System.out.println(firstCat.noise); // Prints: mew
    System.out.println(secondCat.noise); // Prints: mow
  }
}

/* 
The this Keyword
The this keyword is used to reference the current object within any class method or constructor. The this keyword can be useful in clarifying what value is being referred to if any parameter values use the same name as an instance variable.

To use the this keyword, prepend this followed by . to the instance variable:
*/
class Cat {
  String noise;
  int numLives = 9;
 
  // Parameter has same name as the instance variable
  public Cat(String noise){
    // Assign instance variable to parameter value:
    this.noise = noise;
  }
}

/* Object Behavior

Non-static methods: In order to give behavior to objects, we need to create non-static methods. A non-static method is a method that belongs to a class. A non-static method can be identified by the lack of the static keyword in the method signature:
*/
class Cat {
  String noise;
  int numLives = 9;
 
  // Non-static method:
  public void speak() {
    System.out.println(noise);
  }
 
  public Cat(String animalNoise){
    noise = animalNoise;
  }
 
  public static void main(String[] args) {
    Cat myCat = new Cat("mew");
  }
}

// Invoking a Non-Static Method: A non-static method can only be invoked by an object of the class in which the method was created. To call a non-static method, state the object’s name followed by ., the method name, and parentheses:

Cat myCat = new Cat("mew");
// Invoke non-static method on an object:
myCat.speak(); // Prints: mew

// The .toString() Method: If an object is placed inside of a print statement, the output shows the data type of the object (the class name) followed by the memory address of the object:

public static void main(String[] args) {
  Cat myCat = new Cat("mew");
  System.out.println(myCat); // Prints: Cat@6bc7c054
}

/* The .toString() method can be added to a class in order to create a unique output when printing an object. The original .toString() method exists within the Object class; however, the .toString() method is often overridden in subclasses to create a unique output for each individual class:
*/
class Cat {
  String noise;
  int numLives = 9;
 
  public String toString() {
    System.out.println("The cat with " + numLives + " lives says " + noise);
  }
 
  public Cat(String animalNoise){
    noise = animalNoise;
  }
 
  public static void main(String[] args) {
    Cat myCat = new Cat("mew");
    System.out.println(myCat); // Prints: The cat with 9 lives says mew
  }
}


// Entire Example code to help you understand classes, constructors, state and behaviors:

class Whale {
  String whaleSpecies;
  int whaleWeight;
  
  public Whale(String name, int weight) {
    whaleSpecies = name;
    whaleWeight = weight;
  }

  public String toString(){
    return "This is a " + whaleSpecies + " whale which weighs about " + whaleWeight + " pounds.";
  }
  
  public static void main(String[] args){
    Whale whale1 = new Whale("narwhal", 2100);
    Whale whale2 = new Whale("beluga", 3000);
    System.out.println(whale1);
    System.out.println(whale2);
  }
}

