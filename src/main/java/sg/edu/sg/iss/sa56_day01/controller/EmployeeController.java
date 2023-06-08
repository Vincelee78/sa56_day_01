package sg.edu.sg.iss.sa56_day01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.sg.iss.sa56_day01.model.Employee;
import sg.edu.sg.iss.sa56_day01.service.EmployeeService;

// RequestMapping
//GetMapping (Retrieve List/single objects)
//PostMapping (Create new object)
//PutMapping (Update an existing object)


@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {
    
    @Autowired
    EmployeeService empSvc;

    // public EmployeeController(){
    //     empSvc=new EmployeeService();
    // }
    
    @GetMapping(value="/list")
    //@GetMapping(value="/")
    public @ResponseBody List<Employee> getEveryone(){
        return empSvc.getallEmployees();
    }

    @GetMapping(value="/filteredList")
    public @ResponseBody List<Employee> getEmployeeByLName(){
        return empSvc.getEmployeesbyLastName("Lin");
    }
}
