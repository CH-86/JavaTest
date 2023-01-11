import java.util.ArrayList;
/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-10-12 12:33
 */


class Node{
    int data;
    Node right;
    Node left;

    public void NodeToArray(Node node, ArrayList arr){
        if(node == null)
            return ;

        NodeToArray(node.left, arr);
        arr.add(node.data);
        NodeToArray(node.right, arr);
    }
}


class Test {
    public static void main(String[] args) {
        int[] l = {2,1,9,5,4,6,5,1,2,8,13,9};

        Node root = new Node();
        if(l.length > 0){
            root.data = l[0];
        }

        for(int i = 1; i < l.length; i++) {
            Node node = root;
            while (node.data != l[i]){
                if (node.data < l[i]){
                    if (node.right == null){
                        Node newNode = new Node();
                        newNode.data = l[i];
                        node.right = newNode;
                    }
                    else node = node.right;
                }
                if (node.data > l[i]){
                    if (node.left == null){
                        Node newNode = new Node();
                        newNode.data  = l[i];
                        node.left = newNode;
                    }
                    else node = node.left;
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        root.NodeToArray(root, arr);

        System.out.println(arr);
    }
}
