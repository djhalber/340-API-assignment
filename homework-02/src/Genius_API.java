import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.*;

public class Genius_API {
//This method is to retrieve the API from the mysteries of the web and uses it to print a genius.
    public static void getGenius() {
try {

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://genius.p.rapidapi.com/artists/16775/songs"))
            .header("x-rapidapi-key", "1657c9a713msh1fed74477ea6405p1d62abjsn3de3e9d8f696")
            .header("x-rapidapi-host", "genius.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    // retrieves the HTTP message and prints link on line
    System.out.println(response.body());
    JSONObject obj = new JSONObject(response.body());

    System.out.println(response.body());

} catch(Exception ex){
    System.out.println(ex.getMessage());
}
    }
}
