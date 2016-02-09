package ru.itis.inform;

/**
 * Created by Irinoise on 08.02.2016.
 */
public class GraphMatrixImpl implements Graph {

    private static final int DEFAULT_SIZE = 50;
    /**
     * Тут храним вершины и ребра
     */
    private int matrix[][];

    /**
     * Сколько вершин сейчас в графе. Вершины нумеруются от 0.
     */
    private int verticesCount;

    private int maxSize;

    public GraphMatrixImpl() {
        initGraph(DEFAULT_SIZE);
    }

    public GraphMatrixImpl(int maxSize) {
        initGraph(maxSize);
    }

    private void initGraph(int maxSize) {
        this.maxSize = maxSize;
        this.verticesCount = 0;
        this.matrix = new int[maxSize][maxSize];
    }

    @Override
    public void addVertex() {
        if (this.verticesCount < this.maxSize) {
            this.verticesCount++;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void addEdge(int vertexA, int vertexB) {
        if (vertexA < verticesCount && vertexB < verticesCount) {
            this.matrix[vertexA][vertexB] = 1;
            this.matrix[vertexB][vertexA] = 1;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void showGraph() {
        for (int i = 0; i < verticesCount; i++) {
            for (int j = 0; j < verticesCount - 1; j++) {
                System.out.print(matrix[i][j] + ",  ");
            }
            System.out.println(matrix[i][verticesCount - 1]);
        }
    }
}
