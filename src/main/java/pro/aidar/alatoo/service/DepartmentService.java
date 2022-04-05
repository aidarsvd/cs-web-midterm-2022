package pro.aidar.alatoo.service;

import pro.aidar.alatoo.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(Department department);
    List<Department> findAll();
}
