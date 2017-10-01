package abashlykov;


import org.junit.Test;

import java.util.Arrays;

public class CircleArrayShiftTest {
    @Test
    public void WhenSetCirclesShouldReturnTheArray() {
        CircleArrayShift a = new CircleArrayShift();
        int[] arr = {1,2,3,4};
        int[] expectedArray = {3,4,1,2};
        a.shift(arr, 2);

        Arrays.equals(expectedArray, arr);
    }

}
