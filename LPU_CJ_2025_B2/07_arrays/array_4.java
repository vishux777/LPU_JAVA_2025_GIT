public class array_4 {
    public static void main(String[] args) {
        
        //Declare
        // int[][] arr = new int[3][3];

        //init
        int[][] arr = {
            {1,2,3}, 
            {4,5,6}, 
            {7,8,9}
        };

        //print
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//Write a function isSorted(int[] arr) that returns true if array is sorted in ascending order, else retrun false;