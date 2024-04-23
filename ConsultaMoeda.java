import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Moeda buscaMoeda(String moedaBase, String moedaConvertida, double valorConversao){
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/dc0eb1b55038599e5b82b28a/pair/" + moedaBase + "/" + moedaConvertida + "/" + valorConversao);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(moeda)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter dados dessa moeda.");

        }
    }
}
