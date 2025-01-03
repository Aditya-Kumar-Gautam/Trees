
class Node{
    int data;
    Node left;
    Node right;
    Node(int value){
        data = value;
        left = null;
        right = null;
    }
}
public class LC_100 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);
        preorder(root);
    }
    public static void preorder(Node tree){
        if(tree == null){
            return;
        }
        System.out.print(tree.data);
        preorder(tree.left);
        preorder(tree.right);
    }
}
