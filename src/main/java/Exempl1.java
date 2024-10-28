import java.util.Arrays;
import java.util.stream.Stream;

public class Exempl1 {
    public static void main(String[] args) {
        String[] arr1 = {"Petya", "Vasya", "Kolya", "Bob"};
        met(arr1);
        System.out.println(met(arr1));

    }
    //Упр.2. Создать метод, который принимает массив строк,
    // создает stream и возвращает количество слов, которые длиннее четырех символов. Покрыть тестами.
    public static int met  ( String[] arr1){
        Stream<String> stream = Arrays.stream(arr1);
               //stream.filter(x -> x.length()>4).count();
               return (int) stream.filter(x -> x.length()>4).count();




    }


}
