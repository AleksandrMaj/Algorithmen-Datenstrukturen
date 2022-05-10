package Testat3;

import java.util.*;

/**
 * This class provides the necessary static methods to compare different vertices with each other.
 * Testat3.Dijkstra algorithm
 *
 * @author Aleks
 */
public class Dijkstra {

    /**
     * This method iterates all possible ways and chooses the best path to all other destinations
     * @param source The start point. The method will calculate all paths from this start vertex
     * @param zeigeZwischenwerte true if intermediate values should be printed into the console
     */
    public static void computePaths(Vertex source, boolean zeigeZwischenwerte) {
        source.minDistance = 0.; //The weight to reach the start point
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>(); //Manage weights of the different vertices
        vertexQueue.add(source); //First entry in PriorityQueue

        //Calculate paths while the PriorityQueue is not empty
        while (!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll(); //Get the vertex with the lowest priority

            //Iterate all destination points of this vertex u
            for (Edge e : u.adjacencies) {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight; //Calculate new weight to reach this destination

                //If intermediate values should be printed
                if (zeigeZwischenwerte) {
                    System.out.println("!Aktuelle Prioritätenliste!");
                    //Prints the status of the PriorityQueue every time
                    System.out.println(Arrays.toString(vertexQueue.toArray()));
                    System.out.println();
                }

                //If the new calculated weight is smaller
                if (distanceThroughU < v.minDistance) {
                    //If intermediate values should be printed
                    //If we find a shorther path than inform us
                    if (zeigeZwischenwerte) {
                        System.out.println("!Aktualisierung!");
                        String txt = "Verkürzung zu Punkt " + v.name + " -> Von " + v.minDistance + " zu " + distanceThroughU;
                        //Just a little formatting adapt. Change word infinity to Unendlich
                        txt = txt.replace(String.valueOf(Double.POSITIVE_INFINITY), "Unendlich");
                        System.out.println(txt);
                        System.out.println();
                    }
                    vertexQueue.remove(v); //Removes the destination vertex of the PriorityQueue
                    v.minDistance = distanceThroughU; //Set the smaller weight we have been calculated
                    v.previous = u; //Set the previous destination
                    vertexQueue.add(v); //New etry in the PriorityQueue
                }
            }
        }
    }

    /**
     * This method returns a list of vertices you need to take to reach your destination as soon as possible
     * @param target The vertex you want to reach from your start point
     * @return The list of vertices you need to take to reach the shortest path
     */
    public static List<Vertex> getShortestPathTo(Vertex target) {
        List<Vertex> path = new LinkedList<>(); //List of our destination points we need to cross

        //Iterate from our target back to our start point
        Vertex temp = target;
        while(temp != null) {
            path.add(temp); //Add the destination to our list
            temp = temp.previous; //Get the next previous destination point
        }

        Collections.reverse(path); //Reverse the elements of our LinkedList
        return path;
    }
}
