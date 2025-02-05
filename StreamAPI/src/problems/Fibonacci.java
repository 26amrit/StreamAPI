package problems;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

        Stream.iterate(new long[]{0,1},f->new long[]{f[1],f[0]+f[1]}).limit(12).forEach(i-> System.out.println(i[0]+" "));
    }
}
