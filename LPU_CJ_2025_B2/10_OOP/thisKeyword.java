class Student{
    String name;
    int rollNumber;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void print(){
        System.out.println("Student name is : " + name + " and roll number is : " + rollNumber);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("John", 10);

        s1.print();
    }
}



// Create a class Book with:

// Instance variables title, author, and price.
// A constructor that initializes all fields using the this keyword.
// Write a method printDetails() to display the book information.