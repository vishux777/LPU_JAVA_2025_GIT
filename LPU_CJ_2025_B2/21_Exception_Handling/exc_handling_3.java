//custom exceptions

class CustomAgeException extends Exception{
    public CustomAgeException(String msg){
        super(msg);
    }
}

public class exc_handling_3 {
    public static void main(String[] args) {

        int age = 10;

        try{
            if(age < 18){
                throw new CustomAgeException("Age must be above 18");
            }
        }
        catch(CustomAgeException e){
            System.out.println("Custom exception caught : " + e.getMessage());
        }
        
    }
}
