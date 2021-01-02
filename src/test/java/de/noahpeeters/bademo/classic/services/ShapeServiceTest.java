package de.noahpeeters.bademo.classic.services;

import de.noahpeeters.bademo.classic.model.Area;
import de.noahpeeters.bademo.classic.model.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeServiceTest {
    ShapeService shapeService = new ShapeService();

    @Test
    void triangleCircumference() {
        assertEquals(new Length(44.1), shapeService.triangleCircumference(new Length(2), new Length(0.1), new Length(42)));
    }

    @Test
    void triangleArea() {
        assertEquals(new Area(0.5), shapeService.triangleArea(new Length(1), new Length(1), Math.PI / 2));
    }
}
