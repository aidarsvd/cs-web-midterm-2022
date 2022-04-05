package pro.aidar.alatoo.service;

import pro.aidar.alatoo.entity.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);
    List<Department> findAll();
    void deleteById(Long id);
}
