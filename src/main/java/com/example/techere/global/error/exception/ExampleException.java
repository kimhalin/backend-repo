package com.example.techere.global.error.exception;

import com.example.techere.global.error.ErrorCode;

public class ExampleException extends BusinessException {
  public ExampleException() {
    super(ErrorCode.EXAMPLE_USER_ERROR);
  }
}
