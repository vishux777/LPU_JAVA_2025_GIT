import java.io.File;
import java.io.IOException;

public class file_1 {
    public static void main(String[] args) {
        //create file
        File myFile = new File("example.txt");

        try{
            if(myFile.createNewFile()){
                System.out.println("File Cretated");
            } else{
                System.out.println("File already exist : " + myFile.getAbsolutePath());
            }
        }
        catch(IOException e){
            System.out.println("Error");
        }

        System.out.println(myFile.getName());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.length());

        // myFile.delete();

    }
}
