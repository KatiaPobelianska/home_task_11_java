package home_task_23_11_09.task_2.dataProssesor;
//TODO: нарушение принципа KISS,
public class ComplicatedDataProcessor {
    public String processUserData(String name, int age, boolean isMale) {
        StringBuilder result = new StringBuilder();

        if (name != null && !name.isEmpty()) {
            result.append("Name: ").append(name).append("\n");
        }

        if (age > 0 && age < 150) {
            result.append("Age: ").append(age).append("\n");
        }

        result.append("Gender: ").append(isMale ? "Male" : "Female").append("\n");

        return result.toString();
    }
}
