package com.example.Choco.Controller;

import com.example.Choco.Entity.kitentity;
import com.example.Choco.Service.kitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kitcontroller {
    @Autowired
    kitservice kitserv;

    @PostMapping
    public void smell( @RequestBody kitentity kit){
        kitserv.smell(kit);
    }
}
