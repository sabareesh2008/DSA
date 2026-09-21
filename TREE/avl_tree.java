

public class avl_tree {

    static class Node{
        Node left;
        Node right;
        int data,height;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
            height=0;
        }
    }
    Node root;

    public avl_tree(int data) {
        root = new Node(data);
    }
    static int height(Node root){
        if(root==null) return -1;
        return root.height;
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
        root.height=Math.max(height(root.left),height(root.right))+1;
        
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
        avl_tree tree= new avl_tree(50); // 5 2 1 3 7 9 8 6
        insert(tree.root, 20);
        insert(tree.root, 60);
        insert(tree.root, 10);
        insert(tree.root, 30);
        insert(tree.root, 40);
       
    }
}

