package ru.abashlykov.start;

import java.util.ArrayList;

/**
 * Created by art on 08.03.2017.
 */
public class StubInput implements Input {
    private ArrayList<String> answers;
    private int position = 0;

    public StubInput(ArrayList<String> answers){
        this.answers = answers;
        }

    public String ask(String question){
        return answers.get(position++);
    }

    public int ask(String question, ArrayList<Integer> range){
        int answer = new Integer(answers.get(position++));
        return answer;
    }
}
