package ru.bashlykov.chess.exceptions;

/**
 * Класс для обработки исключения
 * @since 10.07.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 1
 */

public class ImpossibleMoveException extends Throwable {

    /**
     * Create an overloaded constructor.
     * Add ImpossibleMoveException
     * @param impossible_move
     */

    public ImpossibleMoveException(String impossible_move) {
        super(impossible_move);
    }
}
