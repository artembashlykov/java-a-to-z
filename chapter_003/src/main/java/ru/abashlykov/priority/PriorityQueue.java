package ru.abashlykov.priority;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int itemIndex = 0;
        for (Task t : tasks){
            if(t.getPriority() > task.getPriority()){
                break;
            }
            itemIndex++;
        }
        tasks.add(itemIndex, task);
    }

    public Task take(){
        return this.tasks.poll();
    }
}


