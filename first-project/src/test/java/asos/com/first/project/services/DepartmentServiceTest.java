package asos.com.first.project.services;

import asos.com.first.project.Entity.Department;
import asos.com.first.project.repo.DepartmentRepo;
import com.sun.tools.jconsole.JConsoleContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {
    @MockBean
    private DepartmentRepo departmentRepo;
    @Autowired
    private DepartmentService service;
    @BeforeEach
    void setUp() {
        Department department=Department.builder()
                .departid(1l).
                departName("3131").
                departAdress("kdkdk").
                departCode("12").build();
        Mockito.when(departmentRepo.findByDepartName("3131")).thenReturn(department);
    }
    @Test
    @DisplayName("get data base on name")
    public  void checkIfFindByNameIsWorkingORNot(){
        String name="3131";
        Department found= service.findByDepartName(name);

        assertEquals(name,found.getDepartName());
    }
}