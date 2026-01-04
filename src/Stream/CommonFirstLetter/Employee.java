package Stream.CommonFirstLetter;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Employee
{

    private int empId;
    private String empName;
    private String department;
    private int salary;

    public Employee(int empId, String empName, String department,  int salary)
    {
        super();
        this.empId = empId;
        this.empName = empName;
        this.department =department ;
        this.salary = salary;

    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + department + ", status="
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
    public String getDeptId() {
        return department;
    }
    public void setDeptId(int deptId) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}