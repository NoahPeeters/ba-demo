package de.noahpeeters.gameoflife.adt.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Board implements InfiniteCellGrid {
    private final Set<CellPosition> aliveCells;

    private Board(Set<CellPosition> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public static Board empty() {
        return new Board(new HashSet<>());
    }

    public boolean isAlive(CellPosition position) {
        return aliveCells.contains(position);
    }

    public void markAsAlive(CellPosition position) {
        aliveCells.add(position);
    }

    public void markAsDead(CellPosition position) {
        aliveCells.remove(position);
    }

    public Board createCopy() {
        return new Board(new HashSet<>(aliveCells));
    }

    public Set<CellPosition> getActivePositions() {
        Set<CellPosition> neighbours = aliveCells
                .stream()
                .flatMap(position -> position.getNeighbours().stream())
                .collect(Collectors.toSet());
        neighbours.addAll(aliveCells);
        return neighbours;
    }

    public Set<CellPosition> getAliveCells() {
        return new HashSet<>(aliveCells);
    }
}
