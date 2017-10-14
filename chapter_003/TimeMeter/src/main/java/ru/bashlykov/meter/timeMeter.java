package main.java.ru.bashlykov.meter;

import java.util.*;

public class timeMeter {
    public static void main(String[] args) {
        String[] strArray = casualStringArray();
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("Testing ArrayList");
        System.out.println(add(arrayList, strArray));
        System.out.println(remove(arrayList));
        System.out.println("Testing LinkedList");
        System.out.println(add(linkedList, strArray));
        System.out.println(remove(linkedList));
        System.out.println("Testing TreeSet");
        System.out.println(add(treeSet, strArray));
        System.out.println(remove(treeSet));


    }

   public static String[] casualStringArray(){
        long[] array = new long[100];
        String[] sArray = new String[100];
        for(int i = 0; i < array.length; i++){
            array[i] = System.nanoTime();
        }
       for(int i = 0; i < array.length; i++){
           sArray[i] = String.valueOf(array[i]);
       }
       return sArray;
   }


    public static long add(Collection<String> collection, String[] lines){
        long start = System.nanoTime();
        for(String col : lines) {
            collection.add(col);
        }
        long traceTime = System.nanoTime() - start;

        return traceTime;
    }

    public static long remove(Collection<String> collection){
        long start = System.nanoTime();
        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
        }
        long traceTime = System.nanoTime() - start;
        return traceTime;
    }
}
