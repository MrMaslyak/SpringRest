package com.maslyak.practicRest.repository;

import com.maslyak.practicRest.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long>{
}
