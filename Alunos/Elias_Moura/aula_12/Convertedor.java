import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Convertedor {
    public static void main(String[] args){
    List<String>nomes =Arrays.asList("roberto,","josé","caio","vinicius");
    List<String>nomesMaiuscolos = nomes.stream()
    .map(String::toUpperCase).collect(Collectors.toList());
    
    System.out.println("nomes em maiuscolo" + nomesMaiuscolos);

  }
}