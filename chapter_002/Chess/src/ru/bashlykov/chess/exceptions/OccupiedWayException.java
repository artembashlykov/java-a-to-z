package ru.bashlykov.chess.exceptions;

public class OccupiedWayException extends Throwable {
    public OccupiedWayException(String occupied_way) {
        super(occupied_way);
    }
}
