package de.noahpeeters.gameoflife.classic.model;

import de.noahpeeters.gameoflife.adt.model.CartesianCellPosition;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CellPosition {
    private final int x;
    private final int y;

    public CellPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Set<CellPosition> getNeighbours() {
        Set<CellPosition> result = new HashSet<>();
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx != 0 || dy != 0) {
                    result.add(new CellPosition(this.x + dx, this.y + dy));
                }
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellPosition that = (CellPosition) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
