package streams;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FilterColors {

    public static void main(String[] args) {

        List<String> colors= List.of("Red","Blue","Green","Pink","White","Black","Red");

        //Get unique colors in sorted upper cases those that don't have  "k"

        List<String> newColors= colors.stream()
                .map(v-> v.toUpperCase())
                .distinct()
                .filter(x->!x.contains("K"))
                //.dropWhile(x-> x.toLowerCase().contains("k"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newColors);;



    }

}
