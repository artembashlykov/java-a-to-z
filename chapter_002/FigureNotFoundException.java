package ru.bashlykov.chess.exceptions;

public class FigureNotFoundException extends Throwable {
    public FigureNotFoundException(String figure_not_found) {
        super(figure_not_found);
    }
}
