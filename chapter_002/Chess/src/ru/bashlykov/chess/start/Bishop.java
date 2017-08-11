package ru.bashlykov.chess.start;

import ru.bashlykov.chess.models.Cell;
import ru.bashlykov.chess.models.Figure;
/**
 * Bishop
 * класс определяющий поведение фигуры Слон
 * @since 10.07.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 1
 */
public class Bishop extends Figure {

    /**
     * поле класса
     */

    private Cell[] distance;

    /**
     * конструктор Слона
     * @param position
     */

    public Bishop(Cell position){
        super(position);
    }

    /**
     * возвращает расстояние пройденое фигурой
     * наследуемый от класса Figure
     * @param dist
     */

    public Cell[] way(Cell dist){
        int distX = Math.abs(dist.getX() - position.getX());
        int distY = Math.abs(dist.getY() - position.getY());
        if(distX == distY) {
            distance = moveFigure(dist);
        }

        return distance;
    }

    /**
     * метод клонирующий положение фигуры
     * @param dist
     * @return
     */

    public Figure clone(Cell dist) {
        return new Bishop(dist);
    }

}
