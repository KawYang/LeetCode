public class TestDemo {
    public static void main(String[] args) {
        SolutionPro solution = new SolutionPro();
        int [] preorder = new int[]{3,9,20,15,7};
        int [] inorder = new int[] {9,3,15,20,7};
        TreeNode treeNode = solution.buildTree(preorder, inorder);
        TreeNode.Print(treeNode);
        System.out.println();
        TreeNode.Print2(treeNode);
    }
}
