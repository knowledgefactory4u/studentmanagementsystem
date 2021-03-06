package com.knf.sibin.dev.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.knf.sibin.dev.document.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
