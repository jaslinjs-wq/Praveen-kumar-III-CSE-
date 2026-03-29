package com.example.h2connections.Repositary;

import com.example.h2connections.dao.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
     extends JpaRepository<Student1, Integer> {

    Optional<Student1> findByName(String name);

    }


