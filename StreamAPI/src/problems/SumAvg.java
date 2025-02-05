package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumAvg {



    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>(List.of(1,2,3,4,53,543,4,3,45,5,6,3,2));

        System.out.println(integers.stream().reduce(Integer::sum).get());

        System.out.println(IntStream.range(1,101).reduce(Integer::sum).getAsInt());
        System.out.println(IntStream.range(1,101).sum());
        System.out.println(IntStream.range(1,1001).average().getAsDouble());

        System.out.println(integers.stream().mapToInt(Integer::intValue).average().getAsDouble());

        System.out.println(integers.stream().mapToInt(i->i).average().getAsDouble());

    }
}
