//2. Runtime polymorphism ->
    //This can be achieved by Method overriding
    //it allows child class (subclass) to provide a specific implementation of a method which is already defined in the parent class (superclass)

class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
}

public class polymorhism_2 {
    public static void main(String[] args) {
        Animal a1 = new Animal();

        a1 = new Dog();
        
        a1.makeSound();
    }
}
