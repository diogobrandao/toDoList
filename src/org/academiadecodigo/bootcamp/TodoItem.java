package org.academiadecodigo.bootcamp;


public class TodoItem implements Comparable<TodoItem> { //Todo list only accepts "TodoItem"

    private Importance importance;
    private int priority;
    private String item;

    public TodoItem(Importance importance, int priority, String item) {
        this.importance = importance;
        this.priority = priority;
        this.item = item;
    }




    @Override
    public int compareTo(TodoItem item) {

        if(importance.getValue() > item.importance.getValue()){
            return -1;
        }else if(importance.getValue() < item.importance.getValue()){
            return 1;
        }else if(importance.getValue() == item.importance.getValue()){
            if(priority < item.priority){
                return 1;
            } if(priority > item.priority) {
                return -1;
            }
        }
            {


            return 0;
        }

    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "importance=" + importance +
                ", priority=" + priority +
                ", item='" + item + '\'' +
                '}';
    }

    public Importance getImportance() {
        return importance;
    }


    public int getPriority() {
        return priority;
    }

    public String getItem() {
        return item;
    }

}
