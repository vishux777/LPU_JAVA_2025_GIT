import java.util.Scanner;
public class test {

    enum Shape{
        SQUARE,
        TRIANGLE
    }
    public static void main(String[] args) {
        

        //user input
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toUpperCase();

        Shape shape = Shape.valueOf(s1);

        switch (shape) {
            case SQUARE:
                
                break;
        
            default:
                break;
        }
    }
}
