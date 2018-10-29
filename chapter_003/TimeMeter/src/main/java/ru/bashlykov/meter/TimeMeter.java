package сonvertListToArray.main.java.ru.bashlykov.meter;

import java.util.*;

public class TimeMeter {

    public static long add(Collection<String> collection, String[] lines){
        long start = System.nanoTime();
        for(String col : lines) {
            collection.add(col);
        }
        long traceTime = System.nanoTime() - start;

        return traceTime;
    }

    public static long remove(Collection<String> collection, int amount){
        long start = System.nanoTime();
        Iterator<String> iter = collection.iterator();
        while(iter.hasNext() && collection.size() > amount){
            iter.next();
            iter.remove();
        }
        long traceTime = System.nanoTime() - start;
        return traceTime;
    }
}
