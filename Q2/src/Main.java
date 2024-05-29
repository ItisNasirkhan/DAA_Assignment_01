import java.util.LinkedList;

class Graph {
    private int numberVertices;
    private LinkedList<Integer>[] adjacencyList;

    // Constructor
    public Graph(int numberVertices) {
        this.numberVertices = numberVertices;
        adjacencyList = new LinkedList[numberVertices];

        for (int i = 0; i < numberVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // adding an edge between two vertices
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source); // Since the graph is undirected
    }

    // for adjecency list
    public void printGraph() {
        for (int i = 0; i < numberVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : adjacencyList[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numVertices = 4;
        Graph g1 = new Graph(numVertices);

        // edging to connect the graph
        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {
                g1.addEdge(i, j);
            }
        }

        // showing the list
        g1.printGraph();
    }
}
