package asos.com.first.project.services;

import asos.com.first.project.Entity.Department;
import asos.com.first.project.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentImp  implements DepartmentService{

    @Autowired
   private DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepo.findAll();
    }

    @Override
    public Department getById(Long id) {
        return departmentRepo.findById(id).get();
    }

    @Override
    public String deleteById(Long id) {
        departmentRepo.deleteById(id);
        return "deleted";
    }

    @Override
    public String deleteByName(String name ) {
     if(departmentRepo.equals(name));

return  "deleted";

    }

    @Override
    public Department update(Long id ,Department department) {
        Department dp=departmentRepo.findById(id).get();
        System.out.println(dp.getDepartName());
        System.out.println(department.getDepartName());

        if(Objects.nonNull(department.getDepartName()) &&
                !"".equalsIgnoreCase(department.getDepartName()))
        {
            dp.setDepartName(department.getDepartName());

        }
        if(Objects.nonNull(department.getDepartCode()) &&
                !"".equalsIgnoreCase(department.getDepartCode()))
        {
            dp.setDepartCode(department.getDepartCode());
        }
        if(Objects.nonNull(department.getDepartAdress()) &&
                !"".equalsIgnoreCase(department.getDepartAdress()))
        {
            dp.setDepartAdress(department.getDepartAdress());
        }
        if(Objects.nonNull(department.getDepartEmail()) &&
                !"".equalsIgnoreCase(department.getDepartEmail()))
        {
            dp.setDepartEmail(department.getDepartEmail());
        }
        return departmentRepo.save(dp);
    }

    @Override
    public Department findByDepartName(String name) {
        return departmentRepo.findByDepartName(name);
    }


}
