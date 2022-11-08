package constructor;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private Node parent;
    
    public Node(int value) {
        this.value = value;
        Node left = null;
        Node right = null;
        Node parent = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getParent() {
        return parent;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
