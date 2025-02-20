//String class in JAVA is immutable, means once string object is created, its value can not be changed
public class strings_1 {
    public static void main(String[] args) {

        //Using string literals
        // String s1 = "Hello"; //Stored in string pool
        // String s2 = "Hello"; //Reuses the same object


        //Creating strings using new keyword

        // String s3 = new String("Hello"); //It will always create a new object

        //Methods
        String s4 = "Hello World";
        String s5 = " Hey";

        // System.out.println(s4.length());

        // System.out.println(s4.charAt(6));
        // System.out.println(s4.equals(s5));

        String s6 = s4.concat(s5);
        System.out.println(s6);
    

    }
}
