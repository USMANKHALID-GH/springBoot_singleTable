package asos.com.first.project.Controller;

import asos.com.first.project.Entity.Department;
import asos.com.first.project.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping(path = "/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping(path = "getAll")
    public List<Department> getAllDepartment(){
        return  departmentService.getAllDepartment();
    }
    
    @GetMapping(path = "getAll/{Id}")
    public  Department getById(@PathVariable("Id") Long Id){
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
    public Department update(@PathVariable("id") Long id, @RequestBody Department department ){
        return  departmentService.update(id,department);
      }

      @GetMapping("getAll/name/{name}")
    public Department findByDepartName(@PathVariable("name") String name){
        return departmentService.findByDepartName(name);

      }

}
