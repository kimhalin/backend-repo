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

    @PostMapping("/{isValid}")
    public ResponseEntity<ResultResponse> create(@PathVariable int isValid) {

        if (isValid == 0) {
            throw new BusinessException(ErrorCode.INPUT_INVALID_VALUE, "Reason why it isn't valid");
        }

        return ResponseEntity.ok(ResultResponse.of(ResultCode.GROUP_CREATE_SUCCESS));
    }
}
