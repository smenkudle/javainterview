import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Examples {

    /**
    1. find Even Int
    2.
     */
    public static void main(String[] args) {
        //findEvenIntStream();
    }


    private static void findEvenIntStream() {
        List<Integer> list = Arrays.asList(10, 13, 14, 16, 17, 19, 21);
        System.out.println("Output:");
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    }
}
