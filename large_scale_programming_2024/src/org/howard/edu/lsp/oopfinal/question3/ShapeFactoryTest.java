// Chukwuemeka Ojih

package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeFactoryTest {
    @Test
    public void testCreateCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        assertNotNull("The shape should not be null", shape);
        assertTrue("The shape should be an instance of Circle", shape instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        assertNotNull("The shape should not be null", shape);
        assertTrue("The shape should be an instance of Rectangle", shape instanceof Rectangle);
    }
}
