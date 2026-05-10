# Graph Traversal Project

## Overview
This project implements graph traversal using BFS (Breadth-First Search) and DFS (Depth-First Search) in Java.

## Graph Structure
A graph consists of vertices (nodes) and edges (connections). This project uses an adjacency list to represent the graph.

## Algorithms

### BFS (Breadth-First Search)
BFS explores the graph level by level. It uses a queue data structure.

### DFS (Depth-First Search)
DFS explores as deep as possible before backtracking. It uses recursion.

## Results

| Graph Size | BFS Time | DFS Time |
|-----------|---------|---------|
| 10        | 57811100 | 2878600 |
| 30        | 61916300 | 10707400 |
| 100       | 64630300 | 83598500 |

## Analysis

- As the graph size increases, execution time also increases.
- DFS was faster for small and medium graphs.
- BFS was faster for large graphs in this experiment.
- Both BFS and DFS follow O(V + E) time complexity.
- BFS is useful for finding the shortest path.
- DFS can be slower in deep or large graphs.

## Conclusion

This project helped understand graph traversal algorithms and their performance differences.

## Reflection

In this project, I learned how BFS and DFS work and how graph size affects performance. Implementing the graph using adjacency lists helped me understand data structures better. One challenge was understanding recursion in DFS.
