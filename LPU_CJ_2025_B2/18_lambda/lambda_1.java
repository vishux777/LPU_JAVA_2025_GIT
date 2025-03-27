
@FunctionalInterface
interface Calculate{
    int add(int i, int j);

}

@FunctionalInterface
interface test{
    void show();
}

public class lambda_1 {
    public static void main(String[] args) {

        // Calculate obj = new Calculate(){
        //     public void add(){
        //         System.out.println(2 + 2);
        //     }
        // };

        // Calculate obj = () -> System.out.println(2 + 2);

        //----------------------------------------------
        
        // Calculate obj = new Calculate(){
        //     public void add(int i){
        //         System.out.println(i);
        //     }
        // };

        // Calculate obj = (i, j) -> {
        //     i = i * 2;
        //     j = j * 3;
        //     System.out.println(i + j);
        // };
            
        //----------------------------------------------
            
        // Calculate obj = new Calculate(){
        //     public int add(int i, int j){
        //         return i + j;
        //     }
        // };

        Calculate obj = (i, j) -> i * j;
            
        
        test t1 = () -> System.out.println("Hello");

        System.out.println(obj.add(5,6));
        t1.show();
    }
}