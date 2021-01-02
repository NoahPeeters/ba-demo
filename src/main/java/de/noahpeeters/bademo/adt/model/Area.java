package de.noahpeeters.bademo.adt.model;

import java.util.Objects;

public class Area {
    private final double squareMeter;

    private Area(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public static Area squareMeter(double squareMeter) {
        return new Area(squareMeter);
    }

    public Area multiply(double factor) {
        return Area.squareMeter(this.squareMeter * factor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Double.compare(area.squareMeter, squareMeter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(squareMeter);
    }
}
