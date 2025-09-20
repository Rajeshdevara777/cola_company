package com.example.school.Service;

import com.example.school.Entity.schoolEntity;
import com.example.school.Repository.schoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class schoolService {

    @Autowired
    schoolRepository schoolrepository;

    public void bell(schoolEntity school){
        schoolrepository.save(school);
    }
    public List<schoolEntity>getAllStudents(){
        return schoolrepository.findAll();
    }
    public schoolEntity getById(Integer id) {
        return schoolrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }
    public schoolEntity updateById(Integer id, schoolEntity updatedStudent) {
        return schoolrepository.findById(id)
                .map(existingStudent -> {
                    existingStudent.setName(updatedStudent.getName());
                    existingStudent.setLastname(updatedStudent.getLastname());
                    existingStudent.setSection(updatedStudent.getSection());
                    return schoolrepository.save(existingStudent);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
}
public void deleteById(Integer id) {
    if (!schoolrepository.existsById(id)) {
        throw new RuntimeException("Student not found with ID: " + id);
    }
    schoolrepository.deleteById(id);
}
    public void deleteAllStudentIds() {
        schoolrepository.deleteAll();  // This will delete all records in the student table
    }

    }

