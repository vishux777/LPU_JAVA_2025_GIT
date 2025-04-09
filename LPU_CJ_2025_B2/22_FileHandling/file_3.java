import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_3 {
    public static void main(String[] args) {
       
        try{

            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
