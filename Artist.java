// Artist.java
import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String nom;
    private List<Edge> connections;

    public Artist(String nom) {
        this.nom = nom;
        this.connections = new ArrayList<>();
    }

    public void addConnection(Edge e) {
        connections.add(e);
    }

    // Getters, setters, etc.
}