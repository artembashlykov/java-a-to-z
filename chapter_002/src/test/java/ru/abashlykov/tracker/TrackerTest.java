//package ru.abashlykov.start;
//
//import ru.abashlykov.models.Item;
//import ru.abashlykov.models.Task;
//import java.util.Arrays;
//import org.junit.Test;
//import ru.abashlykov.start.Tracker;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.*;
//
//public class TrackerTest {
//
//    @Test
//    public void findByName(){
//        Tracker track = new Tracker();
//        track.add(new Task("testName", "testDesc"));
//        Item it = track.findByName("testName");
//        assertEquals("testName", it.getName());
//    }
//
//    @Test
//    public void delete()  {
//        Tracker del = new Tracker();
//        Item item1 = del.add(new Task("item1", "desc1"));
//        del.delete(item1);
//        assertNull(item1.getId());
//
//    }
//
////    @Test
////    public void update() {
////WORKING ON IT!!!
////        Tracker trUpdate = new Tracker();
////        Item item1 = trUpdate.add(new Task("updateName", "updateDesc"));
//
//
////        Item item2 = null;
////        for(int i = 0; i < trUpdate.getAll().length; i++) {
////            if(trUpdate.getAll()[i].getId().equals(item1.getId())){
////                trUpdate.update(trUpdate.getAll()[i]);
////                item2 = trUpdate.update(item1);
////            }
////        }
////        System.out.println(item1.getName());
////        System.out.println(item2.getName());
////        assertNotEquals(item1.getName(), item2.getName());
////    }
//
//    @Test
//    public void add() {
//        Tracker trAdd = new Tracker();
//        Item item1 = trAdd.add(new Task("item1", "desc1"));
//        String id = item1.getId();
//        assertNotNull(id);
//
//    }
//// НУЖНО ЛИ ТЕСТИРОВАТЬ? Т.К. это protected
//    @Test
//    public void findById() {
//        Tracker trFindId = new Tracker();
//        Item item1 = trFindId.add(new Task("item1", "desc1"));
//        Item item2 = trFindId.add(new Task("item2", "desc2"));
//        Item item3 = trFindId.add(new Task("item3", "desc3"));
//        String id = item3.getId();
//        Item item4 = trFindId.findById(id);
//        assertEquals(id, item4.getId());
//    }
//
//    @Test
//    public void generateId() {
//// Идентичен тесту метода add. А значит нафиг тут не нужен (???).
//        Tracker trAdd = new Tracker();
//        Item item1 = trAdd.add(new Task("item1", "desc1"));
//        String id = item1.getId();
//        assertNotNull(id);
//
//    }
//
//    @Test
//    public void getAll() {
//        Tracker trFindId = new Tracker();
//        Item[] allInOne = new Item[3];
//        Item item1 = trFindId.add(new Task("item1", "desc1"));
//        Item item2 = trFindId.add(new Task("item2", "desc2"));
//        Item item3 = trFindId.add(new Task("item3", "desc3"));
//
//        allInOne[0] = item1;
//        allInOne[1] = item2;
//        allInOne[2] = item3;
//
//        Item[] getAll = trFindId.getAll();
//
//        assertTrue("Arrays are equal", Arrays.equals(allInOne, getAll));
//
//
//
//    }
//
//}