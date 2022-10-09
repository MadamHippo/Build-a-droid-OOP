/* 
In Java, scope defines where a certain variable or method is accessible in a program. In this article, we will cover the following scope topics:

~ Types of variable scope
~ Access modifiers

*/


/*
Variable Scope

Variables can be defined as having one of three types of scope:

~ class level scope
~ method level scope
~ block scope
*/


/*
Class Level Scope:

Class level scope (instance variables): any variable declared within a class is accessible by all methods in that class. Depending on its access modifier (ie. public or private), it can sometimes be accessed outside the class.

*/

public class Car {
  public String color;
  private int speed;
 
  public Car(String color, int speed) {
    // Variables color and speed accessible here
  }
 
  public void drive(boolean fourWheel) {
    // Variables color and speed accessible here
  }
}
 
public class BuyCar {
  public static void main(String[]args) {
    Car carObject = new Car("blue", 70);
    // Can access the public variable, color, in this class
    String carColor = carObject.color;
    // Can’t access the private variable, speed, in this class
    // int carSpeed = carObject.speed -- This results in an error, can’t access speed here
  }
}




// Method Level Scope: 
// Method level scope (local variables): any variable declared within a method, arguments included, is NOT accessible outside that method.

public class Car {
  public String color;
  private int speed;
 
  public void drive(boolean fourWheel) {
    String tires = "wide";
    // fourWheel and tires are only accessible here
    // fourWheel and tires are destroyed after drive() finishes
  }
 
  public void paint(String newColor, String oldColor) {
    // newColor and oldColor are only accessible here
    // newColor and oldColor are destroyed after paint() finishes
  }
}
 
public class PaintCar {
  // The only variable from Car accessible in this class is color
  // None of the variables declared in Car methods are accessible in this class
}



// Block Scope:
// Block scope (loop variables): any variable declared in a for loop condition is not accessible after the loop, unless you defined it beforehand.

public class Car {
  public void changeTires() {
    int numTires = 4;
    int changedTires = 0;
    for (i = 0; i < numTires; i++) {
      changedTires += 1;
    }
    // numTires and changedTires are accessible here, i is not
  }
}


/*

Access Modifiers:

Access Modifiers
In Java, there are four access modifiers that restrict the accessibility of the method or variable to which the modifier is applied. They are only used within classes, not within methods. public and private are the most relevant modifiers to our work, but let’s briefly discuss all of them.

private
The most restrictive modifier. It limits access to methods and variables to the class in which they are declared. private is chosen when there is no need to use certain methods or variables outside the class.

default
Allows access only from within the current package. If there is no specified access modifier, the method or variable will take on this one. Learn more about the default modifier.

protected
Allows access to a method or variable only from within the current package, unless it is accessed through a child class outside of the package. Learn more about the protected modifier.

public
The least restrictive modifier. It allows access to a class, method or variable not only from within the class in which it is declared, but outside as well. This is the modifier we will most commonly use, but to understand the scenarios in which to use the others, check out the Oracle documentation.

*/




/*
EXAMPLE #1

An example using min-heap to demonstrate puublic vs private.

Min-heaps are a data structure that keeps track of the minimum element in a dataset; let’s look at the MinHeap class to help us understand private vs. public.

The .bubbleUp() method is private because “bubbling up,” or adjusting a heap after adding an element, is an internal process, not something that needs to be performed outside the MinHeap class. .add() on the other hand is a basic min-heap function so should be made public.

*/

public class MinHeap {
  public ArrayList<Integer> heap;
  public int size;
 
  public MinHeap() {
    // Body of constructor
  }
  public void add(int value) {
    heap.add(value);
    size++;
    bubbleUp();
  }
  private void bubbleUp() {
    // Body of .bubbleUp() method
  }
}
 
public class TrackAges {
  public static void main(String[]args) {
    MinHeap ages = new MinHeap();
    // Can call public MinHeap .add() method here:
    ages.add(42);
    ages.add(15);
    ages.add(27);
    // Can’t call private MinHeap .bubbleUp() method here
    // Don’t need to because .add() calls .bubbleUp()!    
  }
}


// EXAMPLE #2:
// Take a look at the following example code. Feel free to play around with it to get a better understanding of scope in Java.

public class Car {
  public String color;
  private int speed;
 
  public Car(String color, int speed) {
    // Variables color and speed accessible here
  }
 
  public void drive(boolean fourWheel) {
    // Variables color and speed accessible here
    fourWheel = true;
  }

  public static void main(String[] args) {
    Car ferrari = new Car("red", 200);
    System.out.println(ferrari.color);
    System.out.println(ferrari.speed);
    System.out.println(ferrari.fourWheel); // This will throw an error
  }
}

// Will give error: 
Car.java:18: error: cannot find symbol
    System.out.println(ferrari.fourWheel); // This will throw an error
