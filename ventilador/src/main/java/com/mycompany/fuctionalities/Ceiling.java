package com.mycompany.fuctionalities;

public class Ceiling {
    private boolean status;
    private int speed;
    
    void Ceiling() {
        this.status = false;
        this.speed = 0;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void lowerLevel(int num) {
        while(this.isStatus() == true && num > 0) {
            if(this.speed > 0 && this.speed <= 3) {
                this.speed--;
                num--;
            }
            this.setStatus(false);
        }
        if(this.speed < 1) this.setStatus(false);
    }
    
    public void upperLevel(int num) {
        while(num <= 3 && num > 0) {
            if(this.speed > 0 && this.speed <= 3) {
                this.setStatus(true);
                this.speed++;
                num--;
            }
            this.setStatus(false);
            break;
        }
        if(this.speed < 1) this.setStatus(false);
        
        if(this.speed < 3 || this.speed == 0) this.speed++;
        this.setStatus(true);
    }
    
    public void setLevel(int nivel) {
        this.speed = nivel;
    }

    public boolean isStatus() {
        return status;
    }

    public int getLevel() {
        return this.speed;
    }
}