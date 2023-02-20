package com.yulia.leotest.controller;

import com.yulia.leotest.dto.TestDto;
import com.yulia.leotest.entity.Test;
import com.yulia.leotest.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TestController {
  private final TestRepository repository;

  @QueryMapping(name = "testById")
  public Test getTestById(@Argument Long id) {
    return repository.findById(id).get();
  }

  @MutationMapping
  public Test addTest(@Argument(name = "input") TestDto testDto) {
    return repository.save(testDto.getTestEntity());
  }

}
