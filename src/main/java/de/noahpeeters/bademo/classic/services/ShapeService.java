package de.noahpeeters.bademo.classic.services;

import de.noahpeeters.bademo.classic.model.Area;
import de.noahpeeters.bademo.classic.model.Length;

public class ShapeService {
    public Length triangleCircumference(Length a, Length b, Length c) {
        return new Length(a.getMeter() + b.getMeter() + c.getMeter());
    }

    public Area triangleArea(Length a, Length b, double angleC) {
        return new Area(a.getMeter() * b.getMeter() * 0.5 * Math.sin(angleC));
    }
}
