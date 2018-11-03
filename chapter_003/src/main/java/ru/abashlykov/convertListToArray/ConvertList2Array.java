package сonvertListToArray.main.java.ru.abashlykov.convert;

import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows){
        int cells;

        if (list.size() % rows != 0) {
            cells = (list.size() / rows)+1;
        } else {
            cells = list.size() / rows;
        }
        int[][] array = new int[rows][cells];

        int listIndex = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (listIndex < list.size()) {
                    array[i][j] = list.get(listIndex++);
                } else {
                    break;
                }
            }
        }
        for(int[] i : array){
            for(int j : i){
                System.out.println(j);
            }
        }
        return array;
    }

}
