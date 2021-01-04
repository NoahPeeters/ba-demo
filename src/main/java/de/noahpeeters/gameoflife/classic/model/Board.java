package de.noahpeeters.gameoflife.classic.model;

import java.util.Set;
import java.util.stream.Collectors;

public class Board {
    private final Set<CellPosition> aliveCells;

    public Board(Set<CellPosition> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public Set<CellPosition> getAliveCells() {
        return aliveCells;
    }

    public Set<CellPosition> getActivePositions() {
        Set<CellPosition> neighbours = aliveCells
                .stream()
                .flatMap(position -> position.getNeighbours().stream())
                .collect(Collectors.toSet());
        neighbours.addAll(aliveCells);
        return neighbours;
    }
}
