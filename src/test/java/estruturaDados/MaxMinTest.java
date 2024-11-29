package estruturaDados;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxMinTest {
    @Test
    public void testMaxAndMin() {
        assertArrayEquals(new int[]{2, 8}, MaxMin.maxAndMin(new int[]{5, 3, 8, 4, 2}));
        assertArrayEquals(new int[]{1, 5}, MaxMin.maxAndMin(new int[]{1, 1, 1, 5}));
        assertArrayEquals(new int[]{-10, 100}, MaxMin.maxAndMin(new int[]{50, 100, -10, 0}));
        assertArrayEquals(new int[]{7, 7}, MaxMin.maxAndMin(new int[]{7}));
    }

}
