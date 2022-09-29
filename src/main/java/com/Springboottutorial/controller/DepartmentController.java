package com.Springboottutorial.controller;

import com.Springboottutorial.entity.Department;
import com.Springboottutorial.error.DepartmentNotFoundException;
import com.Springboottutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {


    private final Logger logger =
            LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
         logger.info("Inside saveDepartment of  DepartmentController ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        logger.info("Inside fetchDepartmentList of  DepartmentController ");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public  Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        logger.info("Inside fetchDepartmentById of  DepartmentController ");
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        logger.info("Inside deleteDepartmentById of  DepartmentController ");
          departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully ";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        logger.info("Inside updateDepartment of  DepartmentController ");
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName ){
        logger.info("Inside fetchDepartmentByName of  DepartmentController ");
        return departmentService.fetchDepartmentByName(departmentName);
    }


}
