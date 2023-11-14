package home_task_23_11_09.task_2.astonishingExample;
//TODO: Нарушение POLA: неинтуитивное именование переменной
public class AstonishingExample {
    private int a; // Неясное имя переменной

    public AstonishingExample(int initial) {
        a = initial;
    }

    public void modifyValue(int newValue) {
        a = newValue;
    }

    public int getValue() {
        return a;
    }
}