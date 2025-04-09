// assert condition : "Error Message"

//if the condition is true, execution continues normally
//if the condition is false, and AssertionError is thrown

// java -ea to enable assertion
// -da to disable

public class assertions {
    public static void main(String[] args) {
        int age = 10;

        assert age >=18 : "Age must be 18 or above";

        System.out.println("Age is valid");
    }
}
