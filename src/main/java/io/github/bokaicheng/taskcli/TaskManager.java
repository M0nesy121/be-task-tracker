package main.java.io.github.bokaicheng.taskcli;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TaskManager {
    private final Path FILE_PATH = Path.of("task.json");
    private List<Task> tasks;

    public void saveTasks() {
        StringBuilder sb = new StringBuilder();
        // TODO: convert into JSON and then store
    }

    public void addTask(String des) throws IOException {
        Task newTask = new Task(des);
        tasks.add(newTask);
        System.out.println("Task added successfully (ID: " + newTask.getId() + ")");
    }

    public void updateTask(String id, String new_descrption) {
        // TODO:find the task with excepted id from tasks and reset its description
    }

    public void deleteTask(String id) {
        // TODO: find the task with excepted id from tasks and remove it
    }

    public void markInProgress(String id) {
        // TODO:
    }
}
