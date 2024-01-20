import java.util.Arrays;

public class lesson_06_24 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //Реализуй метод main(String[]), который сортирует массив array по возрастанию.
        //Для сортировки массива используй метод Arrays.sort(int[]).
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
