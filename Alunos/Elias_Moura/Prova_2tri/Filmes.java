package com.exemplo;
import java.util.List;

public class Filmes {
    private String nome;
    private String genero;
    private String idioma;
    private double duracao;
    private String estreiaLan;
    private String dataFinal;

public Filmes(String nome, String gerneros, String idioma, double duracao,String estreiaLan,String dataFinal){
    this.nome = nome;
    this.genero = genero;
    this.idioma = idioma;
    this.duracao = duracao;
    this.estreiaLan = estreiaLan;
    this.dataFinal = dataFinal;  
}

public String getNome(){
    return nome;

}

public String getGenero(){
    return genero;

}

public String getIdioma(){
    return idioma;

}

public double getDuracao(){
    return duracao;
}

public String getEstreiaLan(){
    return estreiaLan;

}

public String getDataFinal(){
    return dataFinal;
}











}
