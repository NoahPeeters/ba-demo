package de.noahpeeters.bademo.primitive.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeServiceTest {
    ShapeService shapeService = new ShapeService();

    @Test
    void triangleCircumference() {
        assertEquals(44.1, shapeService.triangleCircumference(2, 0.1, 42));
    }

    @Test
    void triangleArea() {
        assertEquals(0.5, shapeService.triangleArea(1, 1, Math.PI / 2));
    }
}
