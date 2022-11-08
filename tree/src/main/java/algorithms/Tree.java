package algorithms;

import constructor.Node;

public class Tree {
    public Node root;
    
    public Tree() {
        this.root = null;
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }
    // Question 3
    public void description(int number) {
        if(isEmpty()) {
            this.root = new Node(number);
        }else {
            int parentNumber;
            boolean binary = false;
            Node current = this.root;
            
            while(current != null) {
                if(number < current.getValue()) {
                    if(current.getLeft() == null) {
                        Node nw = new Node(number);
                        current.setLeft(nw);
                        nw.setParent(current); 
                    }
                    current = current.getLeft();
                }else {
                    if(current.getRight() == null) {
                        Node nw = new Node(number);
                        current.setLeft(nw);
                        nw.setParent(current);
                        
                        binary = true;
                    }
                    current = current.getRight();
                }
            }
        }
    }
    
    public Node search(int number) {
        Node current = this.root;
        while(current != null) {
            if(current.getValue() == number) {
                return current;
            }else if(number < current.getValue()) {
                current = current.getLeft();
            }else {
                current = current.getRight();
            }
        }
        return null;
    }
    
    public int height(Node no) {
        if(no == null) {
            return -1;
        }else {
            return 1+Math.max(height(no.getLeft()), height(no.getRight()));
        }
    }
}
