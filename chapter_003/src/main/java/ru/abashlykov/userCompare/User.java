package ru.abashlykov.userCompare;

public class User implements Comparable<User>  {

    String name;

    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }

}
