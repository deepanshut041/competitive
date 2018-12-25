import java.util.*;

/**
 * Bft
 */
public class Bft {
    static Graph graph;
    
    static void bfs(int dst){
        Set<Integer>  visited = new HashSet<>();
        Queue<Integer> nextToVisit = new LinkedList<>();
        int src = 0;
        nextToVisit.add(src);
        while (!nextToVisit.isEmpty()) {
            int node = nextToVisit.remove();
            visited.add(node);
            if (dst == node) {
                break;
            }
            LinkedList<Integer> childrens = graph.adj(node);
            for (int children:childrens) {
                if (!visited.contains(children)) {
                    nextToVisit.add(children);
                }
            }

        }

        for (int vistedNode : visited) {
            System.out.print(vistedNode + " -> ");
        }
        System.out.println();
    }

    static void bft(int src){
        boolean[] visited = new boolean[graph.V];
        Queue<Integer> nextToVisit = new LinkedList<>();
        nextToVisit.add(src);
        while (!nextToVisit.isEmpty()) {
            int node = nextToVisit.remove();
            System.out.print(node + " -> ");
            visited[node] = true;
            LinkedList<Integer> childrens = graph.adj(node);
            for (int children:childrens) {
                if (!visited[children]) {
                    visited[children] = true;
                    nextToVisit.add(children);
                }
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph g = new Graph(4); 
        g.addEdgeOrdered(0, 1); 
        g.addEdgeOrdered(0, 2); 
        g.addEdgeOrdered(1, 2); 
        g.addEdgeOrdered(2, 0); 
        g.addEdgeOrdered(2, 3); 
        g.addEdgeOrdered(3, 3);
        graph = g;
        System.out.println(graph);
        // Breadth first serach
        bfs(2);
        // Breadth first Travesal
        bft(2);
    }
}