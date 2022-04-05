package pro.aidar.alatoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.aidar.alatoo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
