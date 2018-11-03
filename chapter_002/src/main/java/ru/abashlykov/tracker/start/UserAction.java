package ru.abashlykov.start;

/**
 * Created by art on 11.04.2017.
 */
public interface UserAction {
    int key();
    void execute(Input input, Tracker tracker);
    String info();

}
