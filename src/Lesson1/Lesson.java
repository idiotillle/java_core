package Lesson1;

public class Lesson {
    public static void main(String[] args) {
        int my_number = 5;
        //System.out.print(my_number);
        byte my_Bute = 23;
        short my_short = 3234;
        int my_int = 324324;
        long my_long = 2342342432L;
        float my_float = 23424.2424f;
        double my_double = 234.234234234;
        //char my_char = 'sfsfdsfsdfs';

        char[] my_array = new char[6];
        my_array[2] = 'c';
        my_array[4] = 'o';
        my_array[5] = 'k';
        my_array[1] = 'e';
        my_array[0] = 'c';
        my_array[3] = 'n';


        //System.out.print(my_array);

        char[] my_array2 = my_array;
        my_array[0] = 'y';

        System.out.print(my_array2);


    }
}
