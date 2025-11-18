package com.exemplo;
import java.util.List;

public class Serie {
   private String nome; 
   private String idioma;
   private List<String>generos;
   private double nota;
   private String estreiaLan;
   private String dataFinal;
   private String status;
   private String emisora;

 public Serie(String emisora, String status, String nome, String idioma, List<String>generos, double nota, String estreiaLan, String dataFinal){
    this.nome = nome;
    this.idioma = idioma;
    this.generos = generos;
    this.nota = nota;
    this.status = status;
    this.emisora = emisora;
    this.estreiaLan = estreiaLan;
    this.dataFinal = dataFinal;

 } 
 
public String getEmisora(){
    return emisora;
}

 public String getStatus(){
    return status;
 }

public String getNome(){
    return nome;
}
public String getIdioma(){
    return idioma;
}
public List<String> getGeneros(){
    return generos;
}

public double getNota(){
    return nota;
}
public String getEstreiaLan(){
    return estreiaLan;
}

public String getDataFinal(){
    return dataFinal;
}

@Override
 public String toString(){
    return" \n serie "+ nome +
        " \n idioma"+ idioma+ 
        " \n generos"+ generos+ 
        " \n nota" + nota +
        " \n estreia lançamento"+ estreiaLan+
        " \n data final do lançamento"+ dataFinal+
        " \n emisora responsavel" + emisora+
        " \n status do lançamento" + status; 
}



} 
