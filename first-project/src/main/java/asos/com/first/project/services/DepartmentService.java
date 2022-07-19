package asos.com.first.project.services;

import asos.com.first.project.Entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartment();
    public Department getById(Long id);

    String deleteById(Long id);

    String deleteByName(String name);

    Department update(Long id, Department department);

    Department findByDepartName(String name);
}
