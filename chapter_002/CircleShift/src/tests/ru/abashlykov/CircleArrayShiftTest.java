package ru.abashlykov;

import main.ru.abashlykov.CircleArrayShift;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


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
