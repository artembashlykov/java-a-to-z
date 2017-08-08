package ru.bashlykov.chess.exceptions;

public class ImpossibleMoveException extends Throwable {
    public ImpossibleMoveException(String impossible_move) {
        super(impossible_move);
    }
}
