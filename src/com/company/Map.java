package com.company;

public class Map {

    private Square[][] map;
    private int points;
    private int pointsToWin;

    public Map(int number) {
        map = new Square[number][number];

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                Square temp = new Square();
                map[row][col] = temp;
            }
        }
    }

    public boolean isShotHere(int row, int col) {
        if (map[row][col].getStatus() == 1 || map[row][col].getStatus() == 2) {
            return true;
        }
        return false;
    }

    public void markHit(int row, int col) {
        map[row][col].markHit();
        points++;
    }

    public void markMiss(int row, int col) {
        map[row][col].markMiss();
    }

    public boolean hasShip(int row, int col) {
        return map[row][col].isShip();
    }

    public void addShip(Ship s) {
        int row = s.getRow();
        int col = s.getCol();
        int length = s.getLength();
        int dir = s.getDirection();

        if (dir == 0) // Hortizontal
        {
            for (int i = col; i < col + length; i++) {
                map[row][i].setShip(true);
                map[row][i].setLengthOfShip(length);
                map[row][i].setDirectionOfShip(dir);
            }
        } else if (dir == 1) // Vertical
        {
            for (int i = row; i < row + length; i++) {
                map[i][col].setShip(true);
                map[i][col].setLengthOfShip(length);
                map[i][col].setDirectionOfShip(dir);
            }
        }
    }

    public boolean isWin() {

        if (points >= pointsToWin)
            return true;
        else
            return false;
    }

    public void setPointsToWin(Ship[] ships) {
        int sumOfShip = 0;
        for (Ship ship : ships) {
            sumOfShip = ship.getLength();
        }
        this.pointsToWin = sumOfShip;
    }


}
