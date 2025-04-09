//Generics allows classes or methods to work with any type of data, which makes our code more flexible and reusable
class Box<T>{
    T value;

    Box(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }

    void setValue(T val){
        this.value = val;
    }
}


public class generics_1 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box(5);
        Box<Float> b2 = new Box(5.5f);

        Box<String> b3 = new Box("Hey");
    }
}
