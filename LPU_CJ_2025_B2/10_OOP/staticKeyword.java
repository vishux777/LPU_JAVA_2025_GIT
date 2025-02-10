/*
 * static keyword in java is used for memory management and shared resources
 * static keyword indicated that the member belongs to the class itself rather than to individual objects of the class
 * 
 * use cases
 * static members are share across all the instances of class, which reduce the memory consumption
 * we can access static members without creating instance of the class
 */

class Student{
    String name;
    int id;
    static String uniName;

    

    void print(){
        System.out.println(name + " " + id + " " + uniName);
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student.uniName = "LPU";

        s1.name = "John";
        s1.id = 11;
        // s1.uniName = "LPU";



        Student s2 = new Student();
        s2.name = "Clark";
        s2.id = 22;
        // s2.uniName = "LPU";

        s1.print();
        s2.print();
    }
}
