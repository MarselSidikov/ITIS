#include <iostream>

using namespace std;

const int MAX_VERTICES_COUNT = 10;

struct GraphMatrixImpl
{
    int matrix[MAX_VERTICES_COUNT][MAX_VERTICES_COUNT];
    int verticesCount;
};
void FillZeros(GraphMatrixImpl *&graph);

void Create(GraphMatrixImpl *&graph)
{
    graph = new GraphMatrixImpl;
    graph->verticesCount = 0;
}
void Create(GraphMatrixImpl *&graph, int verticesCount)
{
    if (verticesCount < MAX_VERTICES_COUNT)
    {
        graph->verticesCount = verticesCount;
        FillZeros(graph);
    } else cout << "Vertices to many" << endl;
}
void FillZeros(GraphMatrixImpl *&graph)
{
    for (int i = 0; i < graph->verticesCount; i++)
    {
        for (int j = 0; j < graph->verticesCount; j++)
        {
            graph->matrix[i][j] = 0;
        }
    }
}
void AddVertex(GraphMatrixImpl *&graph)
{
    if (graph->verticesCount < MAX_VERTICES_COUNT)
    {
        graph->verticesCount++;
    } else cout << "Vertices to many" << endl;
}

void Show(GraphMatrixImpl *graph)
{
    for (int i = 0; i < graph->verticesCount; i++)
    {
        for (int j = 0; j < graph->verticesCount; j++)
        {
            cout << graph->matrix[i][j] << ' ';
        }
        cout << endl;
    }
}
int main()
{
    GraphMatrixImpl *graph;
    Create(graph, 5);
    Show(graph);
}
