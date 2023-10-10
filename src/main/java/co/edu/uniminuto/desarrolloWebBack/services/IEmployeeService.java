package co.edu.uniminuto.desarrolloWebBack.services;

import co.edu.uniminuto.desarrolloWebBack.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();

    Employee getById(Integer id);

    void remove(Integer id);

    void register(Employee employee);
}
