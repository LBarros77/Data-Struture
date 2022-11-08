package com.mycompany.lists;

import com.mycompany.lists.Node;

public class EncadeadeList {
    private Node init;
    private Node end;
    private int totalElements;
    
    public void addInit(int element) {
        Node nw = new Node(element, this.init);
        this.init = nw;
        if(this.totalElements == 0) {
            this.end = nw;
        }
        totalElements++;
    }
    
    public void addEnd(int element) {
        if(this.totalElements == 0) {
            this.addInit(element);
        }else {
            Node nw = new Node(element);
            this.end.setNext(nw);
            this.end = nw;
            this.totalElements++;
        }
    }
    
    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[]";
        }
        StringBuilder s = new StringBuilder("[");
        Node current = this.init;
        for(int i = 0; i < this.totalElements - 1; i++) {
            s.append(current.getElement());
            s.append(", ");
            current = current.getNext();
        }
        s.append(current.getElement());
        s.append("]");
        return s.toString();
    }
    
    public boolean validPosition(int position) {
        return position >= 0 && position < this.totalElements;
    }
    
    private Node getNode(int position) {
        if(this.validPosition(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        Node current = this.init;
        for(int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current;
    }
    
    public void add(int position, int element) {
        if(position == 0) {
            this.addInit(element);
        }else if(position == this.totalElements - 1) {
            this.addEnd(element);
        }else {
            Node previus = this.getNode(position - 1);
            Node nw = new Node(element, previus.getNext());
            previus.setNext(nw);
            this.totalElements++;
        }
    }
    // Question 1
    public void movBigForEnd() {
        Node current = this.init;
        int position = -1;
        int element = current.getElement();
        for(int i = 0; i < this.totalElements - 1; i++) {
            if(current.getElement() > this.init.getElement()) {
                position = i;
                element = current.getElement();
                current = current.getNext();
            }
            current = current.getNext();
        }
        if(position >= 0) {
            this.add(position, current.getElement());
            this.addEnd(element);
        }
    }
    // Question 4
    // Setar o primeiro elemento da segunda lista
    public void addEnd(int element, Node list2) {
        if(this.totalElements == 0) {
            this.addInit(element);
        }else {
            this.end.setNext(list2);
            this.end = list2;
            this.totalElements++;
        }
    }
}
