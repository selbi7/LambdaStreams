package lambdaexpressions;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ReadyFunctionalInterfaces {

    public static void main(String[] args) {

        //It is an interface with method
        Predicate<String> predicate= a->a.contains("b");
        System.out.println(predicate.test("Selbi"));

        BiPredicate<String, Integer> biPredicate=(x,y)-> x.length()==y;
        System.out.println(biPredicate.test("Selbi",5));

        Consumer <Integer>consumer= x-> System.out.println(x);
        consumer.accept(10);

        Consumer <Integer> consumer2= x->{
            if(x>=5) System.out.println(x);
        };
        consumer2.accept(2);

        List<Integer> numbers=List.of(4,3,5,2,2,8);

        printNumberWithCondition(numbers,a->a%2==0);
        printNumberWithCondition(numbers,a->a%2==1);


    }

    public static void printNumberWithCondition(List<Integer> numbers, Predicate<Integer> predicate){

        for(Integer n: numbers){
            if(predicate.test(n)){
                System.out.print(n);
            }
        }

    }

}
