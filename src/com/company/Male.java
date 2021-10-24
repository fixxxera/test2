package com.company;

public class Male extends Human{

    private int dickLenght;
    private boolean hasDick;

    public Male(int armCount, String name, int dickLenght) {
        super(armCount, name);
        this.dickLenght =dickLenght;

    }

    public int getDickLenght() {
        return dickLenght;
    }

    public void setDickLenght(int dickLenght) {
        this.dickLenght = dickLenght;
    }

    public boolean isHasDick() {
        return hasDick;
    }

    public void setHasDick(boolean hasDick) {
        this.hasDick = hasDick;
    }
}
