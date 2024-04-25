import java.util.LinkedList;
public class Graph {
    int v;
    LinkedList<Integer> adjListArray[];

    public Graph(int V) {   //konstruktor
        this.v = V;

        adjListArray = new LinkedList[v];   //mendeklarasikan ukuran array sebagai jumlah simpul
        for (int i = 0; i < v; i++) {   //buat daftar untuk setiap simpul menggunakan node linkedlist
            adjListArray[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest) {    //menambahkan tepi ke grafik DIRECTED
        adjListArray[src].add(dest);
    }
    // karena graph berarah maka 

    public String convert(int i) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        return alphabet[i];
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + convert(i) + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(convert(adjListArray[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph myList = new Graph(10);

        myList.addEdge(0, 1);
        myList.addEdge(0, 3);
        myList.addEdge(0, 4);
        myList.addEdge(3, 6);
        myList.addEdge(6, 7);
        myList.addEdge(7, 8);
        myList.addEdge(8, 5);
        myList.addEdge(5, 2);
        myList.addEdge(2, 1);
        myList.addEdge(1, 4);
        myList.addEdge(4, 7);
        myList.addEdge(4, 5);
        myList.addEdge(5, 7);
        myList.printGraph();
    }
}