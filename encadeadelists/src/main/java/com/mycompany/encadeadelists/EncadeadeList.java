package com.mycompany.encadeadelists;

public class EncadeadeList {
    private Node init;
    private Node end;
    private int totElement;

    public EncadeadeList(Node init, Node end, int totElement) {
        this.init = init;
        this.end = end;
        this.totElement = totElement;
    }

    
    public void addInit(Object element) {
        Node nw = new Node(element, this.init);
        this.init = nw;
        if(this.totElement == 0) this.end = nw;
        this.totElement++;
     }
    
    public void addEnd(Object element) {
        if(this.totElement == 0) this.addInit(element);
        
        Node nw = new Node(element);
        this.end.setNext(nw);
        this.end = nw;
        this.totElement++;
    }
    
    public boolean isPosition(int position) {
        return position >= 0 && position < this.totElement;
    }
    
    private Node getNode(int position) {
        if(this.isPosition(position)) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        Node current = this.init;
        
        for(int i = 0; i < position; i++) {
            current = current.getNext();
        }
        
        return current;
    }
    
    public void add(int position, Object element) {
        if(position == 0) this.addInit(element);
        if(position == this.totElement - 1) this.addEnd(element);
        
        Node previus = this.getNode(position - 1);
        Node nw = new Node(element, previus.getNext());
        
        previus.setNext(nw);
        this.totElement++;
    }
    
    public Object getPosition(int position) {
        return this.getNode(position);
    }
    
    public void rmInit() {
        this.init = this.init.getNext();
        this.totElement--;
        
        if(this.totElement == 0) this.end = null;
    }
    
    public void rmEnd() {
        if(this.totElement == 0) {
            System.out.println("Empt list");
        } else if(this.totElement == 1) {
            this.rmInit();
        } else {
            Node penultimo = this.getNode(this.totElement - 2);
            penultimo.setNext(null);
            this.end = penultimo;
            this.totElement--;
        }
    }
    
    public boolean rmPosition (int position) {
        if(this.isPosition(position)) {
            if(position == 0) {
                this.rmInit();
                return true;
            } else if(position == this.totElement - 1) {
                this.rmEnd();
                return true;
            } else {
                Node previus = this.getNode(position);
                Node current = previus.getNext();
                
                previus.setNext(current.getNext());
                
                this.totElement--;
                
                return true;
            }
        }
        
        return false;
    }
    
    public boolean contain(Object element) {
        Node current = this.init;
        
        for(int i = 0; i < this.totElement - 1; i++) {
            if(current.getElement().equals(element)) return true;
            
            current = current.getNext();
        }
        
        return false;
    }
    
    // ESSENTIALS
    @Override
    public String toString() {
        if(this.totElement == 0) return "[]";
        
        StringBuilder strb = new StringBuilder("[");
        Node current = this.init;
        
        for(int i = 0; i < this.totElement - 1; i++) {
            strb.append(current.getElement());
            strb.append(", ");
            current = current.getNext();
        }
        strb.append(current.getElement());
        strb.append("]");
        return strb.toString();
    }
    
    public Node getInit() {
        return init;
    }

    public Node getEnd() {
        return end;
    }

    public int getTotElement() {
        return totElement;
    }

    public void setInit(Node init) {
        this.init = init;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public void setTotElement(int totElement) {
        this.totElement = totElement;
    }
}
