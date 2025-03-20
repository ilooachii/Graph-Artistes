// Graph.java
import java.util.Map;
import java.util.List;

public class Graph {
    // Attribut pour stocker les artistes
    private Map<String, Artist> artistes;

    public Graph(String fileArtists, String fileMentions) {
        // Lire le fichier artists.txt et créer les instances Artist
        artistes = Parser.parseArtists(fileArtists);

        // Lire le fichier mentions.txt et créer les connexions entre artistes
        List<Edge> edges = Parser.parseMentions(fileMentions, artistes);

        // Ajouter les connexions aux artistes
        for (Edge edge : edges) {
            edge.getSource().addConnection(edge);
            edge.getDestination().addConnection(edge); // Si le graphe est non orienté
        }
    }

    public void trouverCheminLePlusCourt(String depart, String arrivee) {
        // Utiliser un parcours en largeur (BFS)
        // Afficher le chemin, la longueur et le coût total
        // Si aucun chemin, lancer une exception.
    }

    public void trouverCheminMaxMentions(String depart, String arrivee) {
        // Utiliser par exemple l'algorithme de Dijkstra pour le chemin à coût minimum.
        // Afficher le chemin, la longueur et le coût total
        // Si aucun chemin, lancer une exception.
    }
}