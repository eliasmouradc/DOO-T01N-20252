import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args)  {
        List<Produto> produtos = new ArrayList<>();
            produtos.add(new Produto("Celular ", 850.75));
            produtos.add(new Produto("notebook", 4500.50));
            produtos.add(new Produto("Teclado", 85.50));
            produtos.add(new Produto("mause Gamer",55.70));

            List<Produto>filtrados = produtos.stream().filter(p -> p.getPreco()>100).collect(Collectors.toList());


            System.out.println("Prutos com preso maior que R$ 100,00");
            filtrados.forEach(System.out::println );

            double somaTotal = produtos.stream()
            .filter(p -> p.getPreco()>100)
            .mapToDouble(Produto::getPreco).sum();

            System.out.println("\n valor total das compra" +somaTotal);
    }
}
