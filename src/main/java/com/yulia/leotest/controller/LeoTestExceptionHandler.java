package com.yulia.leotest.controller;


import static org.springframework.graphql.execution.ErrorType.BAD_REQUEST;
import static org.springframework.graphql.execution.ErrorType.INTERNAL_ERROR;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;

@Component
public class LeoTestExceptionHandler extends DataFetcherExceptionResolverAdapter {

  @Override
  protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
    ErrorType type = ex instanceof DataIntegrityViolationException ? BAD_REQUEST : INTERNAL_ERROR;

    return GraphqlErrorBuilder
        .newError(env)
        .message(ex.getMessage())
        .errorType(type)
        .build();
  }
}
