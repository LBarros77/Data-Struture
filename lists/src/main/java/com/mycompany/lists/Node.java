package com.mycompany.lists;

public class Node {
    private Node next;
    private int element;
    
    public Node(int element, Node next) {
        this.next = next;
        this.element = element;
    }
    
    public Node(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public int getElement() {
        return element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
