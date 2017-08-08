package ru.bashlykov.chess.models;

public abstract class Figure {

    private int newX;

    private int newY;

    private int firstMovingDistance;

    private int secondMovingDistance;

    public final Cell position;

    public Figure(Cell position){
        this.position = position;
    }

    public Cell getPosition() {
        return this.position;
    }

    public abstract Cell[] way(Cell dist);

    public Cell[] moveFigure(Cell distance) {
        int currentX = position.getX();
        int currentY = position.getY();

        newX = distance.getX();
        newY = distance.getY();

        int distanceX = Math.abs(this.newX - currentX);
        int distanceY = Math.abs(this.newY - currentY);


        if( distanceX > distanceY) {
            firstMovingDistance = distanceX;
            secondMovingDistance = distanceY;
        } else {
            firstMovingDistance = distanceY;
            secondMovingDistance = distanceX;
        }

        Cell[] coveredDistance = new Cell[firstMovingDistance];

        if(((newX - currentX) >= 0) & ((newY - currentY) >= 0)) {
            if (distanceX > distanceY) {
                for (int i = 0; i < firstMovingDistance; i++) {
                    coveredDistance[i].setX(currentX++);
                }
                for (int i = 0; i < secondMovingDistance; i++) {
                    coveredDistance[i].setY(currentY++);
                }
            } else {
                for (int i = 0; i < secondMovingDistance; i++) {
                    coveredDistance[i].setX(currentX++);
                }
                for (int i = 0; i < firstMovingDistance; i++) {
                    coveredDistance[i].setY(currentY++);
                }
            }
        } else if (((newX - currentX) <= 0) & ((newY - currentY) <= 0)) {
            if (distanceX > distanceY) {
                for (int i = 0; i < firstMovingDistance; i++) {
                    coveredDistance[i].setX(currentX--);
                }
                for (int i = 0; i < secondMovingDistance; i++) {
                    coveredDistance[i].setY(currentY--);
                }
            } else {
                for (int i = 0; i < secondMovingDistance; i++) {
                    coveredDistance[i].setX(currentX--);
                }
                for (int i = 0; i < firstMovingDistance; i++) {
                    coveredDistance[i].setY(currentY--);
                }
            }
        } else if (((newX - currentX) >= 0) & ((newY - currentY) <= 0)) {
            coveredDistance = new Cell[firstMovingDistance];
            for (int i = 0; i < firstMovingDistance; i++) {
                coveredDistance[i].setX(currentX++);
            }
            for (int i = 0; i < secondMovingDistance; i++) {
                coveredDistance[i].setY(currentY--);
            }
        } else if (((newX - currentX) <=0) & ((newY - currentY) >=0)) {
            coveredDistance = new Cell[firstMovingDistance];
            for (int i = 0; i < secondMovingDistance; i++) {
                coveredDistance[i].setX(currentX--);
            }
            for (int i = 0; i < firstMovingDistance; i++) {
                coveredDistance[i].setY(currentY++);
            }
        }


        return coveredDistance;
    }

    public abstract Figure clone(Cell dist);
}
