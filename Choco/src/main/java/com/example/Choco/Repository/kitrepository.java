package com.example.Choco.Repository;

import com.example.Choco.Entity.kitentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kitrepository extends JpaRepository<kitentity,Integer> {
}
