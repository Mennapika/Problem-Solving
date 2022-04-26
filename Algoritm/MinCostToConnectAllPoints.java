class Solution {
    public int minCostConnectPoints(int[][] points) {
       int n = points.length;
        graph g = new graph(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                g.edge.add(new graph.Edge(i, j, dist));
            }
        }
        return g.Kruskal();
        
    }
    static class graph {
        int V;
        List<Edge> edge;

        static class Edge implements Comparable<Edge> {
            int src;
            int dest;
            int weight;

            Edge(int src, int dest, int weight) {
                this.weight = weight;
                this.src = src;
                this.dest = dest;
            }

            public Edge() {

            }

            public int compareTo(Edge compareEdge) {
                return this.weight - compareEdge.weight;
            }

        }

        class subset
        {
            int parent, rank;
        };

        public graph(int v) {
            this.V = v;
            edge = new ArrayList<Edge>();


        }

        int find(subset subsets[], int i)
        {

            if (subsets[i].parent != i)
                subsets[i].parent
                        = find(subsets, subsets[i].parent);

            return subsets[i].parent;
        }


         void union(subset subsets[], int x, int y)
        {
            int xroot = find(subsets, x);
            int yroot = find(subsets, y);


            if (subsets[xroot].rank
                    < subsets[yroot].rank)
                subsets[xroot].parent = yroot;
            else if (subsets[xroot].rank
                    > subsets[yroot].rank)
                subsets[yroot].parent = xroot;

            else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;
            }
        }

        int Kruskal() {

            Edge result[] = new Edge[V];


            int e = 0;


            int i = 0;
            for (i = 0; i < V; ++i)
                result[i] = new Edge();


            Collections.sort(edge);


            subset subsets[] = new subset[V];
            for (i = 0; i < V; ++i)
                subsets[i] = new subset();

            for (int v = 0; v < V; ++v) {
                subsets[v].parent = v;
                subsets[v].rank = 0;
            }

            i = 0;


            while (e < V - 1) {

                Edge next_edge = edge.get(i++);

                int x = find(subsets, next_edge.src);
                int y = find(subsets, next_edge.dest);


                if (x != y) {
                    result[e++] = next_edge;
                    union(subsets, x, y);
                }

            }



            int minimumCost = 0;
            for (i = 0; i < e; ++i) {

                minimumCost += result[i].weight;
            }
            return minimumCost;
        }

    }
}
