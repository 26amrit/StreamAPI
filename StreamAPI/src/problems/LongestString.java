package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LongestString {

    public static void main(String[] args) {
        String[] strings={"Java","is", "awesome"};
        System.out.println(Arrays.stream(strings).mapToInt(String::length).max().orElse(0));

        List<String> stringList=Arrays.asList(strings);
        System.out.println(stringList.stream().max(Comparator.comparingInt(str->str.length())).get());
    }
}
