package com.edwinramos.focustracker.repository;

import com.edwinramos.focustracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    //find by name
    Optional<Category> findByName(String name);

    //if exists a category
    boolean existsByName(String name);

}
