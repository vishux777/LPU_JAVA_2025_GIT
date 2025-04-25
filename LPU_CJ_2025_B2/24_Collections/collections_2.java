//Hashmap -> it is used to store data in key-value pairs

// No duplicate keys -> each key must be unique
// Unordered
// Fast access -> O(1) average time for searching insertion deletion

import java.util.HashMap;

public class collections_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        //add
        students.put(1, "Student1");
        students.put(2, "Student2");
        students.put(3, "Student3");

        //access
        // System.out.println("Old name : " + students.get(2));

        //update
        // students.put(2, "NewStudent2");
        // System.out.println("New name  : " + students.get(2));

        // students.remove(2);

        // System.out.println(students.containsKey(2));
        // System.out.println(students.containsValue("Student1"));

        for(int i : students.keySet()){
            System.out.println(i + " " + students.get(i));
        }
    }
}
