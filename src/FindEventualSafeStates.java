import java.util.ArrayList;
import java.util.List;

public class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if(graph[i].length == 0) {
                list.add(i);
            }
        }
        
        System.out.println(list);
        return list;
    }

}
