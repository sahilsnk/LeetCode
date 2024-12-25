import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumNumberofKDivisibleComponents {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int[] result = new int[1];

        dfs(0, adj, values, k, visited, result);
        return result[0];
    }
    private int dfs(int node, List<List<Integer>> adj, int[] values, int k, boolean[] visited, int[] result) {
        visited[node] = true;
        int subtreeSum = values[node];
        int componentCount = 0;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                int childSum = dfs(neighbor, adj, values, k, visited, result);
                if (childSum % k == 0) {
                    componentCount++;
                } else {
                    subtreeSum += childSum;
                }
            }
        }
        if (subtreeSum % k == 0) {
            componentCount++;
        }
        result[0] = Math.max(result[0], componentCount);
        return subtreeSum;
    }
}
