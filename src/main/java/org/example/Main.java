package org.example;
import java.util.*;


import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
Integer [] arr = {1,2,3,3,3,9,5,16,1,7,8};
        ArrayList <Integer> list1 =new ArrayList<>(Arrays.asList(arr));
        //System.out.println(list1);

        // логика отфильтровать всех что больше > 5, далее проходим фор эчем ивывдим в консоль
        Stream  <Integer> stream = list1.stream();
        //stream.filter(x-> x  > 5).map(x-> x+1).forEach(System.out::println); // выводить каждый элемент форэч это терминальный оператор толко один раз можно вызвать
                                                                                // коллекции на печать x- > System.out::println(x)
                                                                                //мапой добавляем плюс х+1
        //stream.filter(x-> x  > 5).limit(3).forEach(System.out::println); // вывести ограничится количество элементов
        //stream.skip(3).forEach(System.out::println); // пропустит количво  элементов сначала
        // stream.sorted().forEach(System.out::println); //сортирует по возрасттанию
        //stream.distinct().forEach(System.out::println); // убрать  дубли
        //long res  = stream.distinct().count(); //  количество элеметнов в стриме после всех операций
        // те которрые дожили  посчитаить колво эл ем в таблице
        //System.out.println(res);
        //long res  = stream.reduce(0, (x, y) -> x+y);  //0 начальное значение,  создание из райлиста.
        // редюс это сумм а  всех элементов от дать два праметра и просуммирую все элемнеты коллекцуии, можно  перемножить.
        //System.out.println(res);



    }
}
