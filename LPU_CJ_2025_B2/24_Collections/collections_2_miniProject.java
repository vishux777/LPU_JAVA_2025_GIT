import java.util.HashMap;

public class collections_2_miniProject {
    public static void main(String[] args) {
        
        HashMap<String, String> phoneBook = new HashMap<>();

        //Add contacts
        phoneBook.put("Person 1", "12345");
        phoneBook.put("Person 2", "98765");
        phoneBook.put("Person 3", "787878");

        //Show all contacts
        System.out.println("All contacts : ");
        for(String i : phoneBook.keySet()){
            System.out.println(i + " - " + phoneBook.get(i));
        }

        //Search
        String name = "Person2";

        if(phoneBook.containsKey(name)){
            System.out.println(name + "'s number is : " + phoneBook.get(name));
        }else{
            System.out.println(name + " not found in contacts");
        }
    }
}
