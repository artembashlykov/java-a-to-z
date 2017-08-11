package ru.bashlykov.chess.exceptions;

/**
 * Класс для обработки исключения
 * @since 10.07.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 1
 */

public class FigureNotFoundException extends Throwable {

    /**
     * Create an overloaded constructor.
     * Add FigureNotFoundException
     * @param figure_not_found
     */

    public FigureNotFoundException(String figure_not_found) {
        super(figure_not_found);
    }
}
