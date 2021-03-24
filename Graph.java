package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
    int numVertices;
    List<ArrayList<Vertex>> list;
    ArrayList<Vertex> vertices;

    Graph() {
        this.numVertices = 0;
        this.list = new ArrayList<>();
        this.vertices = new ArrayList<>();
    }

    void addNode(String node) {
        numVertices += 1;
        Vertex newVertex = new Vertex(node);
        if (!vertices.contains(newVertex)) {
            vertices.add(newVertex);
            list.add(new ArrayList<>());
        }
    }

    Set<String> adjacentNodes(String node) {

        Set<String> set = new HashSet<>();
        Vertex vertex = new Vertex(node);

        if (vertices.contains(vertex)) {
            set = vertex.connections();
        }
        return set;
    }

    // Add edge to node without weight
    void addEdge(String fromNode, String toNode) {

    }  

    // Add edge to node with weight
    void addEdge(String fromNode, String toNode, Integer weight) {

    }

    // Get vertices connected to node
    Set<String> nodeList() {
        Set<String> set = new HashSet<>();

        return set;
    }

}
