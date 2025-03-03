//Method overriding -> this allows subclass to provide a specific implementation of a method already defined in its parent class

class Parent{
    void show(){
        System.out.println("From Parent");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("From Child");
    }
}

public class inheritance_4 {
    public static void main(String[] args) {
        Child c1 = new Child();

        c1.show();
    }
}
