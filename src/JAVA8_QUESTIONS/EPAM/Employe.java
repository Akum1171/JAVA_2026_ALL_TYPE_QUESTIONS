package JAVA8_QUESTIONS.EPAM;

import java.util.*;
import java.util.stream.Collectors;

public class Employe {

    private int id;
    private String name;
    private String department;
    private int salary;
    private int joiningYear;

    public Employe(int id, String name, String department, int salary, int joiningYear) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningYear = joiningYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", joiningYear=" + joiningYear +
                '}';
    }

    static void main() {

            //Ques1: group employees by department
            //question 2: within each department find the employe with highest salary
            //question 3 : from those top corners print only those who joined before 2020, sorted by salaryin descending order


            // ✅ Step 1: Create Employee Objects
            List<Employe> employees = Arrays.asList(
                    new Employe(1, "Amit", "IT", 90000, 2018),
                    new Employe(2, "Rohit", "IT", 120000, 2021),
                    new Employe(3, "Priya", "HR", 70000, 2017),
                    new Employe(4, "Neha", "HR", 85000, 2019),
                    new Employe(5, "Raj", "Finance", 110000, 2016),
                    new Employe(6, "Vikas", "Finance", 100000, 2020)
            );


            //Ques1: group employees by department
            Map<String, List<Employe>> employeesByDept =
                employees.stream().collect(Collectors.groupingBy(Employe::getDepartment));
            employeesByDept.forEach((dept, empList) ->
            System.out.println(dept+ " "+empList));

        System.out.println("=============================================");
        //question 2: within each department find the employe with highest salary
        Map<String, Optional<Employe>> highestSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employe::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employe::getSalary))));
        highestSalaryByDept.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp.get())
        );


        System.out.println("===============");
        //question 3 : from those top corners print only those who joined before 2020, sorted by salaryin descending order
        highestSalaryByDept.values().stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(e -> e.getJoiningYear() < 2020)
                .sorted(Comparator.comparingInt(Employe::getSalary).reversed())// reversed bcs they expecting reverse order once sort
                .forEach(System.out::println);



    }
}