package com.sunil.CrudDemo.rest;


//import com.sunil.CrudDemo.dao.EmployeeDAO;
import com.sunil.CrudDemo.enity.Employee;
import com.sunil.CrudDemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class employeeRestController {

//
//    private EmployeeDAO employeeDAO;
//
//    //quick dirty : inject employee dao (using constructor injection
//
//    public employeeRestController(EmployeeDAO thEmployeeDAO) {
//        employeeDAO = thEmployeeDAO;
//
//    }
//
//
//    // expose "/employee" to return the list of employee
//    @GetMapping("/employees")
//    public List<Employee> getEmployees() {
//        return employeeDAO.findAll();
//    }

    private EmployeeService employeeService;

    public employeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }
    @GetMapping("/Employee")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    // add mapping for employee/{employeeID}
    @GetMapping("/Employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found " + employeeId);
        }
        return theEmployee;
    }


    @PostMapping("/Employee")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        // force to set the id equals to 0 it will not update the database it will only create new
        // Forces the creation of a new employee instead of updating an existing one.
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;

    }
    @PutMapping("/Employee")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }
    @DeleteMapping("/Employee/{employeeID}")
    public String deleteEmployee(@PathVariable int employeeID) {
        Employee tempEmployee = employeeService.findById(employeeID);
        if (tempEmployee == null) {
            throw new RuntimeException("Employee id not found " + employeeID);
        }
        employeeService.deleteById(employeeID);
        return "Delete employee id : " + employeeID;
    }

}
