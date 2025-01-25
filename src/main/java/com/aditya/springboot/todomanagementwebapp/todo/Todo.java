package com.aditya.springboot.todomanagementwebapp.todo;

import java.time.LocalDate;
// will store these details in database
// first we will create static list of todos => Database (H2, MySQL)
public class Todo {
    public Todo(int id, String username, String description,  LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    private  int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
