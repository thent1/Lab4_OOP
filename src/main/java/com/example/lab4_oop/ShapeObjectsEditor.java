package com.example.lab4_oop;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class ShapeObjectsEditor {
    public static void startPointEditor(Scene scene, Pane root) {
        Shape pointShape = new PointShape(scene, root);
        pointShape.editShape();
    }

    public static void startLineEditor(Scene scene, Pane root) {
        Shape lineShape = new LineShape(scene, root);
        lineShape.editShape();
    }

    public static void startRectEditor(Scene scene, Pane root) {
        Shape rectangleShape = new RectangleShape(scene, root);
        rectangleShape.editShape();
    }

    public static void startEllipseEditor(Scene scene, Pane root) {
        Shape ellipseShape = new EllipseShape(scene, root);
        ellipseShape.editShape();
    }

    public static void startLineWithCirclesEditor(Scene scene, Pane root) {
        Shape lineWithCirclesShape = new LineWithCirclesShape(scene, root);
        lineWithCirclesShape.editShape();
    }

    public static void startCubeEditor(Scene scene, Pane root) {
        Shape cubeShape = new CubeShape(scene, root);
        cubeShape.editShape();
    }

}
