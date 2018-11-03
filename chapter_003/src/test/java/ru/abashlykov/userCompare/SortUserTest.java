package ru.abashlykov.userCompare;

import org.junit.Test;

import java.util.*;

import ru.abashlykov.userCompare.SortUser;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {

    @Test
    public void whenListUserThenReturnTreeSetUser() {

        SortUser sortUser = new SortUser();

        List<User> listUser = new ArrayList<>();
        listUser.add(new User("Marina", 14));
        listUser.add(new User("Vital", 27));
        listUser.add(new User("Andrew", 36));

        Set<User> userSet = new TreeSet<>();
        userSet.add(new User("Vital", 27));
        userSet.add(new User("Marina", 14));
        userSet.add(new User("Andrew", 36));

        assertThat(sortUser.sort(listUser), is(userSet));

    }

}
