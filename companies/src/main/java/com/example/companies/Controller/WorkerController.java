package com.example.companies.Controller;

import com.example.companies.Entity.WorkerEntity;
import com.example.companies.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    private WorkerService serv;

    @PostMapping("/Api")
    public void product(@RequestBody WorkerEntity tax){
        serv.machine(tax);
    }
    @GetMapping("/Api1")
    public List <WorkerEntity>getAllWorkers(){
        return serv.getAllWorkers();
    }
    @GetMapping("/Api2/{ID}")
    public WorkerEntity getById(@PathVariable Integer ID){
        return serv.getByID(ID);
    }
}
