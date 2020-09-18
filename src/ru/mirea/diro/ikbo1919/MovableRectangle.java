package ru.mirea.diro.ikbo1919;

public class MovableRectangle extends Rectangle implements Movable{
    public MovableRectangle(Point center, int length, int width){
        super(center, length, width);
    }

    @Override
    public void move(int x, int y) {
        this.getCenter().setX(getCenter().getX()+x);
        this.getCenter().setY(getCenter().getY()+y);
    }
}
