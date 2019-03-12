package com.jorey.mytask.prototype;

public class Vehilce implements Cloneable {
    private String vno;
    private String color;
    private String speed;

    public Vehilce(String vno, String color, String speed) {
        this.vno = vno;
        this.color = color;
        this.speed = speed;
    }

    public Vehilce clone(String vno, String color, String speed){
        return new Vehilce(vno,color,speed);
    }

    public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
