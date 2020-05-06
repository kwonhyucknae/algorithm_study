class Solution {
    boolean init;
    int min;
    int prev;

    public int getMinimumDifference(TreeNode root) {

        min = Integer.MAX_VALUE;
        inorder(root);
        return min;

    }


    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        if (init == false) {
            init = true;
        } else {
            min = Math.min(min, node.val - prev);
        }

        prev = node.val;

        inorder(node.right);

    }
}