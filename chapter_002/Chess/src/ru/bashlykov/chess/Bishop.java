package ru.bashlykov.chess.start;

import ru.bashlykov.chess.models.Cell;
import ru.bashlykov.chess.models.Figure;
/**
 * Created by Art on 10.07.2017.
 */
public class Bishop extends Figure {

    private Cell[] distance;

    public Bishop(Cell position){
        super(position);
    }

    public Cell[] way(Cell dist){
        int distX = Math.abs(dist.getX() - position.getX());
        int distY = Math.abs(dist.getY() - position.getY());
        if(distX == distY) {
            distance = moveFigure(dist);
        }

        return distance;
    }

    public Figure clone(Cell dist) {
        return new Bishop(dist);
    }

}
