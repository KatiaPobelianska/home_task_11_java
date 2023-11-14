package home_task_23_11_09.task_2.unnecessaryFeature;
//TODO: Нарушение YAGNI: добавление избыточной функциональности
public class UnnecessaryFeature {
    private int calculateSum(int a, int b) {
        // Некоторая сложная логика сложения, которая пока не нужна
        // это не понадобится
        return a + b;
    }

    public void processNumbers(int x, int y) {
        // Используется только часть функциональности, остальное лишнее
        int result = calculateSum(x, y);
        System.out.println(result);
    }
}