package com.mycompany.stacks;

public class Node {
    private int element;
    private Node next;
    private Node previus;
    
    public Node(int element, Node next) {
        this.next = next;
        this.element = element;
    }
    
    public Node(int element) {
        this.element = element;
    }
    
    public Node getPrevius() {
        return previus;
    }
    
    public void setPrevius(Node previus) {
        this.previus = previus;
    }

    public int getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
