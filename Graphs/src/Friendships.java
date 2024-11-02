public class Friendships {
    public Graph createFriendshipGraph() {
        Graph graph = new Graph();

        GraphNode node1 = new GraphNode("Susi");
        GraphNode node2 = new GraphNode("Karl");
        GraphNode node3 = new GraphNode("Lisa");
        GraphNode node4 = new GraphNode("Jens");
        GraphNode node5 = new GraphNode("Merle");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        graph.addEdge(node1, node2, 1);
        graph.addEdge(node2, node1, 1);
        graph.addEdge(node1, node3, 1);
        graph.addEdge(node3, node1, 1);
        graph.addEdge(node1, node5, 1);
        graph.addEdge(node5, node1, 1);
        graph.addEdge(node2, node3, 1);
        graph.addEdge(node2, node5, 1);
        graph.addEdge(node2, node4, 1);
        graph.addEdge(node3, node5, 1);

        return graph;
    }

    public boolean areFriends(GraphNode node1, GraphNode node2) {
        if (node1.getNeighbours_().contains(node2)) {
            return true;
        }
        return false;
    }
}
