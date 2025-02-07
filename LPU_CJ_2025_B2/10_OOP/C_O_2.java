
class Add{
    int a = 5;

    public void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public double sum(double num1, double num2){
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

public class C_O_2 {
    public static void main(String[] args) {
        
        Add a1 = new Add();

        System.out.println(a1.sum(1.0, 2.0));

    }
}
