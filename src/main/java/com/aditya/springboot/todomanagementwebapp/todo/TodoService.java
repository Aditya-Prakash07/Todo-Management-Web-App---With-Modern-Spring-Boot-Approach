package com.aditya.springboot.todomanagementwebapp.todo;


import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;
    static{
        todos.add(new Todo(1, "Aditya", "Lean Devops", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1, "Aditya", "Lean Devops", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1, "Aditya", "Lean Devops", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1, "Aditya", "Lean Devops", LocalDate.now().plusYears(1),false));
    }
    public List<Todo> findByUsername(String username){
        return todos;
    }
}
