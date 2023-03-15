package com.example.techere.domain.file.controller;

import com.example.techere.domain.file.service.FileService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/files")
public class FileController {

  private final FileService fileService;

  @PostMapping()
  public ResponseEntity<List<String>> uploadFile(List<MultipartFile> multipartFiles) {
    return ResponseEntity.ok(fileService.uploadFile(multipartFiles));
  }
}
