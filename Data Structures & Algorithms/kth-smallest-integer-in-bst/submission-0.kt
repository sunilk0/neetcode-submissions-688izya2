/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private val arr = mutableListOf<Int>()
    
    fun kthSmallest(root: TreeNode?, k: Int): Int { 
      //left->node->right ascending order.
        dfs(root)
        return arr[k-1]
      
    }
      fun dfs(node: TreeNode?){
        if(node == null){
            return
        }

        dfs(node.left)
        arr.add(node.`val`)
        dfs(node.right)
    }

}
