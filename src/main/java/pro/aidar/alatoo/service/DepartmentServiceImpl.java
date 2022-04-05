package pro.aidar.alatoo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.aidar.alatoo.entity.Department;
import pro.aidar.alatoo.repository.DepartmentRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

}
