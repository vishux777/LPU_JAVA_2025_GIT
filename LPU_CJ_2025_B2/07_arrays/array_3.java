public class array_3 {

    static int[] findMinMax(int[] arr){
        int min = arr[0]; //Assuming first element is the smallest
        int max = arr[0]; //Assung first element is the greatest

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i]; //update min if current element is smaller
            }

            if(arr[i] > max){
                max = arr[i]; //update max if current element is greater
            }
        }

        return new int[]{min,max};

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 25, 5, 9, -1, 30};

        int[] ans = findMinMax(arr);

        System.out.println("Min element is : " + ans[0]);
        System.out.println("Max element is : " + ans[1]);
    }
}
