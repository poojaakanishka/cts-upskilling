/*
36. HTTP Client API (Java 11+)
• Objective: Make HTTP requests from Java.
• Task: Fetch data from a public API (e.g., GitHub).
• Instructions:
o Use HttpClient and HttpRequest.
o Print the response status and body.
o Optional: Parse JSON response using Jackson or Gson.
*/
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

    public static void main(String[] args) {

        try {
  
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com"))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());


            System.out.println("Status Code: " + response.statusCode());

            System.out.println("\nResponse Body:\n" + response.body());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}