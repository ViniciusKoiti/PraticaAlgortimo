package exerciciosBasicos;

import exerciciosBasicos.PalindromeCheck;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeCheck.isPalindrome("radar"));
        assertFalse(PalindromeCheck.isPalindrome("hello"));
        assertTrue(PalindromeCheck.isPalindrome("a"));
        assertTrue(PalindromeCheck.isPalindrome(""));
    }
}
