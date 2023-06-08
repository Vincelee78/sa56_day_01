package sg.edu.sg.iss.sa56_day01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.sg.iss.sa56_day01.model.Employee;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<Employee>();
    
    public EmployeeService(){
        employees.add(new Employee("1", "abc", "Lee"));
        employees.add(new Employee("2", "def", "Lin"));
        employees.add(new Employee("3", "def", "Lin"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getallEmployees(){
        return this.employees;
    }
    public List<Employee> getEmployeesbyLastName(String lastName) {
        List <Employee> filterEmployees=employees.stream().filter(a->a.getLastName().equals(lastName)).toList();
        return filterEmployees;
    }
    }

