package graph;

class Main {
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addVertex("a");
        g.addVertex("b");
        g.addVertex("c");
        g.addVertex("d");
        g.addVertex("e");
        g.addVertex("f");

        System.out.println(g.vertexList());
        System.out.println(g.vertexMap.get("a").node);
        
        // Iterate through list of vertices
        for (String key: g.vertexMap.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.println();

        // Add list of edges
        g.addEdge("a", "b", 7);
        g.addEdge("a", "c", 9);
        g.addEdge("a", "f", 14);
        g.addEdge("b", "c", 10);
        g.addEdge("b", "d", 15);
        g.addEdge("c", "d", 11);
        g.addEdge("c", "f", 2);
        g.addEdge("d", "e", 6);
        g.addEdge("e", "f", 9);

        System.out.println("--- Adjacency list ---");
        for (Vertex vertex: g.vertexMap.values()) {
            System.out.println(vertex.showConnections());
        }

        System.out.println("--- Edge + weight ---");
        Integer cost = 0;
        for (Vertex vertex: g.vertexMap.values()) {
            for (String node: vertex.connections()) {
                cost = vertex.weight(node);
                System.out.println("(" + vertex.id() + ", " + node + ", " + cost + ")");
            }
        }

        System.out.println();
    }
} // Main