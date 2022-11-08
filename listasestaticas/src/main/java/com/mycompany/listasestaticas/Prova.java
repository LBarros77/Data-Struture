package com.mycompany.listasestaticas;


public class Prova {
    private String[] elements;
    private int size;
    
    public Prova(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }
    
    // Question 6
    public void divisionList(int[] list, int size) {
        
        if(size % 2 == 0) { 
            int size2 = size / 2;
        } else {
            int size2 = (size + 1) / 2;
        }
        
        StringBuilder newList = new StringBuilder();
        StringBuilder par = new StringBuilder();
        StringBuilder impar = new StringBuilder();
        
        newList.append("[ ");
        par.append("[ ");
        impar.append("[ ");
        
        for(int i = 0; i < size; i++) {
            newList.append(list[i] + " ");
            if(list[i] % 2 == 0) {
                par.append(list[i] + " ");
            }
            impar.append(list[i] + " ");
        }
        
        newList.append("]");
        par.append("]");
        impar.append("]");
        
        System.out.println(newList);
        System.out.println(par);
        System.out.println(impar);
    }
    
    // Question 7
    public int printEndPosition(String element) {
        if(this.isEmpt()) return -1;
        
        int count = -1;
        
        for(int i = 0; i < this.size; i++) {
            if(this.elements[i].equalsIgnoreCase(element)) {
                count = i;
            }
        }
        return count;
    }
    
    // ESSENTIALS
    public void upperCapacity() {
        if (this.size == this.elements.length) {
            String[] newElements = new String[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++) {
                newElements[i] =  this.elements[i];
            }
            this.elements = newElements;
        }
    }
    
    private boolean validPosition(int position) {
        return ((position >= 0) && (position <= this.size));
    }
    
    public boolean isEmpt() {
        return (this.size < 0 && this.size >= this.elements.length);
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.size - 1; i++) {
            s.append(this.elements[i] + ", ");
        }
        if(this.size > 0) s.append(this.elements[this.size - 1]);
        s.append("]");
        return s.toString();
    }
}
