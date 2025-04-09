
//Properties -
//Dynamic resizing
//Index based access
//Allows duplicates
//Maintain insertion order
//can store null values

import java.util.ArrayList;

public class collections_1 {
    public static void main(String[] args) {
        // ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("Dog");
        arrayList2.add("Cat");
        arrayList2.add("Cow");
        arrayList2.add("Horse");

        arrayList2.add(1, "Tiger");
        // arrayList2.add(null);

        //access
        // System.out.println(arrayList2.get(3));

        //updating elements
        // arrayList2.set(3, "Lion");

        // arrayList2.remove(3);
        // arrayList2.remove("Cat");

        // System.out.println(arrayList2);


        //iterate
        // for(int i = 0; i < arrayList2.size(); i++){
        //     System.out.println(arrayList2.get(i));
        // }

        // for(String i : arrayList2){
        //     System.out.println(i);
        // }

        arrayList2.forEach(i -> System.out.println(i));

    }
}
