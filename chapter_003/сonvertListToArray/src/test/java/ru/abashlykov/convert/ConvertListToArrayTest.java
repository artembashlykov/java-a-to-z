package test.java.ru.abashlykov.convert;

import java.util.Arrays;

import сonvertListToArray.main.java.ru.abashlykov.convert.ConvertList2Array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertListToArrayTest {
@Test
    public void when7ElementsThan9 (){

    ConvertList2Array list = new ConvertList2Array();
    int[][] result = list.toArray(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
    int[][] expect = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 0 ,0}
    };
    assertThat(result, is(expect));
}

}
