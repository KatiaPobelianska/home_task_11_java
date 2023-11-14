package home_task_23_11_09.task_1;

import home_task_23_11_09.task_1.randomNumberGeneretor.RandomNumberGenerator;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomOddNumber = RandomNumberGenerator.generateRandomOddNumber(random);
        System.out.print("Случайное нечетное число: " + randomOddNumber);
    }
}
