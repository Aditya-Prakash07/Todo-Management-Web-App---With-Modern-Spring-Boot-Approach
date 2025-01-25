package com.aditya.springboot.todomanagementwebapp.todo;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
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
