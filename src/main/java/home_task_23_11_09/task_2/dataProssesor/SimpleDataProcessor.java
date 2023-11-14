package home_task_23_11_09.task_2.dataProssesor;

// Исправленный код с упрощенной логикой
public class SimpleDataProcessor {
    public String processUserData(String name, int age, boolean isMale) {
        StringBuilder result = new StringBuilder();

        if (isValidName(name)) {
            result.append("Name: ").append(name).append("\n");
        }

        if (isValidAge(age)) {
            result.append("Age: ").append(age).append("\n");
        }

        result.append("Gender: ").append(isMale ? "Male" : "Female").append("\n");

        return result.toString();
    }

    private boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    private boolean isValidAge(int age) {
        return age > 0 && age < 150;
    }
}