package estruturaDados;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSortRandomArray() {
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testSortAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testSortReverseSortedArray() {
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testSortSingleElementArray() {
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }
}
