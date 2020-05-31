import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheAccessCodes {

    public static class Solution {

        public static int solution(int[] l) {

            // Generate a DAG where an edge from u to v implies that v is divisible by u
            Map<Integer, Set<Integer>> graph = new HashMap<>();
            for (int i = 0; i < l.length; i++) {
                Set<Integer> edges = new HashSet<>();
                int u = l[i];
                for (int j = i + 1; j < l.length; j++) {
                    int v = l[j];
                    if (v % u == 0) {
                        // Nodes will be identified by index, not value, as values
                        // may not be unique
                        edges.add(j);
                    }
                }
                graph.put(i, edges);
            }

            int result = 0;

            for (int u : graph.keySet()) {
                for (int v : graph.get(u)) {
                    // There exists a edge from u to v. If v has an edge to any other
                    // node, this forms a "lucky triplet"
                    result += graph.get(v).size();
                }
            }

            return result;

        }
    }

}