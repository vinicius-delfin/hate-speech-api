import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


public class Assembly {
public static <JSONParser, JSONObject> void main(String[]args) throws Exception {
    Transcript transcript = new Transcript();

//    transcript.setAudio_url("https://github.com/AssemblyAI-Examples/audio-examples/raw/main/20230607_me_canadian_wildfires.mp3");
    transcript.setAudio_url("https://github.com/vinicius-delfin/audio_files/raw/master/israel-hamas-war-api-test.mp3");
    transcript.setContent_safety(true);

    Gson gson = new Gson();
    String jsonRequest = gson.toJson(transcript);

    HttpRequest postRequest = HttpRequest.newBuilder()
    .uri(new URI("https://api.assemblyai.com/v2/transcript"))
    .header("Authorization", "46d88cbeb93a4bb9b3a45d5a67a998ea")
    .POST(HttpRequest.BodyPublishers.ofString(jsonRequest)).build();

    HttpClient client = HttpClient.newHttpClient();

    HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
    transcript = gson.fromJson(postResponse.body(), Transcript.class);

    HttpRequest getRequest = HttpRequest.newBuilder()
            .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
            .header("Authorization", "46d88cbeb93a4bb9b3a45d5a67a998ea")
            .build();

    while (!"completed".equals(transcript.getStatus()) && !"error".equals(transcript.getStatus())) {
        HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        transcript = gson.fromJson(getResponse.body(), Transcript.class);
        System.out.println(transcript.getStatus());
        Thread.sleep(3000);
    }

    System.out.println("Transcription completed");
    Map<String, Double> summary = transcript.getContent_safety_labels().getSummary();
    System.out.println(summary);
}
}
