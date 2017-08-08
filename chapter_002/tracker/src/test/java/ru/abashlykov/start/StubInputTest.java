package ru.abashlykov.start;
import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;

public class StubInputTest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        StubInput input = new StubInput(new String[]{"1", "Name1", "Desc1", "0"});
        new StartUI(input, tracker).init();
        Assert.assertThat(tracker.getAll()[0].getName(), is("Name1"));
    }
    @Test
    public void whenNameChangesItBecomesNew(){
        Tracker tracker = new Tracker();
        StubInput input = new StubInput(new String[]{"1","Name2", "Desc2","2","1","newName","newDesc","0"});
        new StartUI(input, tracker).init();
        Assert.assertThat(tracker.getAll()[0].getName(), is("newName"));
    }

    @Test
    public void whenDeletedShouldBeNull(){
        Tracker tracker = new Tracker();
        StubInput input = new StubInput(new String[]{"1","Name3", "Desc3","3","1","0"});
        new StartUI(input, tracker).init();
        Assert.assertNull(tracker.getAll()[0].getName());
    }
    @Test
    public void whenGivenNameShouldFindAnItem(){
        Tracker tracker = new Tracker();
        StubInput input = new StubInput(new String[]{"1","Name4", "Desc4","4","Name","0"});
        new StartUI(input, tracker).init();
        Assert.assertThat(tracker.findByName("Name4").getName(), is("Name4"));
    }
    @Test
    public void whenGivenIDShouldFindAnItem(){
        Tracker tracker = new Tracker();
        StubInput input = new StubInput(new String[]{"1","Name5", "Desc5","0"});
        new StartUI(input, tracker).init();
        Assert.assertEquals(tracker.findById(tracker.getAll()[0].getId()).getId(), (tracker.getAll()[0].getId()));
    }
    @Test
    public void shouldReturnAnArray(){
        Tracker tracker = new Tracker();
        StubInput input = new StubInput(new String[]{"1","Name6","Desc6","6","0"});
        new StartUI(input, tracker).init();
        int num = tracker.getAll().length;
        Assert.assertThat((num), is(1));
    }
}
