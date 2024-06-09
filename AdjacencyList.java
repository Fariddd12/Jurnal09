import java.util.*;

public class AdjacencyList {
    int v;
    LinkedList<Character> AdjListArray[];

    AdjacencyList(int v) {
        this.v = v;

        AdjListArray = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            AdjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {

        AdjListArray[src-'A'].add(dest);

        // AdjListArray[dest].add(src);
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            if (AdjListArray[i].size() > 0) {
                System.out.print("Vertex " + (char) ('A'+i) + "is connected to:");
                for (int j = 0; j < AdjListArray[i].size(); j++) {
                    System.out.print(AdjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        AdjacencyList myList = new AdjacencyList(9);
        myList.addEdge('A', 'D');
        myList.addEdge('B', 'E');
        myList.addEdge('C', 'B');
        myList.addEdge('D', 'G');
        myList.addEdge('E', 'F');
        myList.addEdge('E', 'H');
        myList.addEdge('F', 'H');
        myList.addEdge('F', 'C');
        myList.addEdge('G', 'H');
        myList.addEdge('H', 'I');
        myList.addEdge('I', 'F');
        myList.printGraph();
    }
}
