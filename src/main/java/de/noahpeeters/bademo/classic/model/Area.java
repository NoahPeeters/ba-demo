package de.noahpeeters.bademo.classic.model;

import java.util.Objects;

public class Area {
    private double squareMeter;

    public Area(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
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
