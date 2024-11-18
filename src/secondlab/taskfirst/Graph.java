package secondlab.taskfirst;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Graph {
    private final Map<String, List<String>> adjList;
    private final boolean isDirected;
    private final Map<String, Integer> vertexValues;

    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        this.adjList = new HashMap<>();
        this.vertexValues = new HashMap<>();
    }

    public void addVertex(String name, int value) {
        if (!adjList.containsKey(name)) {
            adjList.put(name, new ArrayList<>());
            vertexValues.put(name, value);
        }
    }

    public void addEdge(String from, String to) {
        if (adjList.containsKey(from) && adjList.containsKey(to)) {
            adjList.get(from).add(to);
            if (!isDirected)
                adjList.get(to).add(from);

        }
    }

    public void printGraph() {
        for (Map.Entry<String, List<String>> entry : adjList.entrySet()) {
            String vertex = entry.getKey();
            int value = vertexValues.get(vertex);
            System.out.print(vertex + "," + value + " - ");

            for (String neighbor : entry.getValue())
                System.out.print(neighbor + "," + vertexValues.get(neighbor) + " ");

            System.out.println();
        }
    }
}
