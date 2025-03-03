//final keyword in java is used to restrict modifications to variables, methods and classes

//final variable -> value cannot be changed after initilization
//final method -> cannot be overriden by a subclass
//final class -> cannot be inherited by another class

class Car{
    final int speed;

    static final int maxSpeed = 500;

    Car(int speed){
        this.speed = speed;
    }

    void showSpeed(){
        System.out.println(speed);
    }
}

public class final_1 {
    public static void main(String[] args) {
        // final int num = 100;

        // num = 200;

        // System.out.println(num);

        Car c1 = new Car(100);

        c1.showSpeed();

        System.out.println(c1.maxSpeed);
    }
}
