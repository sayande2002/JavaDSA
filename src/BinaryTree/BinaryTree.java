package BinaryTree;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreefunc {
        static int idx = -1;
            public static Node buildTree(int nodes[]) {
                idx++;
                if (nodes[idx] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }
    }
    static void preorder(Node root)
    {
        if(root==null)
        {
//            System.out.print(-1+" "); Optional
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void postorder(Node root)
    {
        if (root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes +1 ;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);
        return leftNodes + rightNodes + root.data;
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight > rightHeight)
        {
            return leftHeight + 1;
        }
        else {
            return rightHeight +1;
        }

    }



    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1, -1};
        BinaryTreefunc tree = new BinaryTreefunc();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
//        preorder(root);
//        inorder(root);
//        postorder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
    }

}
