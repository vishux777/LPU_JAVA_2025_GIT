import java.util.Scanner;

class userInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // System.out.print("Enter your age : ");
        // System.out.println("Enter your name : ");
        // String name = sc.nextLine();

        // System.out.println("Your name is : " + name);

        // sc.close();

        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter color : ");
        String color = sc.nextLine();

        System.out.println( name + " " + age + " " + color);

        sc.close();

    }
}

//Create a program that asks the user for their name, age, and favorite color, then displays a user profile with this information.