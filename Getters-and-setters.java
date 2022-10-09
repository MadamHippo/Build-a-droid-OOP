// An overview of accessor (getter) and mutator (setter) methods in Java.

// When writing classes, we often make all of our instance variables private. However, we still might want some other classes to have access to them, we just don’t want those classes to know the exact variable name.

// Accessor Methods (Setters):

// To give other classes access to a private instance variable, we would write an accessor method (also known as a “getter” method).

public class Dog {
  private String name;
 
  // Other methods and constructors
 
  public String getName() {
    return name;
  }
 
  public static void main(String[] args) {
    Dog myDog = new Dog("Lassie");
    System.out.println(myDog.getName()); // Prints: Lassie
  }
}

// Even though the instance variable name is private, other classes could call the public method getName() which returns the value of that instance variable. Accessor methods are always public and have a return type that matches the type of the instance variable they’re accessing.


// Mutator Methods (Setters):
// Similarly, private instance variables often have mutator methods (also known as “setters”). These methods allow other classes to reset the value stored in private instance variables.

public class Dog {
  private String name;
 
  // Other methods and constructors
 
  public void setName(String newName) {
    name = newName;
  }
 
  public static void main(String[] args){
    Dog myDog = new Dog("Cujo");
    myDog.setName("Lassie");
  }
}

// Mutator methods are often void methods. They don’t return anything, they just reset the value of an existing variable. Similarly, they often have one parameter that is the same type as the variable they’re created to change.

// Here's a full example:

public class Dog {
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public static void main(String[] args) {
    Dog myDog = new Dog("Lassie");
    System.out.println(myDog.getName());
    // will print Lassie
    myDog.setName("Cujo");
    System.out.println(myDog.getName());
    // will print Cujo
  }

}
