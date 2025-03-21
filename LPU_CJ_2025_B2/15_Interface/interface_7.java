
interface Vehicle{
    void drive();

    default void honk(){
        System.out.println("Honk");
    };
}

class Bike implements Vehicle{
    public void drive(){
        System.out.println("Drive");
    }
}

public class interface_7 {
  public static void main(String[] args) {
    Bike obj = new Bike();

    obj.drive();
    obj.honk();
  }  
}




// Create an interface Controllable with methods start() and stop().
// Implement Fan and AirConditioner classes.
// Print start and stop staements for devices.