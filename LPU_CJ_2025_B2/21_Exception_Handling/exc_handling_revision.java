//types -> checked, unchecked

class MyCustomExc extends Exception{
    MyCustomExc(String s){
        super(s);
    }
}

public class exc_handling_revision {
    public static void main(String[] args) {
        
        try{
            int[] arr = new int[5];
            arr[8] = 50;
            int a = 10/4;

            throw new MyCustomExc("My custom message");
        }
        catch(MyCustomExc e){
            System.out.println(e.getMessage());
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }



        //throw -> manually throw exception

        //throws -> used to declare an exception - tells the caller to handle it

        // custom exception

    }
}



/*
 * try -> wrap code that might fail
 * catch -> handle the exception
 * finally -> always runs
 * throw -> manually throw an exception
 * throws -> declare exception in method signature
 */