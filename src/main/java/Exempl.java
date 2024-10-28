import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//Упр.1. Создать ArrayList с числами. Отфильтровать только четные числа,
// потом возвести их вквадрат, потом оставить только первые три элемента и вывести в консоль.
public class Exempl {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList <Integer> list1 =new ArrayList<>(Arrays.asList(arr));
        Stream<Integer> stream = list1.stream();
        stream.filter(x-> x%2 == 0).map(x-> Math.pow(x, 2)).limit(3).forEach(System.out::println);
        String [] arr1 = {"Petya", "Vasya", "Kolya"};



    }



}
