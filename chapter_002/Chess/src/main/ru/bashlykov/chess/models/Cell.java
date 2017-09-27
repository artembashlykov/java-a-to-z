package ru.bashlykov.chess.models;

/**
 * Cell
 * описывает клетки шахматной доски
 * @since 18.09.17
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 2
 */
public class Cell {
    /**
     * Column coordinate
     */
    private int column;
    /**
     * row coordinate
     */
    private int row;
    /**
     * Constructor of the cell object
     * @param column - cell column
     * @param row - cell row
     */
    public Cell(int column, int row) {
        this.column = column;
        this.row = row;
    }

    /**
     * @return - number of column
     */
    public int getColumn() {
        return column;
    }
    /**
     * @return - number of row
     */
    public int getRow() {
        return row;
    }

}
