import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();

        visited[0] = true;
        q.offer(0);
        int visitedCount = 1;

        while (!q.isEmpty()) {
            int currentRoom = q.poll();

            for (int key : rooms.get(currentRoom)) {
                if (!visited[key]) {
                    visited[key] = true;
                    visitedCount++;
                    q.offer(key);
                }
            }
        }

        return visitedCount == n;
    }
}