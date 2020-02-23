package company;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String surname;
    private String position;


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
