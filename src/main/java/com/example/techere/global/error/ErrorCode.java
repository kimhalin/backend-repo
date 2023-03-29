package com.example.techere.global.error;

import java.util.Optional;
import java.util.function.Predicate;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/** {주체}_{이유} message 는 동사 명사형으로 마무리 */
@Getter
@RequiredArgsConstructor
public enum ErrorCode {
  // Global
  INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "E001", "서버 오류"),
  INPUT_INVALID_VALUE(HttpStatus.BAD_REQUEST, "E002", "잘못된 입력"),

  // 예시
  // User 도메인
  EXAMPLE_USER_ERROR(HttpStatus.BAD_REQUEST, "U001", "테스트용 예시 에러코드"),
  ;

  private final HttpStatus status;
  private final String code;
  private final String message;

  public String getMessage(Throwable e) {
    return this.getMessage(this.getMessage() + " - " + e.getMessage());
    // 결과 예시 - "Validation error - Reason why it isn't valid"
  }

  public String getMessage(String message) {
    return Optional.ofNullable(message)
        .filter(Predicate.not(String::isBlank))
        .orElse(this.getMessage());
  }

  @Override
  public String toString() {
    return String.format("%s (%d)", this.name(), this.getCode());
  }
}
