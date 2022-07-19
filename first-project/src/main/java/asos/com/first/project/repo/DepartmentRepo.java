package asos.com.first.project.repo;

import asos.com.first.project.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
    public  Department findByDepartName(String string);
}
