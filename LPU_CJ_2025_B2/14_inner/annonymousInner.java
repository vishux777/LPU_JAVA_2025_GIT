
class A{
    void show(){
        System.out.println("From A");
    }
}

class B{
    void print(){
        System.out.println("From B");
    }
}

// class B extends A{
//     void show(){
//         System.out.println("Hello");
//     }
// }

public class annonymousInner {
    public static void main(String[] args) {
        A obj = new A(){
            void show(){
                System.out.println("Hello");
            }
        };

        obj.show();

        B obj1 = new B(){
            void print(){
                System.out.println("from main");
            }
        };

        obj1.print();
    }
}
