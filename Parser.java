import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    // Méthode pour parser le fichier artists.txt
    public static Map<String, Artist> parseArtists(String filename) {
        Map<String, Artist> artistsMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 1) {
                    String artistName = parts[1].trim();
                    Artist artist = new Artist(artistName);
                    artistsMap.put(artistName, artist);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return artistsMap;
    }

    // Méthode pour parser le fichier mentions.txt et créer les connexions entre artistes
    public static List<Edge> parseMentions(String filename, Map<String, Artist> artistsMap) {
        List<Edge> edges = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String artist1Name = parts[0].trim();
                    String artist2Name = parts[1].trim();
                    int mentions = Integer.parseInt(parts[2].trim());

                    Artist artist1 = artistsMap.get(artist1Name);
                    Artist artist2 = artistsMap.get(artist2Name);

                    if (artist1 != null && artist2 != null) {
                        Edge edge = new Edge(artist1, artist2, mentions);
                        edges.add(edge);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return edges;
    }
}