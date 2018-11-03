package ru.bashlykov.chess.models;

import ru.bashlykov.chess.exceptions.FigureNotFoundException;
import ru.bashlykov.chess.exceptions.ImpossibleMoveException;
import ru.bashlykov.chess.exceptions.OccupiedWayException;


/**
 * Board
 * класс шахматной доски
 * @since 18.09.17.
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 2
 */
public class Board {
    /**
     * cells of the board
     */
    public Figure[][] cells = new Figure[8][8];

    /**
     * Method for checking if it is possible to move figure or is it even exist on the board
     * @param source - starting position
     * @param dest - destination cell
     * @return - boolean true or false - was figure moved or not
     * @throws ImpossibleMoveException - wrong destination coordinates
     * @throws OccupiedWayException - there is another piece on the way
     * @throws FigureNotFoundException - source cell is empty
     */

    boolean move(Cell source, Cell dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {

        boolean result = false;

        try {
            int sourceColumn = source.getColumn();
            int sourceRow = source.getRow();

            /**
             * checking the source cell is on the board
             */

            if ((cells[sourceColumn][sourceRow] == null) || sourceColumn < 0 || sourceColumn > 7 || sourceRow < 0 || sourceRow > 7) {
                throw new FigureNotFoundException("Figure is missing!");
            }

            /**
             * checking the destination cel is on the board
             */

            if (dest.getColumn() < 0 || dest.getRow() > 7 ) {
                throw new ImpossibleMoveException("Destination is out of the board!");
            }

            /**
             * checking the figure cen go the way we want it to
             */

            Cell[] way = cells[sourceColumn][sourceRow].way(dest);

            /**
             * checking the way is free
             */

            for (Cell cell : way) {
                if (cell == null) {
                    break;
                }

                if (cells[cell.getColumn()][cell.getRow()] != null) {
                    throw new OccupiedWayException("There is another figure on the way!");
                }
            }

            /**
             * clone figure to destintion cell
             */

            cells[dest.getColumn()][dest.getRow()] = cells[sourceColumn][sourceRow].clone(dest);

            /**
             * empty source cell
             */

            cells[sourceColumn][sourceRow] = null;

            result = true;



        } catch (ImpossibleMoveException | OccupiedWayException | FigureNotFoundException exc) {
            System.out.println(exc);
        }

        return result;
    }

    }


