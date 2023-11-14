// 17. Write a function that checks if an array of numbers is sorted in ascending order. 

public class CheckArrayAsc {
    static boolean isSortedAscending(int arr[]) {
        if (arr.length <= 1) {
            return true; // An array with 0 or 1 element is always considered sorted
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])   // If any element is greater than the next one, the array is not sorted
                return false;
        }
        return true;     // If the loop completes without returning false, the array is sorted
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 9, 4, 5 };
        System.out.println("Arrays sorted in ascending order = " + isSortedAscending(arr));
    }
}
