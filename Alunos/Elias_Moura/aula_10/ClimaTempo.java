import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ClimaTempo {
   double endereco; 
   
 private static final String API_KEY ="WJQSSBTUPVWNPTKV8TEXW23";
    private static final String BASE_URL ="https://www.visualcrossing.com/weather-query-builder/";
    
public void obterClima(String cidade){
    String url = BASE_URL +cidade + "?unitGroup=metric&key=" + API_KEY + "&lang=pt";
    String resposta = HttpClientUtil.get(url);


    if (resposta != null) {

        JsonObject json = JsonParser.parseString(resposta).getAsJsonObject();
       
        String endereco = json.get("resolvedAddress").getAsString();
        JsonArray dias = json.getAsJsonArray("days");

    } if (dias.size() > 0) {
        JsonObject hoje = dias.get(0).getAsJsonObject();
        String data = hoje.get("datetime").getAsString();
        double temperatura = hoje.get("temp").getAsDouble();
        double umidade = hoje.get("humidity").getAsDouble();
        String condicoes = hoje.get("conditions").getAsString();


       System.out.println("Cidade" + endereco);
       System.out.println("data"+ data);
       System.out.println("temperatura" + temperatura + "C");
       System.out.println("Umidade" + umidade + "%");
       System.out.println("Condiçoes" + condicoes);

    }else{
        System.out.println("Nenhum dado disponível para esta cidade");
 
  } 

 }

}

