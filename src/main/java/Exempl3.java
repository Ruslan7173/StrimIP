import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

//Упр.3. Создать метод, который принимает массив чисел, создает стрим и подсчитывает,
//сколько в массиве чисел, больше заданного значения (например > 5). Покрыть тестами.

public class Exempl3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(met(arr));

    }

    public static int met(Integer[] arr) {
        Stream<Integer> stream = Arrays.stream(arr);
        //stream.filter(x -> x > 5).count();
        return (int) stream.filter(x -> x > 5).count();


    }
}



