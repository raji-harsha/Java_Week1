package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Demo on equals and hashcode
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Overriding equals method to compare id's in Employee class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee myPojo = (Employee) o;
        return id == myPojo.id;
    }

    //Overriding hashcode method to return id hashcode only
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Raji");
        Employee emp2 = new Employee(2, "Harsha");
        Employee emp3 = new Employee(1, "Raji"); // Same ID as emp1

        Set<Employee> empSet = new HashSet<>();
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);

        System.out.println("Size of the set: " + empSet.size()); // Should be 2
    }
}
