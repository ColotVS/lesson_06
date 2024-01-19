import java.util.Scanner;

public class lesson_06_07 {
    public static void main(String[] args) {
        //Считывает с консоли целое число N.
        //Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
        //Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
        //Каждое число выводить с новой строки. Число N выводить не нужно.
        Scanner array = new Scanner(System.in);
        int N = array.nextInt();
        if (N > 0)
        {
            int [] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i]=array.nextInt();
            }
            if (N%2==1) {
                for (int i = 0; i < N; i++) {
                    System.out.println(a[i]);
                }
            }
            else
            {
                for (int i = N-1; i >= 0; i--)
                    System.out.println(a[i]);
            }
        }
    }
}
