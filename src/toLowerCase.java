public class toLowerCase {
        public static String toLowerCase(String s) {
            StringBuilder result = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    result.append((char)(ch + 32));
                } else {
                    result.append(ch);
                }
            }
            return result.toString();
        }

    public static void main(String[] args) {
        System.out.println(toLowerCase("HELLO"));
    }
}
