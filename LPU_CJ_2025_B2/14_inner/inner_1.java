//Inner class -> a class defined within another class
class Outer{

    String msg = "Hello";

    class Inner{
        void show(){
            System.out.println(msg);
        }

        class hello{
            
        }
    }
}

public class inner_1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        Outer.Inner inner = outer.new Inner();

        inner.show();
    }
}
