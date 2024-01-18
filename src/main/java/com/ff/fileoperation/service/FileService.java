package com.ff.fileoperation.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface FileService {
    ResponseEntity saveImage(MultipartFile file) throws IOException;

    ResponseEntity<byte[]> getImage(String id);
}
