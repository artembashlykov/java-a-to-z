package ru.abashlykov.start;

import java.util.ArrayList;

/**
 * Created by art on 08.03.2017.
 */
public class StartUITest {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        ArrayList <String> arList = new ArrayList<>();
        arList.add("create stub task");
        Input input = new StubInput(arList);
        new StartUI(input, tracker).init();
    }
}
