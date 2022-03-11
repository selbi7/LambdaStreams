package lambdaexpressions;

import java.util.List;

public class FilterNames {

    public static void printNamesWithCondition(List<String> names, Condition condition){
        for(String name:names){
            if(condition.applyCondition(name)){
                System.out.println(name);
            }
        }
    }


    public static void main(String[] args) {
        List<String> names = List.of("Selbi","Arslan","Alisher","Fatima");
        printNamesWithCondition(names,value->value.length()==5);
        printNamesWithCondition(names,value -> value.contains("a"));
        printNamesWithCondition(names,value -> value.startsWith("S"));
        printNamesWithCondition(names,value -> value.equalsIgnoreCase("alisher"));
    }


}
