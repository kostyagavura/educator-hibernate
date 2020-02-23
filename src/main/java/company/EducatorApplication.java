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
//		Car car = new Car("Passeraty", "WV", 2, 2, true);
//		myFirstRepository.saveAll(Collections.singletonList(car));
//		//Human human = new Human("Kostiantyn", "Gavura", new Address("Prudnicka", new PostCode("50-503"),"Wroclaw", "Polska"), LocalDate.of(1987, 2,21), Sex.MALE);
//
//		//humanRepository.save(human);
		Department department = new Department("What", "What", 2);

		Employee employee = new Employee("You", "Junior", department);
		department.setEmployee(employee);
		employeeRepository.save(employee);
		System.out.println(employeeRepository.findById(1L).get());

	}
}
