public class operators1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        //Arithmetic operators -> + - * / %

        // System.out.println(num1 + num2);
        // System.out.println(num1 - num2);
        // System.out.println(num1 * num2);
        // System.out.println(num1 / num2);
        // System.out.println(num1 % num2);

        // System.out.println(num1++); //post increment
        // System.out.println(++num1); //pre increment

        // System.out.println(num1++ + ++num1);

        //------------------------------------

        //Relational operators -> == != > >= < <=
        // System.out.println(num1 >= num2);

        //------------------------------------

        //Logical operators -> && || !

        // op1    op2    &&    ||
        // T      T      T     T
        // T      F      F     T
        // F      T      F     T
        // F      F      F     F

        // System.out.println((num1 == num2) &&  (num2 > num1));
        // System.out.println((num1 != num2) ||  (num2 > num1));

        //------------------------------------

        // a    b    a|b    a&b    a^b
        // 0    0    0      0      0
        // 0    1    1      0      1
        // 1    0    1      0      1
        // 1    1    1      1      0

        // int a = 5, b = 3;

        // System.out.println(a^b);

        //------------------------------------

        //Assignment operators = += -= *= /= %=

        num1 -= 15;

        System.out.println(num1);

    }
}


//Accept two numbers from the user and use logical operator to check wheather both numbers are positive