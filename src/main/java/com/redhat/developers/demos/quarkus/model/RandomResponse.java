package com.redhat.developers.demos.quarkus.model;

public class RandomResponse {
  private String id;

  public RandomResponse(String id) {
    this.id = id;
  }

  public String getId() { return id; }

  public void setId(String id) { this.id = id; }
}
