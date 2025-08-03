package com.devgen.dao;

import com.devgen.model.Employee;




import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(long theId);

    Employee  save(Employee theEmployee);

    void deleteById(long theId);

}

