package test.java.ru.bashlykov.convertList;
import сonvertListToArray.main.java.ru.bashlykov.convertList.ConvertList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ConvertListTest {
    @Test

    public void WhenGivenArrayShouldReturnAList() {

        ConvertList c = new ConvertList();

        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7}};

        List<Integer> integerArrayList = c.toList(arr);
        int[][] resultArray = c.toArray(integerArrayList, 3);
         int[][] array2D = {
                 {1,2,3},
                 {4,5,6},
                 {7,0,0}
         };

         for(int i = 0; i < array2D.length; i++){
             for(int j = 0; j < array2D.length; j++){
                 assertThat(resultArray[i][j], is(array2D[i][j]));
             }
         }
    }

    @Test

    public void WhenGivenIstOfArraysShouldReturnSingleListOfIntegers() {
        ConvertList conv = new ConvertList();
        List<int[]> smth = new ArrayList<>();
        smth.add(new int[]{1,2,3});
        smth.add(new int[]{4,5,6,7});
        List<Integer> checkList = new ArrayList(Arrays.asList(1,2,3,4,5,6,7));
        List<Integer> returnSample = conv.convert(smth);

        for(int i = 0; i < returnSample.size(); i++){
            int first = checkList.get(i);
            int second = returnSample.get(i);
            assert(first == second);
        }


    }
}
