package main.java.ru.abashlykov.convert;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {

    public List<Integer> toList(int[][] array){

        List<Integer> list = new ArrayList<>();
        for (int[] i : array){
            for(int j : i){
                list.add(j);
            }
        }
                return list;
    }
}
