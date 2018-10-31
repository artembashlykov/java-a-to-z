package main.java.ru.abashlykov.task;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
//       if(tasks.isEmpty()){
//           tasks.add(0, task);
//       } else {
//           for(Task element : tasks){
//               if(element.getPriority() > task.getPriority()){
//                   int numberOfElement = tasks.indexOf(element);
//                   tasks.add(numberOfElement, task);
//                   break;
//               }
//           }
//       }
//    for(Task element : tasks){
//
//        int taskIndex = tasks.indexOf(element);
//
//        if(tasks.isEmpty()){
//            tasks.add(0, task);
//            break;
//        }
//        if(element.getPriority() < task.getPriority()){
//            taskIndex++;
//        } else {
//            break;
//        }
//        if(element.getPriority() > task.getPriority() & tasks.indexOf(element) != 0){
//            taskIndex--;
//        } else {
//            break;
//        }
//        tasks.add(taskIndex, task);
//    }
//        int itemIndex = 0;
//        for (int i = 0; i <= tasks.size(); i++ ){
//            if(tasks.isEmpty()){
//                break;
//            }else if(tasks.get(i).getPriority() >= task.getPriority()){
//                itemIndex = i;
//                break;
//            } else if(tasks.get(i).getPriority() < task.getPriority() & tasks.size()-1 > i){
//                continue;
//            } else if(tasks.get(i).getPriority() < task.getPriority() & tasks.size()-1 == i) {
//               tasks.add(task);
//            }
//        }
//        tasks.add(itemIndex, task);
//        for(Task el : tasks){
//            System.out.println(el.getDesc());
//        }

    }

    public void vision(){

    }

    public Task take(){
        return this.tasks.poll();
    }
}


