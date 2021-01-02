package de.noahpeeters.bademo.adt.services;

import de.noahpeeters.bademo.adt.model.Area;
import de.noahpeeters.bademo.adt.model.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeServiceTest {
    ShapeService shapeService = new ShapeService();

    @Test
    void triangleCircumference() {
        assertEquals(Length.meter(44.1), shapeService.triangleCircumference(Length.meter(2), Length.cm(10), Length.meter(42)));
    }

    @Test
    void triangleArea() {
        assertEquals(Area.squareMeter(0.5), shapeService.triangleArea(Length.meter(1), Length.meter(1), Math.PI / 2));
    }
}
