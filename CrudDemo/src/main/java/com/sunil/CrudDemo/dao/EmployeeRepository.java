package com.sunil.CrudDemo.dao;

import com.sunil.CrudDemo.enity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    // now we use CRUD operation , no need to write the code that because of spring data jpa
}
