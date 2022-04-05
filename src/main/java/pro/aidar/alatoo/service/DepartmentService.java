package pro.aidar.alatoo.service;

import pro.aidar.alatoo.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> findAll();
    Optional<Department> findById(Long id);
}
