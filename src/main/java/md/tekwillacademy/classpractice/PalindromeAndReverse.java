package md.tekwillacademy.classpractice;

public class PalindromeAndReverse {

    public static boolean isPalindrome(String input) {
        char[] arr = input.toLowerCase().toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;

    }
    public static String reverseString(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }
}
