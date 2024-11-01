package com.sai.CrudMongo.repository;

import com.sai.CrudMongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,Long> {

}
