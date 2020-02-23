package company;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private int floor;
    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;

    public Department() {
    }

    public Department(String name, String address, int floor) {
        this.name = name;
        this.address = address;
        this.floor = floor;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", floor=" + floor + employee+
                '}';
    }
}
