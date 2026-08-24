class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        int[] state = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(graph, state, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> graph,
                             int[] state,
                             int course) {

        // Currently visiting → cycle
        if (state[course] == 1) {
            return true;
        }

        // Already completely processed → no cycle from here
        if (state[course] == 2) {
            return false;
        }

        state[course] = 1;

        for (int next : graph.get(course)) {
            if (hasCycle(graph, state, next)) {
                return true;
            }
        }

        state[course] = 2;

        return false;
    }
}