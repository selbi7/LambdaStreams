package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamWithCustomObject {

    public static List<Product> products= new ArrayList<>();

    static {
        products.add(new Product("Carpet",8,999.0));
        products.add(new Product("Oval Carpet",9,689.0));
        products.add(new Product("Red Carpet",10,1200.0));
        products.add(new Product("Square Carpet",7,155.0));
        products.add(new Product("Blue Carpet",9,505.0));
    }

    public static void main(String[] args) {

        System.out.println(products);

        //Print products that has price more than 500
        System.out.println("Products with price more than 500");

        products.stream().filter(x->x.getPrice()>=500)
                .forEach(x-> System.out.println(x) );

        System.out.println("Print first two products");

        products.stream()
                .limit(2)
                .forEach(x-> System.out.println(x));

        System.out.println("Print only the names of products");
        products.stream()
                .forEach(x-> System.out.println(x.getName()));
        System.out.println("Product price which matches with condition ");
       boolean checkPrice= products.stream()
                .anyMatch(x->x.getPrice()==505.0);
        System.out.println(checkPrice);

        boolean checkName=products.stream()
                .allMatch(x->x.getName().toLowerCase().contains("carpet"));
        System.out.println(checkName);

        Map<String, Double> productsMap= products.stream()
                .collect(Collectors.toMap(Product::getName,Product::getPrice));
        System.out.println(productsMap);

        Map<String, Integer> productsMap2= products.stream()
                .collect(Collectors.toMap(Product::getName,Product::getRate));
        System.out.println(productsMap2);

    }

}
