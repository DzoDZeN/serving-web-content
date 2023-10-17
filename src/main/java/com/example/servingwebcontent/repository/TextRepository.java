package com.example.servingwebcontent.repository;

import com.example.servingwebcontent.controllers.models.Texts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends CrudRepository<Texts, Long> {

}