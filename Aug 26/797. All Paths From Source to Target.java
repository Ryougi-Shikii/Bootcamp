class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        path.add(0);
        dfs(0, graph);

        return ans;
    }

    private void dfs(int current, int[][] graph) {

        if (current == graph.length - 1) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int next : graph[current]) {

            path.add(next);

            dfs(next, graph);

            path.remove(path.size() - 1);
        }
    }
}