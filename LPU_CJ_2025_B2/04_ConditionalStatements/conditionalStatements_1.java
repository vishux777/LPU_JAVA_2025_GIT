
public class conditionalStatements_1 {
    public static void main(String[] args) {
        // if(condition){

        // }

        // int age = 2;

        // if(age >= 18){
        //     System.out.println("You can vote");
        // }
        // else{
        //     System.out.println("You cannot vote");
        // }

        // System.out.println("Last line");

        //Example 2
        // int num = 11;

        // if(num % 2 == 0){
        //     System.out.println(num + " is even");
        // }
        // else{
        //     System.out.println(num + " is odd");
        // }

        //Example 3
        // int marks = 98;

        // if(marks > 90) System.out.println("Grade is A");
        // else if(marks >= 80) System.out.println("Grade is B");
        // else if(marks >= 70) System.out.println("Grade is C");
        // else if(marks >= 60) System.out.println("Grade is D");

        // else System.out.println("Grade is E");
        

        //Example 4

        int age = 1;
        boolean isCitizen = false;

        if(age >= 18){
            if(isCitizen){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("You must be a citizen to vote");
            }
        }
        else{
            System.out.println("You must be 18 or older to vote");
        }
        
    }
}

//Write a program to find the largest among three numbers
