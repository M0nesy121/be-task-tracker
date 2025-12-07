package main.java.io.github.bokaicheng.taskcli;

import java.time.LocalDateTime;

public class Task {
  private static int lastId = 0;
  private int id;
  private String description;
  private Status status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  /**
   * 
   * @param id
   * @param description
   */
  public Task(String description) {
    this.id = lastId++;
    this.description = description;
    status = Status.TODO;
    createdAt = LocalDateTime.now();
    updatedAt = LocalDateTime.now();
  }

  /**
   * 
   * @return
   */
  public int getId() {
    return id;
  }

  /**
   * 
   * @return
   */
  public String getDescription() {
    return description;
  }

  /**
   * 
   * @return
   */
  public Status getStatus() {
    return status;
  }

  /**
   * 
   * @return
   */
  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * 
   * @return
   */
  public LocalDateTime getUpDateAt() {
    return updatedAt;
  }

  /**
   * 
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
    this.updatedAt = LocalDateTime.now();
  }

  /**
   * 
   * @param status
   */
  public void setStatus(Status status) {
    this.status = status;
    this.updatedAt = LocalDateTime.now();
  }

  /**
   * 
   * @param createdAt
   */
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 
   * @param updatedAt
   */
  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * 
   */
  @Override
  public String toString() {
    return id + ". [" + status + "] " + description + " (created: " + createdAt + ")";
  }

  /**
   * 
   * @param obj
   * @return
   */
  public static Task fromJSON() {
    return new Task(null);// TODO
  }

  /**
   * 
   * @return
   */
  public String toJSON() {
    String escapedDesc = description
        .replace("\\", "\\\\")
        .replace("\"", "\\\"");

    return String.format(
        "{\"id\":%d, \"description\" :\"%s\", \"status\":\"%s\", \"createdAt\":\"%s\", \"updatedAt\":\"%s\"}",
        id, escapedDesc, status, createdAt, updatedAt);

  }

}
