package ru.bashlykov.UserConvert;

import java.util.HashMap;
import java.util.List;

public class UserConvert {

    public HashMap <Integer, User> process(List<User> list){
        HashMap<Integer, User> userMap = new HashMap<>();

        for(User users: list){
           userMap.put(users.getId(), users);
        }
        return userMap;
    }
}
