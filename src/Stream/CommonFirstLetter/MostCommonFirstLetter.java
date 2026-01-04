package Stream.CommonFirstLetter;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {
    static void main() {
        List<Employee> employees=List.of(
                new Employee(1,"Uohn","HR",6000),
                new Employee(2,"Alice","HR",55000),
                new Employee(3,"Aob","IT",75000),
                new Employee(4,"Carol","HR",80000),
                new Employee(5,"Cavid","Finance",64000),
                new Employee(6,"Eve","Operations",440000));

        Map<Character, Long> map=employees.stream()
                .map(e-> e.getEmpName().charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        Optional<Map.Entry<Character,Long>> max= map.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(max);
    }
}
