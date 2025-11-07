package main.java.io.github.bokaicheng.taskcli;

import org.json.*;

import java.time.LocalDateTime;

public class Task {
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
  public Task(int id, String description) {
    this.id = id;
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
  public static Task fromJSON(JSONObject obj) {
    int id = obj.getInt("id");
    String description = obj.getString("description");

    Task task = new Task(id, description);
    task.setStatus(Status.valueOf(obj.getString("status").toUpperCase()));
    task.setCreatedAt(LocalDateTime.parse(obj.getString("createdAt")));
    task.setUpdatedAt(LocalDateTime.parse(obj.getString("updatedAt")));

    return task;

  }

  /**
   * 
   * @return
   */
  public JSONObject toJSON() {

    JSONObject object = new JSONObject();
    object.put("id", id);
    object.put("description", description);
    object.put("status", status.toString());
    object.put("createdAt", createdAt.toString());
    object.put("updatedAt", updatedAt.toString());
    return object;
  }

}
