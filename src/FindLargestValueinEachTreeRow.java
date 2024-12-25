import java.util.ArrayList;
import java.util.List;

public class FindLargestValueinEachTreeRow {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> integerList = new ArrayList<>();
    public void helper(TreeNode root, int level) {
        if (root == null) return;
        if (integerList.size() > level) {
            int currentMax = integerList.get(level);
            if (root.val > currentMax) {
                integerList.set(level, root.val);
            }
        } else {
            integerList.add(root.val);
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
    public List<Integer> largestValues(TreeNode root) {
        helper(root, 0);
        return integerList;
    }
}
