package lambdaexpressions;

@FunctionalInterface
public interface Condition {

    boolean applyCondition(String value);

}
