package ru.bashlykov.chess.models;

import ru.bashlykov.chess.exceptions.ImpossibleMoveException;

/**
 * Figure
 * абстрактный класс. логика изменения позиции фигуры на поле
 * @since 18.09.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 2
 */

public abstract class Figure implements Cloneable {
    /**
     * figure position
     */

    protected final Cell position;

    /**
     *@param source - source cell
     */

    public Figure(Cell source) {
        this.position = source;
    }

    /**
     * check right way
     * @param dest - destination cell
     * @return - array of the way cells
     * @throws ImpossibleMoveException - if destination cell is incorrect
     */

    public abstract Cell[] way(Cell dest) throws ImpossibleMoveException;

    /**
     * clone figure to destination cell
     * @param destination - dest cell
     * @return  - new figure with position identical to the destination cell
     */

    public abstract Figure clone(Cell destination);
}
