
public class arrays_1 {
    public static void main(String[] args) {
        //declare
        // dataType[] arrName;

        //init
        // int[] arr = new int[5];

        //declare and init at same time
        int[] arr = {1,2,3,4,5,6,7};

        //access elements
        // System.out.println(arr[2]);

        //modify
        // arr[2] = 20;
        // System.out.println(arr[2]);

        //print
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println("Element at index " + i + " -> " + arr[i]);
        // }

        for(var i : arr){
            System.out.print(i + " ");
        }
    }
}
