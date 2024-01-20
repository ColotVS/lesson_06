import java.util.Scanner;

public class lesson_06_09 {
    public static void main(String[] args) {
        //Ввести с клавиатуры число N.
        //Считать N целых чисел и заполнить ими массив array.
        //Найти максимальное число среди элементов массива.
        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();
        int[] array = new int[arr];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr; i++) {
            array[i] = scanner.nextInt();
            if (array[i]>max)
                max = array[i];
        }
        System.out.println("Минимальное число из введённых:" + max);
    }
}
