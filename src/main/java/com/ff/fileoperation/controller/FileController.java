package com.ff.fileoperation.controller;

import com.ff.fileoperation.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/image")
    public ResponseEntity saveImage(@RequestBody MultipartFile file) throws IOException {
        return fileService.saveImage(file);
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable String id) {
         return fileService.getImage(id);
    }
}
