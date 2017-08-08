package ru.abashlykov.start;

/**
 * Created by art on 08.03.2017.
 */
public class StartUITest {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"create stub task"});
        new StartUI(input, tracker).init();
    }
}
