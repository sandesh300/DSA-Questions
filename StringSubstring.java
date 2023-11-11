// 8. Write a function that checks if a given string contains a given substring. 
// The function should return true if the string contains the substring, and false otherwise.

public class StringSubstring {
 
    public static boolean checkString(String str, String subString)
    {
        return str.contains(subString);
    }

    public static void main(String[] args) {
        
        String str = "hello , world !";
        String subString = "Hello";
        if(checkString(str, subString))
        {
            System.out.println("String contain Substring ");
        }
        else
        {
            System.out.println("String doesnt contain Substring");
        }
    }

}
