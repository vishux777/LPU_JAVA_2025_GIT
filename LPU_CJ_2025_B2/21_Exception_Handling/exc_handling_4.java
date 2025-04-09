//throws - is used to declare exceptions that a method might throw during its execution.It tells the compiler that method may cause exception, and it must be handled by the caller


class A extends Thread{
    public void run(){
        try{

            Thread.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println("Caught");
        }
    }
}

public class exc_handling_4 {

    static void divide(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result : " + (a/b));
    }


    public static void main(String[] args) {
        
        try{

            divide(4, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}


//Take a user input, throw a custom exception if the number is negative or greater than 100;