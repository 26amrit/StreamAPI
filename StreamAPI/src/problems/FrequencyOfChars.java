package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String s="SHDFGSDFVSDFDSGUFDFSDBFFHSDHFSVDDSGFDFVD";

        System.out.println(String.valueOf(s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))));

        LinkedHashMap<Character,Long> charCount=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(charCount.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null));
    }
}
