package exerciciosBasicos;


public class ReverseString {

    public static String reverse(String revert) {
        if (revert == null) {
            return null;
        }
        if (revert.isEmpty()) {
            return "";
        }

        char[] revertChar = revert.toCharArray();
        int n = revertChar.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = revertChar[i];
            revertChar[i] = revertChar[n - i - 1];
            revertChar[n - i - 1] = temp;
        }
        return new String(revertChar);
    }
}
