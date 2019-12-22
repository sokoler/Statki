package com.company;

public class Square {

    private static final String HIT = "X";
    private static final String MISSED = "#";

    private boolean ship;
    private String status;
    private int lengthOfShip;
    private int directionOfShip;

    public Square()
    {
        status =" ";
        ship = false;
        lengthOfShip = -1;
        directionOfShip = -1;
    }

    public void markHit()
    {
        setStatus(HIT);
    }

    public void markMiss()
    {
        setStatus(MISSED);
    }

    public boolean isShip() {
        return ship;
    }

    public void setShip(boolean ship) {
        this.ship = ship;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLengthOfShip() {
        return lengthOfShip;
    }

    public void setLengthOfShip(int lengthOfShip) {
        this.lengthOfShip = lengthOfShip;
    }

    public int getDirectionOfShip() {
        return directionOfShip;
    }

    public void setDirectionOfShip(int directionOfShip) {
        this.directionOfShip = directionOfShip;
    }


    @Override
    public String toString() {
        return "|"+ getStatus() +"|";
    }
}
