public class Node {

    private int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
    public int getData(){
        return data;
    }
}