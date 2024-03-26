// 2. Write a function that checks if a given number is prime.

public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Check from 2 to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        int number = 17; // Example number
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}


--------------------------------------------------------------------------------------------------------

public class CheckPrime {
    public static int isPrime(int no)
    {
       if(no<=1)
       {
        return -1; //invalid input
       }
       
       for(int i=2; i<no-1; i++)
       {
         if(no%i==0){
            return 0; //not a prime number
         }
       }
       return 1; //prime number
    }

    public static void main(String[] args) {
        int no=7;
        if(isPrime(no)==1)
        {
            System.out.println("Number is prime");
        }
        else if (isPrime(no)==0){
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}


