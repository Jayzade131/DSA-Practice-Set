package BinaryTree;

import Arrays.Que1;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImple {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
        static class BinaryTree {
            static int index = -1;

            public static Node buildTree(int[] nodes) {
                index++;
                if (nodes[index] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[index]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }

        }

        public  static  void preorder(Node root)
        {
            if(root==null)
            {
                return ;
            }
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }

    public  static  void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }

        inorder(root.left);

    }

    public  static  void postorder(Node root)
    {
        if(root==null)
        {
            return ;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root)
    {
            if(root==null)
            {
              return;
            }
        Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currentNode =q.remove();
                if(currentNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }else{
                        q.add(null);
                    }

                }
                else{
                    System.out.print(currentNode.data+" ");
                    if(currentNode.left !=null)
                    {
                        q.add(currentNode.left);
                    }
                    if(currentNode.right !=null)
                    {
                        q.add(currentNode.right);
                    }

                }

            }
    }

    public static int countNode(Node root){
        if(root==null)
        {
            return 0;
        }

        int leftNode=countNode(root.left);
        int rightNode=countNode(root.right);

        return  leftNode+rightNode+1;
    }

    public static int sumNode(Node root){
        if(root==null)
        {
            return 0;
        }

        int leftNode=sumNode(root.left);
        int rightNode=sumNode(root.right);

        return  leftNode+rightNode+root.data;
    }

    public static int height(Node root){
        if(root==null)
        {
            return 0;
        }

        int leftNode=height(root.left);
        int rightNode=height(root.right);

       int myheight = Math.max(leftNode,rightNode)+1;
       return myheight;
    }

    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree=new BinaryTree();
    Node root=  tree.buildTree(nodes);
    preorder(root);

    }


}
