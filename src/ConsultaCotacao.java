import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCotacao {
    private static final HttpClient client = HttpClient.newHttpClient();
    public Cotacao buscaCotacao(String moeda_primaria, String moeda_secundaria, Float valor){
        var chaveAPI = "c6b031252be8ccca563d8e78";
        URI url = URI.create("https://v6.exchangerate-api.com/v6/"+ chaveAPI +"/pair/" + moeda_primaria.toUpperCase()+"/"+moeda_secundaria.toUpperCase()+"/"+valor.toString());

        HttpRequest request = HttpRequest.newBuilder().uri(url).build();
  
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cotacao.class);
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Não consegui obter o valor desta moeda.");
        }
    }
}
