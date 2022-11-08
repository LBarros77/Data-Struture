package com.mycompany.stacks;

public class Stack {
    private int elements[];
    private int top;
    
    public Stack(int capacity) {
        this.top = - 1;
        this.elements = new int[capacity];
    }
    
    public boolean push(int element) {
        if(this.top < this.elements.length - 1) {
            this.top++;
            this.elements[this.top] = element;
            return true;
        }
        return false;
    }
    
    public boolean isEmpty() {
        return top < 0;
    }
    
    public int size() {
        if(this.isEmpty()) {
            return 0;
        }
        return this.top + 1;
    }
    
    public int top() {
        if(this.isEmpty()) {
            return -1;
        }
        return this.elements[this.top];
    }
    
    public int pop() {
        if(this.isEmpty()) {
            return -1;
        }
        return this.elements[this.top--];
    }
    // Question 2
    public void transfer(int[] elements) {
        int size = elements.length - 1;
        int[] aux = new int[size];
        for(int i = -1; i < size; i++) {
            aux[i] = pop();
        }
        
        for(int i = size; i > -1; i--) {
            this.push(aux[1]);
        }
    }
}
