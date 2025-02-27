class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);

    for (int i = 0; i < ans.size()-1; i++) {
        if(ans.get(i).compareTo(ans.get(i+1))>= 0){
            return false;
        }
    }
    return true;
}
