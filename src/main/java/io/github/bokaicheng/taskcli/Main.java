package main.java.io.github.bokaicheng.taskcli;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    CliParser parser = new CliParser();

    if (args.length < 1) {
      System.out.println("Usage: TaskCLIApp <command> [arguments]");
      return;
    }

    parser.handle(args);
  }
}
