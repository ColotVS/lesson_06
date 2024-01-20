import java.util.Scanner;

public class lesson_06_08 {
    public static void main(String[] args) {
        //Ввести с клавиатуры число N.
        //Считать N целых чисел и заполнить ими массив.
        //Найти минимальное число среди элементов массива и вывести в консоль.
        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();
        int[] array = new int[arr];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr; i++) {
            array[i] = scanner.nextInt();
            if (array[i]<min)
                min = array[i];
        }
        System.out.println("Минимальное число из введённых:" + min);
    }
}
