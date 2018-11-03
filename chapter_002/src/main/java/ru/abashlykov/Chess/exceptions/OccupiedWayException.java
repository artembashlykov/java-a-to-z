package ru.bashlykov.chess.exceptions;

/**
 * Класс для обработки исключения
 * @since 18.09.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 2
 */

public class OccupiedWayException extends Exception {

    /**
     * Create an overloaded constructor.
     * Add OccupiedWayException.
     * @param occupied_way
     */

    public OccupiedWayException(String occupied_way) {
        super(occupied_way);
    }
}
