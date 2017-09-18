package ru.bashlykov.chess.exceptions;

/**
 * Класс для обработки исключения
 * @since 18.09.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 2
 */

public class FigureNotFoundException extends Exception {

    /**
     * Create an overloaded constructor.
     * Add FigureNotFoundException
     * @param figure_not_found
     */

    public FigureNotFoundException(String figure_not_found) {
        super(figure_not_found);
    }
}
