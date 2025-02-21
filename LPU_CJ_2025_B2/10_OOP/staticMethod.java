class Student{
    static String uniName;

    public static void print(){
        System.out.println(uniName);
    }   
}

public class staticMethod {


    public static void main(String[] args) {
        Student.print();
    }
}



// Create a class Library with:

// A static variable totalBooks.
// Instance variables for bookName and isAvailable.
// A static method getTotalBooks() that returns the total number of books in the library.