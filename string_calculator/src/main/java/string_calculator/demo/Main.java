package string_calculator.demo;

import java.util.*;

public class Main {
    void run() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("write formula : ");
        String formula = scanner.nextLine();
        String[] splitStrings = formula.split(" ");

        calculator.calculate(splitStrings);

        System.out.print(findAnswer(splitStrings));
    }

    double findAnswer(String[] arrayContainsResult) {
        int indexOfAnswer = arrayContainsResult.length - 1;
        return Double.parseDouble(arrayContainsResult[indexOfAnswer]);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
