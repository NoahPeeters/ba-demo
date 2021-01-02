package de.noahpeeters.bademo.adt.services;

import de.noahpeeters.bademo.adt.model.Area;
import de.noahpeeters.bademo.adt.model.Length;

public class ShapeService {
    public Length triangleCircumference(Length a, Length b, Length c) {
        return a.add(b).add(c);
    }

    public Area triangleArea(Length a, Length b, double angleC) {
        return a.multiply(b).multiply(0.5).multiply(Math.sin(angleC));
    }
}
