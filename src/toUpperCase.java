public class toUpperCase {
    // Method to convert all lowercase English letters in a string to uppercase (without using built-in toUpperCase())
    public static String toUpperCaseMethod(String s) {
        // Create a StringBuilder to efficiently build the result string
        StringBuilder result = new StringBuilder();

        // Convert the input string to a character array and loop through each character
        for (char ch : s.toCharArray()) {
            // Check if the current character is a lowercase English letter ('a' to 'z')
            if (ch >= 'a' && ch <= 'z') {
                // If it is lowercase, convert to uppercase by subtracting 32 from its char code (ASCII/Unicode)
                // and append the resulting uppercase character to the StringBuilder
                result.append((char)(ch - 32));
            } else {
                // If not a lowercase English letter, append the character as-is
                result.append(ch);
            }
        }
        // Convert the StringBuilder to a string and return the result
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toUpperCaseMethod("hello"));
    }
}
