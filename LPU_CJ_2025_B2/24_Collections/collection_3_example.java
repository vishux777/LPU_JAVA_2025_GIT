import java.util.ArrayDeque;
import java.util.Deque;

public class collection_3_example {

    static boolean isPalindrome(String s){
        Deque<Character> dq = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            dq.addLast(ch);
        }

        while(dq.size() > 1){
            if(dq.removeFirst() != dq.removeLast()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        System.out.println(isPalindrome("madam"));
    }
}
