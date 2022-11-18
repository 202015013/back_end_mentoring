package string_calculator.demo;

public class Calculator extends Operator {

    public void calculate(String[] formula) {
        Double result = 0.0;
        for (int index = 0; index < formula.length; index++) {
            switch (formula[index]) {
                case "+":
                    result = plus(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = result.toString();
                    break;
                case "-":
                    result = subtract(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = result.toString();
                    break;
                case "*":
                    result = multiple(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = result.toString();
                    break;
                case "/":
                    result = divide(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = result.toString();
                    break;
                default:
                    break;
            }
        }
    }
}
