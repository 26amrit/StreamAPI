package problems;

import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        String s="Amrit";
        System.out.println(IntStream.range(0,s.length()/2).noneMatch(i->s.charAt(i)!=s.charAt(s.length()-1)));
    }
}
