// 18.Write a function that checks if an array of numbers is sorted in descending order.

public class CheckArraysDesc {
    static boolean isSortingDescending(int arr[]) {
        if (arr.length <= 1) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println("Arrays sorted in ascending order = " + isSortingDescending(arr));
    }
}
