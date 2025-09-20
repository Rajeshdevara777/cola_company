package com.example.companies.Service;

import com.example.companies.Entity.WorkerEntity;
import com.example.companies.Repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repo;

    public void machine(WorkerEntity oil){
        repo.save(oil);
    }
    public List <WorkerEntity>getAllWorkers(){
       return repo.findAll();
    }
    public WorkerEntity getByID(Integer Id){
        return repo.findById(Id)
                .orElseThrow(() ->new RuntimeException("Worker not found"));
    }
}
