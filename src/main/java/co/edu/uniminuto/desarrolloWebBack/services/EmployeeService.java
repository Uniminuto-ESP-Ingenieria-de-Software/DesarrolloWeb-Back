package co.edu.uniminuto.desarrolloWebBack.services;

import co.edu.uniminuto.desarrolloWebBack.model.Employee;
import co.edu.uniminuto.desarrolloWebBack.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository repository;

    @Override
    public List<Employee> getAll() {
        return (List<Employee>)repository.findAll();
    }

    @Override
    public Employee getById(Integer id) {
        return (Employee)repository.findById(id).get();
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void register(Employee employee) {
        repository.save(employee);
    }
}
