package exerciciosBasicos;

import exerciciosBasicos.FactorialRecursive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(120, FactorialRecursive.factorial(5));
        assertEquals(1, FactorialRecursive.factorial(0));
        assertEquals(1, FactorialRecursive.factorial(1));
        assertEquals(3628800, FactorialRecursive.factorial(10));
    }
}
