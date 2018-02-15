package ru.bashlykov.UserConvert;

public class User {
    private String name;
    private Integer id;

    public User(Integer id, String name){
        this.name = name;
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}

