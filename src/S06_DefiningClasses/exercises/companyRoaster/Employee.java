package S06_DefiningClasses.exercises.companyRoaster;

public class Employee {

    // mandatory
    private String name;
    private double salary;
    private String position;
    private String department;
    // optional
    private String email;
    private int age;

    // 4 parameters -> name, salary, position, department
    public Employee(String name, double salary, String position, String department){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = -1;
        this.email = "n/a";
    }
    // 6 parameters -> name, salary, position, department, email, age
    public Employee(String name, double salary, String position, String department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }
    // 5 parameters -> name, salary, position, department, email
    public Employee(String name, double salary, String position, String department, String email){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }
    // 5 parameters -> name, salary, position, department, age
    public Employee(String name, double salary, String position, String department, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + " ").append(salary + " ");

        if(email != null) stringBuilder.append(email + " ");
        else System.out.println("n/a ");

        if(age == 0) stringBuilder.append("-1");

        return "Method not finished";
    }

}
