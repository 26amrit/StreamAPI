import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
    HashMap<Integer, String> empMap = new HashMap<>(Map.of(1, "Amrit", 2, "Singh"));
    String[] strArray = {"First", "Second", "Third", "Fourth"};

    public static void main(String[] args) {

        OptionalInt min = IntStream.of(2, 3, 5, 4, 6, 8, 7, 9).min();
        int min1 = IntStream.of(2, 3, 5, 4, 6, 8, 7, 9).min().orElse(0);
        OptionalLong max = LongStream.of(3, 5, 6, 7, 8, 9).max();
        long max1 = LongStream.of(3, 5, 6, 7, 8, 9).max().orElse(0);
        OptionalDouble avg = DoubleStream.of(3, 5, 5, 5, 6, 4, 3, 6, 8, 65, 5).average();

        Optional<Integer> listMin = intList.stream().min(Comparator.naturalOrder());
        intList.stream().forEach(System.out::println);
        System.out.println(intList.stream().findAny());
        System.out.println(intList.parallelStream().findAny());
        System.out.println(intList.stream().findFirst());
        System.out.println(intList.stream().allMatch(e -> e > 0));
        System.out.println(intList.stream().anyMatch(e -> e < 0));
        System.out.println(intList.stream().noneMatch(e -> e < 0));
        listMin.isEmpty();
        listMin.isPresent();
        listMin.get();
        listMin.orElse(0);

        Optional<String> optionalS = Optional.of("Amrit");
        Optional<String> optionalS1 = Optional.ofNullable(null);
        System.out.println(optionalS);
        System.out.println(optionalS1.orElse("no-value"));

        Optional<Integer> result = intList.stream().reduce((acc, n) ->
        {
            System.out.println("acc: " + acc + " n " + n);
            return acc * n;
        });

        Integer sum = intList.stream().reduce(10, (acc, n) -> acc + n);

        System.out.println(result);
        System.out.println(sum);

        List<String> stringList = new ArrayList<>(List.of("Java", "Is", "Awesome"));
        String newString = stringList.stream().reduce("", (acc, w) -> acc + " " + w);
        System.out.println(newString);

        List<String> stringList1 = new ArrayList<>(List.of("MicroServices", "Is", "Awesome"));
        String joinedString = stringList1.stream().collect(Collectors.joining(" "));

        Map<String, Integer> map = stringList.stream().collect(Collectors.toMap(s1 -> s1, s1 -> s1.length()));

        System.out.println(joinedString);
        System.out.println(map);

        List<Integer> integerList = Stream.of(1, 2, 3, 4).collect(Collectors.toList());
        System.out.println(integerList);

        System.out.println(stringList1.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet())));

        System.out.println(stringList.stream().collect(Collectors.partitioningBy(s -> s.contains("a"))));


        List<Employee> employees = Employee.Data.getEmployeeList();

        System.out.println(employees);

        //employees.stream().limit(2).forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 6).map(e -> e * 5).forEach(System.out::println);

        Stream.of("John", "Amrit").map(e -> e.toUpperCase()).forEach(System.out::println);

        employees.stream().limit(5).map(Employee::gender).forEach(System.out::println);

        System.out.println(employees.stream().map(Employee::country).distinct().toList());

        System.out.println(employees.stream().map(Employee::salary).distinct().count());

        System.out.println(employees.stream().filter(e -> e.gender().equals("F")).collect(Collectors.toSet()));

        OptionalDouble maxSal = employees.stream().filter(e -> e.gender().equals("F")).mapToDouble(Employee::salary).max();
        //System.out.println(maxSal);

        //employees.stream().limit(4).sorted(Comparator.comparingDouble(Employee::salary)).forEach(System.out::println);
        System.out.println(employees.stream().distinct().sorted(Comparator.comparingDouble(Employee::salary).reversed()).skip(1).findFirst());
        //employees.stream().

        String str = "AABBBCCCCC";
        System.out.println(str.chars().sorted().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));


    }
}