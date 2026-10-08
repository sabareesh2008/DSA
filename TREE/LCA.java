class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class LCA {

    // Function to find Lowest Common Ancestor
    public static TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q) {

        // Base condition
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search in left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // Search in right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides contain a node,
        // current root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // If only left side contains a node
        if (left != null) {
            return left;
        }

        // Otherwise return right
        return right;
    }

    public static void main(String[] args) {

        /*
                 3
               /   \
              5     1
             / \   / \
            6   2 0   8
               / \
              7   4
        */

        // Create tree
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Given two nodes
        TreeNode p = root.left;          // 5
        TreeNode q = root.right;         // 1

        // Find LCA
        TreeNode result =
                lowestCommonAncestor(root, p, q);

        // Print result
        System.out.println(
                "Lowest Common Ancestor: " + result.val
        );
    }
}