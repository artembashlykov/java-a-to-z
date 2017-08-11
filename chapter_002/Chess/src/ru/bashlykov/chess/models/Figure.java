package ru.bashlykov.chess.models;

/**
 * Figure
 * абстрактный класс. логика изменения позиции фигуры на поле
 * @since 04.06.2017
 * @author Artem Bashlykov (a_bashlykov@inbox.ru)
 * @version 1
 */

public abstract class Figure {
    /**
     * поля класса
     */
    private int newX;

    private int newY;

    private int firstMovingDistance;

    private int secondMovingDistance;

    public final Cell position;

    /**
     * конструктор обьекта Cell
     * @param position
     */

    public Figure(Cell position){
        this.position = position;
    }

    /**
     * геттер для чтения позиции
     * @return
     */
    public Cell getPosition() {
        return this.position;
    }

    /**
     * абстрактный метод. вычисляет расстояние пройденное фигурой
     * @param dist
     * @return
     */

    public abstract Cell[] way(Cell dist);

    /**
     * вычисляет куда и как идет фигура.
     * возвращает пройденное расстояние в виде массива
     * @param distance
     * @return
     */

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

    /**
     * метож клонирующий координаты фигуры
     * @param dist
     * @return
     */

    public abstract Figure clone(Cell dist);
}
