class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    static public void Print(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        System.out.print(treeNode.val + "\t");
        Print(treeNode.left);
        Print(treeNode.right);

    }

    static public void Print2(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        Print(treeNode.left);
        System.out.print(treeNode.val + "\t");
        Print(treeNode.right);

    }

}