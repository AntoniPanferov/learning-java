public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        GraphNode mouse = new GraphNode("mouse");
        GraphNode a = new GraphNode("a");
        GraphNode b = new GraphNode("b");
        GraphNode c = new GraphNode("c");
        GraphNode d = new GraphNode("d");
        GraphNode e = new GraphNode("e");
        GraphNode f = new GraphNode("f");
        GraphNode g = new GraphNode("g");
        GraphNode h = new GraphNode("h");
        GraphNode i = new GraphNode("i");
        GraphNode cheese = new GraphNode("cheese");

        graph.addNode(mouse);
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addNode(e);
        graph.addNode(f);
        graph.addNode(g);
        graph.addNode(h);
        graph.addNode(i);
        graph.addNode(cheese);

        graph.addEdge(mouse,a,1);
        graph.addEdge(a,b,1);
        graph.addEdge(a,e,1);
        graph.addEdge(a,e,1);
        graph.addEdge(e,c,1);
        graph.addEdge(e,f,1);
        graph.addEdge(e,d,1);
        graph.addEdge(c,d,1);
        graph.addEdge(c,h,1);
        graph.addEdge(h,i,1);
        graph.addEdge(h,g,1);
        graph.addEdge(g,cheese,1);



    }
}