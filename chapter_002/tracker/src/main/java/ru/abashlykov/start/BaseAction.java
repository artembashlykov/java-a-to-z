package ru.abashlykov.start;

/**
 * Created by art on 12.05.2017.
 */
public abstract class BaseAction implements UserAction {
    public String name;
    public int key;

    public BaseAction(String name, int key){
        this.name = name;
        this.key = key;
    }
    public String info(){
        return String.format("%s. %s", this.key(), "Edit the new item.");
    }
    public abstract int key();
    public abstract String name();


}
