class A{

    // A(){
    //     super();
    //     System.out.println("From A default constructor");
    // }
    // A(int num){
    //     System.out.println("From A parametrized constructor");
    // }

    void show(){
        System.out.println("Show from A");
    }
}

class B extends A{
    // B(){
    //     super();
    //     System.out.println("From B default constructor");
    // }

    // B(int num){
    //     super(5);
    //     System.out.println("From B parametrized constructor");
    // }

    void show(){
        super.show(); //Call parent's show()
        System.out.println("show from B");
    }
}

public class inheritance_5 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
    }
}
