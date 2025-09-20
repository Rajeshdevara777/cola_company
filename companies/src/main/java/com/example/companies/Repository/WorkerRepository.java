package com.example.companies.Repository;

import com.example.companies.Entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository  extends JpaRepository<WorkerEntity,Integer> {
}
