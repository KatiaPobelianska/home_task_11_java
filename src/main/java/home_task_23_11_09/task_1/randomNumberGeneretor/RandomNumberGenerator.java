package home_task_23_11_09.task_1.randomNumberGeneretor;

import java.util.Random;

/* Напишите метод, который принимает на вход объект класса Random.
 Метод должен возвращать случайное нечётное число из диапазона от -100 до 100.*/
public class RandomNumberGenerator {
    public static int generateRandomOddNumber(Random random) {
        int randomNumber;
        do {
            // Генерация случайного числа от -100 до 100
            randomNumber = random.nextInt(201) - 100;
        } while (randomNumber % 2 == 0); // Повторяем генерацию, пока число не станет нечетным
        return randomNumber;
    }

}
