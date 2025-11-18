package com.exemplo;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.json.*;
import org.json.JSONArray;


public class Tv {

   public static List<Serie>buscarSeriePorNome(String nome){
    List<Serie> serie = new ArrayList<>();

    try{
        String chave ="yeZmg7gXze85N9wJNziq4oLhhV7HCqWi";
        String urlString ="https://www.omdbapi.com/?t="+nome.replace(" ","%20")+"&apikey="+chave;

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        
        InputStreamReader reader = new InputStreamReader(conn.getInputStream());
        Scanner sc = new Scanner(reader);
        StringBuilder json = new StringBuilder();
        while (sc.hasNextLine()){
            json.append(sc.nextLine());
        }
        sc.close();

         //testa pra ver se api e verdadeira

        JSONObject Obj = new JSONObject(json.toString());
        
        if (Obj.optString("Response").equals("False")) {
            System.out.println("Serie nao emcontrada");
            return serie;
        }


        String nomeSerie = Obj.optString("Title","Desconhecido");
        String idioma = Obj.optString("Language","Desconhecido");

        String generosStr = Obj.optString("Genre","");
        List<String> generos = Arrays.asList(generosStr.split(",\\s*"));

        double nota = 0;
        try{
            nota = Double.parseDouble(Obj.optString("imdbRating", "0")); 
        }catch(Exception e){}

        String status = "N/A";
        String estreLan = Obj.optString("Released", "N/A");
        String fim = "N/A";
        String emisora = "Desconhecida";

            //criar a serie

            serie.add(new Serie(emisora, status, nomeSerie, idioma, generos, nota, estreLan, fim));

        
    }catch(Exception e){
        System.out.println("Erro falha ao buscar"+ e.getMessage());
    }
    return serie; 
}
}

