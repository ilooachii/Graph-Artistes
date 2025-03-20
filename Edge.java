// Edge.java
public class Edge {
    private Artist source;
    private Artist destination;
    private double poids;

    public Edge(Artist source, Artist destination, int nombreMentions) {
        this.source = source;
        this.destination = destination;
        // Calcul du poids : inverse du nombre de mentions
        this.poids = 1.0 / nombreMentions;
    }

    // Méthode pour obtenir l'artiste source
    public Artist getSource() {
        return source;
    }

    // Méthode pour obtenir l'artiste destination
    public Artist getDestination() {
        return destination;
    }

    // Getters, setters, etc.
}