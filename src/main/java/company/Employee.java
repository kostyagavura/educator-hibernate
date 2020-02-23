package company;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String surname;
    private String position;

    @ManyToMany
    private List<Department> departments = new ArrayList<>();
    public Employee() {
    }

    public Employee(String surname, String position) {
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
