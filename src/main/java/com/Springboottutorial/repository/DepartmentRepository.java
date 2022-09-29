package com.Springboottutorial.repository;


import com.Springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department ,Long> {

    public Department findDepartmentsByDepartmentName(String departmentName);

    public Department findDepartmentsByDepartmentNameIgnoreCase(String departmentName);
}
