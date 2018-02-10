package test.java.ru.bashlykov.UserConvert;

import main.java.ru.bashlykov.UserConvert.User;
import main.java.ru.bashlykov.UserConvert.UserConvert;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class UserConvertTest {
    @Test
   public void WhenGivenAListShouldReturnAMap(){
        UserConvert usCon = new UserConvert();
        List<User> userList = new ArrayList<>();
        userList.add(new User("Bob"));
        userList.add(new User("Rob"));
        userList.add(new User("Some grumpy fartman"));

        HashMap<Integer, User> returnResult =  usCon.process(userList);
        List<User> checkUserList = new ArrayList<>();

        for(HashMap.Entry<Integer, User> u : returnResult.entrySet()){
            checkUserList.add(u.getValue());
        }

        Assert.assertTrue(userList.containsAll(checkUserList));
    }
}
