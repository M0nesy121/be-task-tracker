package main.java.io.github.bokaicheng.taskcli;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    CliParser parser = new CliParser();
    parser.handle(args);
  }
}
