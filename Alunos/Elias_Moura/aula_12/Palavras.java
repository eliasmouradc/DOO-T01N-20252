import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Palavras {
  public static void main(String[]args){
   List<String> palavras = Arrays.asList("\n se", "\n talvez", "\n hoje",
    "\n sábado","\n se", "\n quarta", "\n sábado");


   Map<String, Integer> contagem = new HashMap<>();
   
   palavras.stream().forEach(p -> contagem.put(p,contagem.getOrDefault(p,0) + 1));
   System.out.println("\n"+ contagem);
  }  
}
