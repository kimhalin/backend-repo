package com.example.techere.domain.group.controller;

import com.example.techere.global.error.ErrorCode;
import com.example.techere.global.error.exception.BusinessException;
import com.example.techere.global.result.ResultCode;
import com.example.techere.global.result.ResultResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/groups")
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupController {

    @PostMapping
    public ResponseEntity<ResultResponse> create(@PathVariable int isValid) {

        // Validation 처리
        if (isValid == 0) {
            // Validation을 통과하지 못할 경우 Exception을 반환
            // exception occurs
            throw new BusinessException(ErrorCode.INPUT_INVALID_VALUE, "Reason why it isn't valid");
        }

        return ResponseEntity.ok(ResultResponse.of(ResultCode.GROUP_CREATE_SUCCESS));
    }
}
