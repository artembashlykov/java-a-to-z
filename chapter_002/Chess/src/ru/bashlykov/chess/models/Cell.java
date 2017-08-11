package ru.bashlykov.chess.models;

/**
 * Cell
 * описывает клетки шахматной доски
 * @since 27.05.17
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 1
 */
public class Cell {
    /**
     * поля класса
     * координаты фигуры на доске
     */
    private int x;
    private int y;

    /**
     * конструктор с параметрами клетки
     * @param x
     * @param y
     */
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * геттер координаты по оси X
     * @return
     */
    public int getX(){
        return this.x;
    }
    /**
     * геттер координаты по оси Y
     * @return
     */
    public int getY(){
        return this.y;
    }

    /**
     * Сеттеры. обновляют координаты фигуры
     * @param newX
     */
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    /**
     * Method is overriding method equals
     * @param obj
     * @return
     */
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
