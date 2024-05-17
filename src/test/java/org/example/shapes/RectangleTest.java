package org.example.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(new int[]{0,0, 0,2, 1,2, 1,0});
        assertEquals(2, rectangle.getArea());
    }
}