package com.example.lab4_oop;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class CubeShape extends Shape {
    private Rectangle frontRectangle;
    private Rectangle backRectangle;

    private Line topperLeftLine;
    private Line bottomLeftLine;
    private Line topperRightLine;
    private Line bottomRightLine;

    public CubeShape(Scene scene, Pane root) {
        super(scene, root);
    }

    @Override
    public void editShape() {
        root.setOnMousePressed(mouseEvent -> {
            frontRectangle = new Rectangle();
            backRectangle = new Rectangle();
            topperLeftLine = new Line();
            bottomLeftLine = new Line();
            topperRightLine = new Line();
            bottomRightLine = new Line();

            frontRectangle.setX(mouseEvent.getX());
            frontRectangle.setY(mouseEvent.getY());
            frontRectangle.setWidth(mouseEvent.getX()-frontRectangle.getX());
            frontRectangle.setHeight(mouseEvent.getY()-frontRectangle.getY());
            frontRectangle.setStroke(Color.RED);
            frontRectangle.getStrokeDashArray().addAll(25d, 10d);
            frontRectangle.setFill(null);



            backRectangle.setX(frontRectangle.getX() + 100);
            backRectangle.setY(frontRectangle.getY() - 100);
            backRectangle.getStrokeDashArray().addAll(25d, 10d);
            backRectangle.setStroke(Color.RED);
            backRectangle.setFill(null);



            topperLeftLine.setStroke(Color.RED);
            topperLeftLine.getStrokeDashArray().addAll(25d, 10d);


            bottomLeftLine.setStroke(Color.RED);
            bottomLeftLine.getStrokeDashArray().addAll(25d, 10d);


            topperRightLine.setStroke(Color.RED);
            topperRightLine.getStrokeDashArray().addAll(25d, 10d);


            bottomRightLine.setStroke(Color.RED);
            bottomRightLine.getStrokeDashArray().addAll(25d, 10d);

            root.getChildren().addAll(frontRectangle, backRectangle, topperLeftLine, bottomLeftLine, topperRightLine, bottomRightLine);
        });

        root.setOnMouseDragged(mouseEvent -> {
            if (frontRectangle != null) {
                frontRectangle.setWidth(mouseEvent.getX() - frontRectangle.getX());
                frontRectangle.setHeight(mouseEvent.getY() - frontRectangle.getY());

                backRectangle.setWidth(frontRectangle.getWidth());
                backRectangle.setHeight(frontRectangle.getHeight());

                topperLeftLine.setStartX(backRectangle.getX());
                topperLeftLine.setStartY(backRectangle.getY());
                topperLeftLine.setEndX(frontRectangle.getX());
                topperLeftLine.setEndY(frontRectangle.getY());

                bottomLeftLine.setStartX(backRectangle.getX());
                bottomLeftLine.setStartY(backRectangle.getY()+backRectangle.getHeight());
                bottomLeftLine.setEndX(frontRectangle.getX());
                bottomLeftLine.setEndY(frontRectangle.getY() + frontRectangle.getHeight());

                topperRightLine.setStartX(backRectangle.getX()+backRectangle.getWidth());
                topperRightLine.setStartY(backRectangle.getY());
                topperRightLine.setEndX(frontRectangle.getX() + frontRectangle.getWidth());
                topperRightLine.setEndY(frontRectangle.getY());

                bottomRightLine.setStartX(backRectangle.getX()+backRectangle.getWidth());
                bottomRightLine.setStartY(backRectangle.getY()+backRectangle.getHeight());
                bottomRightLine.setEndX(frontRectangle.getX() + frontRectangle.getWidth());
                bottomRightLine.setEndY(frontRectangle.getY() + frontRectangle.getHeight());
            }
        });

        root.setOnMouseReleased(mouseEvent -> {
            if (frontRectangle != null) {
                frontRectangle.setStroke(Color.BLACK);
                backRectangle.setStroke(Color.BLACK);
                topperLeftLine.setStroke(Color.BLACK);
                bottomLeftLine.setStroke(Color.BLACK);
                topperRightLine.setStroke(Color.BLACK);
                bottomRightLine.setStroke(Color.BLACK);

                frontRectangle.getStrokeDashArray().clear();
                backRectangle.getStrokeDashArray().clear();
                topperRightLine.getStrokeDashArray().clear();
                topperLeftLine.getStrokeDashArray().clear();
                bottomRightLine.getStrokeDashArray().clear();
                bottomLeftLine.getStrokeDashArray().clear();

                frontRectangle = null;
                backRectangle = null;

            }
        });
    }
}
