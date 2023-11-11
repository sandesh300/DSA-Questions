// 12. Write a function that sorts an array of numbers in ascending order.

public class SortArrayAsc {

    static void ascendingSortArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 1, 3, 5, 8, 2 };

        ascendingSortArray(arr);

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
