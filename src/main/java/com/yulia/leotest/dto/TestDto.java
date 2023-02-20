package com.yulia.leotest.dto;

import com.yulia.leotest.entity.Test;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestDto {
  private String name;
  private String description;
  private short courseId;
  private short authorId;

  public Test getTestEntity() {
    return new Test().setName(name)
        .setDescription(description)
        .setAuthorId(authorId)
        .setCourseId(courseId);
  }
}
