public class lesson_06_11 {
    public static void main(String[] args) {
        //Сравнение строк в массиве
        String[] array = new String[10];

        array[1] = "Привет";
        array[2] = array[1];
        array[3] = new String("Привет");

        boolean b = array[1] == array[2]; //true, ссылки равны
        boolean b1 = array[1] == array[3]; //false, ссылки не равны
        array[1].equals(array[3]); //true, значения равны
        array[1].equalsIgnoreCase(array[3]); //true, значения равны
    }
}
