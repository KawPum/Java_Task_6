package ru.mirea.diro.ikbo1919;

public class Rectangle {
    private Point center;
    private int length;
    private int width;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(Point center, int length, int width){
        this.center = center;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{center = " + center + ", length = " + length + ", width = " + width + '}';
    }
}
