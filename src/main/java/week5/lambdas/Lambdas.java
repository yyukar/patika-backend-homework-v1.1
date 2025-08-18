package week5.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.replaceAll( n -> n * 2);
        numbers.forEach(n -> System.out.println(n));
    }
}
