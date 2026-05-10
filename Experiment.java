public class Experiment {

    public void runTraversals(Graph g) {
        long start = System.nanoTime();
        g.bfs(0);
        long end = System.nanoTime();
        System.out.println("BFS Time: " + (end - start));

        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();
        System.out.println("DFS Time: " + (end - start));
    }

    public Graph createGraph(int size) {
        Graph g = new Graph();

        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {
            g.addEdge(i, i + 1);
        }

        return g;
    }
}