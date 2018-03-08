package ru.abashlykov.start;
import org.junit.Test;
import org.junit.Assert;
import ru.abashlykov.models.Item;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StubInputTest {
    Tracker tracker = new Tracker();
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("0");
        arList.add("Name1");
        arList.add("Desc1");
        arList.add("n");
        arList.add("4");
        arList.add("Name1");
        arList.add("y");
        StubInput input = new StubInput(arList);
        new StartUI(input, tracker).init();
    }
    @Test
    public void whenNameChangesItBecomesNew(){
        Tracker tracker = new Tracker();
       Item previous = new Item("name1", "desc1", "1234");
       tracker.add(previous);
       Item newItem = new Item("name2", "desc2", "1235");
       newItem.setId(previous.getId());
       tracker.edit(previous.getId(),newItem);
        assertThat(tracker.findById(previous.getId()).getName(), is("name2"));


    }

    @Test
    public void whenDeletedShouldBeNull(){
        Tracker tracker = new Tracker();
        Item newIt = new Item("name2", "desc2", "123");
        tracker.add(newIt);
        tracker.delete(newIt.getId());
        Assert.assertNull(tracker.getAll().get(0).getName());
    }
    @Test
    public void whenGivenNameShouldFindAnItem(){
        Tracker tracker = new Tracker();
        ArrayList<String> arList = new ArrayList<>();
        arList.add("0");
        arList.add("Name4");
        arList.add("Desc4");
        arList.add("n");
        arList.add("4");
        arList.add("Name4");
        arList.add("y");
        StubInput input = new StubInput(arList);
        new StartUI(input, tracker).init();
    }
    @Test
    public void whenGivenIDShouldFindAnItem(){
        Tracker tracker = new Tracker();
        Item item = new Item("name5", "desc5");
        tracker.add(item);
        String id = tracker.findById(item.getId()).getId();
        assertThat(id, is(tracker.getAll().get(0).getId()));
    }
    @Test
    public void shouldReturnAnArray(){
        Tracker tracker = new Tracker();
        Item item = new Item("name6", "desc6");
        tracker.add(item);
        int num = tracker.getAll().size();
        assertThat((num), is(1));
    }
}
