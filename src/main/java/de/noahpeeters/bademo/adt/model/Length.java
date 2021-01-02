package de.noahpeeters.bademo.adt.model;

import java.util.Objects;

public class Length {
    private final double meter;

    private Length(double meter) {
        this.meter = meter;
    }

    public static Length meter(double meter) {
        return new Length(meter);
    }

    public static Length cm(double cm) {
        return Length.meter(cm / 100);
    }

    public static Length km(double km) {
        return Length.meter(km * 1000);
    }

    public Length add(Length other) {
        return new Length(this.meter + other.meter);
    }

    public Length multiply(double factor) {
        return Length.meter(this.meter * factor);
    }

    public Area multiply(Length other) {
        return Area.squareMeter(this.meter * other.meter);
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
