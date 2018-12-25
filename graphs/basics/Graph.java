import java.util.LinkedList;

/**
 * Graph
 */
public class Graph {
    final int V;
    LinkedList<Integer>[] verticeArray;

    public Graph(int V){
        this.V = V;
        verticeArray = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            verticeArray[i] = new LinkedList<>();
        }
    }

    public LinkedList<Integer> adj(int v){
        return verticeArray[v];
    }

    public void addEdge(int u, int v){
        verticeArray[u].add(v);
        verticeArray[v].add(u);
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < V; i++) {
            String l = i + ": ";
            for (Integer value:verticeArray[i]) {
                l += value + " -> ";
            }
            l += "\n";
            s = s + l;
        }
        return s;
    }

}