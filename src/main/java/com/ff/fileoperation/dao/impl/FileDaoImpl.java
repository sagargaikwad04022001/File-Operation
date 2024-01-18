package com.ff.fileoperation.dao.impl;

import com.ff.fileoperation.dao.FileDao;
import com.ff.fileoperation.entity.Image;
import com.ff.fileoperation.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileDaoImpl implements FileDao {

    @Autowired
    private FileRepository fileRepository;

    @Override
    public void saveImage(Image image) {
        fileRepository.save(image);
    }

    @Override
    public Image getImage(String id) {
        return fileRepository.findById(id).get();
    }
}
