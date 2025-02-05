package problems;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main(String[] args) {

        String s="Aman is Software Engineer";
        String s1="Amrit";
        System.out.println(s1.chars().mapToObj(c->(char)c).sorted().map(String::valueOf).collect(Collectors.joining()));

        System.out.println(Arrays.stream(s.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));
    }
}
