package main.java.ru.abashlykov.task;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int itemIndex = 0;
        for (int i = 0; i < tasks.size(); i++ ){
            if(tasks.isEmpty()){
                break;
            }else if(tasks.get(i).getPriority() >= task.getPriority() | (i+1) == tasks.size()){
                itemIndex = i;
                break;
            }
        }
        tasks.add(itemIndex, task);
    }

    public Task take(){
        return this.tasks.poll();
    }
}


