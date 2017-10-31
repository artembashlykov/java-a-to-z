package test.java.ru.bashlykov.meter;


import main.java.ru.bashlykov.meter.TimeMeter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class TimeMeterTest {
    @Test
    public void WhenGetTimeOfInsertionShouldOrderResults(){
        long[] array = new long[100];
        int amount = array.length / 2;
        String[] sArray = new String[array.length];
        for(int i = 0; i < array.length; i++){
            array[i] = System.nanoTime();
        }
        for(int i = 0; i < array.length; i++){
            sArray[i] = String.valueOf(array[i]);
        }

        TimeMeter time = new TimeMeter();

        class Value{
            public long value;
            public String name;
            public Value(long value, String name){
                this.value = value;
                this.name = name;
            }

            public long getValue(){
                return this.value;
            }
            public String getName(){
                return this.name;
            }

            public void setValue(long value){
                this.value = value;
            }

        }

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        TreeSet<String> treeSet = new TreeSet<>();

        Value[] addingAction = new Value[3];

        addingAction[0] = new Value(time.add(arrayList, sArray), "ArrayList");
        addingAction[1] = new Value(time.add(linkedList, sArray), "LinkedList");
        addingAction[2] = new Value(time.add(treeSet, sArray), "TreeSet");

        Value[] removeAction = new Value[3];

        removeAction[0] = new Value(time.remove(arrayList, amount), "ArrayList");
        removeAction[1] = new Value(time.remove(linkedList, amount), "LinkedList");
        removeAction[2] = new Value(time.remove(treeSet, amount), "TreeSet");

        for(int i = addingAction.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if (addingAction[j].getValue() > addingAction[j + 1].getValue()){
                    long t = addingAction[j].getValue();
                    addingAction[j].setValue(addingAction[j + 1].getValue());
                    addingAction[j + 1].setValue(t);
                }
                }
            }
        for(int i = removeAction.length -1; i > 0; i-- ){
            for(int j =0; j < i; j++){
                if(removeAction[j].getValue() > removeAction[j + 1].getValue()){
                    long temp = removeAction[j].getValue();
                    removeAction[j].setValue(removeAction[j + 1].getValue());
                    removeAction[j + 1].setValue(temp);
                }
            }
        }

        System.out.println("Добавлеие элемента");

        for(Value val : addingAction){
            System.out.println(val.getName() + "\n" + val.getValue());

        }

        System.out.println("Удаление элемента");

        for(Value val : removeAction){
            System.out.println(val.getName() + "\n" + val.getValue());
        }

    }



    }
