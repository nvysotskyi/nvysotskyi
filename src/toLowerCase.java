public class toLowerCase {
        public static String toLowerCase(String s) {
            // We use StringBuilder to efficiently build up our result string
            StringBuilder result = new StringBuilder();

            // Convert the string to a character array so we can process each character one by one
            for (char ch : s.toCharArray()) {
            //  Checks if the character is between 'A' and 'Z'. This condition is true only for uppercase English letters
                if (ch >= 'A' && ch <= 'Z') {
            //  If it’s uppercase, convert it to lowercase.
            //  Adding 32 to an uppercase character’s code gives you the corresponding lowercase character.
            //  Example: 'C' is 67, 'c' is 99 ⇒ 67 + 32 = 99.
            //  We cast the result back to a char type for appending.
                    result.append((char)(ch + 32));
                } else {
            //  If it’s not an uppercase character, just add it directly.
                    result.append(ch);
                }
            }
            // return the Result
            // After the loop, the StringBuilder contains the fully converted string.
            return result.toString();
        }

    public static void main(String[] args) {
        System.out.println(toLowerCase("HELLO"));
    }
}
