package com.example.techere.global.error.exception;

import com.example.techere.global.error.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
  private final ErrorCode errorCode;

  public BusinessException() {
    super(ErrorCode.INTERNAL_SERVER_ERROR.getMessage());
    this.errorCode = ErrorCode.INTERNAL_SERVER_ERROR;
  }

  public BusinessException(String message) {
    super(ErrorCode.INTERNAL_SERVER_ERROR.getMessage(message));
    this.errorCode = ErrorCode.INTERNAL_SERVER_ERROR;
  }

  public BusinessException(String message, Throwable cause) {
    super(ErrorCode.INTERNAL_SERVER_ERROR.getMessage(message), cause);
    this.errorCode = ErrorCode.INTERNAL_SERVER_ERROR;
  }

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.errorCode = errorCode;
  }

  public BusinessException(ErrorCode errorCode, String message) {
    super(errorCode.getMessage(message));
    this.errorCode = errorCode;
  }
}
