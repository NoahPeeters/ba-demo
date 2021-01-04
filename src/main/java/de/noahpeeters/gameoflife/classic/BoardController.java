package de.noahpeeters.gameoflife.classic;

import de.noahpeeters.gameoflife.classic.model.Board;
import de.noahpeeters.gameoflife.classic.model.CellPosition;

import java.util.HashSet;

public class BoardController {
    private Board board;

    public BoardController() {
        this.board = new Board(new HashSet<>());

        this.board.getAliveCells().add(new CellPosition(1, 0));
        this.board.getAliveCells().add(new CellPosition(2, 1));
        this.board.getAliveCells().add(new CellPosition(0, 2));
        this.board.getAliveCells().add(new CellPosition(1, 2));
        this.board.getAliveCells().add(new CellPosition(2, 2));
    }

    public void step() {
        Board newBoard = new Board(new HashSet<>(board.getAliveCells()));
        for (CellPosition position: board.getActivePositions()) {
            long aliveNeighbourCount = position.getNeighbours().stream().filter(board.getAliveCells()::contains).count();
            boolean isAlive = board.getAliveCells().contains(position);

            if (isAlive && (aliveNeighbourCount < 2 || aliveNeighbourCount > 3)) {
                newBoard.getAliveCells().remove(position);
            } else if (!isAlive && aliveNeighbourCount == 3) {
                newBoard.getAliveCells().add(position);
            }
        }
        this.board = newBoard;

        System.out.println(board.getAliveCells().size());
    }

    public void print() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                CellPosition cellPosition = new CellPosition(x, y);
                System.out.print(board.getAliveCells().contains(cellPosition) ? "X" : " ");
            }
            System.out.println();
        }
    }
}
