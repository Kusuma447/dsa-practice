import java.util.ArrayList;
import java.util.List;

// 1. Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// 2. Your original solution logic
class Solution { 
    void traverse(TreeNode node, List<Integer> list){ 
        if(node == null) return; 
        traverse(node.left, list); 
        list.add(node.val); 
        traverse(node.right, list); 
    } 
    
    public boolean findTarget(TreeNode root, int k) { 
        List<Integer> list = new ArrayList<>(); 
        traverse(root, list); 
        int l = 0; 
        int r = list.size() - 1; 
        while(l < r){ 
            if(list.size() == 1 && list.get(0) != k) return false; 
            if(list.get(l) + list.get(r) == k){ 
                return true; 
            } 
            if(list.get(l) + list.get(r) < k){ 
                l++; 
            } 
            else{ 
                r--; 
            } 
        } 
        return false; 
    } 
}

// 3. Driver Code to execute and test the program
public class Tree {
    public static void main(String[] args) {
        /*
               Constructing a Binary Search Tree (BST):
                     5
                    / \
                   3   6
                  / \   \
                 2   4   7
        */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();

        // Test Case 1: Target sum = 9 (3 + 6 or 2 + 7) -> Should return true
        int target1 = 9;
        boolean result1 = solution.findTarget(root, target1);
        System.out.println("Does a pair exist with sum " + target1 + "? " + result1);

        // Test Case 2: Target sum = 28 -> Should return false
        int target2 = 28;
        boolean result2 = solution.findTarget(root, target2);
        System.out.println("Does a pair exist with sum " + target2 + "? " + result2);
    }
}
