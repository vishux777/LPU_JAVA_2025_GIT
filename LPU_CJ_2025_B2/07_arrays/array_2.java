
public class array_2 {

    // static void modifyArray(int[] arr){
    //     for(int i = 0; i < arr.length; i++){
    //         arr[i] *= 2;
    //     }
    // }

    static int[] getArray(){
        return new int[]{1,2,3,4,5};
    }

    public static void main(String[] args) {

        // int[] arr = {1,2,3,4,5};

        // System.out.println("Original array ");
        // for(var i : arr){
        //     System.out.print(i + " ");
        // }

        // modifyArray(arr);

        // System.out.println("\nAfter modification ");
        // for(var i : arr){
        //     System.out.print(i + " ");
        // }


        int[] ans = getArray();
        for(var i  : ans){
            System.out.print(i + " ");
        }

    }
}

//Write a function findMinMax(int[] arr) that finds the largest and smallest element in an array and returns them;
//10, 5, 25, 18, 3
// max -> 25, min -> 3
