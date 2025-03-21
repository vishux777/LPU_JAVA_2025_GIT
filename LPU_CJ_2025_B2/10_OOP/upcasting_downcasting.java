class A{
    void show(){
        System.out.println("From A");
    }
}

class B extends A{
    void show(){
        System.out.println("From B");
    }
}

public class upcasting_downcasting {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        A obj = new B(); //upcasting
        obj.show();

        B obj1 = (B) obj; //downcasting

        double a = 5.5;
        int b = (int) a;

    }
}
