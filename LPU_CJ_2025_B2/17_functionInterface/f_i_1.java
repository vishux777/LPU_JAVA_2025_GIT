//Function interface ->that contains exactly one abstract method

@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("From B");
    }


}

public class f_i_1 {
    public static void main(String[] args) {
        B obj = new B();

    }
}
