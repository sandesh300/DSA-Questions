//   5. Write a function that checks if a given String, is a palindrome.

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = isPalindrome(str);
        String palindromeMessage = isPalindrome ? " is a palindrome" : " is not a palindrome";
        System.out.println(str + palindromeMessage);
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}







//   5. Write a function that checks if a given Number, is a palindrome.

 class Que5 {
    public static boolean isPalindrome(int number) {

        if (number < 0) {
            return false;
        }

        int originalNumber = number;

        int reversedNumber = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int num1 = 121;  

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
    }
}


