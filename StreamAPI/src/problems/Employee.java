package problems;

import java.util.ArrayList;
import java.util.List;

public record Employee(int id,String name, int age, String designation,String gender) {



    public Employee(int id, String name, int age, String designation, String gender) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.gender = gender;

    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getGender() {
        return gender;
    }

    static class Data {

        public static List<Employee> getEmployeeList() {
            List<Employee> empList = new ArrayList<>();
            empList.add(new Employee(1, "Ravi", 35, "Manager", "Male"));
            empList.add(new Employee(2, "Monica", 26, "Tester", "Female"));
            empList.add(new Employee(3, "Rohit", 28, "Developer", "Male"));
            empList.add(new Employee(4, "Varun", 22, "Developer", "Male"));
            empList.add(new Employee(5, "Riya", 32, "Manager", "Female"));
            return empList;
        }
    }


}
