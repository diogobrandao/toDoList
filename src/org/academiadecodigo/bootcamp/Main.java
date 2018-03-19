package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {
    TodoList todoList = new TodoList();

    TodoItem todo = new TodoItem(Importance.HIGH,4, "clothes");
    TodoItem todo1 = new TodoItem(Importance.MEDIUM,3, "dishes");
    TodoItem todo3 = new TodoItem(Importance.LOW, 1,"study");
    TodoItem todo2 = new TodoItem(Importance.MEDIUM,2, "floors");


    todoList.add(todo1);
    todoList.add(todo);
    todoList.add(todo3);
    todoList.add(todo2);


        while(!todoList.isEmpty()){
        System.out.println(todoList.remove());
    }




    }
}
