package com.company;

public class Human {

    private int headCount;
    private int armCount;
    private String name;



    public Human(int armCount, String name) {
        this.armCount = armCount;
        this.name = name;
        this.headCount=1;
    }

    public int getHeadCount() {
        return headCount;
    }


    public int getArmCount() {
        return armCount;
    }

    public void setArmCount(int armCount) {
        if (armCount>2){
            this.armCount=2;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("fuck")){
            this.name = "****";
        }
    }
}
