class Solution {

    public static TreeNode helper(int nums[] , int st , int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums , st , mid-1);
        root.right = helper(nums , mid+1,end);

        return root;
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums , 0,nums.length-1);
    }
}
