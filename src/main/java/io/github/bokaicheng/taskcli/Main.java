package main.java.io.github.bokaicheng.taskcli;

public class Main {
  public static void main(String[] args) {
    CliParser parser = new CliParser();
    parser.handle(args);
  }
}
