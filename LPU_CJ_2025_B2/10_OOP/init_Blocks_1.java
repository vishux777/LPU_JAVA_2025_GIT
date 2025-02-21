//Initilizer blocks -> they are used to initilize objects before the constructor is executed
//Why? -> it allows code reusability without duplicating initilization logic in multiple constructors

import java.text.NumberFormat;
import java.util.Locale;

public class init_Blocks_1 {

    int instanceNum; //instance variable
    static int staticNum; //static variable

    //Instance initilizer Block
    {
        instanceNum = 10;
        System.out.println("From instance initilizer block");
    } //it will run each time an object is created


    //Static initizer block
    //used to initlize static variables before the class is loaded in the memory, it executes only once no matter how many objects are created.
    static {
        staticNum = 10;
        System.out.println("From static initilizer block");

    }

    init_Blocks_1(){
        System.out.println("From constructor");
    }

    public static void main(String[] args) {
        init_Blocks_1 ib1 = new init_Blocks_1();
        init_Blocks_1 ib2 = new init_Blocks_1();

    }
}



/*
*                   Instance initilizer block
When it runs?           Before the constructor, every time an object is created
used for?                   initilizer instance variables
can it access static variables?  Yes
Can it access instance variables?  Yes


*                   Static initilizer block
When it runs?           Before the main(), only once when the class is loaded
used for?                   initilizer static variables
can it access static variables?  Yes
Can it access instance variables?  No
 */







//  Create a class Counter that keeps track of how many objects are created.
// Use a static initializer block to initialize the counter.
// Use an instance initializer block to increment the counter for each object.