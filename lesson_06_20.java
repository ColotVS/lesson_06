import java.util.Arrays;

public class lesson_06_20 {
    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        //Сравнение двумерных массивов
        System.out.println(Arrays.deepEquals(arrayFirst,arraySecond));
    }
}
