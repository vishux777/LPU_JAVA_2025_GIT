//Inheritance -> it allows a child class(subclass) to inherit properties and behaviours (variables, methods) from parent class(superclass)

class Parent{
    int a;
}


class Child extends Parent{

}

public class inheritance_1 {
    public static void main(String[] args) {
        Child c1 = new Child();

        c1.a = 10;
    }
}



//car1 -> accelerate, brake, nitro
//car2 -> accelerate, brake, drift
//car3 -> accelerate, brake, fly

class ParentCar{
    int speed;
    
    void accelerate(){
        System.out.println("Accelerate");
    }

    void brake(){
        System.out.println("Brake");
    }
}

class Car1 extends ParentCar{
    void nitro(){
        System.out.println("Nitro");
    }
}

class Car2 extends ParentCar{
    void drift(){
        System.out.println("Drift");
    }
}

class Car3 extends ParentCar{
    void fly(){
        System.out.println("fly");
    }
}


//Benefits -> Code reusability, scalable, maintainable