package problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {

        Integer[] ints=new Integer[]{1,2,3,4,4545,454,53,5,43,5365,4354};
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, ints.length).map(i -> ints[ints.length - 1]).toArray()));
        List<Integer> integerList=Arrays.asList(ints);

        integerList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
