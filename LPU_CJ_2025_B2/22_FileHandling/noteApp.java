import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class noteApp {

    static final String FILE_NAME = "notes.txt";
    //write note
    static void writeNote(Scanner scanner){
        try{

            FileWriter writer = new FileWriter(FILE_NAME);
            
            

            writer.close();
        }
        catch(IOException e){
            System.out.println("Error writing file : " + e.getMessage());
        }
    }

    //read notes

    //delete note
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to notes app");

        while(true){
            System.out.println("1 -> Create a note");
            System.out.println("2 -> View all notes");
            System.out.println("3 -> Delete all notes");
            System.out.println("4 -> Exit");
            System.out.print("Enter your choice : ");

            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    writeNote(scanner);
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }

        
    }
}
