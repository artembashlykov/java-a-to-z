package ru.abashlykov.userCompare;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {

    public Set<User> sort (List<User> list) {
        new Comparator<User>(){
            @Override
            public int compare(User o1, User o2){
                int compareAge = Integer.compare(o1.getAge(), (o2.getAge()));
                return compareAge;
            }
        };
        return new TreeSet<>(list);
    }
}