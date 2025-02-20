public class init_Block_2 {
    int A;
    static int B;

    static{
        B = 5;
        System.out.println("1");
    }

    {
        A = 10;
        System.out.println("2");
    }

    init_Block_2(){
        System.out.println("3");
    }
    public static void main(String[] args) {
        System.out.println("4");
        init_Block_2 ib1 = new init_Block_2();
        init_Block_2 ib2 = new init_Block_2();

    }
}
