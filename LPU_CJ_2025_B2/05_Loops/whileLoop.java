import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        
        // while(condition){
        //     code
        // }

        // int i = 0;

        // while(i <= 5){
        //     System.out.println(i);
        //     i++;
        // }


        // do{

        // } while(condition)
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<=5);


        Scanner sc = new Scanner(System.in);

        String password = "hello";

        String input;

        do{
            System.out.print("Enter password : ");
            input = sc.nextLine();
        } while(!input.equals(password));

        System.out.println("Logged in!");
        sc.close();

    }
}
