import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Sample dataset
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 35, "Engineering", 90000),
            new Employee("Bob", 28, "Marketing", 60000),
            new Employee("Charlie", 40, "Engineering", 110000),
            new Employee("David", 32, "HR", 70000),
            new Employee("Eve", 45, "Finance", 120000)
        );

        // Function to concatenate employee's name and department
        Function<Employee, String> nameDeptConcat = e -> e.getName() + " (" + e.getDepartment() + ")";

        // Generating a new collection with concatenated strings
        List<String> nameDeptList = employees.stream()
                                             .map(nameDeptConcat)
                                             .collect(Collectors.toList());

        // Printing the concatenated name and department list
        System.out.println("Concatenated Name and Department:");
        nameDeptList.forEach(System.out::println);

        // Calculating the average salary of all employees
        double averageSalary = employees.stream()
                                        .mapToDouble(Employee::getSalary)
                                        .average()
                                        .orElse(0.0);

        System.out.println("Average Salary: " + averageSalary);

        // Filtering employees whose age is above a certain threshold (e.g., 30 years)
        int ageThreshold = 30;
        List<Employee> filteredEmployees = employees.stream()
                                                    .filter(e -> e.getAge() > ageThreshold)
                                                    .collect(Collectors.toList());

        // Printing the filtered employees
        System.out.println("Employees older than " + ageThreshold + " years:");
        filteredEmployees.forEach(e -> System.out.println(e.getName() + ", " + e.getAge() + ", " + e.getDepartment() + ", " + e.getSalary()));
    }
}
