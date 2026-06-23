package com.edwinramos.focustracker.repository;

import com.edwinramos.focustracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //Find to a user for email
    Optional<User> findByEmail(String email);

    //Find to a user for name
    List<User> findByName(String name);

    //If exists a user has someone email
    Boolean existsByEmail(String email);

}
