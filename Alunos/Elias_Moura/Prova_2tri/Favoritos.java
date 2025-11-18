package com.exemplo;
import java.util.ArrayList;
import java.util.List;

public class Favoritos{
 
 private List<Serie>favoritos = new ArrayList<>();


    public void adicionadaFavoritos(Serie serie){
        if (!favoritos.contains(serie)) {
            favoritos.add(serie);
        System.out.println("Serie adicionada aos favoritos");

        }else{
            System.out.println("Esta serie ja esta adicionada");
        }


    }
    
    public void listarFavoritos(){
        System.out.println("Lista dos favoritos");
        if (favoritos.isEmpty()) {
            System.out.println("Nao a neiuma serie favorita ainda ");
        }else{
            favoritos.forEach(System.out::println);
        }

    }

    public List<Serie>getFavoritos(){
        return favoritos;

    }

}
