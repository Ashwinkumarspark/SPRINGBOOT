package com.freshkite.TODO.DAL;

import com.freshkite.TODO.demoo.Todomodel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mongorepo extends MongoRepository<Todomodel , String> {


}
