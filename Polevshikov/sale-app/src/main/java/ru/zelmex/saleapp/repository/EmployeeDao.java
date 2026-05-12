package ru.zelmex.saleapp.repository;
import ru.zelmex.saleapp.model.Employee;
public class EmployeeDao extends BaseDao<Employee> {
    public EmployeeDao() {
        super(Employee.class);
    }
}