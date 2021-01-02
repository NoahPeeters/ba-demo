package de.noahpeeters.gameoflife.adt.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CartesianCellPosition implements CellPosition {
    private final int x;
    private final int y;

    public CartesianCellPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Set<CellPosition> getNeighbours() {
        Set<CellPosition> result = new HashSet<>();
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx != 0 || dy != 0) {
                    result.add(new CartesianCellPosition(this.x + dx, this.y + dy));
                }
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartesianCellPosition that = (CartesianCellPosition) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
