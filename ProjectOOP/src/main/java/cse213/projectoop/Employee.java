package cse213.projectoop;

public class Employee extends User {
    private String dept;
    private Float salary;
    public Employee(String name, String password, String email, String phoneNumber, String type, String dept){
        super(name, password,email, phoneNumber, type);
        this.dept = dept;

    }

    public Employee(String id, String name, String password, String email, String phoneNumber, String dept, Float salary) {
        super(id, name, password, email, phoneNumber);
        this.dept = dept;
        this.salary = salary;
    }

    public static boolean loginButtonOnAction(String id, String password) {

    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
