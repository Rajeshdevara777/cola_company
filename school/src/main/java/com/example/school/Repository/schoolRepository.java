package com.example.school.Repository;

import com.example.school.Entity.schoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface schoolRepository extends JpaRepository<schoolEntity,Integer> {

}
