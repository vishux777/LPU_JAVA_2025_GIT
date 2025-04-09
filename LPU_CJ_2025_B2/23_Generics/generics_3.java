import java.util.List;

public class generics_3 {

    //Unbounded Wilcard (?) -> accept any type
    static void printList(List<?> list){
        for(Object i : list){
            System.out.println(i + " ");
        }
    }

    //Upper bounded wildcard <? extends someClass> -> used when we want only a specific type and its subclasses
    static double sumNumbers(List<? extends Number> list){
        double sum = 0;
        for(Number num : list){
            sum += num.doubleValue();
        }
        return sum;
    }

    //Lower Bounded wildcard <? super someClass> used when we want a specific type and its superclasses

    public static void main(String[] args) {
        // List<Integer> l1 = List.of(1,2,3,4);
        // List<String> l2 = List.of("a", "b", "c");

        // printList(l1);
        // printList(l2);

        List<Integer> intList = List.of(1,2,3,4);
        System.out.println(sumNumbers(intList));

        List<Double> doubleList = List.of(2.2,4.1,5.8);
        System.out.println(sumNumbers(doubleList));

        List<Character> chatList = List.of('a', 'b', 'c');
        // System.out.println(sumNumbers(charList));
    }
}
