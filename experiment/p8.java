import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;
    public int compareTo(Edge e) { return this.weight - e.weight; }
}

public class Kruskal {
    int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        parent[find(parent, x)] = find(parent, y);
    }

    void kruskal(Edge[] edges, int V) {
        Arrays.sort(edges);
        int[] parent = new int[V];
        for (int i=0;i<V;i++) parent[i]=i;

        for (Edge e : edges) {
            int x = find(parent, e.src);
            int y = find(parent, e.dest);

            if (x != y) {
                System.out.println(e.src+"-"+e.dest);
                union(parent, x, y);
            }
        }
    }

    public static void main(String[] args) {
        Edge[] edges = new Edge[3];
        for (int i=0;i<3;i++) edges[i]=new Edge();

        edges[0].src=0; edges[0].dest=1; edges[0].weight=10;
        edges[1].src=1; edges[1].dest=2; edges[1].weight=15;
        edges[2].src=0; edges[2].dest=2; edges[2].weight=5;

        new Kruskal().kruskal(edges, 3);
    }
}
