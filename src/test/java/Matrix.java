import java.util.ArrayList;

public class Matrix {
    public static void main(String[] args) {

        public static int[][] generateTwoDimensionalArray(boolean random) {
            int[][] array = {
                    { 84,  67,  22, -72,  95},
                    { 72, -70,   2, -88,  30},
                    { 95, -79, -87, -27, -97},
                    {-52, -64, -13, -19, -27},
                    { 79,  89,  95, -84, -53}
            };
            if (random) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = RANDOM_GENERATOR.nextInt(100) - 50;
                    }
                }
            }
        }
        public static ArrayList<Integer> selectEvenNumbers(ArrayList<Integer> list) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int number : list) {
                if (number % 2 == 0) {
                    result.add(number);
                }
            }
            return result;
        }