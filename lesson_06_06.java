import java.util.Scanner;

public class lesson_06_06 {
    public static void main(String[] args) {
        //Вывод чисел в обратном порядке
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
