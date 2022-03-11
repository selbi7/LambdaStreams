package streams;

import java.util.List;
import java.util.stream.Collectors;

public class BasicStreams {
    public static void main(String[] args) {

        List<Integer> numbers= List.of(9,6,4,3,2,12,9,3);

        long numberOfElements=numbers.stream().count();
        System.out.println(numberOfElements);

        long numberOfUniqueElements= numbers.stream()
                .distinct() //numbers will be converted to steam and get unique numbers;
                .count();
        System.out.println(numberOfUniqueElements);

        List<Integer> uniqueNumbers= numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);

        List<Integer> oddNumbers= numbers.stream()
                .filter(x-> x%2==1)
                .filter(x-> x>=5)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(oddNumbers);
    }


}
