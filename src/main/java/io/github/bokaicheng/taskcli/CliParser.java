package main.java.io.github.bokaicheng.taskcli;

import java.io.IOException;

public class CliParser {
  TaskManager taskManager = new TaskManager();

  public void handle(String[] args) throws IOException {
    String cmd = args[0];

    if (cmd == "add") {
      taskManager.addTask(args[1]);
    }

    if (cmd == "update") {
      taskManager.updateTask(args[1], args[2]);
    }

    if (cmd == "delete") {
      taskManager.deleteTask(args[1]);
    }

    if (cmd == "mark-in-progress") {
      taskManager.markInProgress(args[1]);
    }

    if (cmd == "mark-done") {
      taskManager.markDone(args[1]);
    }

    if (cmd == "list") {
      if (args.length > 1) {
        taskManager.listTasks(args[1]);
      }
      taskManager.listTasks();
    }
  }

}
