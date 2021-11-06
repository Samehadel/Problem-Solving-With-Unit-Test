package root;

import java.util.List;

public class KeysAndRooms {

    private static int numVisited = 0;

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        numVisited = 0;

        visitAllNodes(rooms, new boolean[rooms.size()], 0);

        if (numVisited == rooms.size())
            return true;

        return false;
    }

    public static void visitAllNodes(List<List<Integer>> nodes, boolean[] visited, int current) {
        visited[current] = true;
        numVisited++;
        for (int node : nodes.get(current)) {
            if (!visited[node])
                visitAllNodes(nodes, visited, node);
        }
    }
}
