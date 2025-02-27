class Solution {
    public boolean isSymmetric(TreeNode r) {
        return r == null || chk(r.left, r.right);
    }

    private boolean chk(TreeNode l, TreeNode r) {
        if (l == null || r == null) return l == r;
        return l.val == r.val && chk(l.left, r.right) && chk(l.right, r.left);
    }
}
