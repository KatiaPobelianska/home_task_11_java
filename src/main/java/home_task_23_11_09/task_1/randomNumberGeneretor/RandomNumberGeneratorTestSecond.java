package home_task_23_11_09.task_1.randomNumberGeneretor;

import java.util.Random;
//    ======================== 2
public class RandomNumberGeneratorTestSecond {
    static class FixedRandom extends Random {
        private int[] values = {-99, -97, -93, -89, -87, -83, -79, -77, -73, 75};
        private int index = 0;

        @Override
        public int nextInt(int bound) {
            return values[index++ % values.length];
        }
    }
}
