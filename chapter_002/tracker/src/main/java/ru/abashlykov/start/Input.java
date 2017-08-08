package ru.abashlykov.start;

/**
 * Created by art on 08.03.2017.
 */
public interface Input {
    String ask(String question);
    int ask(String question, int[] range);

}