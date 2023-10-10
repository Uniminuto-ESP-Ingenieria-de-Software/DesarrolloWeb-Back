package co.edu.uniminuto.desarrolloWebBack.controller;

import java.util.List;
import co.edu.uniminuto.desarrolloWebBack.model.Employee;
import co.edu.uniminuto.desarrolloWebBack.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService service;
    @GetMapping("/api/employees")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/employees/{id}")
    public Employee getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/employees/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/employees")
    public void register(@RequestBody Employee employee) {
        service.register(employee);
    }
}
