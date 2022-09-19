package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { //<Class type, ID type>

    //find user by email
    //SELECT * FROM student WHERE email = ?
    //OR
    @Query("SELECT s FROM Student s WHERE s.email = ?1")//leave it or comment?
    Optional<Student> findStudentByEmail(String email);
}
