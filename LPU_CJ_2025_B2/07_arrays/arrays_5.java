public class arrays_5 {

//Write a function isSorted(int[] arr) that returns true if array is sorted in ascending order, else retrun false;

    static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(isSorted(arr));
    }
}
