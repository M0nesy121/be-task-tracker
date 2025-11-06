package main.java.io.github.bokaicheng.taskcli;

import org.json.*;

import java.time.LocalDateTime;

public class Task {
  private int id;
  private String description;
  private Status status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public Task(int id, String description) {
    this.id = id;
    this.description = description;
    status = Status.TODO;
    createdAt = LocalDateTime.now();
    updatedAt = LocalDateTime.now();
  }

  public int getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public Status getStatus() {
    return status;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpDateAt() {
    return updatedAt;
  }

  public void setDescription(String description) {
    this.description = description;
    this.updatedAt = LocalDateTime.now();
  }

  public void setStatus(Status status) {
    this.status = status;
    this.updatedAt = LocalDateTime.now();
  }

  @Override
  public String toString() {
    return id + ". [" + status + "] " + description + " (created: " + createdAt + ")";
  }

}
