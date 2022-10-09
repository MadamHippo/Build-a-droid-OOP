/* Building basic droid, has energyReport() but will perform energyTransfer() function in another file */

public class Droid{
  // State is represented with instance fields and behavior is represented with methods.
  String name;
  int batteryLevel;

  // constructor method
  public Droid(String droidName) {
    // Inside this constructor, assign the parameter value of droidName to the appropriate instance field.
    name = droidName;
    batteryLevel = 100;

  }

  // toString method()
  public String toString(){
    // Inside toString(), return a string that introduces the Droid using their name.
    // Something like “Hello, I’m the droid: droidNameHere”
    return "Hello, I'm the droid: " + name;
  }


  // another method() that's void (not return anything)
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    // After the print statement, set batteryLevel to be 10 less than it was before.
    batteryLevel = batteryLevel - 10;
  }

  // extra credit: energyReport() method

  public int energyReport(){
    System.out.println(name + " is at battery: " + batteryLevel);
    return batteryLevel;
  }

  // main
  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);

    // Have your Droid instance perform some tasks inside of main() by calling the method...this is the format: codey.performTask("dancing");
    codey.performTask("dancing");
    codey.performTask("building");
    codey.energyReport();


  }
}
