class Car{
    /*
    * classes and objects
         * class is a blueprint for creating objects, it defines the attributes and behivours that the object created from that class will have
         * object is an instance of that class
    */

    //Attributes
    String color;
    String model;

    //Behaviours
    public void drive(){
        System.out.println("The car is driving");
    }
}

public class C_O {
    public static void main(String[] args) {
        Car c1 = new Car(); //c1 is a reference variable
        c1.color = "Red";
        c1.model = "2020";

        System.out.println(c1.color);
    }

    
}
