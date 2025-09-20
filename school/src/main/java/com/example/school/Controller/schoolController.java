package com.example.school.Controller;

import com.example.school.Entity.schoolEntity;
import com.example.school.Service.schoolService;
import jakarta.persistence.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class schoolController {

    @Autowired
    schoolService schoolservice;

    @PostMapping("/api")
    public void rings(@RequestBody schoolEntity schl){
        schoolservice.bell(schl);
    }
    @GetMapping("/api2")
    public List<schoolEntity>getAllStudents(){
        return schoolservice.getAllStudents();
    }
    @GetMapping("/api3/{id}")
    public schoolEntity getStudentById(@PathVariable Integer id) {
        schoolEntity student = schoolservice.getById(id);
        return student; // Return student if found
    }
    @PutMapping("/api4/{id}")
    public schoolEntity updateStudent(@PathVariable Integer id, @RequestBody schoolEntity updatedStudent) {
        schoolEntity student = schoolservice.updateById(id, updatedStudent);
        return student;
    }
    @DeleteMapping("/api5/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        schoolservice.deleteById(id);
        return ("Student with ID " + id + " has been deleted successfully.");
    }
    @DeleteMapping("/api6/deleteAllStudentIds")
    public String deleteAllStudentIds() {
        schoolservice.deleteAllStudentIds();
        return ("All student IDs have been deleted");
    }
}
