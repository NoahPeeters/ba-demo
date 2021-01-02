package de.noahpeeters.bademo.classic.model;

import java.util.Objects;

public class Length {
    private double meter;

    public Length(double meter) {
        this.meter = meter;
    }

    public double getMeter() {
        return meter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.meter, meter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meter);
    }
}
