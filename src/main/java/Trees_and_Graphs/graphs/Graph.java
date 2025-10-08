package Trees_and_Graphs;

class GraphMatrix {
    int[][] matrix;
    int vertices;

    GraphMatrix(int v) {
        vertices = v;
        matrix = new int[v][v];
    }

    void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1; // undirected
    }

    void printMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            GraphMatrix g = new GraphMatrix(4);
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 3);
            g.addEdge(2, 3);
            g.printMatrix();
        }


}
