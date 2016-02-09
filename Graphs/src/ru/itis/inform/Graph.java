package ru.itis.inform;

public interface Graph {

    /**
     * Добавление вершины в граф
     */
    void addVertex();

    /**
     * Добавление ребра
     * @param vertexA первая вершина
     * @param vertexB вторая вершина
     */
    void addEdge(int vertexA, int vertexB);

    /**
     * Вывод графа на экран
     */
    void showGraph();
}
