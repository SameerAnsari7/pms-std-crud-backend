package com.sameer.student.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sameer.student.entity.student;

@Repository
public interface studentrepository extends JpaRepository<student, Integer> {

}







