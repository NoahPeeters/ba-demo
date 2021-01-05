package de.noahpeeters.gameoflife.adt;

import de.noahpeeters.gameoflife.adt.model.Board;
import de.noahpeeters.gameoflife.adt.model.CartesianCellPosition;
import de.noahpeeters.gameoflife.adt.model.CellPosition;
import de.noahpeeters.gameoflife.adt.model.InfiniteCellGrid;

public class BoardController {
    private InfiniteCellGrid board;

    public BoardController() {
        this.board = Board.empty();

        this.board.markAsAlive(new CartesianCellPosition(1, 0));
        this.board.markAsAlive(new CartesianCellPosition(2, 1));
        this.board.markAsAlive(new CartesianCellPosition(0, 2));
        this.board.markAsAlive(new CartesianCellPosition(1, 2));
        this.board.markAsAlive(new CartesianCellPosition(2, 2));
    }

    public void step() {
        InfiniteCellGrid newBoard = board.createCopy();
        for (CellPosition position: board.getActivePositions()) {
            long aliveNeighbourCount = position.getNeighbours().stream().filter(board::isAlive).count();
            boolean isAlive = board.isAlive(position);

            if (isAlive && (aliveNeighbourCount < 2 || aliveNeighbourCount > 3)) {
                newBoard.markAsDead(position);
            } else if (!isAlive && aliveNeighbourCount == 3) {
                newBoard.markAsAlive(position);
            }
        }
        this.board = newBoard;
    }

    public void print() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                CellPosition cellPosition = new CartesianCellPosition(x, y);
                System.out.print(board.isAlive(cellPosition) ? "X" : " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
}
