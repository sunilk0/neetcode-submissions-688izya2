/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
    //  if(root == null) return null

    //  val temp = root.left
    //  root.left = root.right
    //  root.right = temp

    //  invertTree(root.left)
    //  invertTree(root.right)

    //  return root

    if(root == null) return null

    val queue: ArrayDeque<TreeNode> = ArrayDeque()
    queue.add(root)

    while(queue.isNotEmpty()){
        val node = queue.removeFirst()
        if(node!=null){
            val temp = node.left
            node.left = node.right
            node.right = temp
           if(node.left!=null)
            queue.add(node.left)
             if(node.right!=null)
            queue.add(node.right)
        }
    }
    return root
    }
}
