//polymorphism -> poly -> many, morph -> forms -> means one entity can take multiple forms

//two types of polymorphism

//1. Compile time polymorphism ->
    // This can be achieved through Method overloading
    //This type of polymorphism is determined at compile time
    //Can be achieved by method overloading

class Calculate{

    int add(int num1, int num2){
        return num1+num2;
    }

    int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    double add(double num1, double num2){
        return num1 + num2;
    }
}

public class polymorphism_1 {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();

        System.out.println(c1.add(2, 4));
        System.out.println(c1.add(2,4,6));
    }
}
