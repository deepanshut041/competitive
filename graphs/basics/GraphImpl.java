// Java Graph implementaion using adjacency list
import java.util.*;

public class GraphImpl{
    static class Graph{

        // Array of vertices in graph
        LinkedList<Integer> adjacencyList[];
        // length of array
        final int V;

        Graph(int V){
            this.V = V;
            adjacencyList = new LinkedList[this.V];
            for (int i = 0; i < V; i++) {
                // Intilizing ever item array with empty linkedlist
                adjacencyList[i] = new LinkedList<>();
            }
        }
    }

    static void addEdge(Graph graph, int v, int u){
        graph.adjacencyList[v].add(u);
        graph.adjacencyList[u].add(v);
    }

    static void printGraph(Graph graph){
        for(int v = 0; v < graph.V; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer node: graph.adjacencyList[v]){ 
                System.out.print(" -> "+node); 
            } 
            System.out.println("\n"); 
        } 
    }


    public static void main(String args[]){
        // create the graph given in above figure 
        int V = 5; 
        Graph graph = new Graph(V); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
        printGraph(graph);
    }
 }