package graph;

import java.util.HashMap;
import java.util.Set;

final class Vertex {

    String node;
    HashMap<String, Integer> adjacent;

    public Vertex(String node) {
        this.node = node;
        this.adjacent = new HashMap<>();
    }

    public String id() {
        return this.node;
    }

    public void addNeighbor(String node) {
        this.adjacent.put(node, 0);
    }

    public void addNeighbor(String node, int weight) {
        this.adjacent.put(node, weight);
    }

    public Set<String> connections() {
        return this.adjacent.keySet();
    }

    public Integer weight(String node) {
        return adjacent.get(node);
    }

    public String showConnections() {

        StringBuilder builder = new StringBuilder();
        builder.append(this.node);
        builder.append(": ");

        for (String key: this.adjacent.keySet()) {
            builder.append(key);
            builder.append(", ");
        }
        return builder.toString();
    }

}
