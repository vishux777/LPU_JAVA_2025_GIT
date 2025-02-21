//StringBuilder class -> Mutable strings
public class string_2 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");
        // System.out.println(sb);

        //Methods
        sb.append(" World");
        
        
        // sb.insert(3, " NEW ");

        // sb.replace(6, 11, "JAVA");
        
        // sb.delete(0, 5);

        sb.reverse();


        System.out.println(sb);
    }
}


//Differnce ->          String                  StringBuilder
//Mutability            immutable                   mutable
//Performance           Slow                        Fast



// Write a function isPalindrome(String s) that returns true if the string is the same forward and backward.

// Write a method that counts how many words are in a string (words are separated by spaces).
// Write a function toTitleCase(String s) that capitalizes the first letter of each word.
