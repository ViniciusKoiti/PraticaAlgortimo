package exerciciosBasicos;

import exerciciosBasicos.ReverseString;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        assertEquals("olleh", ReverseString.reverse("hello"));
        assertEquals("dlrow", ReverseString.reverse("world"));
        assertEquals("a", ReverseString.reverse("a"));
        assertEquals("", ReverseString.reverse(""));
        assertEquals("54321", ReverseString.reverse("12345"));
    }
}
