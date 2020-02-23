package company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class EducatorApplication {
//
//	@Autowired
//	private MyFirstRepository myFirstRepository;
//	@Autowired
//	private HumanRepository humanRepository;

	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Employee e1 = new Employee("First", "Junior");
		Employee e2 = new Employee("Second", "Middle");
		Employee e3 = new Employee("Third", "Senior");



		Department department = new Department("What", "What", 2);

		department.setEmployee(e1);
		department.setEmployee(e2);
		department.setEmployee(e3);


		departmentRepository.save(department);
		System.out.println(departmentRepository.findAll());

	}
}
