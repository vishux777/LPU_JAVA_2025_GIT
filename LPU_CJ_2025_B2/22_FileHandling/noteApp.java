import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class noteApp {

    static final String FILE_NAME = "notes.txt";
    //write note
    static void writeNote(Scanner scanner){
        try{

            FileWriter writer = new FileWriter(FILE_NAME, true);
            System.out.print("Enter your note : ");
            String note = scanner.nextLine();
            writer.write(note + "\n");
    
            writer.close();
        }
        catch(IOException e){
            System.out.println("Error writing file : " + e.getMessage());
        }
    }

    //read notes
    static void readNotes(){
        File file = new File(FILE_NAME);
        if(!file.exists()){
            System.out.println("No notes found");
            return;
        }

        try{

            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error in reading file");
        }
    }

    //delete note
    static void deleteNotes(){
        File file = new File(FILE_NAME);
        if(file.exists()){
            file.delete();
        }
    }
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
            scanner.nextLine();

            switch(choice){
                case 1:
                    writeNote(scanner);
                    break;
                case 2:
                    readNotes();
                    break;
                case 3:
                    deleteNotes();
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }

        
    }
}
