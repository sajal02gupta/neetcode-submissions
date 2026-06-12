/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return root
        var left :TreeNode?= null
        var right :TreeNode?= null
        if (root.left != null) {
            left = root.left
        }
        if (root.right != null) {
            right = root.right
        }
        root.left = right
        root.right = left
        invertTree(root.left)
        invertTree(root.right)
        return root
    }
}
