// 19. Write a function that finds the sum of all numbers in an array of numbers. 

public class ArraySum {
    static void sumOfArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all numbers in array = " + sum);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        sumOfArray(arr);
    }
}
