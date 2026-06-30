package EmployeeManagementSystem;

public class Main {

    public static void main(String[] args) {

        EmployeeManagement ems = new EmployeeManagement(10);

        ems.addEmployee(new Employee(101, "Ajay", "Software Engineer", 65000));
        ems.addEmployee(new Employee(102, "Rahul", "Tester", 50000));
        ems.addEmployee(new Employee(103, "Priya", "Manager", 90000));

        System.out.println();

        ems.displayEmployees();

        System.out.println("\nSearching Employee...");

        Employee emp = ems.searchEmployee(102);

        if (emp != null) {
            System.out.println("Employee Found");
            emp.display();
        } else {
            System.out.println("Employee Not Found");
        }

        System.out.println();

        ems.deleteEmployee(102);

        System.out.println();

        ems.displayEmployees();
    }
}