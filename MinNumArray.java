// 15. Write a function that finds the minimum number in an array of numbers.

public class MinNumArray {
    static int minNumber(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 4, 9, 50, 99 };
        int min = minNumber(arr);
        System.out.println("The minimum number is = " + min);
    }
}
