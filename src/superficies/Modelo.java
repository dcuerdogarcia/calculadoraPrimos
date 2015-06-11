/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 *
 * @author dcuerdogarcia
 */
public class Modelo {

    public Modelo() {
    }
    private String shapeType;

    private float area;

    private float length;
    private float height;
    private float radius;

    public String getShapeType() {
        return shapeType;
    }

    public float getArea() {
        return area;
    }

    public float getLength() {
        return length;
    }

    public float getHeight() {
        return height;
    }

    public float getRadius() {
        return radius;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
