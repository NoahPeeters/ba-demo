package de.noahpeeters.gameoflife.adt.model;

import java.util.Set;

public interface CellPosition {
    Set<CellPosition> getNeighbours();
}
