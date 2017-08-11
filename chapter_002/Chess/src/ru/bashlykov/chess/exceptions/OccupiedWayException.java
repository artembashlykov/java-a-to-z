package ru.bashlykov.chess.exceptions;

/**
 * Класс для обработки исключения
 * @since 10.07.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 1
 */

public class OccupiedWayException extends Throwable {

    /**
     * Create an overloaded constructor.
     * Add OccupiedWayException.
     * @param occupied_way
     */

    public OccupiedWayException(String occupied_way) {
        super(occupied_way);
    }
}
