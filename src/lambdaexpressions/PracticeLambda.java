package lambdaexpressions;

public class PracticeLambda {

    public static void main(String[] args) {

        PrintValue print= a -> System.out.println("Hello"+a);

        print.printValue("Patel");

        Calculator calculate = (num1, num2)-> num1+num2;
        System.out.println(calculate.calculate(5,2));

        Calculator calculate2=(num1,num2)->num1-num2;
        System.out.println(calculate2.calculate(10,4));

        Calculator calculate3=(num1,num2)->num1*num2;
        System.out.println(calculate3.calculate(3,8));

        Condition condition=value -> value.startsWith("A");
        System.out.println(condition.applyCondition("Apple"));
        System.out.println(condition.applyCondition("Software"));

        Condition condition2=value -> value.length()==5;
        System.out.println(condition2.applyCondition("Selbi"));

    }


}
