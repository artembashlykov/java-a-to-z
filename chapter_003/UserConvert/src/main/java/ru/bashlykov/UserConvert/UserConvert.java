package main.java.ru.bashlykov.UserConvert;

import java.util.HashMap;
import java.util.List;

public class UserConvert {

    public HashMap <Integer, User> process(List<User> list){
        HashMap<Integer, User> userMap = new HashMap<Integer, User>();

        for(int i = 0; i < list.size(); i++){
           userMap.put(i , list.get(i));
        }

        return userMap;
    }
}
