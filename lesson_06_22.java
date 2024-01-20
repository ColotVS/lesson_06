import java.util.Arrays;

public class lesson_06_22 {
    public static void main(String[] args) {
        //Копирование массивов
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] x2 = Arrays.copyOf(x, 5);
        String str2 = Arrays.toString(x2); //Переменная str2 содержит значение:"[1, 2, 3, 4, 5]"

        int[] x3 = Arrays.copyOf(x, 15);
        String str3 = Arrays.toString(x3); //Переменная str3 содержит значение:"[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0]"

        int[] x4 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] x5 = Arrays.copyOfRange(x4, 5, 10);
        String str5 = Arrays.toString(x5); //Переменная str2 содержит значение:"[16, 17, 18, 19, 20]"

        int[] x6= Arrays.copyOfRange(x4, 5, 15);
        String str6 = Arrays.toString(x6); //Переменная str3 содержит значение:"[16, 17, 18, 19, 20, 0, 0, 0, 0, 0]"
    }
}
