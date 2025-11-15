import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;




public class Numerospar {
 public static void main(String[] args) throws Exception {
        List<Integer>numero = Arrays.asList(12, 5, 33, 48, 20, 17, 8, 90, 41, 26, 18, 25);
        List<Integer>numeroPares = numero.stream().filter(n ->n %2==0)
        .collect(Collectors.toList());

        System.out.println("\n os numeros pares sao "+ numeroPares);
    }
}    

