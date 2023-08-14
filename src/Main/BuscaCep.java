package Main;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCep {
    private final String cep;

    public BuscaCep(String cep){
        this.cep = cep;
    }

    public CepOmdb getAddress() throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/"+this.cep.replace("-","")+"/json/";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), CepOmdb.class);
    }
}
