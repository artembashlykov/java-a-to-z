package ru.bashlykov.chess.exceptions;

/**
 * Класс для обработки исключения
 * @since 18.09.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 2
 */

public class ImpossibleMoveException extends Exception {

    /**
     * Create an overloaded constructor.
     * Add ImpossibleMoveException
     * @param impossible_move
     */

    public ImpossibleMoveException(String impossible_move) {
        super(impossible_move);
    }
}
