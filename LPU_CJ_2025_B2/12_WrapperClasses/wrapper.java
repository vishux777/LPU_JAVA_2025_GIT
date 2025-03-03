//Wrapper class in java are object representation of primitive data types. They provide utility methods and allow primitives to be used as objects

//Primitive data            Wrapper class
//int                           Integer
//char                          Character
//float                         Float

import java.util.ArrayList;

public class wrapper {
    public static void main(String[] args) {

        //Creating wrapper class object
        // Integer num = new Integer(5); //Deprecated

        // Integer num1 = Integer.valueOf(5);

        //Autoboxing -> java automatically converts between primitive and wrapper classes (Primitive->Wrapper)
        // int a = 5;
        // Integer intObj = a; //Autoboxing
        // System.out.println(intObj);


        // Unboxing -> (Wrapper->Primitive)
        // Integer num = Integer.valueOf(5);
        // int b = num; //Unboxing
        // System.out.println(b);

        // int num = Integer.parseInt("100");

        ArrayList<Integer> nums = new ArrayList<>();

        //Autoboxing : int -> Integer
        nums.add(5);
    }    
}


// Write a program that takes a string input ("45") and adds 10 to it using wrapper class methods.