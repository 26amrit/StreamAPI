package problems;

import java.util.ArrayList;
import java.util.List;

public class CommonElementList {

    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>(List.of(1,2,3,54,3,53,4,5,3,2,5,3));
        List<Integer> integers=new ArrayList<>(List.of(1,3,4,5,4,5,3,5,3,3,53,43));
        integerList.stream().filter(integers::contains).forEach(System.out::println);
    }
}
