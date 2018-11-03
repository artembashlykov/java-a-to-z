package ru.bashlykov.UserConvert;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class UserConvertTest {
    @Test
   public void WhenGivenAListShouldReturnAMap(){
        UserConvert usCon = new UserConvert();
        List<User> userList = new ArrayList<>();
        userList.add(new User(0,"Bob"));
        userList.add(new User(1,"Rob"));
        userList.add(new User(2,"Some grumpy man"));

        HashMap<Integer, User> returnResult =  usCon.process(userList);
        List<User> checkUserList = new ArrayList<>();

        for(HashMap.Entry<Integer, User> u : returnResult.entrySet()){
            checkUserList.add(u.getValue());
        }

        Assert.assertTrue(userList.containsAll(checkUserList));
    }
}
