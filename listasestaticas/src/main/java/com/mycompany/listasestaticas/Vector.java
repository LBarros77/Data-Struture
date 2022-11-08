package com.mycompany.listasestaticas;

public class Vector {
    private String[] elements;
    private int size;
    
    public Vector(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }
    
    public void add(String element) {
        if(this.elements.length > this.size) {
            this.elements[this.size] = element;
            this.size++;
        }
    }
    
    public boolean add(int position, String element) {
        if(this.validPosition(position)) {
            if(position == this.elements.length) {
                this.upperCapacity();
            }
            for(int i = this.size - 1; i >= position; i--) {
                this.elements[i+1] = this.elements[i];
            }
            this.elements[position] = element;
            this.size++;
            return true;
        }
        return false;
    }
    // add comparative
    public boolean addElement(int position, String element) {
        if(!this.validPosition(position)) return false;
        
        for(int i = this.size; i >= position; i--) {
            this.elements[i + 1] = this.elements[1];
        }
        
        this.elements[position - 1] = element;
        this.size++;
        return true;
    }
    // To study
    public void remove(int position) {
        if(this.validPosition(position)) {
            for(int i = 0; i < this.size - 1; i++) {
                if(position == i) {
                    this.elements[i] = this.elements[i + 1];
                }
            }
            this.size--;
        }
    }
    
    public String search(int position) {
        if(!validPosition(position)) {
            throw new IllegalArgumentException("Invalid position!");
        }
        return this.elements[position];
    }
    
    public boolean verify(String element) {
        for(int i = 0; i < this.size; i++) {
            if(this.elements[i].equalsIgnoreCase(element)) {
                return true;            }
        }
        return false;
    }
    
    public void addNotRepeat(int position, String element) {
        boolean have = false;
        
        for(int i = 0; i < this.size; i++) {
            if(this.elements[i].equals(element)) {
                have = true;
            }
        }
        
        if(have) {
            this.add(position, element);
        }
    }
    
    public void rmElements() {
//        this.elements = new String[this.elements.length];
        this.size = 0;
    }
    
    public void rmAllOcorrence(String element) {
        for(int i = 0; i < this.size; i++) {
            if(this.elements[i].equalsIgnoreCase(element)) {
                this.remove(i);
            }
        }
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
    // Question 7 | optimization
    public int printPosition(String element) {
        if(this.isEmpt()) return -1;
        
        int indice = -1;
        
        for(int i = this.size; i > 0; i--) {
            if(this.elements[i].equalsIgnoreCase(element)) {
                indice = i;
                break;
            }
        }
        return indice;
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
 