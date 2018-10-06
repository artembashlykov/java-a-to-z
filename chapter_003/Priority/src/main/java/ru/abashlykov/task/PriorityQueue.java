package src.main.java.ru.abashlykov.task;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task){

        if(tasks.isEmpty()){
            tasks.add(task);
        } else if (!tasks.isEmpty()){
            for(Task element : tasks){
                if(element.getPriority() > task.getPriority()){
                    tasks.add(element.getPriority(), task);                }
            }
        }


    }

    public Task take(){
        return this.tasks.pollFirst();
    }


}
