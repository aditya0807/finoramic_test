/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int sum=0;
        recursive_sum(A,ans,B,temp);
        return ans;
    }
    
    void recursive_sum(TreeNode A,ArrayList<ArrayList<Integer>> ans,int b,ArrayList<Integer> temp)
    {
        if(A==null)
        return;
        if(A.left==null&&A.right==null)
        {
            b-=A.val;
            if(b==0)
            {
                temp.add(A.val);
                ans.add(new ArrayList<Integer>(temp));
                temp.remove(temp.size()-1);
            }
            b+=A.val;
            return;
        }
        
        temp.add(A.val);
        recursive_sum(A.left,ans,b-A.val,temp);
        recursive_sum(A.right,ans,b-A.val,temp);
        temp.remove(temp.size()-1);
    }
}
