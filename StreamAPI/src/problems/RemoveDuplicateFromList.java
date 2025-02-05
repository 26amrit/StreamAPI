package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>(List.of(1,2,4,5,3,6,7,5,4,3,2,6,8,4));

        System.out.println(integers.stream().distinct().collect(Collectors.toList()));
    }
}
