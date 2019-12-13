package com.company;

public class Square {

    public static final int HIT = 1;
    public static final int MISSED = 2;

    private boolean ship;
    private int status;
    private int lengthOfShip;
    private int directionOfShip;

    public Square()
    {
        status = 0;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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
}
