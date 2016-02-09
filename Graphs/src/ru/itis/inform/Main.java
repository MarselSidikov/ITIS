package ru.itis.inform;

public class Main {

    public static void main(String[] args) {
	    Graph graph = new GraphMatrixImpl();

        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();

        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 1);
        graph.addEdge(2, 4);

        graph.showGraph();
    }
}
