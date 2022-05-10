package Testat3;

/**
 * This class simulates the destinations you are able to reach from your start vertex
 * @author Aleks
 */
public class Edge {
    /**
     * The vertex you are able to reach
     */
    public Vertex target;

    /**
     * The costs to reach this vertex
     */
    public double weight;

    /**
     * The constructor to create a destination point
     * @param target The vertex you can reach from your start vertex
     * @param weight The cost to reach this destination
     */
    public Edge(Vertex target, double weight) {
        this.target = target;
        this.weight = weight;
    }
}