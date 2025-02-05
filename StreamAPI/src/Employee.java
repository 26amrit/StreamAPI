import java.util.ArrayList;
import java.util.List;

public record Employee(int jobId, String name, String gender, Double salary, String country) {

    public Employee(int jobId, String name, String gender, Double salary, String country) {
        this.jobId = jobId;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.country = country;
    }

    static class Data {
        public static List<Employee> getEmployeeList() {
            List<Employee> employeeList = new ArrayList<>();

            employeeList.add(new Employee(1, "Amrit", "M", 234567.0, "India"));
            employeeList.add(new Employee(2, "Aman", "M", 2564567.0, "India"));
            employeeList.add(new Employee(3, "Manjunath", "M", 234.0, "India"));
            employeeList.add(new Employee(4, "Kanchan", "F", 2345456567.0, "India"));
            employeeList.add(new Employee(5, "Suditi", "F", 2343453567.0, "India"));
            employeeList.add(new Employee(6, "Vikash", "M", 23455654667.0, "India"));

            return employeeList;

        }
    }
}
