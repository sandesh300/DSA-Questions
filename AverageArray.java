// 16. Write a function that calculates the average of an array of numbers.

public class AverageArray {
    static double average;

    static double calculateAverage(int arr[]) {

        int sum = 0;
        if (arr.length == 0) {
            System.out.println("Arrays is empty");
        } else {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / arr.length;
        }
        return average;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55 };
        double average = calculateAverage(arr);
        System.out.println("The average is = " + average);
    }
}