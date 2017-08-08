package ru.bashlykov.chess.models;

import ru.bashlykov.chess.exceptions.FigureNotFoundException;
import ru.bashlykov.chess.exceptions.ImpossibleMoveException;
import ru.bashlykov.chess.exceptions.OccupiedWayException;


/**
 * Created by art on 04.06.17.
 */
public class Board {
  private static final int numOfPieces = 32;

  private Figure[] figures = new Figure[numOfPieces];

  public void addFigure(Figure figure) {
      for (int i = 0; i < figures.length; i++) {
          if (figures[i] == null) {
              figures[i] = figure;
              break;
          }
      }
  }
  public boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
      boolean isNeedSave = false;

      Cell[] pass = null;
      for (Figure figure : figures) {
          if (figure != null && figure.getPosition().equals(source)) {
              pass = figure.way(dist);
              isNeedSave = true;
              break;
          }
      }

      if (isNeedSave = false) {
          throw new FigureNotFoundException("Figure not found");
      }

      isNeedSave = false;
      for(Figure figure : figures) {
          for (Cell cellPass : pass) {
              if (figure != null && figure.getPosition().equals(cellPass)) {
                  isNeedSave = true;
                  break;
              }

              if (isNeedSave = false) {
                  throw new OccupiedWayException("The way is occupied.");
              }
          }
      }
      for (int count = 0; count < figures.length; count++) {
          if (figures[count] != null && figures[count].getPosition().equals(source)) {
                  figures[count] = figures[count].clone(dist);
          }
      }
      return true;
  }
    }


