class Solution {
    private int count = 0;
    public int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }
    public void inorder(TreeNode root, int k) {
        if(root == null) {
            return;
        }
        inorder(root.left, k);
        count++;
        if(k == count) {
            result = root.val;
            return;
        }
        inorder(root.right, k);
    }
}
