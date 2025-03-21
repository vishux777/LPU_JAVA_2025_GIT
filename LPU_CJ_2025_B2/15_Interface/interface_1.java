//an interface acts as a contract that classes must follow when theyimplement the interface

// class will extends a class
//class will implements an interface


interface Car{

    void speed();

}

class BMW implements Car{
    public void speed(){
        System.out.println("Speeding...");
    }
}


public class interface_1 {
    public static void main(String[] args) {

        Car obj = new BMW();
    }
}
