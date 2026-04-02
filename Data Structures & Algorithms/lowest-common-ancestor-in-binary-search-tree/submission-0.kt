/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      var curr = root

      while(curr != null){
        if(p != null && q != null && p.`val`< curr.`val` && q.`val`< curr.`val`){
         curr = curr.left
        } else if(p != null && q != null && p.`val`> curr.`val` && q.`val` > curr.`val`){
        curr =curr.right
        } else {
          return curr
        }
      }
      return null
    }
}
