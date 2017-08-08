package ru.abashlykov.start;
import ru.abashlykov.models.*;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];
    private int position = 0;

    public MenuTracker(Input input, Tracker tracker){
        this.input = input;
        this.tracker = tracker;
    }

      public void fillActions(){
        this.actions[position++] = new AddItem("Add item.", 0);
        this.actions[position++] = new MenuTracker.ShowItems("Show all items.", 1);
        this.actions[position++] = new EditItem("Edit item.", 2);
        this.actions[position++] = new DeleteItem("Delete item.", 3);
        this.actions[position++] = new FindItemByName("Find item by name.", 4);
        this.actions[position++] = new FindItemById("Find item by ID.", 5);
    }
    public void addAction(UserAction action){
          this.actions[position++] = action;

    }

    public void select(int key){
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show(){
        for (UserAction action : this.actions){
            if(action != null) {
                System.out.println(action.info());
            }
        }
    }


    private class AddItem extends BaseAction{
        public AddItem(String name, int key){
            super(name, key);
        }

        @Override
        public String name(){
            return this.name;
        }

        @Override
        public int key(){
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String name = input.ask("Please enter the task's name: ");
            String desc = input.ask("Please enter the task's desc: ");
            tracker.add(new Task(name,  desc));
        }

        @Override
        public String info(){
            return String.format("%s. %s", this.key(), this.name());
        }
    }

    private static class ShowItems extends BaseAction{
        public ShowItems(String name, int key){
            super(name, key);
        }

        @Override
        public String name(){
            return this.name;
        }

        @Override
        public int key(){
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker){
            for(Item item : tracker.getAll()){
                System.out.println(
                        String.format("%s. %s", item.getId(), item.getName())
                );
            }
        }

        @Override
        public String info(){
            return String.format("%s. %s", this.key(), this.name());
        }
    }

    class EditItem extends BaseAction {

        public EditItem(String name, int key) {
            super(name, key);
        }

        @Override
        public int key(){
            return this.key;
        }

        @Override
        public String name() {
            return this.name;
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String id =  input.ask("Please enter the task's ID: ");
            String name = input.ask("Please enter the task's name: ");
            String desc = input.ask("Please enter the task's desc: ");
            Task task = new Task(name, desc);
            task.setId(id);
            tracker.edit(task);
        }
        @Override
        public String info(){
            return String.format("%s. %s", this.key(), this.name());
        }


    }

    class DeleteItem extends BaseAction {
        public DeleteItem(String name, int key){
            super(name, key);
        }

        @Override
        public String name(){
            return this.name;
        }

        @Override
        public int key(){
            return this.key;
        }

        @Override
        public String info(){
            return String.format("%s. %s", this.key(), this.name());
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String id =  input.ask("Please enter the task's ID: ");
            tracker.delete(id);
        }


    }

    class FindItemByName extends BaseAction {
        public FindItemByName(String name, int key){
            super(name, key);
        }

        @Override
        public String name(){
            return this.name;
        }

        @Override
        public int key(){
            return this.key;
        }

        @Override
        public String info(){
            return String.format("%s. %s", this.key(), this.name());
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String name =  input.ask("Please enter the item's name: ");
            System.out.print("Task's name: \n "
                    +tracker.findByName(name).getName()+"\n"
                    +"Task's ID: \n "
                    + tracker.findByName(name).getId()+"\n"
                    +"Task's description: \n "
                    + tracker.findByName(name).getDescription()+"\n");
        }


    }

    class FindItemById extends BaseAction {
        public FindItemById(String name, int key){
            super(name, key);
        }

        @Override
        public String name(){
            return this.name;
        }

        @Override
        public int key(){
            return this.key;
        }

        @Override
        public String info(){
            return String.format("%s. %s", this.key(), this.name());
        }

        @Override
        public void execute(Input input, Tracker tracker){
            String id =  input.ask("Please enter the item's ID: ");
            System.out.print("Task's name: \n "
                    +tracker.findById(id).getName()+"\n"
                    +"Task's ID: \n "
                    + tracker.findById(id).getId()+"\n"
                    +"Task's description: \n "
                    + tracker.findById(id).getDescription()+"\n");
        }


    }
}
