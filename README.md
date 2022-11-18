# back_end_mentoring
since 2022/5 ~

string_calculator
=================

기능 요구사항
------------
- 입력받은 문자열 공백(" ") 기준으로 split
- split된 문자열 배열에서 연산자( +,-,*,/ ) 탐색
- 주어진 연산자와 값들를 이용해 계산된 값을 return
- 연산자에 맞게 양 옆 값를 이용해 계산된 값을 연산자의 index + 1에 저장
- 문자열 배열 마지막 index의 값 추출


기능 구현
---------
1. 입력받은 문자열 공백(" ") 기준으로 split
```java
        System.out.print("write formula : ");
        String formula = scanner.nextLine();
        String[] splitStrings = formula.split(" ");
```
2. split된 문자열 배열에서 연산자( +,-,*,/ ) 탐색
3. 연산자에 맞게 양 옆 값를 이용해 계산된 값을 연산자의 index + 1에 저장
```java
        double result = 0.0;
        for (int index = 0; index < formula.length; index++) {
            switch (formula[index]) {
                case "+" -> {
                    result = plus(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = Double.toString(result);
                }
                case "-" -> {
                    result = subtract(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = Double.toString(result);
                }
                case "*" -> {
                    result = multiple(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = Double.toString(result);
                }
                case "/" -> {
                    result = divide(formula[index - 1], formula[index + 1]);
                    formula[index + 1] = Double.toString(result);
                }
                default -> {
                }
            }
        }
```

4. 주어진 연산자와 값들를 이용해 계산된 값을 return
```java
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
```

5. 문자열 배열 마지막 index의 값 추출

```java
double findAnswer(String[] arrayContainsResult) {
        int indexOfAnswer = arrayContainsResult.length - 1;
        return Double.parseDouble(arrayContainsResult[indexOfAnswer]);
    }
```
