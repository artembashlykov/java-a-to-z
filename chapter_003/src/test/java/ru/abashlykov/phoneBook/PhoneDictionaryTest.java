package src.test.java.ru.abashlykov.search;

import org.junit.Test;
import src.main.java.ru.abashlykov.search.Person;
import src.main.java.ru.abashlykov.search.PhoneDictionary;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName(){
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Artem", "Bashlykov", "456589", "Belgorod"));
        List<Person> persons = phones.find("Art");
        assertThat(persons.iterator().next().getSurname(), is("Bashlykov"));
        System.out.println(persons.iterator().next().getName() +" "+ persons.iterator().next().getSurname() +" "+ persons.iterator().next().getPhone() +" "+
                persons.iterator().next().getAddress());
    }


}
