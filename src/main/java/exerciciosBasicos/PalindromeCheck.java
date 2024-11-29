package exerciciosBasicos;

public class PalindromeCheck {

    public static boolean isPalindrome(String palindrome){
        char[] charPalindrome = palindrome.toCharArray();
        int size = charPalindrome.length - 1;
        for (int i = 0; i < size / 2; i++) {
            char left = charPalindrome[i];
            char right = charPalindrome[size - i];

            if(left != right){
                return false;
            }
        }
        return true;
    }
}
