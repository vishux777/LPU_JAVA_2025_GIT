//abstract class is class which cannot be instantiated. It is used as a base class for other classes to extend and provides a structure that enforces a certain behaviour in subclasses

//Characteristics
//can have abstract methods (methods without implementation)
//can have concrete methods (methods with implementation)
//can not be instantiated directly

abstract class Car{
    abstract void accelarate(); //-> abstract method - this will have no body, only the signature
                                //-> it MUST be overriden in subclasses
                                //-> abstract method can only exist in abstract class

    abstract void brake();

    void drift(){
        System.out.println("Car is drifting...");
    }
}

class RacingCar1 extends Car{
    
    void accelarate() {
       System.out.println("Car 1 is accelerating");
        
    }

    void brake(){
        System.out.println("brakes applied");
    }
}

class RacingCar2 extends Car{
    void accelarate() {
        System.out.println("Car 2 is accelerating");
         
     }

     void brake(){
        System.out.println("brakes applied");
    }
}


public class abstract_1 {
    public static void main(String[] args) {
        Car c1 = new RacingCar1();

        c1.accelarate();
        c1.drift();
    }
}
