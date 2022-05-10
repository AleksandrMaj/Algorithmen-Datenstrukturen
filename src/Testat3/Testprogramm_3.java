package Testat3;

import java.util.List;

public class Testprogramm_3 {
    public static void main(String[] args) {
        //Instanzierung der Vertexe
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        //Erstellung der Adjazenten
        a.addEdge(new Edge(b, 4))
                .addEdge(new Edge(c, 5));

        b.addEdge(new Edge(c, 2))
                .addEdge(new Edge(e, 1));

        c.addEdge(new Edge(d, 2));

        d.addEdge(new Edge(f, 6));

        e.addEdge(new Edge(d, 1))
                .addEdge(new Edge(f, 5));

        //Auswählen der Orte, für die wir den kürzesten Weg erfahren möchten
        Vertex[] destinations = {b, c, d, e, f};

        //Berechnung der Pfade
        Dijkstra.computePaths(a, true);

        //Ausgabe der kürzesten Pfade
        //Distanz und Weg für jeden Ort ausgeben
        System.out.println("Alle Pfade:");
        for (Vertex v : destinations) {
            System.out.println("Distanz nach " + v.name + " beträgt " + v.minDistance + " Einheiten");

            //Liste der Orte, die wir durchqueren müssen, um am Ziel anzukommen
            List<Vertex> path = Dijkstra.getShortestPathTo(v);
            System.out.print("Route: ");

            //Für die Schònheit, damit kein --> am Ende steht
            String text = "";
            for (Vertex dest : path) {
                text += dest.name + " --> ";
            }
            //Wenn am Ende ein --> steht, dann wird dieses entfernt
            if (text.lastIndexOf(" -->") == text.length() - 5) {
                text = text.substring(0, text.length() - 5);
            }
            System.out.print(text);

            System.out.println();
            System.out.println();
        }
    }
}
