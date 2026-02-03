import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Conversor {
    public Moeda ConverteMoeda(String base_code, String target_code, String amount) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/dd3136d48d03902f8ccb5071/pair/" + base_code + "/" + target_code + "/" + amount);
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();
        HttpResponse<String> response = null;

        try {
            response = HttpClient.newHttpClient().send(request, BodyHandlers.ofString());
        } catch (InterruptedException | IOException var8) {
            throw new RuntimeException("Valores ou tipo de conversão errado!!");
        }

        return (Moeda)(new Gson()).fromJson((String)response.body(), Moeda.class);
    }
}