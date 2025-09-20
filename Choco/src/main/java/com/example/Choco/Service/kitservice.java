package com.example.Choco.Service;

import com.example.Choco.Entity.kitentity;
import com.example.Choco.Repository.kitrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class kitservice {

    @Autowired
    kitrepository kitRepo;

    public void smell(kitentity kit){
        kitRepo.save(kit);
    }
}
