package de.noahpeeters.gameoflife.classic.model;

import java.util.HashSet;
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

    public Set<CellPosition> getNeighboursOfPosition(CellPosition position) {
        Set<CellPosition> result = new HashSet<>();
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx != 0 || dy != 0) {
                    result.add(new CellPosition(position.getX() + dx, position.getY() + dy));
                }
            }
        }
        return result;
    }

    public Set<CellPosition> getActivePositions() {
        Set<CellPosition> neighbours = aliveCells
                .stream()
                .flatMap(position -> getNeighboursOfPosition(position).stream())
                .collect(Collectors.toSet());
        neighbours.addAll(aliveCells);
        return neighbours;
    }
}
