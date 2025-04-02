import java.io.FileWriter;
import java.io.IOException;

public class file_2 {
   public static void main(String[] args) {
        //write

        try{
            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello, this is first line");
            writer.write("\nTesting again");
            writer.write("\nhello");


            writer.close();
            System.out.println("Successfuly wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error occured " + e.getMessage());
        }

   } 
}
