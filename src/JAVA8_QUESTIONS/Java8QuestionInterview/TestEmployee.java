package JAVA8_QUESTIONS.Java8QuestionInterview;

import java.util.*;
import java.util.stream.Collectors;

class Emp
{
    private String name;
    private double salary;
    @Override
    public String toString() {
        return "Emp [name=" + name + ", salary=" + salary + ", age=" + age + ", organization=" + organization + "]";
    }
    public Emp(String name, double salary, int age, String organization) {
        super();
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.organization = organization;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    private int age;
    private String organization;
}

public class TestEmployee {

     static void main(String[] args) {
        ArrayList<Emp> em=new ArrayList<Emp>();
        em.add(new Emp("rahul", 23000, 25, "HR"));
        em.add(new Emp("Amit", 2302, 23, "IT"));
        em.add(new Emp("Snatosh", 45000, 21, "HR"));
        em.add(new Emp("Sanju", 29000, 27, "HR"));
        em.add(new Emp("Priya", 3000, 19, "Finance"));
        em.add(new Emp("Suraj", 34000, 19, "IT"));
        em.add(new Emp("Priya", 35400, 19, "Finance"));

        //print all detail whose salary is greater that 3000
        List<Emp> j=  em.stream().filter(e->e.getSalary()>3000).collect(Collectors.toList());
        System.out.println(j);

         System.out.println("---------------------------------------------------");

        //print only name whose salary is greater that 3000
        em.stream().filter(e->e.getSalary()>3000).map(e -> e.getName()).forEach(System.out::println);

         System.out.println("------------------------------------------------------");

        //print the no HOW MANY HR AND IT IN ORIGANIZATION
        Map<String,Long> r = em.stream().collect(Collectors.groupingBy(Emp::getOrganization,Collectors.counting()));
        System.out.println(r);

         System.out.println("-------------------------------------------------------");

        //print the name of the employee who is getting the minimum salary
        Optional<Emp> min= em.stream().min(Comparator.comparingDouble(Emp::getSalary));
        System.out.println(min);

         System.out.println("---------------------------------------------------------");

        //print the name of the employee who is getting the max salary
        Optional<Emp> max= em.stream().max(Comparator.comparingDouble(Emp::getSalary));
        System.out.println(max);

         System.out.println("-----------------------------------------------------------");

        //print the name of all employee from HR department .... if you you want particular name then use map if all detais then use collect()
        em.stream().filter(e->e.getOrganization().equalsIgnoreCase("hr")).map(Emp::getName).forEach(System.out::println);

         System.out.println("-------------------------------------------------------------");
        //print slaray who is working in IT depatement
        em.stream().filter(n->n.getOrganization().equalsIgnoreCase("it")).map(Emp::getSalary).forEach(System.out::println);

         System.out.println("--------------------------------------------------------------");
        //count the no of employee of each organization
        Map<String ,Long> q =   em.stream().collect(Collectors.groupingBy(Emp::getOrganization,Collectors.counting()));
        System.out.println(q);
         System.out.println("---------------------------------------------------------------");

        //print total salary
        Double totalSalary =  em.stream().collect(Collectors.summingDouble(Emp::getSalary));
        System.out.println("This is total salary: "+totalSalary);
        System.out.println("---------------------------------------------------------------");


         //print average salary
        Double avgSal = em.stream().collect(Collectors.averagingDouble(Emp::getSalary));
        System.out.println("Average salary is : "+avgSal);

         //find the name only  whose salary is 2nd highest
         Optional<Emp> emp=em.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).skip(1).findFirst();
         System.out.println(emp);

    }
}