import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class buscarcotacao {
    public static double buscarCotacao(string from, String to){

        String urlStr = String.format("");// adicionar chave da API 
        URL url = new URL(urlStr);
    
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeErrorException("Errro no pedido" + responseCode);
            
        }
        Scanner sc = new Scanner(url.openStream());
        StringBuilder response =  new StringBuilder();
        while (sc.hasNext()) {
            response.append(sc.nextLine());
            
        }
     sc.close();

     JSONobject json = new JSONObject(response.toString());
     double result = json.getDouble("resultado");

     return result;


    }catch(Exception e){
       System.out.println("Erro ao buscar cotação da Moeda"+ e.getMenssagem()); 
    }
}
