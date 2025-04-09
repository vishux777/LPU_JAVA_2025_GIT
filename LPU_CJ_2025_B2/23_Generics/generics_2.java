
class Box <T extends Number>{
    T value;

    Box(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }
}

public class generics_2 {
    public static void main(String[] args) {

        // Box<String> b1 = new Box("Hey");

        Box<Integer> b1 = new Box(5);
        Box<Short> b2 = new Box(1);
    }
}
