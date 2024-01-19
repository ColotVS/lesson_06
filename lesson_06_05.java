public class lesson_06_05 {
    public static void main(String[] args) {
        //Заполнение массива из 10 чисел числами от 0 до 9
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = i;
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        //Заполнение массива из 10 чисел числами от 1 до 10:
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = i + 1;
            System.out.print(array2[i] + ", ");
        }
        System.out.println();
        //Заполнение массива из 10 чисел числами от 10 до 1:
        int[] array3 = new int[10];
        for (int i = 0; i < 10; i++) {
            array3[i] = 10 - i;
            System.out.print(array3[i] + ", ");
        }
        System.out.println();
    }
}
