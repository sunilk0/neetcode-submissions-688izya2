/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
     //level order
     
    //  if(root == null) return 0

    //  val queue: ArrayDeque<TreeNode> = ArrayDeque()
    //  queue.addLast(root)
    //  var level = 0

    //  while(queue.isNotEmpty()){
    //     val size = queue.size
 
    //   repeat(size){
    //   val node = queue.removeFirst()

    //     if(node.left != null){
    //         queue.addLast(node.left)
    //     }

    //     if(node.right != null){
    //      queue.addLast(node.right)
    //      }
    //   }

    //       level++ 
    //  }
    //   return level


    if(root == null) return 0

    return 1 + maxOf(maxDepth(root.left), maxDepth(root.right))

    }
}
