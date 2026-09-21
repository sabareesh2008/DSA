

public class binary_search_tree {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    Node root;

    public binary_search_tree(int data) {
        root = new Node(data);
    }
    
    static void insert(Node root,int data){
        if(root.data>data){
            if(root.left==null){
                root.left=new Node(data);
            }
            else{
                insert(root.left,data);
            }
        }
        else{
            if(root.right==null){
                root.right=new Node(data);
            }
            else{
                insert(root.right, data);
            }
        }
    }

    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static Node search(Node root,int data){
        if(root==null){
            System.out.println("\nNot found "+data);
            return null;
        }
        if(root.data==data){
            System.out.println("\nFound "+data);
            return null;
        }
        if(root.data>data){
            return search(root.left,data);
        }
        return search(root.right,data);
    }
    public static void main(String[] args) {
        binary_search_tree tree= new binary_search_tree(5); // 5 2 1 3 7 9 8 6
       insert(tree.root,2 );
        insert(tree.root, 1);
        insert(tree.root, 3);
        insert(tree.root, 7);
        insert(tree.root, 9);
        insert(tree.root, 8);
        insert(tree.root, 6);
        inOrder(tree.root);

        search(tree.root,9);

    }
}
