// 9. Write a function that removes all vowels from a given string.

public class RemoveVowels {
 
    public static String remVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String str = "Good Morning";
        String result = remVowel(str);

        System.out.println("After removing vowel ="+result);
    }
}
