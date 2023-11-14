// 14. Write a function that finds the maximum number in an array of numbers. 

public class MaxNumArray {
    static int maxNumber(int arr[]) {
        if (arr.length == 0) {
            System.out.println("array is empty");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 4, 9, 50, 99 };
        int max = maxNumber(arr);
        System.out.println("The maximum number is = " + max);
    }
}