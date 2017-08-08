package ru.bashlykov.chess.models;

/**
 * Created by art on 27.05.17.
 */
public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Cell)){
            return false;
        }

        Cell cell = (Cell) obj;

        return this.x == cell.x && this.y ==cell.y;
    }
}
