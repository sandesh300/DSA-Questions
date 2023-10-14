// 3. Write a function that finds the sum of all numbers from 1 to a given number.

public class  SumNumber{

    public static void calculateSum(int number) {
        int sum = 0;

        if (number < 0) 
        {
            System.out.println("Input is negative.");
        } 
        else if (number >= 1) 
        {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
        } 
        else {
            System.out.println("Number is zero.");
        }
    }

    public static void main(String[] args) 
    {
        int numberToSum = 30;
        calculateSum(numberToSum);
    }
}
