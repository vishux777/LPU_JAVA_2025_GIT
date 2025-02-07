/*
 * Constructors are special method that is invoked when an object of a class is created
 * the name of the constructor method will be same as the class name
 * a constructor method will not return any value
 */


class Student{

    String name;
    int rollNumber;

    //Default constructor
    Student(){
        System.out.println("Fron constructor");
    }

    Student(String nameVal, int rollNumberVal){
        name = nameVal;
        rollNumber = rollNumberVal;
    }

    public void printDetails(){
        System.out.println("Name is : " + name + " roll number is : " + rollNumber);
    }

    public void exams(){
        System.out.println("Giving exams");
    }

}


public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();


        Student s2 = new Student("john", 20);
        s2.printDetails();
       
    }
}



// Design a class Book with the following properties:

// String title
// String author
// double price

// Create a default constructor that sets title, author, and price to default values.
// Create a parameterized constructor to initialize these fields.
// Write a method printBookDetails() to print the details of the book.
// Create an object of the class in the main method and call the printBookDetails().




// Problem Statement:

// Design a class BankAccount with the following attributes:

// String accountHolderName
// String accountNumber
// double balance
// Tasks:

// Create a default constructor that initializes balance to 0.
// Create a parameterized constructor to initialize all fields.
// Write methods for deposit(double amount), withdraw(double amount), and getBalance().
// Handle edge cases like withdrawal exceeding balance.