//Java does not support multiple inheritance with classes but supports it with interfaces

interface Engine{
    void start();
}

interface Steer{
    void drive();
}

class Car {

    public void start(){
        System.out.println("Car can start");
    }

    public void drive(){
        System.out.println("Car can drive");
    }
}
public class interface_4 {
    public static void main(String[] args) {
        Car carObj = new Car();

        carObj.start();
        carObj.drive();
    }
}
