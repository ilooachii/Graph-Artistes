// Graph.java
import java.util.Map;

public class Graph {
    // Attribut pour stocker les artistes
    private Map<String, Artist> artistes;

    public Graph(String fileArtists, String fileMentions) {
        // 1. Lire le fichier artists.txt et créer les instances Artist
        // 2. Lire le fichier mentions.txt et pour chaque ligne,
        //    créer des arêtes (Edge) entre les artistes correspondants,
        //    en calculant le poids comme 1 / (nombre de mentions).
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