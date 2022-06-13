package S06_DefiningClasses.exercises.companyRoaster;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // name of department -> list of employees
        Map<String, List<Employee>> departmentsMap = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            String[] parameters = scanner.nextLine().split("\\s+");
            String name = parameters[0];
            double salary = Double.parseDouble(parameters[1]);
            String position = parameters[2];
            String department = parameters[3];
            Employee employee = null;
            // 6 parameters -> name, salary, position, department, email, age
            if(parameters.length == 6){
                String email = parameters[4];
                int age = Integer.parseInt(parameters[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }
            // 4 parameters -> name, salary, position, department
            else if(parameters.length == 4){
                employee = new Employee(name, salary, position, department);
            }
            // 5 parameters -> name, salary, position, department, email
            else if(parameters.length == 5){
                String fourthParameter = parameters[4];
                if(fourthParameter.contains("@")){
                    String email = fourthParameter;
                    employee = new Employee(name, salary, position, department, email);
                }
                else {
                    // 5 parameters -> name, salary, position, department, age
                    int age = Integer.parseInt(fourthParameter);
                    employee = new Employee(name, salary, position, department, age);
                }
            }

            // object Employee
            // employee with unknown department
            if(departmentsMap.containsKey(department)){
                departmentsMap.put(department , new ArrayList<>());
                departmentsMap.get(department).add(employee);
            }
            else {
                // employee with known department
                departmentsMap.get(department).add(employee);
            }
        }

        String maxAverageSalaryDepartment = departmentsMap.entrySet().stream()
                .max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue())))
                .get() // entry (department -> list of employees)
                .getKey();

        System.out.printf("Highest Average Salary: %s%n", maxAverageSalaryDepartment);
        List<Employee> employeeList = departmentsMap.get(maxAverageSalaryDepartment);
        employeeList.sort(Comparator.comparingDouble(employee -> employee.getSalary())); // ascending by salary
        Collections.reverse(employeeList); // descending order

        for(Employee employee : employeeList){
            System.out.println(employee);
        }

    }

    public static double getAverageSalary(List<Employee> employees){
        double sum = 0;
        for(Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }


}
