public class lesson_06_02 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];
    public static void main(String[] args) {
        int[] a = new int[10]; //Создаем массив на 10 элементов типа int.
        a[2] = 4; //В ячейку с индексом 2 записываем значение 4.
        a[7] = 9;
        a[9] = a[2] + a[5];//В ячейку с индексом 9 записываем сумму значений, которые хранятся в ячейках 2 (хранится 4) и 5 (хранится 0).

        //В методе main(String[]) тебе нужно заполнить массив strings значениями.
        // Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
        //Вывод текста в консоль в тестировании не участвует.

        for (int i = 0; i < 5; i++) {
            if(i%2==0)
            {
                strings[i] = lesson_06_02.EVEN;
            }
            else
                strings[i] = lesson_06_02.ODD;
        }
        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
                


    }
}
