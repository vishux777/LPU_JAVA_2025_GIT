public class array_6 {

    // Write a function findMissingNumber(int[] arr, int n) that finds the missing number from an array containing numbers from 1 to n

    //step 1 -> find sum of n natural numbers -> (n * (n+1))/2 -> 15
    //step 2 -> find sum of all the elements of array -> sum += arr[i] -> 11

    //step1 - step2 = 4

    static int missingNumber(int[] arr, int n){
        int expectedSum = (n*(n+1)/2); //sum of first n natural numbers
        int totalSum = 0;

        for(int i  : arr){
            totalSum += i;
        }

        return expectedSum - totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};

        int n = 2;

        System.out.println("Missing number is : " + missingNumber(arr, n));
    }
}
