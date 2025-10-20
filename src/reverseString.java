public class reverseString {
    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--){
         char temp = s[i];
         s[i] = s[j];
         s[j] = temp;
        }
        for (int i = 0; i < s.length; i++){
            System.out.print(s[i]);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
