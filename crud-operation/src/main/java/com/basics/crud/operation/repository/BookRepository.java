package com.basics.crud.operation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.basics.crud.operation.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

}
