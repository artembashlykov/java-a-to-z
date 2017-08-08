package ru.abashlykov.start;

/**
 * Created by art on 08.03.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers){
        this.answers = answers;
        }
    public String ask(String question){
        return answers[position++];
    }

    public int ask(String question, int[] range){
//        throw new UnsupportedOperationException("Unsupported operation");
        return -1;
    }
}
