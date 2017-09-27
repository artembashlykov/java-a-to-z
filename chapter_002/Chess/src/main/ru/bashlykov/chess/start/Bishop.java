package ru.bashlykov.chess.start;

import ru.bashlykov.chess.exceptions.ImpossibleMoveException;
import ru.bashlykov.chess.models.Cell;
import ru.bashlykov.chess.models.Figure;
/**
 * Bishop
 * класс определяющий поведение фигуры Слон
 * @since 18.09.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 2
 */
public class Bishop extends Figure {

    /**
     * @param position source cell
     */

    public Bishop(Cell position) {
        super(position);
    }

    /**
     * @param dest - destination cell
     * @return - array of the way cells
     * @throws ImpossibleMoveException - wrong destination cell
     */

    public Cell[] way(Cell dest) throws ImpossibleMoveException {

        Cell[] result = new Cell[8];
        int positionColumn = this.position.getColumn();
        int positionRow = this.position.getRow();
        int destColumn = dest.getColumn();
        int destRow = dest.getRow();
        int stepColumn = 1;
        int stepRow = 1;

        /**
         * check right way
         */

        if ((Math.abs(positionColumn - destColumn) == Math.abs(positionRow - destRow)) && (positionColumn != destColumn)) {
            if (positionColumn > destColumn) {
                stepColumn = -1;
            }

            if (positionRow > destRow) {
                stepRow = -1;
            }

            int count = Math.abs(positionColumn - destColumn);
            for (int i = 0; i < count; i++ ) {
                positionColumn += stepColumn;
                positionRow += stepRow;
                result[i] = new Cell(positionColumn, positionRow);
            }

        } else {
            throw new ImpossibleMoveException("The Bishop can't go there");
        }
        return result;
    }

    public Bishop clone(Cell destination) {
        return new Bishop(destination);
    }
}
