package main.java.ru.bashlykov.convertList;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public List<Integer> toList(int [][] array){
        List<Integer> listOfIntegers = new ArrayList<>();
        for(int[] lines : array){
            for(int value : lines){
                listOfIntegers.add(value);
            }
        }
        return listOfIntegers;
    }

    public int[][] toArray(List<Integer> list, int row) {
        int listSize = list.size();
        int numOfRows = -1;

        while(listSize % row != 0) {
            listSize++;
        }
         numOfRows = listSize / row;

       int[][] array2D = new int[numOfRows][numOfRows];
       int array2DSize = array2D.length * array2D[0].length;
       int howMuchNulls = array2DSize - list.size();

       for(int i =0; i < howMuchNulls; i++){
           list.add(0);
       }

        for(int i = 0; i < numOfRows; i++){
           for(int j = 0; j < numOfRows; j++){
               array2D[i][j] = list.get(i*numOfRows+j);
           }
        }

        return array2D;
    }
}
