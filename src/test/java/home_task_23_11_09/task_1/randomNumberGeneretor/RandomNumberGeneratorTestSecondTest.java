package home_task_23_11_09.task_1.randomNumberGeneretor;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

//====================2
class RandomNumberGeneratorTestSecondTest {
    @Test
    public void testGenerateRandomOddNumber() {
        // Создаем экземпляр FixedRandom, который возвращает фиксированные значения
        Random fixedRandom = new RandomNumberGeneratorTestSecond.FixedRandom();

        // Вызываем метод generateRandomOddNumber с фиксированным объектом Random
        for (int i = 0; i < 10; i++) {
            int result = RandomNumberGenerator.generateRandomOddNumber(fixedRandom);
            assertTrue(result % 2 != 0, "Число " + result + " не является нечетным");
            assertFalse(result < -100 || result > 100, "Число " + result + " не в диапазоне от -100 до 100");
        }
    }

}