// 20. Write a function that finds the product of all numbers in an array of numbers.

public class ArrayProduct {
    static void productArray(int arr[]) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("The product of array = " + product);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        productArray(arr);
    }
}
