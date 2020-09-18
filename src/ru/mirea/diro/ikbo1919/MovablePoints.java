package ru.mirea.diro.ikbo1919;

public class MovablePoints implements Movable{
    private Point upperLeft;
    private Point lowerRight;

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        if (upperLeft.getX()<this.lowerRight.getX() && upperLeft.getY()>this.lowerRight.getY())  this.upperLeft = upperLeft;
        else System.out.println("Upper left point can't be further right or beyond lower right point");
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Point lowerRight) {
        if (lowerRight.getX()>this.upperLeft.getX() && lowerRight.getY()<this.upperLeft.getY())  this.lowerRight = lowerRight;
        else System.out.println("Lower right point can't be further left or above upper left point");
    }

    public MovablePoints(Point point1, Point point2){
        this.upperLeft = point1;
        this.lowerRight = point2;
    }

    @Override
    public void move(int x, int y) {
        this.getLowerRight().setX(getLowerRight().getX()+x);
        this.getLowerRight().setY(getLowerRight().getY()+y);
        this.getUpperLeft().setX(getUpperLeft().getX()+x);
        this.getUpperLeft().setY(getUpperLeft().getY()+y);
    }

    @Override
    public String toString() {
        return "MovablePoints{upperLeft = " + this.upperLeft + ", lowerRight = " + this.lowerRight + '}';
    }
}
