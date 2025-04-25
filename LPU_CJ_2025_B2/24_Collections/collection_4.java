import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class collection_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> pages = new HashMap<>();
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();

        String currentPage = "";


        while(true){
            System.out.println("-------Browser Menu------");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Show History");
            System.out.println("6. Exit");
            System.out.print("Choose one option : ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 :
                    System.out.print("Enter page title : ");
                    String title = scanner.nextLine();
                    System.out.print("Enter URL : ");
                    String url = scanner.nextLine();

                    if(currentPage != null){

                        backStack.push(currentPage);
                        forwardStack.clear();
                    }

                    currentPage = title;
                    pages.put(title, url);

                    System.out.println("Visited : " + title);
                    break;
                case 2:

                    if(backStack.isEmpty()){
                        System.out.println("No pages to go back to");
                    }else{
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Went back to : " + currentPage);
                    }

                    break;
                
                case 3 :
                    if(forwardStack.isEmpty()){
                        System.out.println("No pages to go forward to");
                    }else{
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("went forward to : " + currentPage);
                    }
                    break;


                case 4 :
                    if(currentPage == null){
                        System.out.println("No page cuurently open");

                    }else{
                        System.out.println("Current page : " + currentPage + "( " + pages.get(currentPage) + " )");
                    }

                    break;
                case 5 :
                    System.out.println("-----History-----");
                    System.out.println("Back Stack : " + backStack);
                    System.out.println("Forward Stack : " + forwardStack);

                    break;
                
                case 6 :
                    System.out.println("Exiting....");
                    return;

                default:
                    System.out.println("Enter a valid input");
                    
            }
        }
    }
}
