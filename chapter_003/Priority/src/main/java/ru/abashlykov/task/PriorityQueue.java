package src.main.java.ru.abashlykov.task;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
       if(tasks.isEmpty()){
           tasks.add(0, task);
       } else {
           for(Task element : tasks){
               if(element.getPriority() > task.getPriority()){
                   int numberOfElement = tasks.indexOf(element);
                   tasks.add(numberOfElement, task);
                   break;
               }
           }
       }
    }

    public Task take(){
        return this.tasks.poll();
    }
}


