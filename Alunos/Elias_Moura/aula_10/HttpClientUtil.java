import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientUtil {
     public static String get(String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI. create( url))
        .GET()
        .build();

    try{
        HttpResponse<String>response = client.send(request,HttpResponse.BodyHandlers.ofString());
        return response.body();
    }catch(IOException |InterruptedException e ){
        e.printStackTrace();
        return null;
    }



    }
}


