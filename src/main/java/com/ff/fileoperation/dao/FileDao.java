package com.ff.fileoperation.dao;

import com.ff.fileoperation.entity.Image;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDao {

    void saveImage(Image image);

    Image getImage(String id);
}
