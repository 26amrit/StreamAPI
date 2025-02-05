package problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArray {

    public static void main(String[] args) {
        
        int[] ints={1,3,4,2,5,63,246,743,254,342};
        int[] ints1={234,54,543,5,7,35,3,355,64,25};

        System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(ints), Arrays.stream(ints1)).sorted().toArray()));
    }
}
