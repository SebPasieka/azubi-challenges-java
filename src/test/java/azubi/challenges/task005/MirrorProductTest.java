package azubi.challenges.task005;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import azubi.challenges.task005.MirrorProduct;

public class MirrorProductTest {

    @Test
    public void digitOf1_should_return_9() {
        int given = 1;
        int expected = 9;

        int actual = MirrorProduct.findLargestMirrorProduct(given);
        assertEquals(actual, expected);
    }

    @Test
    public void digitOf2_should_return_9009() {
        int given = 2;
        int expected = 9009;

        int actual = MirrorProduct.findLargestMirrorProduct(given);
        assertEquals(actual, expected);
    }

    @Test
    public void digitOf3_should_return_906609() {
        int given = 3;
        int expected = 906609;

        int actual = MirrorProduct.findLargestMirrorProduct(given);
        assertEquals(actual, expected);
    }

    @Test
    public void digitOf4_should_return_99000099() {
        int given = 4;
        int expected = 99000099;

        int actual = MirrorProduct.findLargestMirrorProduct(given);
        assertEquals(actual, expected);
    }
}
