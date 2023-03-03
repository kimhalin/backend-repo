package com.springboot.techere.global.error.exception;

import com.springboot.techere.global.error.ErrorCode;

public class ExampleException extends BusinessException {
  public ExampleException() {
    super(ErrorCode.EXAMPLE_USER_ERROR);
  }
}
