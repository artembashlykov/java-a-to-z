package ru.abashlykov.start;
import java.util.*;
/**
 * Created by art on 08.03.2017.
 */
public class ConsoleInput implements Input{
    private Scanner scanner = new Scanner(System.in);


    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
    public int ask(String question, int[] range){
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for(int value : range) {
            if (value == key) {
                exist = true;
                break;
            }

        }
        if (exist){
            return key;
        } else {
            throw new MenuOutException("Out of menu range");
        }
    }
}
