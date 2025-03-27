
// try{
    //code that may throw an exception
// }
// catch(ExceptionObject e){
    //code to handle the exception
// }
// finally{
    //code that always executes (optional)
// }


public class exc_handling_1 {
    public static void main(String[] args) {

        System.out.println("First line");

        int num = 10;
        int dem = 0;

        try{
            int ans = num/dem;
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println("Exception detected");
        }
        finally{
            System.out.println("Finally code");
        }

        System.out.println("Rest of the code");
    }
}
