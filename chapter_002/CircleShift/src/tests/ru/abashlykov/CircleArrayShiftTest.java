package ru.abashlykov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleArrayShiftTest {
    @Test
    public void WhenSetCirclesShouldReturnTheArray() {
        CircleArrayShift a = new CircleArrayShift();
        int[] arr = {1,2,3,4};
        int[] expectedArray = {3,4,1,2};
        a.shift(arr, 2);

        assertEquals(expectedArray, arr);
    }

}
