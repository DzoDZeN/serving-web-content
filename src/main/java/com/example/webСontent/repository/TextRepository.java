package com.example.webСontent.repository;
import com.example.webСontent.models.Texts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends CrudRepository<Texts, Long> {

}