package src.main.java.ru.abashlykov.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {

    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();

        for(Person element: persons){
            if(element.getName().contains(key) | element.getSurname().contains(key) | element.getPhone().contains(key) |
                    element.getAddress().contains(key)){
                result.add(element);
            } else System.out.println("Did not found a shit!");
        }

        return result;
    }
}
