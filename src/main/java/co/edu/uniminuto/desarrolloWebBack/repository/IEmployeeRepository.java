package co.edu.uniminuto.desarrolloWebBack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.edu.uniminuto.desarrolloWebBack.model.Employee;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
}
