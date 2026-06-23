package com.edwinramos.focustracker.repository;

import com.edwinramos.focustracker.model.Category;
import com.edwinramos.focustracker.model.Session;
import com.edwinramos.focustracker.model.Status;
import com.edwinramos.focustracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<Session,Long> {

    //find sessions for user
    List<Session> findByUser(User user);

    //find sessions for category
    List<Session> findByCategory(Category category);

    //find sessions for status
    List<Session> findByStatus(Status status);

    //find sessions after someone dates
    Session findByStartTimeAfter (LocalDateTime startTime);


}
