package Testat3;

import java.util.*;

/**
 * This class forms the main destination points of your vertex
 * @author Aleks
 */
public class Vertex implements Comparable<Vertex> {
    /**
     * The name of this destination point
     */
    public String name;

    /**
     * The lsit of possible destinations you can reach from this point
     */
    public List<Edge> adjacencies;

    /**
     * The costs to reach this destination
     */
    public double weight;

    /**
     * The previous vertex
     */
    public Vertex previous;

    /**
     * minDistance is at the start infinity
     */
    public double minDistance = Double.POSITIVE_INFINITY;

    /**
     * The constructor the create a simple destination point for your dijkstra algorithm
     * @param s Name of this destination
     */
    public Vertex(String s) {
        name = s;
        adjacencies = new LinkedList<Edge>();
    }

    /**
     * This method adds a destination point you can reach from this point
     * @param edge A edge for the adjacency
     * @return Simple return of this object
     */
    public Vertex addEdge(Edge edge) {
        adjacencies.add(edge); //Add a edge to the list
        return this; //return this to make a multiple call of this method
    }

    /**
     * This method compares the two weights of two other vertices
     * @param other The other vertex you want to compare with
     * @return This method returns -1, 0 or 1 to show, if the weight is bigger, smaller or equal
     */
    public int compareTo(Vertex other) {
        return (int) (weight - other.weight);
    }

    /**
     * This method represents the object as a string with his attributes
     * @return Representation of this object as a string
     */
    @Override
    public String toString() {
        return "Testat3.Vertex{" +
                "name='" + name + '\'' +
                /*", weight=" + weight +
                ", previous=" + previous +  //Uncomment this lines to get more information about the vertex
                ", minDistance=" + minDistance +*/
                '}';
    }
}