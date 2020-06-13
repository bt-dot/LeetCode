class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        helper(0, nums, new ArrayList<>(), ans);
        return ans;
    }
    
    
    public void helper(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {        
        ans.add(new ArrayList<Integer>(current));       
        for (int i = index; i < nums.length; i++ ) {
            current.add(nums[i]);
            helper(i+1, nums, current, ans);
            current.remove(current.size()-1);
        }
    }
}