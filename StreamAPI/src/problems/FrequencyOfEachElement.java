package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {

    public static void main(String[] args) {


        List<Integer> integerList=new ArrayList<>(List.of(2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,7,8,8,9,9,9,4,3,2,1,5,6,7,8,9));

        System.out.println(integerList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}
