package com.ff.fileoperation.repository;

import com.ff.fileoperation.entity.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileRepository extends MongoRepository<Image,String> {

}
