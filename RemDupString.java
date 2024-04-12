// 11. Write a function that removes duplicate characters from a given string.

import java.util.Arrays;

public class RemDupString {

    static String removeDuplicateCharacters(char[] str) {
        int index = 0;
        // Iterate through each character in the string
        for (int i = 0; i < str.length; i++) {
            boolean isDuplicate = false;
            
            // Check if the current character has occurred before
            for (int j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If the character is not a duplicate, add it to the result string
            if (!isDuplicate) {
                str[index++] = str[i];
            }
        }
        
        // Convert the resulting character array back to a string and return
        return String.valueOf(Arrays.copyOf(str, index));
    }

    public static void main(String[] args) {
        String inputString = "goodMorning";
        
        // Convert the input string to a character array
        char[] charArray = inputString.toCharArray();
        
        // Remove duplicates from the string and print the result
        String result = removeDuplicateCharacters(charArray);
        System.out.println("String with duplicates removed: " + result);
    }
}

// op - String with duplicates removed: godMnir
