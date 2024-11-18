package secondlab.taskfirst;

public class Main {
    public static void main(String[] args) {
        System.out.println("Directed Graph: ");
        Graph directedGraph = new Graph(true);
        directedGraph.addVertex("A", 1);
        directedGraph.addVertex("B", 2);
        directedGraph.addVertex("C", 3);
        directedGraph.addEdge("A", "B");
        directedGraph.addEdge("B", "C");
        directedGraph.addEdge("C", "A");
        directedGraph.printGraph();

        System.out.println();

        System.out.println("Undirected Graph: ");
        Graph undirectedGraph = new Graph(false);
        undirectedGraph.addVertex("A", 4);
        undirectedGraph.addVertex("B", 5);
        undirectedGraph.addVertex("C", 6);
        undirectedGraph.addEdge("A", "B");
        undirectedGraph.addEdge("B", "C");
        undirectedGraph.addEdge("C", "A");
        undirectedGraph.printGraph();
    }
}