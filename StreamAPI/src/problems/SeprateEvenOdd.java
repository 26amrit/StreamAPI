package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeprateEvenOdd {

    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>(List.of(1,3,5,6,7,8,9,4,2,10,12));

        System.out.println(integerList.stream().collect(Collectors.partitioningBy(i->i%2==0)));

        List<Integer> integers=integerList.stream().filter(i->i%2==0).toList();
        System.out.println(integers);
        System.out.println(integers.stream().reduce(Integer::sum).get());

    }
}
