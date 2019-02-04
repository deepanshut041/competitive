import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

/**
 * TopologicalSort
 */

public class TopologicalSort {
    Graph graph;
    
    TopologicalSort(Graph graph){
        this.graph = graph;
    }

    boolean childrensEmptyOrVisited(LinkedList<Integer> childrens, boolean visited[]){
        for (int children: childrens ) {
            if (!visited[children]) {
                return false;
            }
        }
        return true;
    }
    public void sort(){
        boolean visited[] = new boolean[graph.V];
        Stack<Integer> verticeStack = new Stack<>();
        Stack<Integer> sortedStack = new Stack<>();
        int src = 0;
        verticeStack.add(src);
        visited[src] = true;
        while (!verticeStack.isEmpty()) {
            int node = verticeStack.peek();
            LinkedList<Integer> childrens = graph.adj(node);
            if (childrensEmptyOrVisited(childrens, visited)) {
                sortedStack.add(node);
                verticeStack.pop();
            } else{
                for (int children: childrens ) {
                    if (!visited[children]) {
                        verticeStack.add(children);
                        visited[children] = true;
                    }
                }
            }
            if (verticeStack.isEmpty()) {
                for (int i = 0; i < visited.length; i++) {
                    if (!visited[i]) {
                        verticeStack.add(i);
                        visited[i] = true;
                    }
                }
            }
        }

        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + ", ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdgeOrdered(5, 2); 
        g.addEdgeOrdered(5, 0); 
        g.addEdgeOrdered(4, 0); 
        g.addEdgeOrdered(4, 1); 
        g.addEdgeOrdered(2, 3); 
        g.addEdgeOrdered(3, 1);

        TopologicalSort sort = new TopologicalSort(g);
        sort.sort();
    }
}