package home_task_23_11_09.task_2.calculator;

//TODO: Пример нарушения принципа DRY:
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Повторяющийся код
    public int multiply(int a, int b) {
        return a * b;
    }

    // Повторяющийся код
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}
