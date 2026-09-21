public class binary_tree {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    Node root;

    public binary_tree(int data) {
        root = new Node(data);
    }



    static void insertLeft(Node node,int data){
        node.left = new Node(data);
    }



    static void insertRigth(Node node,int data){
        node.right = new Node(data);
    }



    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {

        binary_tree tree = new binary_tree(1);
        insertLeft(tree.root, 2);
        insertRigth(tree.root, 3);


        insertLeft(tree.root.right, 7);
        insertRigth(tree.root.right, 8);
        
        preOrder(tree.root);
        System.out.println();
        inOrder(tree.root);
        System.out.println();
        postOrder(tree.root);


    }
}