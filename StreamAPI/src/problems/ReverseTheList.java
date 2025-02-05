package problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheList {

    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>(List.of(4,4,5,3,7,3,8,5,1,9,8,2,46));

        System.out.println(integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
