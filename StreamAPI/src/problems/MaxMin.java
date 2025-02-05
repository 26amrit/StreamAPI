package problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMin {

    public static void main(String[] args) {

        List<Integer> integers= new ArrayList<>(List.of(4,6,3,6,8,9,6,66,5,54,8,9));

        System.out.println(integers.stream().max(Comparator.naturalOrder()).get());
        System.out.println(integers.stream().min(Comparator.naturalOrder()).get());
    }
}
