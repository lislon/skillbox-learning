package com.objects;

import java.util.Collection;
import java.util.HashSet;

public class Department {
  private Integer id;
  private Integer headId;
  private String name;
  private String description;
  // Добавлено поле для связи one-to-one
  private Employee head;

  public Department() {
    //Used by Hibernate
  }

  public Department(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getHeadId() {
    return headId;
  }

  public void setHeadId(Integer headId) {
    this.headId = headId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Employee getHead() {
    return head;
  }

  public void setHead(Employee head) {
    this.head = head;
  }
}
