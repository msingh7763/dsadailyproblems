// class Solution {
//     public boolean validPath(int n, int[][] edges, int source, int destination) {

//         List<List<Integer>> graph = new ArrayList<>();
//         for(int i = 0; i < n; i++){
//             graph.add(new ArrayList<>());
//         }

//         for(int[] e : edges){
//             graph.get(e[0]).add(e[1]);
//             graph.get(e[1]).add(e[0]);
//         }

//         boolean[] visited = new boolean[n];
//         Queue<Integer> q = new LinkedList<>();
//         q.offer(source);
//         visited[source] = true;

//         while(!q.isEmpty()){
//             int node = q.poll();
//             if(node == destination){
//                 return true;
//             }

//             for(int nei : graph.get(node)){
//                 if(!visited[nei]){
//                     visited[nei] = true;
//                     q.offer(nei);
//                 }
//             }
//         }

//         return false;
//     }
// }

class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge:edges) {
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        return dfs(source,destination,adj,vis);
    }

    public boolean dfs(int node, int dest,ArrayList<ArrayList<Integer>> adj,
                    boolean[] vis) {

        if(node==dest){
            return true;
        }
        vis[node] = true;
        for(int neigh:adj.get(node)) {
            if(!vis[neigh]) {
                if(dfs(neigh,dest,adj,vis))
                    return true;
            }
        }
        return false;
    }
}
