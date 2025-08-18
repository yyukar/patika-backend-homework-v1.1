package week5.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmet","Ayse","Mehmet","Zeynep"));
        names.forEach(System.out::println);
    }
}
