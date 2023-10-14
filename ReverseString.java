public class ReverseString {
    public static String reverseString(String input) {
        // Check for null or empty string
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder reversed = new StringBuilder();

        // Iterate through the input string in reverse order and append characters to the StringBuilder
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String inputString = "hello";
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}
