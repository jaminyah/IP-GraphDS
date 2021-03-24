package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
    int numVertices;
    HashMap<String, Vertex> vertexMap;

    Graph() {
        this.numVertices = 0;
        this.vertexMap = new HashMap<>();
    }

    void addVertex(String node) {
        numVertices += 1;
        Vertex vertex = new Vertex(node);
        
        if (!vertexMap.containsKey(node)) {
            vertexMap.put(node, vertex);
        }
    }

    Set<String> adjacentNodes(String node) {

        Set<String> set = new HashSet<>();
        Vertex vertex = new Vertex(node);

        if (vertexMap.containsKey(node)) {
            set = vertex.connections();
        }
        return set;
    }

    // Add edge to node without weight
    void addEdge(String fromNode, String toNode) {

        Integer cost = 0;
        if (!vertexMap.containsKey(fromNode)) {
            this.addVertex(fromNode);
        }
        if (!vertexMap.containsKey(toNode)) {
            this.addVertex(toNode);
        }
        // Undirected so add in both directions.
        vertexMap.get(fromNode).addNeighbor(toNode, cost);
        vertexMap.get(toNode).addNeighbor(fromNode, cost);
    }  

    // Add edge to node with weight
    void addEdge(String fromNode, String toNode, Integer cost) {
        if (!vertexMap.containsKey(fromNode)) {
            this.addVertex(fromNode);
        }
        if (!vertexMap.containsKey(toNode)) {
            this.addVertex(toNode);
        }
        // Undirected so add in both directions.
        vertexMap.get(fromNode).addNeighbor(toNode, cost);
        vertexMap.get(toNode).addNeighbor(fromNode, cost);
    }

    // Get vertices connected to node
    Set<String> vertexList() {
        return vertexMap.keySet();
    }
} // Graph
