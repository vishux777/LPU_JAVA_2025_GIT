
public class varargs {

    // returnType methodName(datatype... varName){

    // }

    // Example 1
    // static int sum(int... numbers){

    //     int count = 0;
    //     for(int i : numbers){
    //         count += i;
    //     }

    //     return count;
    // }


    //-------------------------------
    // Example 2
    // static void greet(String msg, String... names){
    //     System.out.println(msg);
    //     for(var i : names){
    //         System.out.println("Hello " + i);
    //     }
    // }

    //-------------------------------
    // Example 3

    static void print(int... nums){
        System.out.println("from varargs method");
    }

    static void print(int nums){
        System.out.println("single prameter method");
    }


    public static void main(String[] args) {
        // System.out.println(sum(2,4,5,10));

        // greet("Welcome : ", "John", "Harry", "Charlie");

        print(5);
    }
}


//Create a method maxValue(int.. nums) that return the maximum value from integers
