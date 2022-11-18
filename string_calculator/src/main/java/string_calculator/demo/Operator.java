package string_calculator.demo;

public class Operator {
    protected double plus(String x, String y) {
        double num1 = Double.parseDouble(x);
        double num2 = Double.parseDouble(y);

        return num1 + num2;
    }

    protected double divide(String x, String y) {
        double num1 = Double.parseDouble(x);
        double num2 = Double.parseDouble(y);

        return num1 / num2;
    }

    protected double multiple(String x, String y) {
        double num1 = Double.parseDouble(x);
        double num2 = Double.parseDouble(y);

        return num1 * num2;
    }

    protected double subtract(String x, String y) {
        double num1 = Double.parseDouble(x);
        double num2 = Double.parseDouble(y);

        return num1 - num2;
    }
}
