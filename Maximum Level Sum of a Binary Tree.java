class Solution {
    public int maxLevelSum(TreeNode root) 
    {
        int level = 0;  
        
        if(root==null)
        {
            return 1;
        }
        
        int ans = 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        int max = Integer.MIN_VALUE; 
        
        while(!q.isEmpty())
        {
            int s = 0;
            int size = q.size();
            level++;
            
            for(int i=0;i<size;i++)
            {
                TreeNode rem = q.remove();
                
                s+=rem.val;
                
                if(rem.left!=null)
                {
                    q.add(rem.left);
                }
                
                if(rem.right!=null)
                {
                    q.add(rem.right);
                }
            }
            
            if(max<s)
            {
                ans = level;
                max = s;
            }
        }
        
        return ans;
    }
}
