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
        graph = new GraphMatrixImpl;
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
void AddEdge(GraphMatrixImpl *&graph, int iVertex, int jVertex)
{
    if (iVertex < graph->verticesCount
        && jVertex < graph->verticesCount)
    {
        graph->matrix[iVertex][jVertex] = 1;
        graph->matrix[jVertex][iVertex] = 1;
    } else cout << "Vertext not exist" << endl;
}
void Show(GraphMatrixImpl *graph)
{
    cout << "  ";
    for (int i = 0; i < graph->verticesCount; i++)
    {
        cout << i << "|";
    }
    cout << endl;
    int columnIndex = 0;
    for (int i = 0; i < graph->verticesCount; i++)
    {
        cout << columnIndex << '|';
        for (int j = 0; j < graph->verticesCount; j++)
        {
            cout << graph->matrix[i][j] << ' ';
        }
        columnIndex++;
        cout << endl;
    }
}
int main()
{
    GraphMatrixImpl *graph;
    Create(graph, 5);
    AddEdge(graph, 2, 3);
    AddEdge(graph, 4, 1);
    Show(graph);
    AddEdge(graph,5,6);
}
