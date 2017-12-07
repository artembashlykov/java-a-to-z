package java.ru.bashlykov.convertList;
import main.java.ru.bashlykov.convertList.ConvertList;
import org.junit.Test;
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
}
