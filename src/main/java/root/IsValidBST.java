package root;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IsValidBST {

    private static List<Integer> list;

    public static boolean isValidBST(TreeNode root) {
        list = new ArrayList<>();

        traverse(root);

        for(int i = 0; i < list.size() - 1; i++){
            if(!(list.get(i) < list.get(i + 1)))
                return false;
        }

        return true;
    }

    public static void traverse(TreeNode node){

        if(node == null)
            return;

        if(node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }

        traverse(node.left);
        list.add(node.val);
        traverse(node.right);
    }
}
