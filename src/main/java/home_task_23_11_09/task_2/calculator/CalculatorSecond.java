package home_task_23_11_09.task_2.calculator;
//TODO: CORRECT CODE
public class CalculatorSecond {
    public int add(int a, int b) {
        return performOperation(a, b, '+');
    }

    public int subtract(int a, int b) {
        return performOperation(a, b, '-');
    }

    public int multiply(int a, int b) {
        return performOperation(a, b, '*');
    }

    public int divide(int a, int b) {
        return performOperation(a, b, '/');
    }

    private int performOperation(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
