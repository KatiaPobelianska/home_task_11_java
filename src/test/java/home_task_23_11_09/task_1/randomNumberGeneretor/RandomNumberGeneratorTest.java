package home_task_23_11_09.task_1.randomNumberGeneretor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

//======================== 1
class RandomNumberGeneratorTest {

    @Test
    public void generateRandomOddNumber() {
        // Создаем мок объекта Random
        Random mocketRandom = Mockito.mock(Random.class);

        // Задаем последовательность чисел, которые мок Random будет возвращать
        when(mocketRandom.nextInt(anyInt()))
                .thenReturn(-99, -97, -93, -89, -87, -83, -79, -77, -73);

        // Вызываем метод generateRandomOddNumber 5 раз с мок объектом Random
        for (int i = 0; i < 5; i++) {
            int result = RandomNumberGenerator.generateRandomOddNumber(mocketRandom);
            assertTrue(result % 2 != 0, "Число " + result + " не является нечетным");
            assertFalse(result >= -100 && result <= 100, "Число " + result + " не в диапазоне от -100 до 100");
        }

        // Проверяем, что метод nextInt был вызван ровно 10 раз
        verify(mocketRandom, times(5)).nextInt(anyInt());
    }

}

