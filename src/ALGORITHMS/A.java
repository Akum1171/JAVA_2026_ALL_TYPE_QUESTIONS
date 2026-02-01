package ALGORITHMS;
/*
Using Streams, find the Employee with the maximum salary in the “IT” department.

Return it as Optional<Employee> to safely handle empty cases.

Then, convert the list of all employees into a Map<String, List<Employee>> grouped by department.

highest salary-
Map<String, Optional<Employee>> highestPaidByDept =
    employees.stream()
             .collect(Collectors.groupingBy(
                 Employee::getDepartment,
                 Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
             ));



 🎯 Question 16 – Java 8 Streams & Parallel

Given a list of numbers:

List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

 */

import java.util.Arrays;

public class A {
    static void main()
    {
        int a[] = {1, 2, 3, 4};
        int b[] = {4, 6, 7, 8};

        int alength=a.length;
        int blength=b.length;
        int clength=alength+blength;

        int c[]=new int[clength];
        for (int i=0;i<clength;i++){
            if(i<alength){
                c[i]=a[i];
            }else {
                c[i]=b[i-alength];
            }
            System.out.print(c[i]+ " ");
        }


    }
}