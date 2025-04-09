
// try{
    //code that may throw an exception
// }
// catch(ExceptionObject e){
    //code to handle the exception
// }
// finally{
    //code that always executes (optional)
// }

//-------------------------------------

/*
     Object
        |
    Throwable
        |
    Exception (Checked) -> IOExeption, ClassNotFoundException
        |
    RuntimeExceptions (Unchecked) -> ArithmeticException, ArrayIndexOutOfBoundException, NullPointerException


    Types of Exceptions
    1. Checked Exceptions -> Exceptions that are checked at compile time

    2. Unchecked Exceptions ->Exceptions that occur at runtime and are not checked at compile time
 */

public class exc_handling_1 {
    public static void main(String[] args) {

        System.out.println("First line");

        int num = 10;
        int dem = 0;

        try{
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[7]);
            int ans = num/dem;
            System.out.println(ans);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught : " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array exception caught : " + e.getMessage());
        }
        finally{
            System.out.println("Finally code");
        }

        System.out.println("Rest of the code");
    }
}
