package problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinThreeFromList {

    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>(List.of(1,3,4,5,6,7,8,9,6,4,2,10,56,53,64));
        System.out.println(integerList.stream().sorted().limit(3).collect(Collectors.toList()));
        System.out.println(integerList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));
    }
}
