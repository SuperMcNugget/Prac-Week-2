package org.example;

public class ToDoItem {
    private String description;
    private boolean isDone;

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public ToDoItem(String description){
        this.description = description;
        this.isDone = false;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}