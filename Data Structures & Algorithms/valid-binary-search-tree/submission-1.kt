/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        //nod.val ->(left,right) return false
        //recursive (left,node.val) also, (node.val,right)
        return valid(root, Int.MIN_VALUE, Int.MAX_VALUE)
    }

    fun valid(node:TreeNode?, left: Int, right: Int) :Boolean {

        if(node == null) return true

        val value = node.`val`
        if(value <= left || value >= right){
            return false
        }

        return valid(node.left, left, value) && valid(node.right, value,right)
    }
}
