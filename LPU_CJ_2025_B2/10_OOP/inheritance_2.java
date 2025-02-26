class Animal{
    String name;

    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(name + " is barking");
    }
}

class Snake extends Animal{
    void hiss(){
        System.out.println(name + " is hissing");
    }
}

public class inheritance_2 {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.name = "Tom";
        d1.bark();

        Snake s1 = new Snake();

        s1.name = "Snake";
        s1.hiss();
    }
}
