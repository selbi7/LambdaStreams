package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsAggregateMethods {

    public static void main(String[] args) {

        //average, max, min, sum---aggregate functions in SQL
        // Find average price for products
        Double averagePrice=  StreamWithCustomObject.products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice));
        System.out.println(averagePrice);

        //Get max price
        Double maxPrice= StreamWithCustomObject.products.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)))
                        .get().getPrice();
        System.out.println(maxPrice);

        //Get min Price
        Double minPrice= StreamWithCustomObject.products.stream()
                .min(Comparator.comparing(Product::getPrice))
                .get().getPrice();
        System.out.println(minPrice);

        //Joining the names.
        String allProductNames= StreamWithCustomObject.products.stream()
                .map(x -> x.getName())
                .collect(Collectors.joining(","));//we can add comma here, to separate words
        System.out.println(allProductNames);

        //Grouping by Rate.. storing as a Map with key and value
        Map<String, List<Product>> groupedByRate=
                StreamWithCustomObject.products.stream()
                        .collect(Collectors.groupingBy(p->p.getRate()>=9 ? "High Rated": "Low Rated"));
        System.out.println(groupedByRate.get("High Rated"));
        System.out.println(groupedByRate.get("Low Rated"));



    }

}
