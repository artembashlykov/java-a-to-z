package src.main.java.ru.abashlykov.convert;

import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows){
        int cells = -1;
        int listSize = list.size();

        if(listSize % rows != 0){
            cells = listSize +1 / rows;
        } else {
            cells = listSize / rows;
        }

        int[][] array = new int[rows][cells];

        int listIndex = -1;

        for (int[] item1 : array){
            for(int item2 : item1){
                item2 =
            }
        }

        return array;
    }

}
