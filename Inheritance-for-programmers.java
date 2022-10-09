/*
In Java, inheritance is the concept of allowing a class to inherit the methods and properties of another class. This article will cover the following topics:

~ superclasses and subclasses
~ the super() method
~ access modifiers

*/

// Superclasses and Subclasses

/*
Superclasses refer to the class that another class inherits from. Subclasses refer to the class that inherits qualities from another class. An object of a subclass inherits all the available instance variables and methods provided in the superclass class.

In order to create a superclass/subclass relationship between two classes, the class declaration of the subclass must be modified to include the extends keyword followed by the name of the superclass. No changes need to be made to the superclass:
*/

class Shape {
  Shape() {
    System.out.println("I am a shape!");
  }
}
// Make Triangle a subclass of Shape:
class Triangle extends Shape {
  Triangle() {
    System.out.print("I am a triangle!");
  }
  public static void main(String[] argos) {
    Shape sq = new Shape(); // Prints: I am a shape!
    Triangle tri = new Triangle();
    /* Prints:
    I am a shape!
    I am a triangle!
    */
  }
}

/* 

The super() Method:
When an instance of a subclass is created, the subclass’ constructor will automatically invoke the superclass’ constructor. The super() method allows us to control what arguments are sent to the superclass constructor when creating an object of the subclass.
To invoke the super() method, place super() in the body of the subclass’ constructor; the () can hold any specific arguments that an instance of the subclass should contain:

*/

class Shape {
  int numSides;
  Shape(int numSides) {
    this.numSides = numSides;
  }
}
 
class Triangle extends Shape {
  Triangle() {
    // Use super() to call the Shape constructor:
    super(3);
  }
 
  public static void main(String[] args) {
    Shape sq = new Shape(4);
    Triangle tri = new Triangle();
    System.out.println(sq.numSides); // Prints: 4
    System.out.println(tri.numSides); // Prints: 3
  }
}
