/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> al = new ArrayList<>();
        traverse(root, al);
        return al;
    }

    private void traverse(Node root, List<Integer> al) {
        if (root == null) return;

        al.add(root.val); 

        for (Node child : root.children) { 
            traverse(child, al);
        }
    }
}
