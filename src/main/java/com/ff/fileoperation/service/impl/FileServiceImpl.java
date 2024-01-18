package com.ff.fileoperation.service.impl;

import com.ff.fileoperation.dao.FileDao;
import com.ff.fileoperation.entity.Image;
import com.ff.fileoperation.exception.ImageNotFoundException;
import com.ff.fileoperation.service.FileService;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;


@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDao fileDao;
    @Override
    public ResponseEntity saveImage(MultipartFile file) throws IOException {

        Image image=new Image();
        image.setBytes(file.getBytes());
        image.setName(file.getOriginalFilename());
        fileDao.saveImage(image);
        return new ResponseEntity(Map.of("data",image), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<byte[]> getImage(String id) {
        Image image=fileDao.getImage(id);
        if(image!=null)
        {
            return ResponseEntity.status(HttpStatus.FOUND).contentType(MediaType.ALL).body(image.getBytes());

        }
        throw new ImageNotFoundException("Image id:"+id+" not exist");
    }
}
