public class Main {
    public static void main(String[] args) {
        VirusTree tree = new VirusTree();
        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(); 
        System.out.println();
        System.out.println("apakah diatas ini tree BST? " + tree.checkBST()); 
    }
}