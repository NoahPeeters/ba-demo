package de.noahpeeters.gameoflife.adt.model;

import java.util.Set;

public interface InfiniteCellGrid {
    boolean isAlive(CellPosition position);

    void markAsAlive(CellPosition position);

    void markAsDead(CellPosition position);

    Set<CellPosition> getAliveCells();

    Set<CellPosition> getActivePositions();

    InfiniteCellGrid createCopy();
}
