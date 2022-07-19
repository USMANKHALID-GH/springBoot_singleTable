package asos.com.first.project.Controller;

import asos.com.first.project.Entity.Department;
import asos.com.first.project.exceptions.DepartmentNotFound;
import asos.com.first.project.services.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    private  final Logger logger= LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;

    @PostMapping(path = "/saveDepartment")
    public Department saveDepartment(@Valid @RequestBody Department department){
        logger.info("POST REQUEST");
        return departmentService.saveDepartment(department);
    }
    @GetMapping(path = "getAll")
    public List<Department> getAllDepartment(){
        return  departmentService.getAllDepartment();
    }
    
    @GetMapping(path = "getAll/{Id}")
    public  Department getById(@PathVariable("Id") Long Id) throws DepartmentNotFound {
        return departmentService.getById(Id);
    }
    
    @DeleteMapping("deleteId/{id}")
    public String  deleteById(@PathVariable("id") Long id){
        return departmentService.deleteById(id);

}
      @DeleteMapping("deleteName/{name}")
    public String deleteByName(@PathVariable("name") String name){
        return departmentService.deleteByName(name);
      }
      @RequestMapping("update/{id}")
    public Department update(@PathVariable("id") Long id,@Valid @RequestBody Department department ){
        return  departmentService.update(id,department);
      }

      @GetMapping("getAll/name/{name}")
    public Department findByDepartName(@PathVariable("name") String name){
        return departmentService.findByDepartName(name);

      }

}
