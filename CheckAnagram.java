public class CheckAnagram {

    public static boolean isAnagram(String str) {
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if (isAnagram(str)) {
            System.out.println("String is anagram");
        } else {
            System.out.println("String is not anagram");
        }
    }
}
