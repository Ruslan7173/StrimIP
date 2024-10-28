import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1 (){

        String[] arr1 = {"Petya", "Vasya", "Kolya", "Bob"};
        Assertions.assertEquals(3, Exempl1.met(arr1));
    }



}
