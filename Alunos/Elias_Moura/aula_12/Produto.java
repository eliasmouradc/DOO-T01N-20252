import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome ,double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return nome + "R$" + preco;
    }
}
