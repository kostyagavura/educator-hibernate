package company;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private int floor;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "DepartamentId")
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(String name, String address, int floor) {
        this.name = name;
        this.address = address;
        this.floor = floor;
    }

    public void setEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", floor=" + floor +
                ", employees=" + employees +
                '}';
    }
}
