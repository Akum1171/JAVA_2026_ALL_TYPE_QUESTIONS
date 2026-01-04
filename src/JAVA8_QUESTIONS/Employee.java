package JAVA8_QUESTIONS;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Employee
{

    private int empId;
    private String empName;
    private int deptId;
    private String status="active";
    private int salary;

    public Employee(int empId, String empName, int deptId, String status, int salary)
    {
        super();
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.status = status;
        this.salary = salary;

    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", status=" + status
                + ", salary=" + salary + "]";
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    static void main(String[] args)
    {
        List<Employee> emplist=new ArrayList<>();

        emplist.add(new Employee(101,"Amit" , 101 ,"active", 2000));
        emplist.add(new Employee(102,"Rahul" , 104 ,"active", 5000));
        emplist.add(new Employee(103,"Mishra" , 102 ,"inactive", 25000));
        emplist.add(new Employee(105,"Vishal" , 101 ,"active", 45000));
        emplist.add(new Employee(106,"Bhanu" , 104 ,"inactive", 23000));
        emplist.add(new Employee(107,"Shivam" , 103 ,"active", 13000));
        emplist.add(new Employee(108,"Arman" , 104 ,"active", 11000));

        //Program 1 : Print Employee details based on Deptartment :
        Map<Integer,List<Employee>> employeebasedOnDept = emplist.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

        employeebasedOnDept.entrySet().forEach(entry->
        {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        });
        //
        //program 2: Write a program to print employee count working in each department
        Map<Integer,Long> employeeCountDepartment = emplist.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
        employeeCountDepartment .entrySet().forEach(entry->{
            System.out.println("Dept " + entry.getKey() + "--" + entry.getValue());
        });

        //Program 3: write a program to print active and inactive employee in the givenCollection

        long activeEmployeeCount=emplist.stream().filter(e->"active".equals(e.getStatus())).count();
        long inactiveEmployeeCount=emplist.stream().filter(e->"inactive".equals(e.getStatus())).count();

        System.out.println("Active employee count " +activeEmployeeCount);
        System.out.println("Inactive employee count " +inactiveEmployeeCount);

        //program 4: write a program to print Maximum and minimum employee salary from  the given collection
        Optional<Employee> maximumsalary= emplist.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> minimumsalary= emplist.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("Employee Maximum salary : "+maximumsalary);
        System.out.println("Employeee minimum salary : "+minimumsalary);

        //program 5:  write a program to print the maximum salary of an employee from each department
        Map<Integer,Optional<Employee>> topSalaryEmplDept=emplist.stream().collect(Collectors.groupingBy(Employee::getDeptId,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))
        ));
        topSalaryEmplDept.entrySet().forEach(entry->
        {
            System.out.println("dept " +entry.getKey()+ " top emp "+entry.getValue());
        });


       /* //find the name only  whose salary is 2nd highest
        Employ lis=empl.stream().sorted(Comparator.comparingDouble(Employ::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(lis);

        //find the second highest salary (here this way we can find maximum ,2nd ,3rd)
        List<Employ> ss = empl.stream().sorted(Comparator.comparingDouble(Employ::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(ss.get(1));*/

    }


}