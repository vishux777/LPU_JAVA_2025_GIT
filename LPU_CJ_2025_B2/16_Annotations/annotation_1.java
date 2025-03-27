
class Parent{
    void show(){
        System.out.println("From Parent");
    }

    void thisIsAVeryStrangeNamedMethodWeareCreating(){
        System.out.println("1");
    }

    // @Deprecated
    void oldMethod(){
        System.out.println("Hello");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("From Child");
    }

    // @Override
    // void thisIsAVeryStraangeNamedMethodWeareCreating(){
    //     System.out.println("2");
    // }
}

public class annotation_1 {
   public static void main(String[] args) {
        Parent obj = new Child();

        // obj.show();

   } 
}
