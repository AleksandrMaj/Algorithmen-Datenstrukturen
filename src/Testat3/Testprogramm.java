package Testat3;

import java.util.List;

public class Testprogramm {
    public static void main(String[] args) {
        //Instanzierung der Vertexe
        Vertex heinsberg = new Vertex("Heinsberg");
        Vertex viersen = new Vertex("Viersen");
        Vertex moenchengladbach = new Vertex("Mönchengladbach");
        Vertex erkelenz = new Vertex("Erkelenz");
        Vertex krefeld = new Vertex("Krefeld");
        Vertex duesseldorf = new Vertex("Düsseldorf");

        //Erstellung der Adjazenten
        heinsberg.addEdge(new Edge(viersen, 38))
                .addEdge(new Edge(moenchengladbach, 33))
                .addEdge(new Edge(erkelenz, 17));

        viersen.addEdge(new Edge(heinsberg, 38))
                .addEdge(new Edge(moenchengladbach, 10))
                .addEdge(new Edge(duesseldorf, 31))
                .addEdge(new Edge(krefeld, 21));

        moenchengladbach.addEdge(new Edge(viersen, 10))
                .addEdge(new Edge(heinsberg, 33))
                .addEdge(new Edge(erkelenz, 17))
                .addEdge(new Edge(duesseldorf, 30));

        erkelenz.addEdge(new Edge(heinsberg, 17))
                .addEdge(new Edge(moenchengladbach, 17))
                .addEdge(new Edge(duesseldorf, 46));

        krefeld.addEdge(new Edge(viersen, 21))
                .addEdge(new Edge(duesseldorf, 28));

        duesseldorf.addEdge(new Edge(krefeld, 28))
                .addEdge(new Edge(viersen, 31))
                .addEdge(new Edge(moenchengladbach, 30))
                .addEdge(new Edge(erkelenz, 46));

        //Auswählen der Orte, für die wir den kürzesten Weg erfahren möchten
        Vertex[] destinations = {heinsberg, viersen, erkelenz, krefeld, duesseldorf};

        //Berechnung der Pfade
        Dijkstra.computePaths(moenchengladbach, false);

        //Ausgabe der kürzesten Pfade
        //Distanz und Weg für jeden Ort ausgeben
        System.out.println("Alle Pfade:");
        for (Vertex v : destinations) {
            System.out.println("Distanz nach " + v.name + " beträgt " + v.minDistance + " km");

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
