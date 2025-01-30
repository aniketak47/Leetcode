class Solution {
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adjlst = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            adjlst.add(new ArrayList<>());
        }
        for(int[] edge: edges) {
            adjlst.get(edge[0]).add(edge[1]);
            adjlst.get(edge[1]).add(edge[0]);
        }
        int[] colors = new int[n+1];
        Arrays.fill(colors, -1);
        List<List<Integer>> components = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            if(colors[i]==-1){
                List<Integer> component = new ArrayList<>();
                if(!isBipartite(i, 0, adjlst, component, colors))
                return -1;
                components.add(component);
            }
        }
        int total = 0;
        for(List<Integer> component: components) {
            total+=maxGroups(component, adjlst, n);
        }
        return total;
    }
    private boolean isBipartite(int u, int c, List<List<Integer>> adjlst, List<Integer> component, int[] colors){
        if(colors[u]!=-1)
        return colors[u]==c;
        colors[u]=c;
        component.add(u);
        for(int v: adjlst.get(u)){
            if(!isBipartite(v, 1-c, adjlst, component, colors))
            return false;
        }
        return true;
    }
    private int maxGroups(List<Integer> component, List<List<Integer>> adjlst, int n) {
        int ans = 0;
        for(int start: component){
            int[] depth = new int[n+1];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            depth[start]=1;
            while(!queue.isEmpty()){
                int u = queue.poll();
                ans = Math.max(ans, depth[u]);
                for(int v: adjlst.get(u)){
                    if(depth[v]==0){
                        depth[v]=depth[u]+1;
                        queue.add(v);
                    }
                }
            }
        }
        return ans;
    }
}