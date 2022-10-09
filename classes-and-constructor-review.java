/* Summary notes:

An overview of classes and constructors in Java.

In this article, we’ll cover the following Java class concepts:

~General structure
~Access modifiers
~Constructors


CLASSES

A class is the set of instructions that describe how an instance can behave and what information it contains. Java has predefined classes such as System, which we’ve used in logging text to our screen, but we will often have to create our own classes.
*/

// General Structure: this example defines a public class named Car.

public class Car {
 
  public static void main(String[] args) {
 
  }
 
}

// Access Modifiers: public is an access level modifier that allows other classes to interact with this class. The scope ranges from public classes, which are accessible from anywhere in the program, to private classes, which are only accessible in the class itself.

/* Constructors:
In order to create an object (an instance of a class), we need a constructor method. The constructor is defined within the class.
Let’s take a look at the Car class with a constructor. The constructor, Car(), shares the same name as the class:
*/
public class Car {
  // Constructor method:
  public Car() {
    // Instructions for creating a Car instance
  }  
 
  public static void main(String[] args) {
 
  }
}
// To create an instance, we need to call or invoke the constructor within main(). The following example assigns a Car instance to the variable ferrari:

public class Car {
 
  public Car() {
    // Instructions for creating a Car instance
  }
 
  public static void main(String[] args) {
    // Invoke the constructor:
    Car ferrari = new Car(); 
  }
}

/*
In this example, instead of being declared with a primitive data type like int or boolean, our variable ferrari is declared as a reference data type. This means that the value of our variable is a reference to an instance’s memory address. During its declaration, the class name is used as the variable’s type. In this case, the type is Car.

After the assignment operator, (=), we invoke the constructor method: Car(), and use the keyword new to indicate that we’re creating an instance. Omitting new causes an error.

If we were to output the value of ferrari we would see its memory address.
*/

// Invoking the Constructor: When we create a new instance of our class, we invoke (or call) the constructor. This means that any code inside the constructor will be executed:

public class Car {
 
  public Car() {
    System.out.println("I'm a constructor!");
  }
 
  public static void main(String[] args) {
    // Invoke the constructor:
    Car ferrari = new Car(); // Prints: I'm a constructor! 
  }
}

