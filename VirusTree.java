public class VirusTree {
    Node root;

    public VirusTree() {
        root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(12);
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }
    private void preorderHelper (Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s", node.getData());
        preorderHelper(node.left);
        preorderHelper(node.right);
    }
    public boolean checkBST() {
        return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBSTHelper(Node node, int min, int max) {
        if (node == null) {
            return false;
        }
        if (node.getData() <= min || node.getData() >= max) {
            return false;
        } else {
            return checkBSTHelper(node.left, min, node.getData()) &&
               checkBSTHelper(node.right, max, node.getData());
        }
    }
}