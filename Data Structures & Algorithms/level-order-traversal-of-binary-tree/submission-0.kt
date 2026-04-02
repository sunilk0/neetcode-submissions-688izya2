/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if(root == null) return result

        var curr = root
        val queue = ArrayDeque<TreeNode>()
        queue.add(root)

        while(queue.isNotEmpty()) {
           val level= mutableListOf<Int>()
           val qsize = queue.size

           repeat(qsize){
             val node = queue.removeFirst()
             level.add(node.`val`)

             if(node?.left != null){
              queue.add(node.left)
             }

             if(node?.right != null){
               queue.add(node.right)
             }
           }
           result.add(level)
        }
     return result

    }
}
